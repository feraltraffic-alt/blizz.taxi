# Sandbox transcript (2026-10-27T15:40:48Z, b207b0b)

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672138768",
  "device_ref": "sandbox-19353"
}
```

```json
{
  "challenge_id": "9777515a-d62e-4f0a-8b45-dcd39eba4fcd",
  "expires_at": "2026-10-27T15:45:48.147039596Z",
  "resend_available_at": "2026-10-27T15:40:49.147039596Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672138768` → **200**

```json
{
  "phone": "+380672138768",
  "audience": "CLIENT",
  "code": "478173",
  "sent_at": "2026-10-27T15:40:48.157975256Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9777515a-d62e-4f0a-8b45-dcd39eba4fcd",
  "code": "478173",
  "device_ref": "sandbox-19353"
}
```

```json
{
  "session_id": "d5591e40-83e0-47bf-8ccf-59ddf1a57d4f",
  "subject": {
    "type": "CLIENT",
    "id": "044cd7c0-41be-4d74-8e22-1487b4b2b592"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNDRjZDdjMC00MWJlLTRkNzQtOGUyMi0xNDg3YjRiMmI1OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTE2NTQ4LCJpYXQiOjE3OTMxMTU2NDgsImp0aSI6ImVjNzY4OTQ0LTM1ZWYtNGFjZi05NGI5LWYzMWQ4ODhlYjJmOCIsInNpZCI6ImQ1NTkxZTQwLTgzZTAtNDdiZi04Y2NmLTU5ZGRmMWE1N2Q0ZiJ9.iWcyFfgiDLgeaaF37KcqyouGH1o7LWMwbkdyyoAPwUU",
  "access_expires_at": "2026-10-27T15:55:48.252294023Z",
  "refresh_token": "UG41zbDtQWn0CSW9J-NNExfCf_lLaADqBecdeyJO2eA",
  "refresh_expires_at": "2026-11-26T15:40:48.250062314Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "044cd7c0-41be-4d74-8e22-1487b4b2b592",
  "session_id": "d5591e40-83e0-47bf-8ccf-59ddf1a57d4f",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7dcf4e00-a385-475f-9dae-205449ff5a74",
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
  "id": "dae708c1-ef9e-44d6-a518-c2e134204218",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T15:45:48.488111Z",
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
  "challenge_id": "0185f390-68b5-43c0-bf07-f1ae27179cf3",
  "expires_at": "2026-10-27T15:45:50.548553957Z",
  "resend_available_at": "2026-10-27T15:40:51.548553957Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672138768` → **200**

```json
{
  "phone": "+380672138768",
  "audience": "CLIENT",
  "code": "428659",
  "sent_at": "2026-10-27T15:40:50.552134449Z"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "8fdb4b60-239f-41b8-b08c-902afd4baefd",
  "challenge_id": "0185f390-68b5-43c0-bf07-f1ae27179cf3",
  "otp_code": "428659"
}
```

```json
{
  "client_id": "044cd7c0-41be-4d74-8e22-1487b4b2b592",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T15:40:50.614513875Z"
}
```
