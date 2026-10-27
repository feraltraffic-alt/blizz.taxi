# Sandbox transcript (2026-10-27T15:39:11Z, cd81197)

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
  "correlation_id": "21b75335-98cb-4442-8cd6-090bedb70410"
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
  "session_id": "ac59a331-5465-40dc-b936-d9eb8393586a",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0NTIsImlhdCI6MTc5MzExNTU1MiwianRpIjoiMWFlYzgyMWItYzExYS00YWQwLTg0ZGEtMGE0YTFiMmM5NmVmIiwic2lkIjoiYWM1OWEzMzEtNTQ2NS00MGRjLWI5MzYtZDllYjgzOTM1ODZhIn0.6pQvxFsgDmhelTF2bpUUkwU6xnKNhMLerfPNn3MNGIs",
  "access_expires_at": "2026-10-27T15:54:12.505552241Z",
  "refresh_token": "utFzgetujiVVZmnscaejeI7Jfat52FPqqvDhO2fG_pw",
  "refresh_expires_at": "2026-10-28T03:39:12.502842823Z",
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
  "session_id": "9e7cfe09-d05d-4c39-80db-461f971e488c",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0NTMsImlhdCI6MTc5MzExNTU1MywianRpIjoiODQ4NTI5NjctOTU1OS00ZGQyLWE5ZDEtM2YwYmZkOTJhN2I5Iiwic2lkIjoiOWU3Y2ZlMDktZDA1ZC00YzM5LTgwZGItNDYxZjk3MWU0ODhjIn0.hh-B-3oGPpBplXpeL0oV4Vt_Vzc7JBsC_8XCdoqqNZM",
  "access_expires_at": "2026-10-27T15:54:13.795820482Z",
  "refresh_token": "HDLlOnxi1D-4vJs_JH6NNCu5IrlzT8ITEGgQCamTWRo",
  "refresh_expires_at": "2026-10-28T03:39:13.794618313Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "b092f4de-11b2-48a9-937c-f3d554ff5ab0",
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
  "id": "217d8097-b5a9-4ae3-8dfa-9a7b99baa06c",
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
  "created_by": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
  "created_at": "2026-10-27T15:39:13.869398Z",
  "updated_at": "2026-10-27T15:39:13.869398Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633233786",
  "device_ref": "sandbox-20721"
}
```

```json
{
  "challenge_id": "e897c718-7334-4bd9-b25b-e0d53865eff0",
  "expires_at": "2026-10-27T15:44:13.916461794Z",
  "resend_available_at": "2026-10-27T15:39:14.916461794Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633233786` → **200**

```json
{
  "phone": "+380633233786",
  "audience": "CLIENT",
  "code": "144747",
  "sent_at": "2026-10-27T15:39:13.923287261Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e897c718-7334-4bd9-b25b-e0d53865eff0",
  "code": "144747",
  "device_ref": "sandbox-20721"
}
```

```json
{
  "session_id": "f9283584-189c-40d9-bd91-c5742af305e7",
  "subject": {
    "type": "CLIENT",
    "id": "3c7e55f2-633a-4c6c-9f0d-01ce65c4ddfa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzdlNTVmMi02MzNhLTRjNmMtOWYwZC0wMWNlNjVjNGRkZmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NDU0LCJpYXQiOjE3OTMxMTU1NTQsImp0aSI6ImIxNGY1NTMyLTJhMmMtNGI2Mi05MjA1LTBjNzM4MGUxM2Q5YSIsInNpZCI6ImY5MjgzNTg0LTE4OWMtNDBkOS1iZDkxLWM1NzQyYWYzMDVlNyJ9.JeYYhapty-3SEEsPnf1LNC6KaDSkl_10cLkx88mDaIc",
  "access_expires_at": "2026-10-27T15:54:14.006135037Z",
  "refresh_token": "wotSegdNDJmyRK0CPOVa6CAS3U37qow0EcHXXSRr2Pw",
  "refresh_expires_at": "2026-11-26T15:39:14.004981992Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633233786` → **200**

```json
{
  "client_id": "3c7e55f2-633a-4c6c-9f0d-01ce65c4ddfa"
}
```

`POST /api/admin/v1/rider-wallets/3c7e55f2-633a-4c6c-9f0d-01ce65c4ddfa/top-ups` → **201**

```json
{
  "command_id": "ce4829d3-937f-41b2-b0ad-334cbc4e5102",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "3c7e55f2-633a-4c6c-9f0d-01ce65c4ddfa",
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
      "id": "f5bd7ec1-a2c8-44d0-a1ad-116521c9c764",
      "at": "2026-10-27T15:39:14.096324Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "161e2174-b98c-48b1-85dc-7dc855b128f2",
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
  "id": "74ed193a-5cae-4bfd-ad7d-d1d09d4aafa7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:44:14.278229Z",
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
      "id": "217d8097-b5a9-4ae3-8dfa-9a7b99baa06c",
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
  "device_ref": "sandbox-9937"
}
```

```json
{
  "challenge_id": "15846420-f3a6-4673-ab96-4abd716957e8",
  "expires_at": "2026-10-27T15:44:14.35132802Z",
  "resend_available_at": "2026-10-27T15:39:15.35132802Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "503253",
  "sent_at": "2026-10-27T15:39:14.356134097Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15846420-f3a6-4673-ab96-4abd716957e8",
  "code": "503253",
  "device_ref": "sandbox-9937"
}
```

```json
{
  "session_id": "4f3df8f0-c976-4cb9-9ac4-a5141e42306e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ1NCwiaWF0IjoxNzkzMTE1NTU0LCJqdGkiOiI0MWU0OTNjMi0zOGNhLTRmNGMtOWVjZC0yZmJhYmZhMGIwNGMiLCJzaWQiOiI0ZjNkZjhmMC1jOTc2LTRjYjktOWFjNC1hNTE0MWU0MjMwNmUifQ.fBeCa40PO7YGkYaiHw9MKb_2V8zz43wGee13ix5Pb8I",
  "access_expires_at": "2026-10-27T15:54:14.416616431Z",
  "refresh_token": "zm7xf6rP-nfO0FUMEsA0taC0p77bCXILkpsMz4Uy_rA",
  "refresh_expires_at": "2026-11-26T15:39:14.415626902Z",
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
  "command_id": "f22595be-7464-400d-b290-59a1789cff6c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:14Z",
    "sequence": 1793115554480
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad749472-db3f-483d-b25d-5a26fdd7388e",
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
  "last_heartbeat_at": "2026-10-27T15:39:14.526432Z",
  "last_location_at": "2026-10-27T15:39:14.526432Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c0066daf-ee9e-43fc-92a9-84f525e990f7",
  "quote_id": "74ed193a-5cae-4bfd-ad7d-d1d09d4aafa7",
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
  "id": "d040194e-5879-4a34-9611-3b88e596f969",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3c7e55f2-633a-4c6c-9f0d-01ce65c4ddfa",
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
  "created_at": "2026-10-27T15:39:14.609921Z",
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
  "client_id": "3c7e55f2-633a-4c6c-9f0d-01ce65c4ddfa",
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
      "id": "f5bd7ec1-a2c8-44d0-a1ad-116521c9c764",
      "at": "2026-10-27T15:39:14.096324Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
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
    "id": "c2219dac-2797-41bd-aa02-5eab60c6e7df",
    "order_id": "d040194e-5879-4a34-9611-3b88e596f969",
    "expires_at": "2026-10-27T15:39:29.623893Z",
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

`POST /api/driver/v1/offers/c2219dac-2797-41bd-aa02-5eab60c6e7df/accept` → **200**

```json
{
  "command_id": "45a5a1ff-0c20-4e35-8afd-7e6cccae1a99"
}
```

```json
{
  "id": "eb7d1202-4058-4fef-a54d-80ee48998926",
  "order_id": "d040194e-5879-4a34-9611-3b88e596f969",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4a934f48-da87-4ea7-844e-9f17c882985f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4a934f48-da87-4ea7-844e-9f17c882985f",
  "order_id": "d040194e-5879-4a34-9611-3b88e596f969",
  "assignment_id": "eb7d1202-4058-4fef-a54d-80ee48998926",
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
  "discount_minor": 1052
}
```

`POST /api/driver/v1/work-sessions/ad749472-db3f-483d-b25d-5a26fdd7388e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:14Z",
    "sequence": 1793115554796
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad749472-db3f-483d-b25d-5a26fdd7388e",
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
  "last_heartbeat_at": "2026-10-27T15:39:14.822433Z",
  "last_location_at": "2026-10-27T15:39:14.822433Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4a934f48-da87-4ea7-844e-9f17c882985f/arrive` → **200**

```json
{
  "command_id": "8f20905e-16d1-43e4-ac64-36f476fbed72",
  "expected_version": 0
}
```

```json
{
  "id": "4a934f48-da87-4ea7-844e-9f17c882985f",
  "order_id": "d040194e-5879-4a34-9611-3b88e596f969",
  "assignment_id": "eb7d1202-4058-4fef-a54d-80ee48998926",
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
  "arrived_at": "2026-10-27T15:39:14.884418Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`POST /api/driver/v1/trips/4a934f48-da87-4ea7-844e-9f17c882985f/start` → **200**

```json
{
  "command_id": "d65f67ec-0b90-4386-9b44-7452c9467c46",
  "expected_version": 1
}
```

```json
{
  "id": "4a934f48-da87-4ea7-844e-9f17c882985f",
  "order_id": "d040194e-5879-4a34-9611-3b88e596f969",
  "assignment_id": "eb7d1202-4058-4fef-a54d-80ee48998926",
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
  "arrived_at": "2026-10-27T15:39:14.884418Z",
  "started_at": "2026-10-27T15:39:14.931288Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/4a934f48-da87-4ea7-844e-9f17c882985f/complete` → **200**

```json
{
  "command_id": "6e991a1a-ed18-4cff-bf13-ab8b9aa9a373",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:39:14Z",
  "cash_received": true
}
```

```json
{
  "id": "4a934f48-da87-4ea7-844e-9f17c882985f",
  "order_id": "d040194e-5879-4a34-9611-3b88e596f969",
  "assignment_id": "eb7d1202-4058-4fef-a54d-80ee48998926",
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
  "arrived_at": "2026-10-27T15:39:14.884418Z",
  "started_at": "2026-10-27T15:39:14.931288Z",
  "completed_at": "2026-10-27T15:39:15.001455Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3c7e55f2-633a-4c6c-9f0d-01ce65c4ddfa",
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
      "id": "1bb529e3-0a59-4cc8-90f8-26e7a5d8817e",
      "at": "2026-10-27T15:39:15.343884Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "d040194e-5879-4a34-9611-3b88e596f969"
    },
    {
      "id": "f5bd7ec1-a2c8-44d0-a1ad-116521c9c764",
      "at": "2026-10-27T15:39:14.096324Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/217d8097-b5a9-4ae3-8dfa-9a7b99baa06c/archive` → **200**

```json
{
  "command_id": "1e27e16c-cb1a-4f64-bcb4-3694af398592",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "217d8097-b5a9-4ae3-8dfa-9a7b99baa06c",
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
  "created_by": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
  "created_at": "2026-10-27T15:39:13.869398Z",
  "updated_at": "2026-10-27T15:39:18.096996Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad749472-db3f-483d-b25d-5a26fdd7388e",
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
  "last_heartbeat_at": "2026-10-27T15:39:14.822433Z",
  "last_location_at": "2026-10-27T15:39:14.822433Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ad749472-db3f-483d-b25d-5a26fdd7388e/close` → **200**

```json
{
  "command_id": "ec8d282f-c174-45ac-a106-6badc42449fa",
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

Done: order d040194e-5879-4a34-9611-3b88e596f969.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639411959",
  "device_ref": "sandbox-11945"
}
```

```json
{
  "challenge_id": "609ab314-5b47-4a40-b1e8-885afcb3647b",
  "expires_at": "2026-10-27T15:44:18.222812502Z",
  "resend_available_at": "2026-10-27T15:39:19.222812502Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639411959` → **200**

```json
{
  "phone": "+380639411959",
  "audience": "CLIENT",
  "code": "857472",
  "sent_at": "2026-10-27T15:39:18.226519458Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "609ab314-5b47-4a40-b1e8-885afcb3647b",
  "code": "857472",
  "device_ref": "sandbox-11945"
}
```

```json
{
  "session_id": "b8ec3dc5-38cd-48e9-8c47-97372efdbffc",
  "subject": {
    "type": "CLIENT",
    "id": "69183df6-b526-4a96-be23-028e3d39a9ec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTE4M2RmNi1iNTI2LTRhOTYtYmUyMy0wMjhlM2QzOWE5ZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NDU4LCJpYXQiOjE3OTMxMTU1NTgsImp0aSI6IjY2YjZhZDliLTcwOTUtNDc3MC1hYWQwLWNjMGFiNWM3ZTdlNSIsInNpZCI6ImI4ZWMzZGM1LTM4Y2QtNDhlOS04YzQ3LTk3MzcyZWZkYmZmYyJ9.T9Cl4UdQmEqDd_DlhkwhCNBaNACANvjSBiWdypUg9mY",
  "access_expires_at": "2026-10-27T15:54:18.284240404Z",
  "refresh_token": "4tAQKsR8CwSZAm6FKrWxV56gY5h7a-NmX2Vv-ctzZ-k",
  "refresh_expires_at": "2026-11-26T15:39:18.283266292Z",
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
  "device_ref": "sandbox-19332"
}
```

```json
{
  "challenge_id": "fd9ffec9-edd7-43db-a41a-b976d0150bff",
  "expires_at": "2026-10-27T15:44:18.34096043Z",
  "resend_available_at": "2026-10-27T15:39:19.34096043Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "613128",
  "sent_at": "2026-10-27T15:39:18.344474192Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd9ffec9-edd7-43db-a41a-b976d0150bff",
  "code": "613128",
  "device_ref": "sandbox-19332"
}
```

```json
{
  "session_id": "cdf96e32-b264-4e7d-bf80-d1412ca6b6bb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ1OCwiaWF0IjoxNzkzMTE1NTU4LCJqdGkiOiJjNTZhZTExMS04ODFlLTRkMzQtYTQxNy03OTZhZWMzZmRlOGIiLCJzaWQiOiJjZGY5NmUzMi1iMjY0LTRlN2QtYmY4MC1kMTQxMmNhNmI2YmIifQ.hzvqUWecvP7hfUKtSo4XpQuDN1_0gHHg7aftuFr8RFk",
  "access_expires_at": "2026-10-27T15:54:18.404844108Z",
  "refresh_token": "Ai4NGWeX1LwMqSliU7cdOOSFGFw8je-xtSGh14CEY2k",
  "refresh_expires_at": "2026-11-26T15:39:18.403898108Z",
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
  "session_id": "a64ea035-13fb-4cd7-9ca0-7d1d2a756bc1",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0NTgsImlhdCI6MTc5MzExNTU1OCwianRpIjoiOGFjYTc4NWItNWU0ZS00MDJhLTg5YjYtMDM2MDJhY2QzMDI1Iiwic2lkIjoiYTY0ZWEwMzUtMTNmYi00Y2Q3LTljYTAtN2QxZDJhNzU2YmMxIn0.A8mbn7pI-CHdNxFPHnrXtRl607maJ-IP71mb5IZIbZI",
  "access_expires_at": "2026-10-27T15:54:18.750148113Z",
  "refresh_token": "-FMMD6yD3c0TE2rhxVazNWSoa6lWB-XLNubjDomJHUQ",
  "refresh_expires_at": "2026-10-28T03:39:18.74948865Z",
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
  "session_id": "9f49b0c3-8b81-4919-8b72-4abd5fe925ab",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0NTksImlhdCI6MTc5MzExNTU1OSwianRpIjoiNTgyNGQ1M2YtZjdkOC00MTEyLWIxMDItYjdlZjYwMzZjMzBhIiwic2lkIjoiOWY0OWIwYzMtOGI4MS00OTE5LThiNzItNGFiZDVmZTkyNWFiIn0.ZRFdjGHO64uir4IouvL_o0GaDSqnsYdy2I3Wx5rgLJQ",
  "access_expires_at": "2026-10-27T15:54:19.071956985Z",
  "refresh_token": "JGQLh08oxoAkDr-O1i_0imEnoDDC4Do8uAvyGsriQAw",
  "refresh_expires_at": "2026-10-28T03:39:19.070871595Z",
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
  "command_id": "f6ac1b4b-2536-43e7-8ef5-e22678afcb83",
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
  "id": "efbebae2-9799-457a-b437-8c9c9ad60d81",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:44:19.140444Z",
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
  "command_id": "5aa1f1b3-5098-4739-975b-7756f1c55a02",
  "quote_id": "efbebae2-9799-457a-b437-8c9c9ad60d81",
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
  "id": "216bbf2d-556e-4fe7-bdb1-1598e609d78b",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69183df6-b526-4a96-be23-028e3d39a9ec",
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
  "created_at": "2026-10-27T15:39:19.183053Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/216bbf2d-556e-4fe7-bdb1-1598e609d78b` → **200**

```json
{
  "id": "216bbf2d-556e-4fe7-bdb1-1598e609d78b",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69183df6-b526-4a96-be23-028e3d39a9ec",
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
  "created_at": "2026-10-27T15:39:19.183053Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/216bbf2d-556e-4fe7-bdb1-1598e609d78b/cancel` → **200**

```json
{
  "command_id": "6fea6f83-d38d-4fd7-aba1-ac46453338e4",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "216bbf2d-556e-4fe7-bdb1-1598e609d78b",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "69183df6-b526-4a96-be23-028e3d39a9ec",
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
  "created_at": "2026-10-27T15:39:19.183053Z",
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
  "command_id": "d29fff04-a380-49b0-9f6f-42cc77df17da",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:19Z",
    "sequence": 1793115559326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f07ec81a-a3dc-4060-ad1e-42abefcb2e1e",
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
  "last_heartbeat_at": "2026-10-27T15:39:19.346169Z",
  "last_location_at": "2026-10-27T15:39:19.346169Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12822"
}
```

```json
{
  "challenge_id": "3a5d2acb-7421-4000-9b4b-858796dc9385",
  "expires_at": "2026-10-27T15:44:19.377525376Z",
  "resend_available_at": "2026-10-27T15:39:20.377525376Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "028113",
  "sent_at": "2026-10-27T15:39:19.3810505Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a5d2acb-7421-4000-9b4b-858796dc9385",
  "code": "028113",
  "device_ref": "sandbox-12822"
}
```

```json
{
  "session_id": "b0a6d274-56ad-40f8-b2e6-ca2c6c0db575",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ1OSwiaWF0IjoxNzkzMTE1NTU5LCJqdGkiOiJmNzRkMjMxZC0wNjBiLTRlMTktOTg4YS1kMjEwODY3MGFmNTQiLCJzaWQiOiJiMGE2ZDI3NC01NmFkLTQwZjgtYjJlNi1jYTJjNmMwZGI1NzUifQ.bV4-xpxfC82aJIboIO2iDTVpy0EHYPV23HHbmWTaTPU",
  "access_expires_at": "2026-10-27T15:54:19.444093329Z",
  "refresh_token": "5H3rTaGExNs8rcy8UmMxBKRswG0Upj82ZXQr5NfuI18",
  "refresh_expires_at": "2026-11-26T15:39:19.443417285Z",
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
  "command_id": "d3847a73-036f-4589-8a7d-9d96a19ff62f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:19Z",
    "sequence": 1793115559496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acdacfdf-a2f3-470d-95dc-37dbe14cd8fa",
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
  "last_heartbeat_at": "2026-10-27T15:39:19.515964Z",
  "last_location_at": "2026-10-27T15:39:19.515964Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a69bff71-d0e5-4e33-9a50-168c12981f68",
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
  "id": "9ec40299-bf8e-420a-9432-9154a6138ae6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T15:44:19.558074Z",
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
  "command_id": "37f6ca9d-9487-4f2a-955b-7338197b14f5",
  "quote_id": "9ec40299-bf8e-420a-9432-9154a6138ae6",
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
  "id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "69183df6-b526-4a96-be23-028e3d39a9ec",
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
  "created_at": "2026-10-27T15:39:19.597606Z",
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
    "id": "12e6416e-fd45-483e-bd87-2ebb69de8c75",
    "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
    "expires_at": "2026-10-27T15:39:34.602694Z",
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

`POST /api/driver/v1/offers/12e6416e-fd45-483e-bd87-2ebb69de8c75/accept` → **200**

```json
{
  "command_id": "82f66ac6-bdd4-43b3-a330-92d0ce44db5e"
}
```

```json
{
  "id": "a4ced272-8758-4dfa-bfe3-0a9bd1084137",
  "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fbbad559-203d-40d6-8154-7feab53647ce",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fbbad559-203d-40d6-8154-7feab53647ce",
  "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
  "assignment_id": "a4ced272-8758-4dfa-bfe3-0a9bd1084137",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/fbbad559-203d-40d6-8154-7feab53647ce/cancel` → **200**

```json
{
  "command_id": "48c65643-f201-47ea-b4f8-2436e3217f8d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "fbbad559-203d-40d6-8154-7feab53647ce",
  "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
  "assignment_id": "a4ced272-8758-4dfa-bfe3-0a9bd1084137",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/2c9728e8-b85b-44f7-8681-4a50819d3d3d` → **200**

```json
{
  "id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "69183df6-b526-4a96-be23-028e3d39a9ec",
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
    "id": "a4ced272-8758-4dfa-bfe3-0a9bd1084137",
    "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "fbbad559-203d-40d6-8154-7feab53647ce",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T15:39:19.597606Z",
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
    "id": "15596cb5-a659-4bf6-a8b4-6087c0df72ce",
    "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
    "expires_at": "2026-10-27T15:39:34.753154Z",
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

`POST /api/driver/v1/offers/15596cb5-a659-4bf6-a8b4-6087c0df72ce/accept` → **200**

```json
{
  "command_id": "79f3986a-cf7f-4330-856b-3c388ba20ece"
}
```

```json
{
  "id": "f7ab90ca-e8c0-4fa6-afef-9844082c321e",
  "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c8b0ae97-d76f-4541-a8e1-0ac118ab7de9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c8b0ae97-d76f-4541-a8e1-0ac118ab7de9",
  "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
  "assignment_id": "f7ab90ca-e8c0-4fa6-afef-9844082c321e",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/c8b0ae97-d76f-4541-a8e1-0ac118ab7de9/cancel` → **200**

```json
{
  "command_id": "907eb138-bfbd-40a2-936e-6d1a44a8f58c",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "c8b0ae97-d76f-4541-a8e1-0ac118ab7de9",
  "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
  "assignment_id": "f7ab90ca-e8c0-4fa6-afef-9844082c321e",
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
  "discount_minor": 0
}
```

## The rider sees who cancelled; the operator sees the whole history

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:39:19.597606Z",
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
    "id": "216bbf2d-556e-4fe7-bdb1-1598e609d78b",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:39:19.183053Z",
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

`GET /api/operator/v1/orders/2c9728e8-b85b-44f7-8681-4a50819d3d3d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:39:19.59843Z",
      "actor": {
        "type": "CLIENT",
        "id": "69183df6-b526-4a96-be23-028e3d39a9ec",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
        "quote_id": "9ec40299-bf8e-420a-9432-9154a6138ae6",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:39:19.601201Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
        "attempt_id": "4a543a11-3a59-4adc-881f-228bff918203",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:39:19.608091Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "12e6416e-fd45-483e-bd87-2ebb69de8c75",
        "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:39:19.673458Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "12e6416e-fd45-483e-bd87-2ebb69de8c75",
        "order_id": "2c9728e8-b85b-44f7-8681-4a50819d3d3d",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "a4ced272-8758-4dfa-bfe3-0a9bd1084137"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 216bbf2d-556e-4fe7-bdb1-1598e609d78b, 2c9728e8-b85b-44f7-8681-4a50819d3d3d.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738009357",
  "device_ref": "sandbox-24476"
}
```

```json
{
  "challenge_id": "6176748c-bfeb-47b9-be26-392c7080ee2d",
  "expires_at": "2026-10-27T15:44:20.028373218Z",
  "resend_available_at": "2026-10-27T15:39:21.028373218Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738009357` → **200**

```json
{
  "phone": "+380738009357",
  "audience": "CLIENT",
  "code": "251255",
  "sent_at": "2026-10-27T15:39:20.032031929Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6176748c-bfeb-47b9-be26-392c7080ee2d",
  "code": "251255",
  "device_ref": "sandbox-24476"
}
```

```json
{
  "session_id": "72bf5fcd-06c4-4f23-aa0c-292be057a7e0",
  "subject": {
    "type": "CLIENT",
    "id": "23050aa2-c4fd-48df-8c03-5d087573b4d8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMzA1MGFhMi1jNGZkLTQ4ZGYtOGMwMy01ZDA4NzU3M2I0ZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NDYwLCJpYXQiOjE3OTMxMTU1NjAsImp0aSI6IjVlMTE4NDM2LTk4NzItNDUyMy1hMDI4LWMxZGJiYmY5NTNjZiIsInNpZCI6IjcyYmY1ZmNkLTA2YzQtNGYyMy1hYTBjLTI5MmJlMDU3YTdlMCJ9.RWdseouvsdeWc08N6WS7dFrBVCtvVJr6c7lYY8Ny_Kw",
  "access_expires_at": "2026-10-27T15:54:20.089717081Z",
  "refresh_token": "J5yc2OjhIZ7_gJOKIo3J4Af9clPy40GHMif9OnD5uUc",
  "refresh_expires_at": "2026-11-26T15:39:20.088837516Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "5832123a-a910-425f-9e28-212be5c361d1",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "01f5b429-d688-4b8e-9ed7-c7f578416cb2",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-01f5b429-d688-4b8e-9ed7-c7f578416cb2",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "03b2a14c186a915bd12cd02a66d742c9",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=01f5b429-d688-4b8e-9ed7-c7f578416cb2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738009357"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=01f5b429-d688-4b8e-9ed7-c7f578416cb2",
  "expires_at": "2026-10-27T16:09:20.128284Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/01f5b429-d688-4b8e-9ed7-c7f578416cb2` → **200**

```json
{
  "id": "01f5b429-d688-4b8e-9ed7-c7f578416cb2",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T16:09:20.128284Z",
  "card": {
    "id": "bfe10d1b-722f-4408-b5d8-1ee0475808db",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4782",
    "card_type": "Visa",
    "created_at": "2026-10-27T15:39:20.174422Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "bfe10d1b-722f-4408-b5d8-1ee0475808db",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4782",
      "card_type": "Visa",
      "created_at": "2026-10-27T15:39:20.174422Z"
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
  "device_ref": "sandbox-23934"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "1e377b77-eadc-45f5-879e-c19c39fc4787",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-23934"
}
```

```json
{
  "challenge_id": "5d3e04e2-e254-449b-a121-d57c0e37b317",
  "expires_at": "2026-10-27T15:44:21.288379162Z",
  "resend_available_at": "2026-10-27T15:39:22.288379162Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "555128",
  "sent_at": "2026-10-27T15:39:21.291618951Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d3e04e2-e254-449b-a121-d57c0e37b317",
  "code": "555128",
  "device_ref": "sandbox-23934"
}
```

```json
{
  "session_id": "fbee12b2-96f5-4538-a658-95a31b5fc5f1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ2MSwiaWF0IjoxNzkzMTE1NTYxLCJqdGkiOiI0NGY4MDQxOS00MDBjLTRhMzQtYTJkYi01NWJkZjI0OGZlMTIiLCJzaWQiOiJmYmVlMTJiMi05NmY1LTQ1MzgtYTY1OC05NWEzMWI1ZmM1ZjEifQ.ZOza-BAnd6jF8eSz-Zplmj3Nggm7OOMlanpHYcNjLMA",
  "access_expires_at": "2026-10-27T15:54:21.34752134Z",
  "refresh_token": "34uhi-qX1vi2Q5obwCN3bdM6BhTYYE-Fl1R3AZ6gOhc",
  "refresh_expires_at": "2026-11-26T15:39:21.346866184Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acdacfdf-a2f3-470d-95dc-37dbe14cd8fa",
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
  "last_heartbeat_at": "2026-10-27T15:39:19.515964Z",
  "last_location_at": "2026-10-27T15:39:19.515964Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/acdacfdf-a2f3-470d-95dc-37dbe14cd8fa/handover` → **200**

```json
{
  "command_id": "80460822-a224-4446-b3fe-2f26e0a13d84",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acdacfdf-a2f3-470d-95dc-37dbe14cd8fa",
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
  "last_heartbeat_at": "2026-10-27T15:39:19.515964Z",
  "last_location_at": "2026-10-27T15:39:19.515964Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/acdacfdf-a2f3-470d-95dc-37dbe14cd8fa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:21Z",
    "sequence": 1793115561438
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acdacfdf-a2f3-470d-95dc-37dbe14cd8fa",
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
  "last_heartbeat_at": "2026-10-27T15:39:21.458774Z",
  "last_location_at": "2026-10-27T15:39:21.458774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b125633d-5cf5-472a-a2fc-5d7c995756ee",
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
  "id": "97f5e357-6b80-43ed-9012-cb9f3b4427c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T15:44:21.497551Z",
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
  "command_id": "f7ff4a94-4a3a-4f9b-9be8-4d5a80eb737f",
  "quote_id": "97f5e357-6b80-43ed-9012-cb9f3b4427c7",
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
  "id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "23050aa2-c4fd-48df-8c03-5d087573b4d8",
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
  "created_at": "2026-10-27T15:39:21.535467Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/824dd961-1aa3-4090-9e57-a24b9c657f5b` → **200**

```json
{
  "id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "23050aa2-c4fd-48df-8c03-5d087573b4d8",
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
  "created_at": "2026-10-27T15:39:21.535467Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/824dd961-1aa3-4090-9e57-a24b9c657f5b` → **200**

```json
{
  "id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "23050aa2-c4fd-48df-8c03-5d087573b4d8",
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
  "created_at": "2026-10-27T15:39:21.535467Z",
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
    "id": "718097e1-08c2-4a78-b093-e5e766d9587e",
    "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
    "expires_at": "2026-10-27T15:39:37.457864Z",
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

`POST /api/driver/v1/offers/718097e1-08c2-4a78-b093-e5e766d9587e/accept` → **200**

```json
{
  "command_id": "5f89b0d9-e4a2-4242-ba9a-9d6bf93e40c2"
}
```

```json
{
  "id": "a76000b6-a68a-48f4-bb40-7a8724d8458c",
  "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "032776ef-1075-4ee6-897e-b983a573c5c8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "032776ef-1075-4ee6-897e-b983a573c5c8",
  "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "assignment_id": "a76000b6-a68a-48f4-bb40-7a8724d8458c",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/acdacfdf-a2f3-470d-95dc-37dbe14cd8fa/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:22Z",
    "sequence": 1793115562720
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acdacfdf-a2f3-470d-95dc-37dbe14cd8fa",
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
  "last_heartbeat_at": "2026-10-27T15:39:22.740839Z",
  "last_location_at": "2026-10-27T15:39:22.740839Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/032776ef-1075-4ee6-897e-b983a573c5c8/arrive` → **200**

```json
{
  "command_id": "46e07c77-89f9-4c2c-a16b-e0415ba34acf",
  "expected_version": 0
}
```

```json
{
  "id": "032776ef-1075-4ee6-897e-b983a573c5c8",
  "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "assignment_id": "a76000b6-a68a-48f4-bb40-7a8724d8458c",
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
  "arrived_at": "2026-10-27T15:39:22.780915Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/032776ef-1075-4ee6-897e-b983a573c5c8/start` → **200**

```json
{
  "command_id": "3c4a0a9a-63de-4b0d-bd27-b43baca1894c",
  "expected_version": 1
}
```

```json
{
  "id": "032776ef-1075-4ee6-897e-b983a573c5c8",
  "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "assignment_id": "a76000b6-a68a-48f4-bb40-7a8724d8458c",
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
  "arrived_at": "2026-10-27T15:39:22.780915Z",
  "started_at": "2026-10-27T15:39:22.825576Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/032776ef-1075-4ee6-897e-b983a573c5c8/complete` → **200**

```json
{
  "command_id": "80eb9769-d129-49e8-9f19-cecaa9ab429c",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:39:22Z"
}
```

```json
{
  "id": "032776ef-1075-4ee6-897e-b983a573c5c8",
  "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "assignment_id": "a76000b6-a68a-48f4-bb40-7a8724d8458c",
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
  "arrived_at": "2026-10-27T15:39:22.780915Z",
  "started_at": "2026-10-27T15:39:22.825576Z",
  "completed_at": "2026-10-27T15:39:22.875575Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/824dd961-1aa3-4090-9e57-a24b9c657f5b` → **200**

```json
{
  "id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "23050aa2-c4fd-48df-8c03-5d087573b4d8",
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
    "id": "a76000b6-a68a-48f4-bb40-7a8724d8458c",
    "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "032776ef-1075-4ee6-897e-b983a573c5c8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:39:21.535467Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/824dd961-1aa3-4090-9e57-a24b9c657f5b` → **200**

```json
{
  "id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "23050aa2-c4fd-48df-8c03-5d087573b4d8",
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
    "id": "a76000b6-a68a-48f4-bb40-7a8724d8458c",
    "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "032776ef-1075-4ee6-897e-b983a573c5c8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:39:21.535467Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/824dd961-1aa3-4090-9e57-a24b9c657f5b` → **200**

```json
{
  "id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "23050aa2-c4fd-48df-8c03-5d087573b4d8",
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
    "id": "a76000b6-a68a-48f4-bb40-7a8724d8458c",
    "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "032776ef-1075-4ee6-897e-b983a573c5c8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:39:21.535467Z",
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
      "id": "72397d2a-34b0-49ea-99d5-2fe29de5563b",
      "at": "2026-10-27T15:39:23.492229Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/824dd961-1aa3-4090-9e57-a24b9c657f5b/tip` → **200**

```json
{
  "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
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
  "available_until": "2026-10-28T15:39:22.875575Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/824dd961-1aa3-4090-9e57-a24b9c657f5b/tip` → **201**

```json
{
  "command_id": "aab5260a-1e87-4dd9-b393-8681e4249508",
  "amount_minor": 2500
}
```

```json
{
  "id": "d75e497e-4e13-4ae3-88c3-e25081d9c1e2",
  "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T15:39:25.109866Z"
}
```

`GET /api/rider/v1/orders/824dd961-1aa3-4090-9e57-a24b9c657f5b/tip` → **200**

```json
{
  "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
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
  "available_until": "2026-10-28T15:39:22.875575Z",
  "open": false,
  "tip": {
    "id": "d75e497e-4e13-4ae3-88c3-e25081d9c1e2",
    "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T15:39:25.109866Z"
  }
}
```

`GET /api/rider/v1/orders/824dd961-1aa3-4090-9e57-a24b9c657f5b/tip` → **200**

```json
{
  "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
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
  "available_until": "2026-10-28T15:39:22.875575Z",
  "open": false,
  "tip": {
    "id": "d75e497e-4e13-4ae3-88c3-e25081d9c1e2",
    "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T15:39:25.109866Z"
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
      "id": "72397d2a-34b0-49ea-99d5-2fe29de5563b",
      "at": "2026-10-27T15:39:23.492229Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
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
      "id": "ebaace42-6597-4d72-b569-6f9c802044d6",
      "at": "2026-10-27T15:39:26.540483Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
      "counterpart_id": null
    },
    {
      "id": "72397d2a-34b0-49ea-99d5-2fe29de5563b",
      "at": "2026-10-27T15:39:23.492229Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "824dd961-1aa3-4090-9e57-a24b9c657f5b",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "acdacfdf-a2f3-470d-95dc-37dbe14cd8fa",
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
  "last_heartbeat_at": "2026-10-27T15:39:22.740839Z",
  "last_location_at": "2026-10-27T15:39:22.740839Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/acdacfdf-a2f3-470d-95dc-37dbe14cd8fa/close` → **200**

```json
{
  "command_id": "756166e7-d392-41da-932a-16b2de1876f3",
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

Done: card order 824dd961-1aa3-4090-9e57-a24b9c657f5b.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735062278",
  "device_ref": "sandbox-3917"
}
```

```json
{
  "challenge_id": "b42077b5-c5f7-46e6-b487-679065230f79",
  "expires_at": "2026-10-27T15:44:27.328386963Z",
  "resend_available_at": "2026-10-27T15:39:28.328386963Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735062278` → **200**

```json
{
  "phone": "+380735062278",
  "audience": "CLIENT",
  "code": "097897",
  "sent_at": "2026-10-27T15:39:27.331293577Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b42077b5-c5f7-46e6-b487-679065230f79",
  "code": "097897",
  "device_ref": "sandbox-3917"
}
```

```json
{
  "session_id": "284b9752-6ee1-494f-8980-c79d921713d3",
  "subject": {
    "type": "CLIENT",
    "id": "431a6d3f-a8a1-4fb4-ab0f-391cd0775090"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzFhNmQzZi1hOGExLTRmYjQtYWIwZi0zOTFjZDA3NzUwOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NDY3LCJpYXQiOjE3OTMxMTU1NjcsImp0aSI6IjI0YjBmOWE4LWZlNWMtNDg4Mi1iMmRiLTNlNmZjMDVjYzlhYSIsInNpZCI6IjI4NGI5NzUyLTZlZTEtNDk0Zi04OTgwLWM3OWQ5MjE3MTNkMyJ9.A8v_sN8v8Xgi0uA8mkgmEREzWavjd2fsDCu8C-SAVIg",
  "access_expires_at": "2026-10-27T15:54:27.38890969Z",
  "refresh_token": "BQpQJaAS_q3Nv-dNSALqLuMFUQS24NvQahLD2xWgE1I",
  "refresh_expires_at": "2026-11-26T15:39:27.388186879Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "c634b516-8b49-4871-b1c6-dfcea7f1b7a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "ac97f1f1-1712-4628-8fb4-6b6695f8b308",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ac97f1f1-1712-4628-8fb4-6b6695f8b308",
    "orderDate": "1793115567",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "ae88ede64d66da78a14dd4e9c6f0ef7f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ac97f1f1-1712-4628-8fb4-6b6695f8b308",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735062278"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ac97f1f1-1712-4628-8fb4-6b6695f8b308",
  "created_at": "2026-10-27T15:39:27.426248Z",
  "expires_at": "2026-10-27T16:09:27.426248Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/ac97f1f1-1712-4628-8fb4-6b6695f8b308` → **200**

```json
{
  "id": "ac97f1f1-1712-4628-8fb4-6b6695f8b308",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T15:39:27.426248Z",
  "expires_at": "2026-10-27T16:09:27.426248Z",
  "completed_at": "2026-10-27T15:39:27.464978Z",
  "masked_pan": "41****8423",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "431a6d3f-a8a1-4fb4-ab0f-391cd0775090",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "431a6d3f-a8a1-4fb4-ab0f-391cd0775090",
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
      "id": "16cb48a1-66bc-41c2-a351-c4008718e834",
      "at": "2026-10-27T15:39:27.552268Z",
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
  "client_id": "431a6d3f-a8a1-4fb4-ab0f-391cd0775090",
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
      "id": "16cb48a1-66bc-41c2-a351-c4008718e834",
      "at": "2026-10-27T15:39:27.552268Z",
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
  "device_ref": "sandbox-29855"
}
```

```json
{
  "challenge_id": "3aab6187-d0ea-4e89-98c7-56bc080c11f5",
  "expires_at": "2026-10-27T15:44:28.59786142Z",
  "resend_available_at": "2026-10-27T15:39:29.59786142Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "084639",
  "sent_at": "2026-10-27T15:39:28.600815202Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3aab6187-d0ea-4e89-98c7-56bc080c11f5",
  "code": "084639",
  "device_ref": "sandbox-29855"
}
```

```json
{
  "session_id": "b83f55ba-2e01-4fc3-bc85-5908a98f4288",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ2OCwiaWF0IjoxNzkzMTE1NTY4LCJqdGkiOiIxN2RhMWFmMy1iMTJhLTQwYmYtYmE2Yi1iM2FlZmM0YjM4NzIiLCJzaWQiOiJiODNmNTViYS0yZTAxLTRmYzMtYmM4NS01OTA4YTk4ZjQyODgifQ.5PVqQ6GuwzVrI77QAgXSXqO1C48fdmzXAwH5i4EXtTg",
  "access_expires_at": "2026-10-27T15:54:28.658679624Z",
  "refresh_token": "ANedCFT95ODtA3o3jy5XQBlMd9eCMJZzZ3pDZeOY7ag",
  "refresh_expires_at": "2026-11-26T15:39:28.658084471Z",
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
  "command_id": "9afbcde7-f4f4-4503-9f13-6de621a16d5d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "aaf60ca8-822a-4116-9739-0736d41a5a92",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-aaf60ca8-822a-4116-9739-0736d41a5a92",
    "orderDate": "1793115568",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "6002be095ece71fb76d81459d7b7e390",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=aaf60ca8-822a-4116-9739-0736d41a5a92",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=aaf60ca8-822a-4116-9739-0736d41a5a92",
  "created_at": "2026-10-27T15:39:28.716905Z",
  "expires_at": "2026-10-27T16:09:28.716905Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/aaf60ca8-822a-4116-9739-0736d41a5a92` → **200**

```json
{
  "id": "aaf60ca8-822a-4116-9739-0736d41a5a92",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T15:39:28.716905Z",
  "expires_at": "2026-10-27T16:09:28.716905Z",
  "completed_at": "2026-10-27T15:39:28.749687Z",
  "masked_pan": "41****5003",
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
      "id": "5b89b724-0289-4f76-bb5c-8fc1fd3ae2c6",
      "at": "2026-10-27T15:39:29.56407Z",
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
  "command_id": "882c5cf4-1ffa-4ea1-a0bc-239d25dd9610",
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
  "correlation_id": "68803053-5509-4b2b-81df-42f07bee273f"
}
```

Done: the rider's account and the driver's balance were topped up by card.

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
  "device_ref": "sandbox-18114"
}
```

```json
{
  "challenge_id": "da7a3454-4eb0-47ef-9049-87cea186b97a",
  "expires_at": "2026-10-27T15:44:29.923529867Z",
  "resend_available_at": "2026-10-27T15:39:30.923529867Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "367164",
  "sent_at": "2026-10-27T15:39:29.926370437Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da7a3454-4eb0-47ef-9049-87cea186b97a",
  "code": "367164",
  "device_ref": "sandbox-18114"
}
```

```json
{
  "session_id": "bedc2187-b1ce-4348-8ef1-6c3f90b1adea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ2OSwiaWF0IjoxNzkzMTE1NTY5LCJqdGkiOiJmODUxOTQ2My0xY2MzLTRjMzEtOTQxYS1lZGNiMGUxOWM4MjciLCJzaWQiOiJiZWRjMjE4Ny1iMWNlLTQzNDgtOGVmMS02YzNmOTBiMWFkZWEifQ.JqSxKGPnAH7c9AAmierrZsRDPmu5EdNDCY2Uz6rlm90",
  "access_expires_at": "2026-10-27T15:54:29.982858601Z",
  "refresh_token": "lka0tz8qSkE9Q5-Fl2sgs-7JcnRp-RuIyB8qKcnMd8E",
  "refresh_expires_at": "2026-11-26T15:39:29.982180967Z",
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
  "command_id": "5a739eb9-650c-4cb1-bee0-be50b8ad694f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:30Z",
    "sequence": 1793115570346
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:30.052892Z",
  "last_location_at": "2026-10-27T15:39:30.052892Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675034390",
  "device_ref": "sandbox-32679"
}
```

```json
{
  "challenge_id": "214269a7-8bb1-4411-a67c-86c079c4a7dc",
  "expires_at": "2026-10-27T15:44:30.085897656Z",
  "resend_available_at": "2026-10-27T15:39:31.085897656Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675034390` → **200**

```json
{
  "phone": "+380675034390",
  "audience": "CLIENT",
  "code": "599847",
  "sent_at": "2026-10-27T15:39:30.088979841Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "214269a7-8bb1-4411-a67c-86c079c4a7dc",
  "code": "599847",
  "device_ref": "sandbox-32679"
}
```

```json
{
  "session_id": "c600157a-ff4d-4b85-9768-ae4f50e364e3",
  "subject": {
    "type": "CLIENT",
    "id": "f3d88523-816a-4753-9665-c590e77ddade"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmM2Q4ODUyMy04MTZhLTQ3NTMtOTY2NS1jNTkwZTc3ZGRhZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NDcwLCJpYXQiOjE3OTMxMTU1NzAsImp0aSI6IjA3ZjMwYmUzLWZkZWYtNGMwOC1iZmI3LTIyZGMyNGJiNDU5ZCIsInNpZCI6ImM2MDAxNTdhLWZmNGQtNGI4NS05NzY4LWFlNGY1MGUzNjRlMyJ9.ow8d-1-UiNaZPdNlV5Ma7OBJKYFT0gCvKAofEgFiOKY",
  "access_expires_at": "2026-10-27T15:54:30.144450344Z",
  "refresh_token": "QZMvYVtKp2cC14KdZGYSYIiRa9ZVbM-ZmJNIDnm-5Ow",
  "refresh_expires_at": "2026-11-26T15:39:30.143803535Z",
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
  "command_id": "9451fef2-3aef-4466-812f-75c807ff5a18",
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
  "id": "545bd373-7fbb-4e0b-a84b-c5c6035bf640",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:44:30.208350Z",
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
  "command_id": "8487d718-b060-4490-96cc-477688ed627e",
  "platform": "ANDROID",
  "token": "sandbox-driver-6039aa90-17a2-4deb-a0fa-589c8b37db34"
}
```

```json
{
  "id": "fcda7b8e-fccd-4a32-b107-22ee62ac94f1",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:39:30.25348Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "4def10fb-bb7c-407b-801e-34566eb235f3",
  "platform": "ANDROID",
  "token": "sandbox-rider-d167e6eb-9787-459e-b6cc-b95fa506dc85"
}
```

```json
{
  "id": "781860f4-6a86-47aa-9e5a-58f6901af0f2",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T15:39:30.289178Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "51198fe0-fe28-4a54-b2b3-229424085dfe",
  "quote_id": "545bd373-7fbb-4e0b-a84b-c5c6035bf640",
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
  "id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f3d88523-816a-4753-9665-c590e77ddade",
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
  "created_at": "2026-10-27T15:39:30.330694Z",
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
    "id": "36d93a0d-9ece-402d-b115-d47806d0ff67",
    "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
    "expires_at": "2026-10-27T15:39:45.335294Z",
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

`POST /api/driver/v1/offers/36d93a0d-9ece-402d-b115-d47806d0ff67/accept` → **200**

```json
{
  "command_id": "0334f89c-2e41-475c-830d-a4003a75704b"
}
```

```json
{
  "id": "b7e44197-616f-443a-b901-7fc9b6175b88",
  "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "06f94be4-3e5a-473a-ba05-42f9a1692766",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:39:30.309Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T15:39:30.309Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:39:31.334616162Z",
    "token_suffix": "37db34",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "46e4da6a-7179-4158-b91f-ef5b470be38f",
      "order_version": "2",
      "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675034390&after=2026-10-27T15:39:30.309Z` → **200**

```json
[
  {
    "at": "2026-10-27T15:39:31.336571368Z",
    "token_suffix": "06dc85",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "cd65a4d9-2ec7-4174-872b-b3925e50c920",
      "order_version": "3",
      "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/6816db82-10dc-4bcc-b453-44e00f8385ce/messages` → **201**

```json
{
  "command_id": "7f5b487f-e83d-4a1b-97ff-b25ae2cb8436",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "f444ad6d-6695-4b08-b4a7-0e17409f1737",
  "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T15:39:31.528990338Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "06f94be4-3e5a-473a-ba05-42f9a1692766",
  "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
  "assignment_id": "b7e44197-616f-443a-b901-7fc9b6175b88",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/06f94be4-3e5a-473a-ba05-42f9a1692766/messages` → **201**

```json
{
  "command_id": "27e350f5-45b4-445c-998f-0f972c478ba1",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "52325b5d-868c-40c5-8d21-1f52197a4108",
  "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T15:39:31.582017674Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/6816db82-10dc-4bcc-b453-44e00f8385ce/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/06f94be4-3e5a-473a-ba05-42f9a1692766/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675034390"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/6a93baef-5bbe-4071-86ff-7663c5a513e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:31Z",
    "sequence": 1793115571662
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:31.682478Z",
  "last_location_at": "2026-10-27T15:39:31.682478Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "06f94be4-3e5a-473a-ba05-42f9a1692766",
  "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
  "assignment_id": "b7e44197-616f-443a-b901-7fc9b6175b88",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/06f94be4-3e5a-473a-ba05-42f9a1692766/arrive` → **200**

```json
{
  "command_id": "7d561808-feeb-44c0-a752-794d34eaabd2",
  "expected_version": 0
}
```

```json
{
  "id": "06f94be4-3e5a-473a-ba05-42f9a1692766",
  "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
  "assignment_id": "b7e44197-616f-443a-b901-7fc9b6175b88",
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
  "arrived_at": "2026-10-27T15:39:31.737817Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/06f94be4-3e5a-473a-ba05-42f9a1692766/start` → **200**

```json
{
  "command_id": "e1a78664-9ff2-4d6b-a838-8f2a2ef8d505",
  "expected_version": 1
}
```

```json
{
  "id": "06f94be4-3e5a-473a-ba05-42f9a1692766",
  "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
  "assignment_id": "b7e44197-616f-443a-b901-7fc9b6175b88",
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
  "arrived_at": "2026-10-27T15:39:31.737817Z",
  "started_at": "2026-10-27T15:39:31.774972Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/6a93baef-5bbe-4071-86ff-7663c5a513e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:31Z",
    "sequence": 1793115571799
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:31.81876Z",
  "last_location_at": "2026-10-27T15:39:31.81876Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/06f94be4-3e5a-473a-ba05-42f9a1692766/complete` → **200**

```json
{
  "command_id": "c3d37ee2-2bef-4adb-86dc-8565540b0891",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:39:31Z",
  "cash_received": true
}
```

```json
{
  "id": "06f94be4-3e5a-473a-ba05-42f9a1692766",
  "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
  "assignment_id": "b7e44197-616f-443a-b901-7fc9b6175b88",
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
  "arrived_at": "2026-10-27T15:39:31.737817Z",
  "started_at": "2026-10-27T15:39:31.774972Z",
  "completed_at": "2026-10-27T15:39:31.857227Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/6816db82-10dc-4bcc-b453-44e00f8385ce` → **200**

```json
{
  "id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f3d88523-816a-4753-9665-c590e77ddade",
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
    "id": "b7e44197-616f-443a-b901-7fc9b6175b88",
    "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "06f94be4-3e5a-473a-ba05-42f9a1692766",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:39:30.330694Z",
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
    "id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:39:30.330694Z",
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
    "id": "06f94be4-3e5a-473a-ba05-42f9a1692766",
    "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
    "order_short_number": 5,
    "created_at": "2026-10-27T15:39:30.403212Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4a934f48-da87-4ea7-844e-9f17c882985f",
    "order_id": "d040194e-5879-4a34-9611-3b88e596f969",
    "order_short_number": 1,
    "created_at": "2026-10-27T15:39:14.743733Z",
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

`GET /api/rider/v1/orders/6816db82-10dc-4bcc-b453-44e00f8385ce/tip` → **200**

```json
{
  "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
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
  "available_until": "2026-10-28T15:39:31.857227Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6816db82-10dc-4bcc-b453-44e00f8385ce/tip` → **201**

```json
{
  "command_id": "7ce564f3-398b-41f0-84df-8331fb3255e9",
  "amount_minor": 1100
}
```

```json
{
  "id": "eb979dbb-4459-4980-b861-ffc29c2d8dc8",
  "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T15:39:35.033088Z"
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
  "session_id": "3c072e14-8fd8-4c8d-a665-63a7f0192e9d",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0NzUsImlhdCI6MTc5MzExNTU3NSwianRpIjoiOGIwYzQ0OGMtNjkzOS00NzRmLThmZDgtNjNjMzZjMjRlZGJjIiwic2lkIjoiM2MwNzJlMTQtOGZkOC00YzhkLWE2NjUtNjNhN2YwMTkyZTlkIn0.HSu1McIOhuBRMMdnDAUtRy4zh48fUGh0vqyDHlCoAuA",
  "access_expires_at": "2026-10-27T15:54:35.359487407Z",
  "refresh_token": "rAM_kAU07bHssNxL1UcV9Sw8lYbxBsCtCDFzDoxvUXU",
  "refresh_expires_at": "2026-10-28T03:39:35.358833184Z",
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
  "session_id": "ffbf4c53-38fe-4e84-9e57-1222bd6466e2",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0NzUsImlhdCI6MTc5MzExNTU3NSwianRpIjoiNDc5ZTZlMDAtYjlmMy00NDc0LWJiYTktZWE3Y2UxMTg5MjExIiwic2lkIjoiZmZiZjRjNTMtMzhmZS00ZTg0LTllNTctMTIyMmJkNjQ2NmUyIn0.VXqmhoYlEI6rZR-bsTPfslvIJwmq9DcVrWEUMlOvE8M",
  "access_expires_at": "2026-10-27T15:54:35.679845961Z",
  "refresh_token": "HFbrjOKP1QZZC0dtfBX5lM-sDRdzpNMLGjM2F6pJitI",
  "refresh_expires_at": "2026-10-28T03:39:35.679221138Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6816db82-10dc-4bcc-b453-44e00f8385ce/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:39:30.331584Z",
      "actor": {
        "type": "CLIENT",
        "id": "f3d88523-816a-4753-9665-c590e77ddade",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
        "quote_id": "545bd373-7fbb-4e0b-a84b-c5c6035bf640",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:39:30.334061Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
        "attempt_id": "15411c3b-44ec-457f-8c36-43e7b8fabcf5",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:39:30.340786Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "36d93a0d-9ece-402d-b115-d47806d0ff67",
        "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:39:30.405426Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "36d93a0d-9ece-402d-b115-d47806d0ff67",
        "order_id": "6816db82-10dc-4bcc-b453-44e00f8385ce",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "b7e44197-616f-443a-b901-7fc9b6175b88"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 6816db82-10dc-4bcc-b453-44e00f8385ce.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10704"
}
```

```json
{
  "challenge_id": "f46f2a50-1ece-47ef-b8f2-ef2ed60bc903",
  "expires_at": "2026-10-27T15:44:35.744063794Z",
  "resend_available_at": "2026-10-27T15:39:36.744063794Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "883676",
  "sent_at": "2026-10-27T15:39:35.746879988Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f46f2a50-1ece-47ef-b8f2-ef2ed60bc903",
  "code": "883676",
  "device_ref": "sandbox-10704"
}
```

```json
{
  "session_id": "fff38244-2821-427e-a459-a7273b575063",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ3NSwiaWF0IjoxNzkzMTE1NTc1LCJqdGkiOiI5ZmVmYmI4MS1hMzcwLTQxMmQtOWFkMC0zY2MwMmRkM2IxNDUiLCJzaWQiOiJmZmYzODI0NC0yODIxLTQyN2UtYTQ1OS1hNzI3M2I1NzUwNjMifQ.DrhWZ4ieNTjgUTFgmzrLH0wEAhfN3Be-iUGaUsKoVQQ",
  "access_expires_at": "2026-10-27T15:54:35.800856825Z",
  "refresh_token": "-woiJr0Cy7iSivij56DbBXe2exGhM4izxTdjRByocr0",
  "refresh_expires_at": "2026-11-26T15:39:35.800231249Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:31.81876Z",
  "last_location_at": "2026-10-27T15:39:31.81876Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a93baef-5bbe-4071-86ff-7663c5a513e6/handover` → **200**

```json
{
  "command_id": "0a545286-53ff-4cd3-b487-aa646945c660",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:31.81876Z",
  "last_location_at": "2026-10-27T15:39:31.81876Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a93baef-5bbe-4071-86ff-7663c5a513e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:35Z",
    "sequence": 1793115575895
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:35.91645Z",
  "last_location_at": "2026-10-27T15:39:35.91645Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660400970",
  "device_ref": "sandbox-5153"
}
```

```json
{
  "challenge_id": "71335794-9204-420f-a32a-a5319dcf884a",
  "expires_at": "2026-10-27T15:44:35.94240846Z",
  "resend_available_at": "2026-10-27T15:39:36.94240846Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660400970` → **200**

```json
{
  "phone": "+380660400970",
  "audience": "CLIENT",
  "code": "132978",
  "sent_at": "2026-10-27T15:39:35.9449437Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71335794-9204-420f-a32a-a5319dcf884a",
  "code": "132978",
  "device_ref": "sandbox-5153"
}
```

```json
{
  "session_id": "662c5fdb-46b8-40be-b717-d913ba7e6d9b",
  "subject": {
    "type": "CLIENT",
    "id": "b75da9c7-7527-47c1-9f75-e094dc1bd6b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzVkYTljNy03NTI3LTQ3YzEtOWY3NS1lMDk0ZGMxYmQ2YjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NDc2LCJpYXQiOjE3OTMxMTU1NzYsImp0aSI6IjI0Y2RmZjdkLTRmMmEtNDVlNS05MDFlLTE2OWE1N2FiNmViYyIsInNpZCI6IjY2MmM1ZmRiLTQ2YjgtNDBiZS1iNzE3LWQ5MTNiYTdlNmQ5YiJ9.XnY794zWkqlLrdjGn0OR0ORcTYiza8ndV2oUkfXs7Hc",
  "access_expires_at": "2026-10-27T15:54:36.00106586Z",
  "refresh_token": "hdg28eefUl4xYBkYLzMT6XU6q6CHjleLPcH-ebv5Sl8",
  "refresh_expires_at": "2026-11-26T15:39:36.000418011Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b4c68018-c83c-4f68-877c-1b90f246ba96",
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
  "id": "8be68edf-22ea-4fcd-8f2d-db66c46e68bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T15:44:36.036180Z",
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
  "command_id": "f267706f-e6e5-4043-842a-0cc1b18f40aa",
  "quote_id": "8be68edf-22ea-4fcd-8f2d-db66c46e68bb",
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
  "id": "7e3469cd-7a64-4421-a627-5200cc087090",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b75da9c7-7527-47c1-9f75-e094dc1bd6b6",
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
  "created_at": "2026-10-27T15:39:36.07358Z",
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
    "id": "a52de3b6-49a3-4306-9889-c74a99169c87",
    "order_id": "7e3469cd-7a64-4421-a627-5200cc087090",
    "expires_at": "2026-10-27T15:39:51.077667Z",
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

`POST /api/driver/v1/offers/a52de3b6-49a3-4306-9889-c74a99169c87/accept` → **200**

```json
{
  "command_id": "41ba4c76-1b08-4ba0-8c1a-3c8d220130b6"
}
```

```json
{
  "id": "f0b31080-8b5a-429a-8d3c-65014c6ea019",
  "order_id": "7e3469cd-7a64-4421-a627-5200cc087090",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f9377cf2-ef7b-4ee4-9c46-5c9a1d04bbb5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f9377cf2-ef7b-4ee4-9c46-5c9a1d04bbb5",
  "order_id": "7e3469cd-7a64-4421-a627-5200cc087090",
  "assignment_id": "f0b31080-8b5a-429a-8d3c-65014c6ea019",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/6a93baef-5bbe-4071-86ff-7663c5a513e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:36Z",
    "sequence": 1793115576183
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:36.202455Z",
  "last_location_at": "2026-10-27T15:39:36.202455Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f9377cf2-ef7b-4ee4-9c46-5c9a1d04bbb5/arrive` → **200**

```json
{
  "command_id": "2b21a1a0-23a9-41d6-92a5-ad6517416a5c",
  "expected_version": 0
}
```

```json
{
  "id": "f9377cf2-ef7b-4ee4-9c46-5c9a1d04bbb5",
  "order_id": "7e3469cd-7a64-4421-a627-5200cc087090",
  "assignment_id": "f0b31080-8b5a-429a-8d3c-65014c6ea019",
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
  "arrived_at": "2026-10-27T15:39:36.240371Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/f9377cf2-ef7b-4ee4-9c46-5c9a1d04bbb5/start` → **200**

```json
{
  "command_id": "ab6bb694-ddf5-489a-a75c-bc8cce3ba477",
  "expected_version": 1
}
```

```json
{
  "id": "f9377cf2-ef7b-4ee4-9c46-5c9a1d04bbb5",
  "order_id": "7e3469cd-7a64-4421-a627-5200cc087090",
  "assignment_id": "f0b31080-8b5a-429a-8d3c-65014c6ea019",
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
  "arrived_at": "2026-10-27T15:39:36.240371Z",
  "started_at": "2026-10-27T15:39:36.28061Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/6a93baef-5bbe-4071-86ff-7663c5a513e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:36Z",
    "sequence": 1793115576306
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:36.325457Z",
  "last_location_at": "2026-10-27T15:39:36.325457Z",
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
  "device_ref": "sandbox-20735"
}
```

```json
{
  "challenge_id": "26cdc8b1-d557-4828-95b9-a05a36e49c3d",
  "expires_at": "2026-10-27T15:44:36.35357903Z",
  "resend_available_at": "2026-10-27T15:39:37.35357903Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "878301",
  "sent_at": "2026-10-27T15:39:36.355979857Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26cdc8b1-d557-4828-95b9-a05a36e49c3d",
  "code": "878301",
  "device_ref": "sandbox-20735"
}
```

```json
{
  "session_id": "ed39dbcc-2328-46a0-9d29-db83d7cdc580",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ3NiwiaWF0IjoxNzkzMTE1NTc2LCJqdGkiOiJlZmFjOGYyZS05MzljLTRlOTctODUzZS1kOTYzZWFkZWY5OTMiLCJzaWQiOiJlZDM5ZGJjYy0yMzI4LTQ2YTAtOWQyOS1kYjgzZDdjZGM1ODAifQ.V_64PEfz8Ldd3QAm8NL_YB23vsiVqxatuybI5V8aN0c",
  "access_expires_at": "2026-10-27T15:54:36.412633611Z",
  "refresh_token": "W4LPUGpJ9_I9syLVsxPuooewEfBI21SH6cErTy7S4I4",
  "refresh_expires_at": "2026-11-26T15:39:36.411865027Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f07ec81a-a3dc-4060-ad1e-42abefcb2e1e",
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
  "last_heartbeat_at": "2026-10-27T15:39:19.346169Z",
  "last_location_at": "2026-10-27T15:39:19.346169Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f07ec81a-a3dc-4060-ad1e-42abefcb2e1e/handover` → **200**

```json
{
  "command_id": "16c42a5e-b7da-49a3-b09e-5f385c21376f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f07ec81a-a3dc-4060-ad1e-42abefcb2e1e",
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
  "last_heartbeat_at": "2026-10-27T15:39:19.346169Z",
  "last_location_at": "2026-10-27T15:39:19.346169Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f07ec81a-a3dc-4060-ad1e-42abefcb2e1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:36Z",
    "sequence": 1793115576499
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f07ec81a-a3dc-4060-ad1e-42abefcb2e1e",
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
  "last_heartbeat_at": "2026-10-27T15:39:36.519636Z",
  "last_location_at": "2026-10-27T15:39:36.519636Z",
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
  "session_id": "9dd02aa4-796c-43e3-bd29-fff1f6ed0c4b",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0NzYsImlhdCI6MTc5MzExNTU3NiwianRpIjoiOWFhZTAyZWMtYjczYi00NDQ0LWIwNGEtZjU2MmJhNDQ1NGRmIiwic2lkIjoiOWRkMDJhYTQtNzk2Yy00M2UzLWJkMjktZmZmMWY2ZWQwYzRiIn0._2K8iq_DZ6Ofcrc0w_P99gkOtrZbGtDvxtZg0ommli8",
  "access_expires_at": "2026-10-27T15:54:36.843661101Z",
  "refresh_token": "aowAfYCw-N9Ti_-DoeeWoNVx_bsu2JjufRZqmYwLjAU",
  "refresh_expires_at": "2026-10-28T03:39:36.843073755Z",
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
  "session_id": "d3189b27-13c0-478e-9297-e58d32d132f0",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0NzcsImlhdCI6MTc5MzExNTU3NywianRpIjoiYjVkOGZjNjUtMjg4OS00NjViLWJkMGMtZGE2ZGYyZjIwNTdhIiwic2lkIjoiZDMxODliMjctMTNjMC00NzhlLTkyOTctZTU4ZDMyZDEzMmYwIn0.0I6mdsr7HcS-TfjCn4yJSX93NOOwxx07byi7bcA_ubc",
  "access_expires_at": "2026-10-27T15:54:37.164910474Z",
  "refresh_token": "zKBiIesCZOqPyQIq1Hvf1VPnB5Zn7JRNH5aM6eqGMaY",
  "refresh_expires_at": "2026-10-28T03:39:37.164007129Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7e3469cd-7a64-4421-a627-5200cc087090` → **200**

```json
{
  "id": "7e3469cd-7a64-4421-a627-5200cc087090",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "b75da9c7-7527-47c1-9f75-e094dc1bd6b6",
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
    "id": "f0b31080-8b5a-429a-8d3c-65014c6ea019",
    "order_id": "7e3469cd-7a64-4421-a627-5200cc087090",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f9377cf2-ef7b-4ee4-9c46-5c9a1d04bbb5",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T15:39:36.07358Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7e3469cd-7a64-4421-a627-5200cc087090/interrupt` → **200**

```json
{
  "command_id": "7cb1b9cb-1cbe-4889-96d3-610d7d3c8c5d",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "7e3469cd-7a64-4421-a627-5200cc087090",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "b75da9c7-7527-47c1-9f75-e094dc1bd6b6",
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
      "id": "f0b31080-8b5a-429a-8d3c-65014c6ea019",
      "order_id": "7e3469cd-7a64-4421-a627-5200cc087090",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "f9377cf2-ef7b-4ee4-9c46-5c9a1d04bbb5",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T15:39:36.07358Z",
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
    "id": "829c3170-8faf-4cc3-84a9-7991f869aba2",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "b75da9c7-7527-47c1-9f75-e094dc1bd6b6",
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
    "id": "9bab9f51-62b6-4b02-901e-88216466e10f",
    "order_id": "829c3170-8faf-4cc3-84a9-7991f869aba2",
    "expires_at": "2026-10-27T15:39:52.252564Z",
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

`POST /api/driver/v1/offers/9bab9f51-62b6-4b02-901e-88216466e10f/accept` → **200**

```json
{
  "command_id": "7c11d8fa-8d3c-44a1-a017-87cc113cd855"
}
```

```json
{
  "id": "c402148b-231b-48f3-966a-04edf7b56beb",
  "order_id": "829c3170-8faf-4cc3-84a9-7991f869aba2",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7975f75f-5f78-475e-9348-5069bccdf7ba",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7975f75f-5f78-475e-9348-5069bccdf7ba",
  "order_id": "829c3170-8faf-4cc3-84a9-7991f869aba2",
  "assignment_id": "c402148b-231b-48f3-966a-04edf7b56beb",
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
  "discount_minor": 0
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f07ec81a-a3dc-4060-ad1e-42abefcb2e1e",
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
  "last_heartbeat_at": "2026-10-27T15:39:36.519636Z",
  "last_location_at": "2026-10-27T15:39:36.519636Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/f07ec81a-a3dc-4060-ad1e-42abefcb2e1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:37Z",
    "sequence": 1793115577397
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f07ec81a-a3dc-4060-ad1e-42abefcb2e1e",
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
  "last_heartbeat_at": "2026-10-27T15:39:37.418157Z",
  "last_location_at": "2026-10-27T15:39:37.418157Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7975f75f-5f78-475e-9348-5069bccdf7ba/arrive` → **200**

```json
{
  "command_id": "3a8937e5-758b-4c98-831d-2da5ea6c41ac",
  "expected_version": 0
}
```

```json
{
  "id": "7975f75f-5f78-475e-9348-5069bccdf7ba",
  "order_id": "829c3170-8faf-4cc3-84a9-7991f869aba2",
  "assignment_id": "c402148b-231b-48f3-966a-04edf7b56beb",
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
  "arrived_at": "2026-10-27T15:39:37.455145Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/7975f75f-5f78-475e-9348-5069bccdf7ba/start` → **200**

```json
{
  "command_id": "8c5736a4-fc27-44e9-90b8-6e94922100b3",
  "expected_version": 1
}
```

```json
{
  "id": "7975f75f-5f78-475e-9348-5069bccdf7ba",
  "order_id": "829c3170-8faf-4cc3-84a9-7991f869aba2",
  "assignment_id": "c402148b-231b-48f3-966a-04edf7b56beb",
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
  "arrived_at": "2026-10-27T15:39:37.455145Z",
  "started_at": "2026-10-27T15:39:37.49428Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/7975f75f-5f78-475e-9348-5069bccdf7ba/complete` → **200**

```json
{
  "command_id": "916b9bd1-1bd1-4b97-b117-e33bc10dc3d1",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:39:37Z"
}
```

```json
{
  "id": "7975f75f-5f78-475e-9348-5069bccdf7ba",
  "order_id": "829c3170-8faf-4cc3-84a9-7991f869aba2",
  "assignment_id": "c402148b-231b-48f3-966a-04edf7b56beb",
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
  "arrived_at": "2026-10-27T15:39:37.455145Z",
  "started_at": "2026-10-27T15:39:37.49428Z",
  "completed_at": "2026-10-27T15:39:37.538539Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "829c3170-8faf-4cc3-84a9-7991f869aba2",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T15:39:37.240999Z",
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
    "id": "7e3469cd-7a64-4421-a627-5200cc087090",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T15:39:36.07358Z",
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

`GET /api/operator/v1/orders/7e3469cd-7a64-4421-a627-5200cc087090/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T15:39:36.074307Z",
      "actor": {
        "type": "CLIENT",
        "id": "b75da9c7-7527-47c1-9f75-e094dc1bd6b6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7e3469cd-7a64-4421-a627-5200cc087090",
        "quote_id": "8be68edf-22ea-4fcd-8f2d-db66c46e68bb",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T15:39:36.076628Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7e3469cd-7a64-4421-a627-5200cc087090",
        "attempt_id": "e29b8c46-a2f3-4b69-8f44-3d3d7b7cc7a2",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T15:39:36.083021Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a52de3b6-49a3-4306-9889-c74a99169c87",
        "order_id": "7e3469cd-7a64-4421-a627-5200cc087090",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T15:39:36.142552Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a52de3b6-49a3-4306-9889-c74a99169c87",
        "order_id": "7e3469cd-7a64-4421-a627-5200cc087090",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f0b31080-8b5a-429a-8d3c-65014c6ea019"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 7e3469cd-7a64-4421-a627-5200cc087090, follow-up 829c3170-8faf-4cc3-84a9-7991f869aba2.

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
  "session_id": "62eff3f8-dac4-4fe1-b0c0-40f8bf4a840d",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0ODAsImlhdCI6MTc5MzExNTU4MCwianRpIjoiODNjYWI4YjAtNWVhNC00MTg4LWE4YWMtYjUxZWFhMmIzNmMzIiwic2lkIjoiNjJlZmYzZjgtZGFjNC00ZmUxLWIwYzAtNDBmOGJmNGE4NDBkIn0.IYx4Yg91PZqLyGr9KoXwdSw6VCSx6r8Q7o-qbLHG4sw",
  "access_expires_at": "2026-10-27T15:54:40.958166395Z",
  "refresh_token": "_6hbxbAUKM6IXqfLAnCVby_mzPOZP5wZcZOTWiugxgg",
  "refresh_expires_at": "2026-10-28T03:39:40.957403449Z",
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
  "session_id": "cf846ba5-66a0-4ff8-a46a-07f41473ebb3",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0ODEsImlhdCI6MTc5MzExNTU4MSwianRpIjoiMDlmZGMxYWUtOTdiNy00ZGYwLTg2NzgtY2M3MDEwMDg3YTJlIiwic2lkIjoiY2Y4NDZiYTUtNjZhMC00ZmY4LWE0NmEtMDdmNDE0NzNlYmIzIn0.C-TiySkRIufU8358encUeW9Ttqlq-EMFN095EOa6kYA",
  "access_expires_at": "2026-10-27T15:54:41.280906975Z",
  "refresh_token": "74r5uk8lDiVWSCuOqSEWydmuNppo89tySIXRY-5w2aE",
  "refresh_expires_at": "2026-10-28T03:39:41.280352138Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3717"
}
```

```json
{
  "challenge_id": "9b46977e-2619-4b69-b7e7-db8951e92e5b",
  "expires_at": "2026-10-27T15:44:41.30496911Z",
  "resend_available_at": "2026-10-27T15:39:42.30496911Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "157730",
  "sent_at": "2026-10-27T15:39:41.307263881Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b46977e-2619-4b69-b7e7-db8951e92e5b",
  "code": "157730",
  "device_ref": "sandbox-3717"
}
```

```json
{
  "session_id": "10907bbd-877f-44fc-aed5-4bcfc743a71b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ4MSwiaWF0IjoxNzkzMTE1NTgxLCJqdGkiOiJmM2I2MGFhYy05NmI3LTQ5N2MtYTI0Ny00MGVhY2ZiMzdhNTciLCJzaWQiOiIxMDkwN2JiZC04NzdmLTQ0ZmMtYWVkNS00YmNmYzc0M2E3MWIifQ.pyCd5uqUI7ovgxuVWiEdTm32GymEfFnLHETjQft_bMQ",
  "access_expires_at": "2026-10-27T15:54:41.364342314Z",
  "refresh_token": "9XcNUPtO4Bqm0897QNCLZCDRUWeUycNxb8ithxVn4Y4",
  "refresh_expires_at": "2026-11-26T15:39:41.363657836Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:36.325457Z",
  "last_location_at": "2026-10-27T15:39:36.325457Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a93baef-5bbe-4071-86ff-7663c5a513e6/handover` → **200**

```json
{
  "command_id": "d774e92b-5e7e-475d-b014-6654cbba2043",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:36.325457Z",
  "last_location_at": "2026-10-27T15:39:36.325457Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a93baef-5bbe-4071-86ff-7663c5a513e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:41Z",
    "sequence": 1793115581449
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:41.468227Z",
  "last_location_at": "2026-10-27T15:39:41.468227Z",
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
  "command_id": "5a8f02ff-6a93-4c36-8f34-a163faf61596",
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
  "effective_at": "2026-10-27T15:39:41.53925Z",
  "changed_by": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T15:39:41.570102954Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "71360f14-8728-4cd4-80e4-b1b179e54497",
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
  "id": "49d90dca-01ef-4cfa-a625-fe0da5c4e9a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:44:41.611220Z",
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
  "command_id": "4fc02947-1d9c-407b-ac69-53f95199e433",
  "quote_id": "49d90dca-01ef-4cfa-a625-fe0da5c4e9a5",
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
    "phone": "+3806711119157"
  }
}
```

```json
{
  "id": "2770abb6-a06f-4a6d-8a86-9a229ba3ae32",
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
  "created_at": "2026-10-27T15:39:41.660623Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119157"
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
    "id": "d5e0354c-fdf7-4bfb-97c1-a84651826db7",
    "order_id": "2770abb6-a06f-4a6d-8a86-9a229ba3ae32",
    "expires_at": "2026-10-27T15:39:56.665292Z",
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

`POST /api/driver/v1/offers/d5e0354c-fdf7-4bfb-97c1-a84651826db7/accept` → **200**

```json
{
  "command_id": "b3ebd41c-a2d8-48e7-a4d4-af2c40e5bb54"
}
```

```json
{
  "id": "56594d3d-283a-42e0-9f40-0925292a3e98",
  "order_id": "2770abb6-a06f-4a6d-8a86-9a229ba3ae32",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "30a58efd-bc64-4fdf-9f6e-85d2503a889e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "30a58efd-bc64-4fdf-9f6e-85d2503a889e",
  "order_id": "2770abb6-a06f-4a6d-8a86-9a229ba3ae32",
  "assignment_id": "56594d3d-283a-42e0-9f40-0925292a3e98",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/6a93baef-5bbe-4071-86ff-7663c5a513e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:41Z",
    "sequence": 1793115581772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:41.790524Z",
  "last_location_at": "2026-10-27T15:39:41.790524Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/30a58efd-bc64-4fdf-9f6e-85d2503a889e/arrive` → **200**

```json
{
  "command_id": "e4aff14b-f1a8-4cbf-ba47-d89fae943305",
  "expected_version": 0
}
```

```json
{
  "id": "30a58efd-bc64-4fdf-9f6e-85d2503a889e",
  "order_id": "2770abb6-a06f-4a6d-8a86-9a229ba3ae32",
  "assignment_id": "56594d3d-283a-42e0-9f40-0925292a3e98",
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
  "arrived_at": "2026-10-27T15:39:41.827812Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/30a58efd-bc64-4fdf-9f6e-85d2503a889e/start` → **200**

```json
{
  "command_id": "9c529461-e673-491c-b599-d4dc92418ac0",
  "expected_version": 1
}
```

```json
{
  "id": "30a58efd-bc64-4fdf-9f6e-85d2503a889e",
  "order_id": "2770abb6-a06f-4a6d-8a86-9a229ba3ae32",
  "assignment_id": "56594d3d-283a-42e0-9f40-0925292a3e98",
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
  "arrived_at": "2026-10-27T15:39:41.827812Z",
  "started_at": "2026-10-27T15:39:41.868384Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/30a58efd-bc64-4fdf-9f6e-85d2503a889e/complete` → **200**

```json
{
  "command_id": "de6824c4-c0ee-453d-88aa-966cc7cc0547",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:39:41Z",
  "cash_received": true
}
```

```json
{
  "id": "30a58efd-bc64-4fdf-9f6e-85d2503a889e",
  "order_id": "2770abb6-a06f-4a6d-8a86-9a229ba3ae32",
  "assignment_id": "56594d3d-283a-42e0-9f40-0925292a3e98",
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
  "arrived_at": "2026-10-27T15:39:41.827812Z",
  "started_at": "2026-10-27T15:39:41.868384Z",
  "completed_at": "2026-10-27T15:39:41.912794Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a6691657-ad26-409e-9f82-9926e2747a53",
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
  "id": "e7fe0106-730a-4be1-a2ec-a44338e05463",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:44:41.958637Z",
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
  "command_id": "2ca5ceb1-b2fb-4223-8055-027763aa0b69",
  "quote_id": "e7fe0106-730a-4be1-a2ec-a44338e05463",
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
    "phone": "+3806711126162"
  }
}
```

```json
{
  "id": "2c78923d-8f13-4b6c-a0cd-fcc2222fe2ba",
  "short_number": 9,
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
  "created_at": "2026-10-27T15:39:41.994561Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126162"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/2c78923d-8f13-4b6c-a0cd-fcc2222fe2ba` → **200**

```json
{
  "id": "2c78923d-8f13-4b6c-a0cd-fcc2222fe2ba",
  "short_number": 9,
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
  "created_at": "2026-10-27T15:39:41.994561Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126162"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2c78923d-8f13-4b6c-a0cd-fcc2222fe2ba/cancel` → **200**

```json
{
  "command_id": "04b636d0-72f9-4dd8-97ce-0d1f7b236869",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "2c78923d-8f13-4b6c-a0cd-fcc2222fe2ba",
  "short_number": 9,
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
  "created_at": "2026-10-27T15:39:41.994561Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126162"
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
  "staff_id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T15:39:41.918849Z",
  "last_entries": [
    {
      "order_id": "2c78923d-8f13-4b6c-a0cd-fcc2222fe2ba",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T15:39:42.075629Z"
    },
    {
      "order_id": "2770abb6-a06f-4a6d-8a86-9a229ba3ae32",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T15:39:41.918849Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a93baef-5bbe-4071-86ff-7663c5a513e6",
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
  "last_heartbeat_at": "2026-10-27T15:39:41.790524Z",
  "last_location_at": "2026-10-27T15:39:41.790524Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a93baef-5bbe-4071-86ff-7663c5a513e6/close` → **200**

```json
{
  "command_id": "0c9d7aa8-cd46-4af6-9823-d6d7ea751409",
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

Done: operator bonus for fulfilled 2770abb6-a06f-4a6d-8a86-9a229ba3ae32 and operator-fault cancellation 2c78923d-8f13-4b6c-a0cd-fcc2222fe2ba.

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
  "session_id": "cba85cd2-a13c-4197-b72b-f8ad85f9a6a5",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0ODQsImlhdCI6MTc5MzExNTU4NCwianRpIjoiNGRkODUyNDAtNmU4My00M2VkLWJhOWYtNDE0OTNjYWIzNGQ5Iiwic2lkIjoiY2JhODVjZDItYTEzYy00MTk3LWI3MmItZjhhZDg1ZjlhNmE1In0.bsKL694kWHLJe6w69ZAQ4jLBJQCGqIbQ-tDovvdLGFA",
  "access_expires_at": "2026-10-27T15:54:44.526246986Z",
  "refresh_token": "OZMa7MWk3nS_hKhz1cdHetpvXSGVdsLxOZ98p3oavCo",
  "refresh_expires_at": "2026-10-28T03:39:44.525583857Z",
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
  "command_id": "3bdcc1cb-5fe1-4c8f-a99b-ed870fe20f61",
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
    }
  },
  "changed_by": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T15:39:44.597032589Z"
}
```

## The rider books the airport for 2026-10-27T18:39:44Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600529852",
  "device_ref": "sandbox-31114"
}
```

```json
{
  "challenge_id": "cd44ce3a-dbca-4d88-8ee0-dedd12065414",
  "expires_at": "2026-10-27T15:44:44.629815106Z",
  "resend_available_at": "2026-10-27T15:39:45.629815106Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600529852` → **200**

```json
{
  "phone": "+48600529852",
  "audience": "CLIENT",
  "code": "835769",
  "sent_at": "2026-10-27T15:39:44.632152262Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd44ce3a-dbca-4d88-8ee0-dedd12065414",
  "code": "835769",
  "device_ref": "sandbox-31114"
}
```

```json
{
  "session_id": "059bd42f-4259-4825-9ba5-20f0269cd2a4",
  "subject": {
    "type": "CLIENT",
    "id": "5497cd11-9cea-4cb4-b1aa-68d9e0bfaf3f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDk3Y2QxMS05Y2VhLTRjYjQtYjFhYS02OGQ5ZTBiZmFmM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NDg0LCJpYXQiOjE3OTMxMTU1ODQsImp0aSI6IjdhOTFjZWY0LTE2NGUtNDQyNC04NzM4LTM3M2RiYmNlNTY0YSIsInNpZCI6IjA1OWJkNDJmLTQyNTktNDgyNS05YmE1LTIwZjAyNjljZDJhNCJ9.W54OXz5zt1D4Fnm820OfpDlcxWTPwBAi6-T1w-dwhVo",
  "access_expires_at": "2026-10-27T15:54:44.68718317Z",
  "refresh_token": "bqCa7YHf83O2YaUVss3J-Rsqui2egHPtwRUrwJCjgTk",
  "refresh_expires_at": "2026-11-26T15:39:44.686556289Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "02f605ea-856f-4e8c-a9df-e5e6a8ddc408",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T18:39:44Z"
}
```

```json
{
  "id": "236113fa-ff3a-46cf-9578-b7ad45b2ff7c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T15:44:44.723351Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T18:39:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8c0a76f3-b490-498e-8775-1d9f95c94c2b",
  "quote_id": "236113fa-ff3a-46cf-9578-b7ad45b2ff7c",
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
  "pickup_at": "2026-10-27T18:39:44Z"
}
```

```json
{
  "id": "a0eccdcd-d14c-4af2-a991-6957eadf2693",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5497cd11-9cea-4cb4-b1aa-68d9e0bfaf3f",
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
  "created_at": "2026-10-27T15:39:44.76103Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T18:39:44Z",
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
  "device_ref": "sandbox-3430"
}
```

```json
{
  "challenge_id": "b8566b9a-cb3f-4703-8dd1-c9619edff163",
  "expires_at": "2026-10-27T15:44:44.795227301Z",
  "resend_available_at": "2026-10-27T15:39:45.795227301Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "989750",
  "sent_at": "2026-10-27T15:39:44.797351Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8566b9a-cb3f-4703-8dd1-c9619edff163",
  "code": "989750",
  "device_ref": "sandbox-3430"
}
```

```json
{
  "session_id": "b4b7327d-32ba-4e28-811e-4e5d71b8a1b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ4NCwiaWF0IjoxNzkzMTE1NTg0LCJqdGkiOiIzYTA4MTY3Zi0yMjMwLTRjMzgtODUzOS01N2Q0MWIyNGEwNzgiLCJzaWQiOiJiNGI3MzI3ZC0zMmJhLTRlMjgtODExZS00ZTVkNzFiOGExYjMifQ.DK3dRYUPm1x11DZ2HcvHb3NYYPVoMmSwziE1y7n9zNo",
  "access_expires_at": "2026-10-27T15:54:44.853962701Z",
  "refresh_token": "j-vGxwkojFFBrLCQPNqkvoPbH1ZghPqH4UTJM-mR7OQ",
  "refresh_expires_at": "2026-11-26T15:39:44.853226155Z",
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
  "command_id": "e86dfb7c-b7d8-45ea-8c44-4b7d01ec134d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:44Z",
    "sequence": 1793115584910
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "09c2a32c-d048-400c-a552-5b19b0b2fdc6",
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
  "last_heartbeat_at": "2026-10-27T15:39:44.929007Z",
  "last_location_at": "2026-10-27T15:39:44.929007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "a0eccdcd-d14c-4af2-a991-6957eadf2693",
      "short_number": 10,
      "pickup_at": "2026-10-27T18:39:44Z",
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

`POST /api/driver/v1/preorders/a0eccdcd-d14c-4af2-a991-6957eadf2693/reserve` → **200**

```json
{
  "command_id": "a5039ac6-2bdb-4273-bb34-9a908b939e63"
}
```

```json
{
  "id": "c349f74c-1c4e-4c94-a21b-505e7a99e938",
  "state": "RESERVED",
  "order": {
    "order_id": "a0eccdcd-d14c-4af2-a991-6957eadf2693",
    "short_number": 10,
    "pickup_at": "2026-10-27T18:39:44Z",
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
  "reserved_at": "2026-10-27T15:39:44.997801Z",
  "confirm_from": "2026-10-27T18:09:44Z",
  "confirm_until": "2026-10-27T18:19:44Z",
  "drop_until": "2026-10-27T17:39:44Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "c349f74c-1c4e-4c94-a21b-505e7a99e938",
      "state": "RESERVED",
      "order": {
        "order_id": "a0eccdcd-d14c-4af2-a991-6957eadf2693",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:39:44Z",
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
      "reserved_at": "2026-10-27T15:39:44.997801Z",
      "confirm_from": "2026-10-27T18:09:44Z",
      "confirm_until": "2026-10-27T18:19:44Z",
      "drop_until": "2026-10-27T17:39:44Z"
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
      "id": "c349f74c-1c4e-4c94-a21b-505e7a99e938",
      "state": "RESERVED",
      "order": {
        "order_id": "a0eccdcd-d14c-4af2-a991-6957eadf2693",
        "short_number": 10,
        "pickup_at": "2026-10-27T18:39:44Z",
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
      "reserved_at": "2026-10-27T15:39:44.997801Z",
      "confirm_from": "2026-10-27T18:09:44Z",
      "confirm_until": "2026-10-27T18:19:44Z",
      "drop_until": "2026-10-27T17:39:44Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/c349f74c-1c4e-4c94-a21b-505e7a99e938/confirm` → **409**

```json
{
  "command_id": "074c11bf-5d69-4529-844d-adabc25b4077"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/c349f74c-1c4e-4c94-a21b-505e7a99e938/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6a5bc3a7-a43c-4730-8983-03fd2e2d5292"
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
  "session_id": "2c8a5ecb-24bb-4199-9b09-8ba1114a6cef",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0ODUsImlhdCI6MTc5MzExNTU4NSwianRpIjoiODgwMzdjYjktMDdjZi00ZDc0LWJlOGUtOWU0NTg3ODMxY2Y0Iiwic2lkIjoiMmM4YTVlY2ItMjRiYi00MTk5LTliMDktOGJhMTExNGE2Y2VmIn0.EZd91YexWIJLnmM_K6utJZ-hbht8C8A0sA4qwXNUbjg",
  "access_expires_at": "2026-10-27T15:54:45.413323285Z",
  "refresh_token": "8-JdBis23u55f5hzKCN6XtDSPXfNNsV1YtEUK-fyb9A",
  "refresh_expires_at": "2026-10-28T03:39:45.412693188Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a0eccdcd-d14c-4af2-a991-6957eadf2693` → **200**

```json
{
  "id": "a0eccdcd-d14c-4af2-a991-6957eadf2693",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "5497cd11-9cea-4cb4-b1aa-68d9e0bfaf3f",
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
  "created_at": "2026-10-27T15:39:44.76103Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T18:39:44Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "c349f74c-1c4e-4c94-a21b-505e7a99e938",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T15:39:44.997801Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/a0eccdcd-d14c-4af2-a991-6957eadf2693/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T15:39:44.762557Z",
      "actor": {
        "type": "CLIENT",
        "id": "5497cd11-9cea-4cb4-b1aa-68d9e0bfaf3f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "a0eccdcd-d14c-4af2-a991-6957eadf2693",
        "preorder": true,
        "quote_id": "236113fa-ff3a-46cf-9578-b7ad45b2ff7c",
        "pickup_at": "2026-10-27T18:39:44Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T15:39:44.998985Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a0eccdcd-d14c-4af2-a991-6957eadf2693",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "c349f74c-1c4e-4c94-a21b-505e7a99e938"
      }
    }
  ]
}
```

Done: pre-order a0eccdcd-d14c-4af2-a991-6957eadf2693, reservation c349f74c-1c4e-4c94-a21b-505e7a99e938.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20928"
}
```

```json
{
  "challenge_id": "670c3a37-1825-4401-92d0-d991f1df6991",
  "expires_at": "2026-10-27T15:44:45.499794042Z",
  "resend_available_at": "2026-10-27T15:39:46.499794042Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "447253",
  "sent_at": "2026-10-27T15:39:45.502122102Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "670c3a37-1825-4401-92d0-d991f1df6991",
  "code": "447253",
  "device_ref": "sandbox-20928"
}
```

```json
{
  "session_id": "c2becd4e-ed80-4e88-bf08-ed7c15d626ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ4NSwiaWF0IjoxNzkzMTE1NTg1LCJqdGkiOiIwZGM5Zjk3NS00YzU5LTQxNTMtOWQ2Yi05OWE5MWJhYjI1ZDQiLCJzaWQiOiJjMmJlY2Q0ZS1lZDgwLTRlODgtYmYwOC1lZDdjMTVkNjI2Y2EifQ.C4wSv1qeRP_73M2DgomGYV94eskLlrf0DLEJciY1KGM",
  "access_expires_at": "2026-10-27T15:54:45.558975526Z",
  "refresh_token": "aDB2htYZnwK0FCZerh5f73O9R_LrxLBDVISESOpB9xQ",
  "refresh_expires_at": "2026-11-26T15:39:45.558199042Z",
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
  "command_id": "65985fca-a51c-418a-b732-4a329f27d35f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:45Z",
    "sequence": 1793115585613
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "328b3502-4583-420e-9084-4019ce425a96",
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
  "last_heartbeat_at": "2026-10-27T15:39:45.631894Z",
  "last_location_at": "2026-10-27T15:39:45.631894Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672395041",
  "device_ref": "sandbox-18018"
}
```

```json
{
  "challenge_id": "aada4f61-6eff-4171-bb20-8ef1dfd2cd76",
  "expires_at": "2026-10-27T15:44:45.66156267Z",
  "resend_available_at": "2026-10-27T15:39:46.66156267Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672395041` → **200**

```json
{
  "phone": "+380672395041",
  "audience": "CLIENT",
  "code": "732864",
  "sent_at": "2026-10-27T15:39:45.663775255Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aada4f61-6eff-4171-bb20-8ef1dfd2cd76",
  "code": "732864",
  "device_ref": "sandbox-18018"
}
```

```json
{
  "session_id": "e1a528d4-108f-4d28-9bb2-ef1619fb626a",
  "subject": {
    "type": "CLIENT",
    "id": "00c40eb8-1c6a-4ba2-952a-2d103cbddbe0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMGM0MGViOC0xYzZhLTRiYTItOTUyYS0yZDEwM2NiZGRiZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NDg1LCJpYXQiOjE3OTMxMTU1ODUsImp0aSI6IjliZmRhY2JiLTMwMzEtNDJkYy1hMTMxLTc3MmIxMjllZGJjNCIsInNpZCI6ImUxYTUyOGQ0LTEwOGYtNGQyOC05YmIyLWVmMTYxOWZiNjI2YSJ9.nlCA7ZrUeqXXn-dE0GFGx2SzHsruAF6WWClLDjNryDE",
  "access_expires_at": "2026-10-27T15:54:45.720522126Z",
  "refresh_token": "tIjMlHR3-N62lRm8QHpHx0roSkG4Lr5rulFHGiJkwqk",
  "refresh_expires_at": "2026-11-26T15:39:45.719872725Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "443d22f2-c703-4124-9665-75f98c59e0d1",
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
  "id": "7b796e4c-010e-47c5-be2a-495f74f3ab0c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:44:45.759011Z",
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
  "command_id": "18e4fe57-4214-402b-a18a-59889f8d0206",
  "quote_id": "7b796e4c-010e-47c5-be2a-495f74f3ab0c",
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
  "id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "00c40eb8-1c6a-4ba2-952a-2d103cbddbe0",
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
  "created_at": "2026-10-27T15:39:45.795477Z",
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
    "id": "da5adf32-ffb4-4c92-bf6e-34c208a2db56",
    "order_id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
    "expires_at": "2026-10-27T15:40:00.798575Z",
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

`POST /api/driver/v1/offers/da5adf32-ffb4-4c92-bf6e-34c208a2db56/accept` → **200**

```json
{
  "command_id": "961a6648-b957-487f-9d38-87c187c2138c"
}
```

```json
{
  "id": "fd97fb5d-2b23-46bf-82ea-6f0ef4a69594",
  "order_id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "acd818e6-d626-40d1-9b08-83f70d6e9ec8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "acd818e6-d626-40d1-9b08-83f70d6e9ec8",
  "order_id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
  "assignment_id": "fd97fb5d-2b23-46bf-82ea-6f0ef4a69594",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/328b3502-4583-420e-9084-4019ce425a96/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:45Z",
    "sequence": 1793115585910
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "328b3502-4583-420e-9084-4019ce425a96",
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
  "last_heartbeat_at": "2026-10-27T15:39:45.928623Z",
  "last_location_at": "2026-10-27T15:39:45.928623Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "acd818e6-d626-40d1-9b08-83f70d6e9ec8",
  "order_id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
  "assignment_id": "fd97fb5d-2b23-46bf-82ea-6f0ef4a69594",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/acd818e6-d626-40d1-9b08-83f70d6e9ec8/arrive` → **200**

```json
{
  "command_id": "89e7be6d-a2a1-4d3c-899b-f536d6c6f482",
  "expected_version": 0
}
```

```json
{
  "id": "acd818e6-d626-40d1-9b08-83f70d6e9ec8",
  "order_id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
  "assignment_id": "fd97fb5d-2b23-46bf-82ea-6f0ef4a69594",
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
  "arrived_at": "2026-10-27T15:39:45.979967Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/acd818e6-d626-40d1-9b08-83f70d6e9ec8/start` → **200**

```json
{
  "command_id": "99e9ef3c-9a45-45c4-bfe7-42f49e4f83cb",
  "expected_version": 1
}
```

```json
{
  "id": "acd818e6-d626-40d1-9b08-83f70d6e9ec8",
  "order_id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
  "assignment_id": "fd97fb5d-2b23-46bf-82ea-6f0ef4a69594",
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
  "arrived_at": "2026-10-27T15:39:45.979967Z",
  "started_at": "2026-10-27T15:39:46.019828Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/328b3502-4583-420e-9084-4019ce425a96/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:46Z",
    "sequence": 1793115586485
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "328b3502-4583-420e-9084-4019ce425a96",
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
  "last_heartbeat_at": "2026-10-27T15:39:46.068405Z",
  "last_location_at": "2026-10-27T15:39:46.068405Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/acd818e6-d626-40d1-9b08-83f70d6e9ec8/complete` → **200**

```json
{
  "command_id": "0e8dccc0-e9d0-415a-af8e-87c17aa656f5",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:39:46Z",
  "cash_received": true
}
```

```json
{
  "id": "acd818e6-d626-40d1-9b08-83f70d6e9ec8",
  "order_id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
  "assignment_id": "fd97fb5d-2b23-46bf-82ea-6f0ef4a69594",
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
  "arrived_at": "2026-10-27T15:39:45.979967Z",
  "started_at": "2026-10-27T15:39:46.019828Z",
  "completed_at": "2026-10-27T15:39:46.100714Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/ae96ac01-3f8d-4606-b056-e1c9611c74c8/rating` → **200**

```json
{
  "command_id": "665719b2-114a-4053-98af-6b7b6033072f",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
  "score": 5,
  "created_at": "2026-10-27T15:39:46.152290968Z"
}
```

`POST /api/driver/v1/orders/ae96ac01-3f8d-4606-b056-e1c9611c74c8/rating` → **200**

```json
{
  "command_id": "6886d866-2ec3-4164-904c-9a9069ab9c08",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
  "score": 4,
  "created_at": "2026-10-27T15:39:46.189175468Z"
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
  "session_id": "ea64c7d4-dc64-4054-8df2-a3e553faaf90",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0ODYsImlhdCI6MTc5MzExNTU4NiwianRpIjoiZWRiZDMxZGMtOTQ2MS00Yjk2LWExZWItNGQwYzQxNTIwZDM3Iiwic2lkIjoiZWE2NGM3ZDQtZGM2NC00MDU0LThkZjItYTNlNTUzZmFhZjkwIn0.rllr3x3OxR--D1QMZG4oIVEhGZAjaTuY8D3ss4yCgiQ",
  "access_expires_at": "2026-10-27T15:54:46.546918421Z",
  "refresh_token": "6xjnVv_vetUD8UB8l2QumrHPvTIWRnUOA6GShVJGyOc",
  "refresh_expires_at": "2026-10-28T03:39:46.5463455Z",
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
  "session_id": "dca6400c-4588-47e3-be81-b052078f0f97",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0ODYsImlhdCI6MTc5MzExNTU4NiwianRpIjoiYzA5ZWQ4ZmQtNmRiYy00YWIxLWIyYjctOGY3N2U3MTNiMWUxIiwic2lkIjoiZGNhNjQwMGMtNDU4OC00N2UzLWJlODEtYjA1MjA3OGYwZjk3In0.KIhwOf8UqApBMlmGdXhPthihjyHVhbpRpNQfTKp2u4o",
  "access_expires_at": "2026-10-27T15:54:46.869704553Z",
  "refresh_token": "USRpmO9O1W7XEBnr4fa9FBHIgSlym4-Zg2b7IuQ3o8Y",
  "refresh_expires_at": "2026-10-28T03:39:46.869134197Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ae96ac01-3f8d-4606-b056-e1c9611c74c8/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
      "author_type": "RIDER",
      "author_id": "00c40eb8-1c6a-4ba2-952a-2d103cbddbe0",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T15:39:46.152291Z"
    },
    {
      "order_id": "ae96ac01-3f8d-4606-b056-e1c9611c74c8",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "00c40eb8-1c6a-4ba2-952a-2d103cbddbe0",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T15:39:46.189175Z"
    }
  ]
}
```

Done: ratings for order ae96ac01-3f8d-4606-b056-e1c9611c74c8.

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
  "session_id": "f3030ed5-e737-4110-a659-9c9e40380de9",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0ODcsImlhdCI6MTc5MzExNTU4NywianRpIjoiMWE3NGM0MjMtMWU3ZS00ODVmLWJkYTMtNmY1YzhmMWQ5ZGFjIiwic2lkIjoiZjMwMzBlZDUtZTczNy00MTEwLWE2NTktOWM5ZTQwMzgwZGU5In0.a8jJKX0E02YEzTYBAokWIDOvcs7sShQIUqDo60eOEp4",
  "access_expires_at": "2026-10-27T15:54:47.237634647Z",
  "refresh_token": "2EUzOxjjS0zaj8ZR8kIrGZTNS4cbC4F7cKEY2faht6c",
  "refresh_expires_at": "2026-10-28T03:39:47.23699413Z",
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
  "command_id": "5fad7063-793a-49f7-b19f-95bfe05dcb74",
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
  "changed_by": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:39:47.310444Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "5fad7063-793a-49f7-b19f-95bfe05dcb74",
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
  "changed_by": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T15:39:47.310444Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48136821765",
  "device_ref": "sandbox-17587"
}
```

```json
{
  "challenge_id": "6f521aac-d59e-4ab9-8471-ce4141a19b27",
  "expires_at": "2026-10-27T15:44:47.390348542Z",
  "resend_available_at": "2026-10-27T15:39:48.390348542Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48136821765` → **200**

```json
{
  "phone": "+48136821765",
  "audience": "CLIENT",
  "code": "054781",
  "sent_at": "2026-10-27T15:39:47.392470839Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f521aac-d59e-4ab9-8471-ce4141a19b27",
  "code": "054781",
  "device_ref": "sandbox-17587"
}
```

```json
{
  "session_id": "f93d47e2-a60d-46bc-99ad-0af04a7d3d2f",
  "subject": {
    "type": "CLIENT",
    "id": "1b4b15e0-e28d-48be-a971-cac0d429b661"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjRiMTVlMC1lMjhkLTQ4YmUtYTk3MS1jYWMwZDQyOWI2NjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NDg3LCJpYXQiOjE3OTMxMTU1ODcsImp0aSI6IjdjN2Q0ZTBlLWI5YzQtNDVlMC04OWZjLTRlYjA4NjA3ZTZhZCIsInNpZCI6ImY5M2Q0N2UyLWE2MGQtNDZiYy05OWFkLTBhZjA0YTdkM2QyZiJ9.w1iRs-nOW2OnkD3cd9iTu6ocae1dFzFZk9tNeAaYPhs",
  "access_expires_at": "2026-10-27T15:54:47.446507667Z",
  "refresh_token": "23r94nD9CtG_CrUeq5wim6VAfGktXeF_fJKSo_lAKic",
  "refresh_expires_at": "2026-11-26T15:39:47.445948974Z",
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
  "correlation_id": "81486afd-528e-44eb-a24f-ccaa0da48fbb"
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
  "device_ref": "sandbox-15749"
}
```

```json
{
  "challenge_id": "917fc924-34eb-4002-a1cf-1c81e89b6cd4",
  "expires_at": "2026-10-27T15:44:47.525767315Z",
  "resend_available_at": "2026-10-27T15:39:48.525767315Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "582779",
  "sent_at": "2026-10-27T15:39:47.527951056Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "917fc924-34eb-4002-a1cf-1c81e89b6cd4",
  "code": "582779",
  "device_ref": "sandbox-15749"
}
```

```json
{
  "session_id": "8e934ff7-9455-455c-b167-9223c9c4fc18",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ4NywiaWF0IjoxNzkzMTE1NTg3LCJqdGkiOiI1MDAzOGEwMy0yZWJhLTQ2YjAtODQxYy0wNTYxM2UyNzhlNGMiLCJzaWQiOiI4ZTkzNGZmNy05NDU1LTQ1NWMtYjE2Ny05MjIzYzljNGZjMTgifQ.qU4uyQ40IXQclxLE0npxJPuAuC99gOoaD-mOqVcy7ko",
  "access_expires_at": "2026-10-27T15:54:47.582272124Z",
  "refresh_token": "a4VxpBAeLk61hhxNBkxUbKRP7OtEiukcKUeYmt16Fgk",
  "refresh_expires_at": "2026-11-26T15:39:47.581710034Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "09c2a32c-d048-400c-a552-5b19b0b2fdc6",
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
  "last_heartbeat_at": "2026-10-27T15:39:44.929007Z",
  "last_location_at": "2026-10-27T15:39:44.929007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/09c2a32c-d048-400c-a552-5b19b0b2fdc6/handover` → **200**

```json
{
  "command_id": "1bc55304-595b-40cd-a825-03fef4d9f3d9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "09c2a32c-d048-400c-a552-5b19b0b2fdc6",
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
  "last_heartbeat_at": "2026-10-27T15:39:44.929007Z",
  "last_location_at": "2026-10-27T15:39:44.929007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/09c2a32c-d048-400c-a552-5b19b0b2fdc6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:47Z",
    "sequence": 1793115587665
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "09c2a32c-d048-400c-a552-5b19b0b2fdc6",
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
  "last_heartbeat_at": "2026-10-27T15:39:47.684555Z",
  "last_location_at": "2026-10-27T15:39:47.684555Z",
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
  "session_id": "09c2a32c-d048-400c-a552-5b19b0b2fdc6",
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
  "last_heartbeat_at": "2026-10-27T15:39:47.684555Z",
  "last_location_at": "2026-10-27T15:39:47.684555Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/09c2a32c-d048-400c-a552-5b19b0b2fdc6/close` → **200**

```json
{
  "command_id": "25ca14ad-4ef7-400a-a48f-772279249fbb",
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
  "correlation_id": "c891fb74-092a-4dea-9b22-c34cc6ce204c"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676103972",
  "device_ref": "sandbox-18660"
}
```

```json
{
  "challenge_id": "6725ff36-1bc5-4efb-b664-27e853fd4495",
  "expires_at": "2026-10-27T15:44:47.844281982Z",
  "resend_available_at": "2026-10-27T15:39:48.844281982Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676103972` → **200**

```json
{
  "phone": "+380676103972",
  "audience": "CLIENT",
  "code": "541811",
  "sent_at": "2026-10-27T15:39:47.8467409Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6725ff36-1bc5-4efb-b664-27e853fd4495",
  "code": "541811",
  "device_ref": "sandbox-18660"
}
```

```json
{
  "session_id": "60d09bdf-5f91-4f14-b607-5995f95c80b6",
  "subject": {
    "type": "CLIENT",
    "id": "b856276e-add5-40b5-ad1f-3861b4057404"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODU2Mjc2ZS1hZGQ1LTQwYjUtYWQxZi0zODYxYjQwNTc0MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NDg3LCJpYXQiOjE3OTMxMTU1ODcsImp0aSI6IjZlM2M3MGFlLWJhYzQtNDc3OC05ZjBhLWNhMmNlM2ZmMDAwMCIsInNpZCI6IjYwZDA5YmRmLTVmOTEtNGYxNC1iNjA3LTU5OTVmOTVjODBiNiJ9.HgRtQyD6s3QOrZThrcl6TeVCKt2ZlhYQMPE4JUMCa2I",
  "access_expires_at": "2026-10-27T15:54:47.904557643Z",
  "refresh_token": "3_tnXmf10t8bBlL1YyKv0YUezIQWm0_2wqbsfum44dU",
  "refresh_expires_at": "2026-11-26T15:39:47.903887331Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "134ce155-1504-4e51-91c8-b8229ef045ff",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "34c349b0-dd5e-4bf5-a35a-05e11da08e5b",
  "upload_path": "/api/rider/v1/uploads/34c349b0-dd5e-4bf5-a35a-05e11da08e5b",
  "expires_at": "2026-10-27T15:54:47.940607875Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/34c349b0-dd5e-4bf5-a35a-05e11da08e5b` → **200**

```json
{
  "file_id": "34c349b0-dd5e-4bf5-a35a-05e11da08e5b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "b6bedc60-ff47-441d-bdbc-38fb10437179",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "34c349b0-dd5e-4bf5-a35a-05e11da08e5b"
  ]
}
```

```json
{
  "id": "b16099df-327b-47e4-9659-abadcf31a0ae",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b856276e-add5-40b5-ad1f-3861b4057404",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:39:48.00949Z",
  "updated_at": "2026-10-27T15:39:48.00949Z",
  "messages": [
    {
      "id": "df5f5160-5304-4121-8b2a-3ae106909a8d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b856276e-add5-40b5-ad1f-3861b4057404",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:39:48.01109Z",
      "attachments": [
        {
          "file_id": "34c349b0-dd5e-4bf5-a35a-05e11da08e5b",
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
  "session_id": "4865aeea-a2a1-4b56-a696-8b50fec4f46c",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0ODgsImlhdCI6MTc5MzExNTU4OCwianRpIjoiNTdkYWE3YTMtYTIyMS00YTJhLTkwNTAtMjliMzIyNmY0MzdhIiwic2lkIjoiNDg2NWFlZWEtYTJhMS00YjU2LWE2OTYtOGI1MGZlYzRmNDZjIn0._hmT1HLlnfzMeR9HHz0WiqcYcecTPVuxsfq-HH8DIco",
  "access_expires_at": "2026-10-27T15:54:48.346504441Z",
  "refresh_token": "g0rnrD034JIjP05wxwaI1sbzyQLZM4k1FcaNbj08wHo",
  "refresh_expires_at": "2026-10-28T03:39:48.3457855Z",
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
  "session_id": "37b2b228-e279-4e3b-a6a9-15dfd1232021",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0ODgsImlhdCI6MTc5MzExNTU4OCwianRpIjoiNTg0ZWEwMjgtMTljZS00MzY0LTk2YWItNzg3YzJjOGE0Yjg5Iiwic2lkIjoiMzdiMmIyMjgtZTI3OS00ZTNiLWE2YTktMTVkZmQxMjMyMDIxIn0.Lpj5DlLbCPzZf2J3Etrs0o3va01ohwdDPn-KFRZmOaQ",
  "access_expires_at": "2026-10-27T15:54:48.664462881Z",
  "refresh_token": "xUQ4kt2Dp7kiavN2z3DVPlFIoPLKqhsrXGUdwrNIe3Q",
  "refresh_expires_at": "2026-10-28T03:39:48.66389511Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/b16099df-327b-47e4-9659-abadcf31a0ae/attachments/34c349b0-dd5e-4bf5-a35a-05e11da08e5b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "a72c3a96-072e-4ee8-869e-d54ee13fea07",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "358edd7e-94b9-4abf-a21b-9fea18eb2ae0",
  "upload_path": "/api/operator/v1/uploads/358edd7e-94b9-4abf-a21b-9fea18eb2ae0",
  "expires_at": "2026-10-27T15:54:48.715609461Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/358edd7e-94b9-4abf-a21b-9fea18eb2ae0` → **200**

```json
{
  "file_id": "358edd7e-94b9-4abf-a21b-9fea18eb2ae0",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/b16099df-327b-47e4-9659-abadcf31a0ae` → **200**

```json
{
  "id": "b16099df-327b-47e4-9659-abadcf31a0ae",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b856276e-add5-40b5-ad1f-3861b4057404",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T15:39:48.00949Z",
  "updated_at": "2026-10-27T15:39:48.00949Z",
  "messages": [
    {
      "id": "df5f5160-5304-4121-8b2a-3ae106909a8d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b856276e-add5-40b5-ad1f-3861b4057404",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:39:48.01109Z",
      "attachments": [
        {
          "file_id": "34c349b0-dd5e-4bf5-a35a-05e11da08e5b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/b16099df-327b-47e4-9659-abadcf31a0ae/comments` → **200**

```json
{
  "command_id": "40930a71-69a0-4137-b95b-721a0e0597d8",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "358edd7e-94b9-4abf-a21b-9fea18eb2ae0"
  ]
}
```

```json
{
  "id": "b16099df-327b-47e4-9659-abadcf31a0ae",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b856276e-add5-40b5-ad1f-3861b4057404",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:39:48.00949Z",
  "updated_at": "2026-10-27T15:39:48.815328Z",
  "messages": [
    {
      "id": "df5f5160-5304-4121-8b2a-3ae106909a8d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b856276e-add5-40b5-ad1f-3861b4057404",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:39:48.01109Z",
      "attachments": [
        {
          "file_id": "34c349b0-dd5e-4bf5-a35a-05e11da08e5b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "086eaa68-d256-4836-bd6d-3425bde9a606",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:39:48.814928Z",
      "attachments": [
        {
          "file_id": "358edd7e-94b9-4abf-a21b-9fea18eb2ae0",
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

`GET /api/rider/v1/support/cases/b16099df-327b-47e4-9659-abadcf31a0ae` → **200**

```json
{
  "id": "b16099df-327b-47e4-9659-abadcf31a0ae",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b856276e-add5-40b5-ad1f-3861b4057404",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T15:39:48.00949Z",
  "updated_at": "2026-10-27T15:39:48.815328Z",
  "messages": [
    {
      "id": "df5f5160-5304-4121-8b2a-3ae106909a8d",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b856276e-add5-40b5-ad1f-3861b4057404",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T15:39:48.01109Z",
      "attachments": [
        {
          "file_id": "34c349b0-dd5e-4bf5-a35a-05e11da08e5b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "086eaa68-d256-4836-bd6d-3425bde9a606",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T15:39:48.814928Z",
      "attachments": [
        {
          "file_id": "358edd7e-94b9-4abf-a21b-9fea18eb2ae0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/b16099df-327b-47e4-9659-abadcf31a0ae/attachments/358edd7e-94b9-4abf-a21b-9fea18eb2ae0` → **200**

Done: support case b16099df-327b-47e4-9659-abadcf31a0ae, rider attachment 34c349b0-dd5e-4bf5-a35a-05e11da08e5b, operator attachment 358edd7e-94b9-4abf-a21b-9fea18eb2ae0.

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
  "session_id": "1962539a-4e8b-413d-a38f-37a85f0ffe15",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0ODksImlhdCI6MTc5MzExNTU4OSwianRpIjoiZWM5MzI1ZGEtZWRhOS00YmJkLTg0ZTAtMzI4NzliYmNiM2RlIiwic2lkIjoiMTk2MjUzOWEtNGU4Yi00MTNkLWEzOGYtMzdhODVmMGZmZTE1In0.N8hPAUzy6glcSRy0WLkhWIMgcg_FGypNAP9ZwDax5GM",
  "access_expires_at": "2026-10-27T15:54:49.205101155Z",
  "refresh_token": "s6fWFEdgQCL33iRCiV1UiEy2VMIDk-UVECJCre8Nq4I",
  "refresh_expires_at": "2026-10-28T03:39:49.204427629Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-21239"
}
```

```json
{
  "challenge_id": "44962b32-00d6-4d75-b8f6-7bbfdd661ef5",
  "expires_at": "2026-10-27T15:44:49.232551589Z",
  "resend_available_at": "2026-10-27T15:39:50.232551589Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "919986",
  "sent_at": "2026-10-27T15:39:49.235092888Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44962b32-00d6-4d75-b8f6-7bbfdd661ef5",
  "code": "919986",
  "device_ref": "sandbox-21239"
}
```

```json
{
  "session_id": "452b4d3c-824e-4215-a8d8-f03b753b20a2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ4OSwiaWF0IjoxNzkzMTE1NTg5LCJqdGkiOiJmOTEwNjEyYS03NzczLTQ5ZDYtOTE4YS0wYjAwZmUyY2UxMjgiLCJzaWQiOiI0NTJiNGQzYy04MjRlLTQyMTUtYThkOC1mMDNiNzUzYjIwYTIifQ.nBRa1zEoztDwlWfYSmQHnSXUf2bJbWwhfl8_ZJ49SVA",
  "access_expires_at": "2026-10-27T15:54:49.290943034Z",
  "refresh_token": "HVIbdSbuCJ0mSEd33B8kzimgfx-JQBoH2NlfsGIMYZQ",
  "refresh_expires_at": "2026-11-26T15:39:49.290424996Z",
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
  "command_id": "16f7a6b7-f5d2-4514-a028-5ce979232b90",
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
  "device_ref": "sandbox-2556"
}
```

```json
{
  "challenge_id": "94781eed-c24a-48e2-a2db-8c3299a2948f",
  "expires_at": "2026-10-27T15:44:49.418910842Z",
  "resend_available_at": "2026-10-27T15:39:50.418910842Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "205177",
  "sent_at": "2026-10-27T15:39:49.421021897Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94781eed-c24a-48e2-a2db-8c3299a2948f",
  "code": "205177",
  "device_ref": "sandbox-2556"
}
```

```json
{
  "session_id": "11da4a44-1dfb-45a4-becd-016f223c6724",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExNjQ4OSwiaWF0IjoxNzkzMTE1NTg5LCJqdGkiOiJlYWIxNWNmOS1hYTY3LTQxMjUtYjRjYi03ZDc3MWY2ZTVmYzMiLCJzaWQiOiIxMWRhNGE0NC0xZGZiLTQ1YTQtYmVjZC0wMTZmMjIzYzY3MjQifQ.PkhjCmCiEFTBe_uxO2RR7jPuy-ySACxWg-j-nuL7Osc",
  "access_expires_at": "2026-10-27T15:54:49.475236669Z",
  "refresh_token": "6dhJRJCzKww6efyPxdvlhQ56tVKU291u8Zn3ijdoFNw",
  "refresh_expires_at": "2026-11-26T15:39:49.474609269Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "328b3502-4583-420e-9084-4019ce425a96",
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
  "last_heartbeat_at": "2026-10-27T15:39:46.068405Z",
  "last_location_at": "2026-10-27T15:39:46.068405Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/328b3502-4583-420e-9084-4019ce425a96/handover` → **200**

```json
{
  "command_id": "d0f0c68e-b943-431a-bd77-516f5c7f115e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "328b3502-4583-420e-9084-4019ce425a96",
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
  "last_heartbeat_at": "2026-10-27T15:39:46.068405Z",
  "last_location_at": "2026-10-27T15:39:46.068405Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/328b3502-4583-420e-9084-4019ce425a96/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:49Z",
    "sequence": 1793115589558
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "328b3502-4583-420e-9084-4019ce425a96",
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
  "last_heartbeat_at": "2026-10-27T15:39:49.576501Z",
  "last_location_at": "2026-10-27T15:39:49.576501Z",
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
  "command_id": "d2688d7f-9c46-4ce8-8a8f-bea91739fbe1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:49Z",
    "sequence": 1793115589623
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ed98b20e-3da8-49df-a64c-600076c43ca7",
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
  "last_heartbeat_at": "2026-10-27T15:39:49.640998Z",
  "last_location_at": "2026-10-27T15:39:49.640998Z",
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
  "session_id": "9f38cad6-88c8-47b7-aa93-d22e6261f1a2",
  "subject": {
    "type": "STAFF",
    "id": "56c1a7f0-4f36-4b06-b5e2-9752200ce40e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmMxYTdmMC00ZjM2LTRiMDYtYjVlMi05NzUyMjAwY2U0MGUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTY0ODksImlhdCI6MTc5MzExNTU4OSwianRpIjoiZTRmOTg2YjctNzZlMi00ZjhjLWFjMGQtZTg2MWFkOTcxNzc2Iiwic2lkIjoiOWYzOGNhZDYtODhjOC00N2I3LWFhOTMtZDIyZTYyNjFmMWEyIn0.VCUXaqh2dFkY9AVdAo2K1GrxnK0QKsO4S-K9QfZF9UM",
  "access_expires_at": "2026-10-27T15:54:49.965243902Z",
  "refresh_token": "RucUNoCGOHiZ303NIQa3T-v_untvewRooqLvEjOcKiU",
  "refresh_expires_at": "2026-10-28T03:39:49.964671933Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0298181e-cf98-46b7-b8b8-968cb3ed647e",
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
  "id": "52026209-684e-4d2f-a82c-363707fb4392",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T15:44:49.996401Z",
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
  "command_id": "b37ed0e1-c2d8-4386-8e4e-24a769898e7f",
  "quote_id": "52026209-684e-4d2f-a82c-363707fb4392",
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
  "id": "eba24515-0109-47a9-9216-a659ebd11d66",
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
  "created_at": "2026-10-27T15:39:50.03524Z",
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
    "id": "257604ee-80c8-4faa-aa05-28cdb3624534",
    "order_id": "eba24515-0109-47a9-9216-a659ebd11d66",
    "expires_at": "2026-10-27T15:40:05.040062Z",
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

`POST /api/driver/v1/offers/257604ee-80c8-4faa-aa05-28cdb3624534/accept` → **200**

```json
{
  "command_id": "f1b614c9-0b3e-45b0-8c99-788958042ea4"
}
```

```json
{
  "id": "102e827c-a4d9-47cb-a68c-595816df1710",
  "order_id": "eba24515-0109-47a9-9216-a659ebd11d66",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "92ee0481-83e3-4fe6-bda8-f5e6e1081442",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "92ee0481-83e3-4fe6-bda8-f5e6e1081442",
  "order_id": "eba24515-0109-47a9-9216-a659ebd11d66",
  "assignment_id": "102e827c-a4d9-47cb-a68c-595816df1710",
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
  "discount_minor": 0
}
```

`POST /api/driver/v1/work-sessions/ed98b20e-3da8-49df-a64c-600076c43ca7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T15:39:50Z",
    "sequence": 1793115590172
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ed98b20e-3da8-49df-a64c-600076c43ca7",
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
  "last_heartbeat_at": "2026-10-27T15:39:50.190859Z",
  "last_location_at": "2026-10-27T15:39:50.190859Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/92ee0481-83e3-4fe6-bda8-f5e6e1081442/arrive` → **200**

```json
{
  "command_id": "58924deb-c18c-4e85-aebf-7b7f151fa89e",
  "expected_version": 0
}
```

```json
{
  "id": "92ee0481-83e3-4fe6-bda8-f5e6e1081442",
  "order_id": "eba24515-0109-47a9-9216-a659ebd11d66",
  "assignment_id": "102e827c-a4d9-47cb-a68c-595816df1710",
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
  "arrived_at": "2026-10-27T15:39:50.2264Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/92ee0481-83e3-4fe6-bda8-f5e6e1081442/start` → **200**

```json
{
  "command_id": "f9f3c8bc-f5fd-469a-8385-46092d556153",
  "expected_version": 1
}
```

```json
{
  "id": "92ee0481-83e3-4fe6-bda8-f5e6e1081442",
  "order_id": "eba24515-0109-47a9-9216-a659ebd11d66",
  "assignment_id": "102e827c-a4d9-47cb-a68c-595816df1710",
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
  "arrived_at": "2026-10-27T15:39:50.2264Z",
  "started_at": "2026-10-27T15:39:50.265527Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/driver/v1/trips/92ee0481-83e3-4fe6-bda8-f5e6e1081442/complete` → **200**

```json
{
  "command_id": "da16ad85-4ce9-440e-8689-47704fa36928",
  "expected_version": 2,
  "reported_at": "2026-10-27T15:39:50Z",
  "cash_received": true
}
```

```json
{
  "id": "92ee0481-83e3-4fe6-bda8-f5e6e1081442",
  "order_id": "eba24515-0109-47a9-9216-a659ebd11d66",
  "assignment_id": "102e827c-a4d9-47cb-a68c-595816df1710",
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
  "arrived_at": "2026-10-27T15:39:50.2264Z",
  "started_at": "2026-10-27T15:39:50.265527Z",
  "completed_at": "2026-10-27T15:39:50.307127Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/operator/v1/orders/eba24515-0109-47a9-9216-a659ebd11d66` → **200**

```json
{
  "id": "eba24515-0109-47a9-9216-a659ebd11d66",
  "short_number": 12,
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
    "id": "102e827c-a4d9-47cb-a68c-595816df1710",
    "order_id": "eba24515-0109-47a9-9216-a659ebd11d66",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "92ee0481-83e3-4fe6-bda8-f5e6e1081442",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T15:39:50.03524Z",
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
  "session_id": "328b3502-4583-420e-9084-4019ce425a96",
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
  "last_heartbeat_at": "2026-10-27T15:39:49.576501Z",
  "last_location_at": "2026-10-27T15:39:49.576501Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/328b3502-4583-420e-9084-4019ce425a96/close` → **200**

```json
{
  "command_id": "952340db-b4bc-46ad-9024-e7cfd5404fc1",
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
  "session_id": "ed98b20e-3da8-49df-a64c-600076c43ca7",
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
  "last_heartbeat_at": "2026-10-27T15:39:50.190859Z",
  "last_location_at": "2026-10-27T15:39:50.190859Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed98b20e-3da8-49df-a64c-600076c43ca7/close` → **200**

```json
{
  "command_id": "486776c9-3e49-4f48-9d84-5b0d8dad1c76",
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

Done: terminal order eba24515-0109-47a9-9216-a659ebd11d66 by Andrii (5a000000-0000-4000-8000-000000000403).
