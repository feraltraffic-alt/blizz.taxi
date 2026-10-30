# Sandbox transcript (2026-10-30T16:28:06Z, 02efddb)

# Scenario: admission-cities

## Only Andrii is online in Kyiv for this scenario

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27656"
}
```

```json
{
  "challenge_id": "02cb65ad-42ba-4328-aa5e-9bb7adfaafdc",
  "expires_at": "2026-10-30T16:33:07.005954014Z",
  "resend_available_at": "2026-10-30T16:28:08.005954014Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "906998",
  "sent_at": "2026-10-30T16:28:07.020062384Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02cb65ad-42ba-4328-aa5e-9bb7adfaafdc",
  "code": "906998",
  "device_ref": "sandbox-27656"
}
```

```json
{
  "session_id": "e9781511-1680-4b78-ac5c-d9b0e882936b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODU5MywiaWF0IjoxNzkzMzc3NjkzLCJqdGkiOiJkY2ZmZmM1MC1hNjI1LTQ4N2YtYWU0Yy1mYThmNmI5NjE3NTIiLCJzaWQiOiJlOTc4MTUxMS0xNjgwLTRiNzgtYWM1Yy1kOWIwZTg4MjkzNmIifQ.zCBOyVxv3Dtir7YhyjPPOhmlVOs6p-sV27jDSk8vd00",
  "access_expires_at": "2026-10-30T16:43:13.476815391Z",
  "refresh_token": "eUlu3WeSy-JMYtzsxu708NRCWcd8-FZIsRts9-pWDTY",
  "refresh_expires_at": "2026-11-29T16:28:13.474846986Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-24956"
}
```

```json
{
  "challenge_id": "e2ec890a-19a2-450e-b1d0-3610c0bbc01a",
  "expires_at": "2026-10-30T16:33:14.138271474Z",
  "resend_available_at": "2026-10-30T16:28:15.138271474Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "401249",
  "sent_at": "2026-10-30T16:28:14.143847826Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2ec890a-19a2-450e-b1d0-3610c0bbc01a",
  "code": "401249",
  "device_ref": "sandbox-24956"
}
```

```json
{
  "session_id": "7bcf211f-c4b2-477f-940f-7d3092bdbd70",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODU5NCwiaWF0IjoxNzkzMzc3Njk0LCJqdGkiOiJhZTE2OTdhOS05Njc2LTQ5ODItODZjYi1mZTBlM2Y2NGUyMjEiLCJzaWQiOiI3YmNmMjExZi1jNGIyLTQ3N2YtOTQwZi03ZDMwOTJiZGJkNzAifQ.ay5tHmxbvYVAtcoeHW3EnNGl2WtmmU4V0efoaPHW0NI",
  "access_expires_at": "2026-10-30T16:43:14.452320955Z",
  "refresh_token": "Wey302w5bhpLK00k7iaH__UrRDz1XyCKodY-R-AGR4Y",
  "refresh_expires_at": "2026-11-29T16:28:14.451407524Z",
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
  "correlation_id": "d9a21914-d059-4964-8059-66fa12b95c07"
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
  "session_id": "710d888a-4cc2-4c9a-aa7b-df27007f2b96",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg1OTUsImlhdCI6MTc5MzM3NzY5NSwianRpIjoiYmQxMjNmZGItZWFlOS00ODcwLTg4MDItZjBjZGNiMDY4NDQ0Iiwic2lkIjoiNzEwZDg4OGEtNGNjMi00YzlhLWFhN2ItZGYyNzAwN2YyYjk2In0.Mv0bvyydhcVtGB1xcuNxURJKBWToLYkmvP32vZwDqQY",
  "access_expires_at": "2026-10-30T16:43:15.91939311Z",
  "refresh_token": "4gYbs8jjMpE_UJrftCV-KqT2VB0yswQVkdOEzvosmH0",
  "refresh_expires_at": "2026-10-31T04:28:15.918455165Z",
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
  "session_id": "be0e07b9-8965-4980-b49d-1db8a1535bf3",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg1OTcsImlhdCI6MTc5MzM3NzY5NywianRpIjoiZDgwNGRiMzgtZGM3ZC00MTdmLWE5M2MtZjk5MTI1Y2VhYzhhIiwic2lkIjoiYmUwZTA3YjktODk2NS00OTgwLWI0OWQtMWRiOGExNTM1YmYzIn0.yK0w2qmTI82RyEsSyhUQJc6cpNXmLIycldWa54Su2nw",
  "access_expires_at": "2026-10-30T16:43:17.737093458Z",
  "refresh_token": "z8KIkZpxrNvp9wqi4tgj0kMoQK9XDCm0VixY1bIUxVw",
  "refresh_expires_at": "2026-10-31T04:28:17.736087493Z",
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
  "session_id": "6a374f36-148e-4277-8b11-36934f44cdbb",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg1OTgsImlhdCI6MTc5MzM3NzY5OCwianRpIjoiNDkzMTE3MTEtZmVlNS00ZjMwLTkzODgtNjYxYWJkZjgxOWRiIiwic2lkIjoiNmEzNzRmMzYtMTQ4ZS00Mjc3LThiMTEtMzY5MzRmNDRjZGJiIn0.AJPeGGAYaqBLZljfKsg6tfmfpsZbc7GoqKDT_Nd3Y7A",
  "access_expires_at": "2026-10-30T16:43:18.324200888Z",
  "refresh_token": "RUF0QI4ONohAoGXwzH6ClsWxrdsSZgmai3MSUKXaOSg",
  "refresh_expires_at": "2026-10-31T04:28:18.323198343Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-66"
}
```

```json
{
  "challenge_id": "96d1271b-665a-41fd-9682-b8bd74ad4a37",
  "expires_at": "2026-10-30T16:33:18.609598912Z",
  "resend_available_at": "2026-10-30T16:28:19.609598912Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "574888",
  "sent_at": "2026-10-30T16:28:18.614356949Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96d1271b-665a-41fd-9682-b8bd74ad4a37",
  "code": "574888",
  "device_ref": "sandbox-66"
}
```

```json
{
  "session_id": "df906efb-b838-472d-93b4-148165455777",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODU5OCwiaWF0IjoxNzkzMzc3Njk4LCJqdGkiOiIyZTg1ZGE1Ni0wMWE5LTRkZTMtYmViOS04ZmIyZDYxNDgzNzAiLCJzaWQiOiJkZjkwNmVmYi1iODM4LTQ3MmQtOTNiNC0xNDgxNjU0NTU3NzcifQ.yJOttKTDQ6gjFwc5lKV0BUkmLYGxmXsKfnIoVnO9IqU",
  "access_expires_at": "2026-10-30T16:43:18.936540105Z",
  "refresh_token": "umaYT25ceA_hbYegiNoZJA8Z5NujFvs9mLhpnbkiIZc",
  "refresh_expires_at": "2026-11-29T16:28:18.935703341Z",
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

## E1: admitted only in Warsaw, Andrii cannot go online in Kyiv

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 1,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
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
  "history": [],
  "duplicates": []
}
```

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "1229acb5-b9ce-472e-99a3-d186795efa5a",
  "expected_version": 1,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
  "reason": "Moved to the Warsaw office"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 2,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
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

`POST /api/driver/v1/work-sessions` → **409**

```json
{
  "command_id": "2d24edb5-2b55-422e-a602-e1261f4b5224",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:28:20Z",
    "sequence": 1793377700140
  }
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "30b6a9bf-730c-4aa0-b472-abcc162d8680"
}
```

## Back in Kyiv he goes online; then he is taken off Kyiv while online

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 2,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000002"
    ],
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
  "history": [],
  "duplicates": []
}
```

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "ad4da506-7c3d-4bbf-a865-ba420d359fc7",
  "expected_version": 2,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "reason": "Back in Kyiv"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 3,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
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
  "command_id": "5f07f5af-24c3-46be-afc1-e4bf32391f31",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:28:21Z",
    "sequence": 1793377701448
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "801a0850-1f41-4771-b90c-635e6d566f22",
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
  "last_heartbeat_at": "2026-10-30T16:28:21.469458Z",
  "last_location_at": "2026-10-30T16:28:21.469458Z",
  "eligible": true,
  "ineligible_reasons": []
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
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
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
  "history": [],
  "duplicates": []
}
```

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "87b7f6b0-19cf-4e0d-898c-ca5671dfef3d",
  "expected_version": 3,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
  "reason": "Kyiv licence suspended for a check"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 4,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000002"
  ],
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
  "session_id": "801a0850-1f41-4771-b90c-635e6d566f22",
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
  "last_heartbeat_at": "2026-10-30T16:28:21.469458Z",
  "last_location_at": "2026-10-30T16:28:21.469458Z",
  "eligible": false,
  "ineligible_reasons": [
    "ADMISSION_CITY"
  ]
}
```

## A rider orders 300 m from him: no offer, not in his ALL tab, a claim is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380682182872",
  "device_ref": "sandbox-22249"
}
```

```json
{
  "challenge_id": "39de1a5f-e188-4c3c-a17e-254519873c32",
  "expires_at": "2026-10-30T16:33:22.669681492Z",
  "resend_available_at": "2026-10-30T16:28:23.669681492Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380682182872` → **200**

```json
{
  "phone": "+380682182872",
  "audience": "CLIENT",
  "code": "484510",
  "sent_at": "2026-10-30T16:28:22.674851344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39de1a5f-e188-4c3c-a17e-254519873c32",
  "code": "484510",
  "device_ref": "sandbox-22249"
}
```

```json
{
  "session_id": "e9a7ce1d-9bfb-4037-b4e0-43a6973c659c",
  "subject": {
    "type": "CLIENT",
    "id": "42e42c9c-25fe-42d9-82ab-e4f5e5e8bfd3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MmU0MmM5Yy0yNWZlLTQyZDktODJhYi1lNGY1ZTVlOGJmZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4NjAyLCJpYXQiOjE3OTMzNzc3MDIsImp0aSI6ImU4ZjcxMzMyLTc4MDctNDRiOC04OGU5LTFiOGNjZTc1NjFmNCIsInNpZCI6ImU5YTdjZTFkLTliZmItNDAzNy1iNGUwLTQzYTY5NzNjNjU5YyJ9.k1DuDHmswXb_aNp48Npt9n8k1oiNTKa3k8TlM0ufk2A",
  "access_expires_at": "2026-10-30T16:43:22.982830694Z",
  "refresh_token": "KW0ILXeEX9TIX1lE32zTstMtvq91QJsShfuV078h_TE",
  "refresh_expires_at": "2026-11-29T16:28:22.982034847Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0aedd162-2111-40e3-9bf2-0344233fcda4",
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
  "id": "c518c03a-a2ef-499b-ad47-d7338a601dce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:33:23.298896Z",
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
  "command_id": "fd3a924d-0e84-447b-b61b-48d3b32db3cc",
  "quote_id": "c518c03a-a2ef-499b-ad47-d7338a601dce",
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
  "id": "ce6b7a2e-b0de-44ab-a669-45f3c802968a",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42e42c9c-25fe-42d9-82ab-e4f5e5e8bfd3",
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
  "created_at": "2026-10-30T16:28:23.683651Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[]
```

`POST /api/driver/v1/orders/ce6b7a2e-b0de-44ab-a669-45f3c802968a/claim` → **409**

```json
{
  "command_id": "264a219a-d343-4b99-ba50-6f0649ee4f29"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ce6b7a2e-b0de-44ab-a669-45f3c802968a/claim",
  "status": 409,
  "title": "Driver not eligible",
  "type": "https://errors.blizz.taxi/driver-not-eligible",
  "code": "DRIVER_NOT_ELIGIBLE",
  "correlation_id": "ec75dd9e-e18d-4a90-99d0-2826686369c7"
}
```

`GET /api/operator/v1/orders/ce6b7a2e-b0de-44ab-a669-45f3c802968a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:28:23.685871Z",
      "actor": {
        "type": "CLIENT",
        "id": "42e42c9c-25fe-42d9-82ab-e4f5e5e8bfd3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ce6b7a2e-b0de-44ab-a669-45f3c802968a",
        "quote_id": "c518c03a-a2ef-499b-ad47-d7338a601dce",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "111a579e-2b8c-4905-af40-10693d87c212"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:28:23.691346Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ce6b7a2e-b0de-44ab-a669-45f3c802968a",
        "attempt_id": "797c99eb-12ef-42e6-970a-301b718732bc",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "111a579e-2b8c-4905-af40-10693d87c212"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T16:28:23.744071Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ce6b7a2e-b0de-44ab-a669-45f3c802968a",
        "attempt_id": "797c99eb-12ef-42e6-970a-301b718732bc"
      },
      "correlation_id": "111a579e-2b8c-4905-af40-10693d87c212"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "797c99eb-12ef-42e6-970a-301b718732bc",
        "generation": 1,
        "started_at": "2026-10-30T16:28:23.688858Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T16:28:23.744071Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T16:28:23.692972Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000403",
```

## Zones: Kyiv again; the ALL tab narrowed to a zone around the pickup has the order, another zone does not

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
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000002"
    ],
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
  "history": [],
  "duplicates": []
}
```

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "e06ab13f-fe47-4383-a367-80c7b4a6578e",
  "expected_version": 4,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "reason": "Check done"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 5,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
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

`POST /api/driver/v1/work-sessions/801a0850-1f41-4771-b90c-635e6d566f22/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4528,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:28:25Z",
    "sequence": 1793377705849
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "801a0850-1f41-4771-b90c-635e6d566f22",
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
  "last_heartbeat_at": "2026-10-30T16:28:25.873671Z",
  "last_location_at": "2026-10-30T16:28:25.873671Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "70f33143-f70a-4181-9881-b30585958b58",
  "type": "DISTRICT",
  "polygon": {
    "type": "Polygon",
    "coordinates": [
      [
        [
          30.510,
          50.440
        ],
        [
          30.540,
          50.440
        ],
        [
          30.540,
          50.460
        ],
        [
          30.510,
          50.460
        ],
        [
          30.510,
          50.440
        ]
      ]
    ]
  },
  "priority": 1,
  "reason": "Sandbox: ALL tab filter"
}
```

```json
{
  "id": "46859156-4dc2-4748-b115-571807c82e90",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/46859156-4dc2-4748-b115-571807c82e90/publish` → **200**

```json
{
  "command_id": "33c50fc5-8bad-4c45-abb4-62485d936cdd",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "46859156-4dc2-4748-b115-571807c82e90",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000001/zones` → **201**

```json
{
  "command_id": "49a180bf-2b95-41fe-909b-b72d6cfa733e",
  "type": "DISTRICT",
  "polygon": {
    "type": "Polygon",
    "coordinates": [
      [
        [
          30.600,
          50.400
        ],
        [
          30.640,
          50.400
        ],
        [
          30.640,
          50.420
        ],
        [
          30.600,
          50.420
        ],
        [
          30.600,
          50.400
        ]
      ]
    ]
  },
  "priority": 1,
  "reason": "Sandbox: ALL tab filter"
}
```

```json
{
  "id": "085e6df9-8135-4203-88b1-e3904d7316f7",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/085e6df9-8135-4203-88b1-e3904d7316f7/publish` → **200**

```json
{
  "command_id": "a9b4a982-87af-434a-ad88-745ca228e3d2",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "085e6df9-8135-4203-88b1-e3904d7316f7",
  "state": "PUBLISHED",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/zones` → **201**

```json
{
  "command_id": "0c2b842e-3b7d-43c6-83ca-fbf837ff1966",
  "type": "DISTRICT",
  "polygon": {
    "type": "Polygon",
    "coordinates": [
      [
        [
          21.000,
          52.220
        ],
        [
          21.030,
          52.220
        ],
        [
          21.030,
          52.240
        ],
        [
          21.000,
          52.240
        ],
        [
          21.000,
          52.220
        ]
      ]
    ]
  },
  "priority": 1,
  "reason": "Sandbox: ALL tab filter"
}
```

```json
{
  "id": "7a2b3042-e31f-411e-8a97-0a8278d6b9cf",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/zones/7a2b3042-e31f-411e-8a97-0a8278d6b9cf/publish` → **200**

```json
{
  "command_id": "a3482d27-972d-4db3-9ff5-71d673b42bfe",
  "expected_version": 0,
  "reason": "Sandbox"
}
```

```json
{
  "id": "7a2b3042-e31f-411e-8a97-0a8278d6b9cf",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/driver/v1/broadcast-orders?zone_id=46859156-4dc2-4748-b115-571807c82e90` → **200**

```json
[
  {
    "order_id": "ce6b7a2e-b0de-44ab-a669-45f3c802968a",
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
    "distance_m": 300
  }
]
```

`GET /api/driver/v1/broadcast-orders?zone_id=085e6df9-8135-4203-88b1-e3904d7316f7` → **200**

```json
[]
```

`GET /api/driver/v1/broadcast-orders?zone_id=7a2b3042-e31f-411e-8a97-0a8278d6b9cf` → **400**

```json
{
  "instance": "/api/driver/v1/broadcast-orders",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ea35678c-877b-4426-bd8b-cd32b626c5f4"
}
```

Done: E1 for 5a000000-0000-4000-8000-000000000403 (open 409, no offer, empty ALL tab, claim 409, journal CITY_NOT_ADMITTED); zone filter.

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "APPROVED",
    "version": 5,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
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
  "history": [],
  "duplicates": []
}
```

`PUT /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/admission-cities` → **200**

```json
{
  "command_id": "ebea8802-cbf7-49f7-a913-7f5520224dda",
  "expected_version": 5,
  "city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
  "reason": "Restore after the scenario"
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
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
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

`GET /api/operator/v1/orders/ce6b7a2e-b0de-44ab-a669-45f3c802968a` → **200**

```json
{
  "id": "ce6b7a2e-b0de-44ab-a669-45f3c802968a",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "42e42c9c-25fe-42d9-82ab-e4f5e5e8bfd3",
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
  "created_at": "2026-10-30T16:28:23.683651Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ce6b7a2e-b0de-44ab-a669-45f3c802968a/cancel` → **200**

```json
{
  "command_id": "28e7172b-bb89-45c1-b590-be40f0cda44f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ce6b7a2e-b0de-44ab-a669-45f3c802968a",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "42e42c9c-25fe-42d9-82ab-e4f5e5e8bfd3",
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
  "created_at": "2026-10-30T16:28:23.683651Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
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
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "801a0850-1f41-4771-b90c-635e6d566f22",
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
  "last_heartbeat_at": "2026-10-30T16:28:25.873671Z",
  "last_location_at": "2026-10-30T16:28:25.873671Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/801a0850-1f41-4771-b90c-635e6d566f22/close` → **200**

```json
{
  "command_id": "bdeec1cb-15bf-467b-bbfc-94c83285b4fb",
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

# Scenario: app-version

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
  "session_id": "bf2f1780-cc9b-4afa-9c30-8b608fd222be",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg2MTEsImlhdCI6MTc5MzM3NzcxMSwianRpIjoiZGMxOGE4MWYtMmUzYS00NDNiLWJkYjctMGRkNmU0ZTU1MDVjIiwic2lkIjoiYmYyZjE3ODAtY2M5Yi00YWZhLTljMzAtOGI2MDhmZDIyMmJlIn0.s0kc_jwvMnGGD3jm9ZLFUemw63pBID3WGPLVYzC8iQg",
  "access_expires_at": "2026-10-30T16:43:31.002430252Z",
  "refresh_token": "wTqSC9Jiq3qW3jHAL2YZgTBhPNL_SBTTxZ-jx7qy0PA",
  "refresh_expires_at": "2026-10-31T04:28:31.001478971Z",
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

## Ivan is online with his app and takes an order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15054"
}
```

```json
{
  "challenge_id": "3f193d85-b64e-4316-99dd-1429e3410f58",
  "expires_at": "2026-10-30T16:33:31.598373463Z",
  "resend_available_at": "2026-10-30T16:28:32.598373463Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "735727",
  "sent_at": "2026-10-30T16:28:31.603117907Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f193d85-b64e-4316-99dd-1429e3410f58",
  "code": "735727",
  "device_ref": "sandbox-15054"
}
```

```json
{
  "session_id": "b68dfeef-2433-4d6c-b22b-6bc9dddca5dd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODYxMSwiaWF0IjoxNzkzMzc3NzExLCJqdGkiOiIxODJjZmEyNC02MTFlLTRlYzctOWYwNi01Zjg2YzAwYWFlOGQiLCJzaWQiOiJiNjhkZmVlZi0yNDMzLTRkNmMtYjIyYi02YmM5ZGRkY2E1ZGQifQ.PlL4Tb8LPZhBLnvqPwPZK-RGzN5LkITJEPZhse4FjRo",
  "access_expires_at": "2026-10-30T16:43:31.913098713Z",
  "refresh_token": "NkVwfkSZw1zU6mOQ43RxZFJJnqU2J8nollyq9fvniHo",
  "refresh_expires_at": "2026-11-29T16:28:31.912390433Z",
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
  "command_id": "c97d2d6d-7014-4440-b73a-b054f942a5f6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:28:32Z",
    "sequence": 1793377712501
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17db8a24-b370-4385-a2e4-dbb0d4dc06df",
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
  "last_heartbeat_at": "2026-10-30T16:28:32.521843Z",
  "last_location_at": "2026-10-30T16:28:32.521843Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631263987",
  "device_ref": "sandbox-25745"
}
```

```json
{
  "challenge_id": "fb9e437e-c7af-4e86-93d5-1bc36181617c",
  "expires_at": "2026-10-30T16:33:32.82137579Z",
  "resend_available_at": "2026-10-30T16:28:33.82137579Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631263987` → **200**

```json
{
  "phone": "+380631263987",
  "audience": "CLIENT",
  "code": "069505",
  "sent_at": "2026-10-30T16:28:32.825555481Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb9e437e-c7af-4e86-93d5-1bc36181617c",
  "code": "069505",
  "device_ref": "sandbox-25745"
}
```

```json
{
  "session_id": "856ac5c9-c941-4a35-8ef3-724d435295d4",
  "subject": {
    "type": "CLIENT",
    "id": "612abe67-e3fd-4866-9d00-a2e2422c2997"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTJhYmU2Ny1lM2ZkLTQ4NjYtOWQwMC1hMmUyNDIyYzI5OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4NjEzLCJpYXQiOjE3OTMzNzc3MTMsImp0aSI6IjU0YjEwZWRkLTYzOWUtNDFlNi05MDNmLTI3NGY3MDlhOWU3NiIsInNpZCI6Ijg1NmFjNWM5LWM5NDEtNGEzNS04ZWYzLTcyNGQ0MzUyOTVkNCJ9.EdHMyBtKAwTUT3uUuHcRytoskDUEyElsag7GHRrWAn0",
  "access_expires_at": "2026-10-30T16:43:33.139490031Z",
  "refresh_token": "nnK_ZMM_g0aAduArkIee-beA5SLL8Tw5yQ9X2Mzvw14",
  "refresh_expires_at": "2026-11-29T16:28:33.13878342Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e46f12d2-0e78-4286-9ec6-336757074f64",
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
  "id": "dfef71ab-9186-41d0-913d-d48dc070f861",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:33:33.435051Z",
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
  "command_id": "fd6b2bda-e85d-4014-a43b-74da1c718748",
  "quote_id": "dfef71ab-9186-41d0-913d-d48dc070f861",
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
  "id": "23933be5-4d1e-48ef-bc54-82f0ba27d7c3",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "612abe67-e3fd-4866-9d00-a2e2422c2997",
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
  "created_at": "2026-10-30T16:28:33.73651Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "83329670-aeca-4aad-8311-d7a49ff83088",
    "order_id": "23933be5-4d1e-48ef-bc54-82f0ba27d7c3",
    "expires_at": "2026-10-30T16:28:48.741413Z",
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
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/83329670-aeca-4aad-8311-d7a49ff83088/accept` → **200**

```json
{
  "command_id": "ccc2c73d-1caa-4b54-af5a-484f797895ec"
}
```

```json
{
  "id": "a4f55a98-9118-4f8f-92bc-912db88e6616",
  "order_id": "23933be5-4d1e-48ef-bc54-82f0ba27d7c3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1101d2ed-f3b4-4760-b532-cc66b75f6e70",
  "trip_phase": "TO_PICKUP"
}
```

## While Ivan drives, staff require driver apps 9.0.0 or newer

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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
  "command_id": "b363d9cc-a703-4b80-8f0a-40c391825496",
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "reason": "Sandbox: force an update"
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T16:28:34.967287643Z"
}
```

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 1,
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
  ],
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "rider_ios": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "driver_android": {
      "minimum_version": "9.0.0",
      "latest_version": "9.0.0"
    },
```

## With the old app Ivan still finishes the trip

`GET /api/driver/v1/trips/current` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "id": "1101d2ed-f3b4-4760-b532-cc66b75f6e70",
  "order_id": "23933be5-4d1e-48ef-bc54-82f0ba27d7c3",
  "assignment_id": "a4f55a98-9118-4f8f-92bc-912db88e6616",
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
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/17db8a24-b370-4385-a2e4-dbb0d4dc06df/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:28:35Z",
    "sequence": 1793377715901
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17db8a24-b370-4385-a2e4-dbb0d4dc06df",
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
  "last_heartbeat_at": "2026-10-30T16:28:35.922314Z",
  "last_location_at": "2026-10-30T16:28:35.922314Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/1101d2ed-f3b4-4760-b532-cc66b75f6e70/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "2e3f3abd-63ef-4785-9e25-b6a9780451a6",
  "expected_version": 0
}
```

```json
{
  "id": "1101d2ed-f3b4-4760-b532-cc66b75f6e70",
  "order_id": "23933be5-4d1e-48ef-bc54-82f0ba27d7c3",
  "assignment_id": "a4f55a98-9118-4f8f-92bc-912db88e6616",
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
  "arrived_at": "2026-10-30T16:28:36.224184Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1101d2ed-f3b4-4760-b532-cc66b75f6e70/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b8ab92b1-c37b-44ab-9645-654568a82c7e",
  "expected_version": 1
}
```

```json
{
  "id": "1101d2ed-f3b4-4760-b532-cc66b75f6e70",
  "order_id": "23933be5-4d1e-48ef-bc54-82f0ba27d7c3",
  "assignment_id": "a4f55a98-9118-4f8f-92bc-912db88e6616",
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
  "arrived_at": "2026-10-30T16:28:36.224184Z",
  "started_at": "2026-10-30T16:28:36.525479Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1101d2ed-f3b4-4760-b532-cc66b75f6e70/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "75af42f4-9037-499a-bd7c-30a2a26dd2ec",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:28:36Z",
  "cash_received": true
}
```

```json
{
  "id": "1101d2ed-f3b4-4760-b532-cc66b75f6e70",
  "order_id": "23933be5-4d1e-48ef-bc54-82f0ba27d7c3",
  "assignment_id": "a4f55a98-9118-4f8f-92bc-912db88e6616",
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
  "arrived_at": "2026-10-30T16:28:36.224184Z",
  "started_at": "2026-10-30T16:28:36.525479Z",
  "completed_at": "2026-10-30T16:28:36.857052Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## He closes his shift, and cannot go online again with the old app

`GET /api/driver/v1/work-sessions/current` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "17db8a24-b370-4385-a2e4-dbb0d4dc06df",
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
  "last_heartbeat_at": "2026-10-30T16:28:35.922314Z",
  "last_location_at": "2026-10-30T16:28:35.922314Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/17db8a24-b370-4385-a2e4-dbb0d4dc06df/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "19919656-a06c-4eeb-92bc-0c49c5f9d753",
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

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **426**

```json
{
  "command_id": "37b8c086-108a-4749-b0be-790e4c7be73b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:28:37Z",
    "sequence": 1793377717778
  }
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions",
  "status": 426,
  "title": "Upgrade required",
  "type": "https://errors.blizz.taxi/upgrade-required",
  "code": "UPGRADE_REQUIRED",
  "correlation_id": "a595009c-cd56-44a5-8bc0-39983d54e316",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "f15ec75e-c887-410a-961a-62a6271731c4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:28:38Z",
    "sequence": 1793377718136
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "00e389b2-d527-4eb5-a044-863f04cb6354",
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
  "last_heartbeat_at": "2026-10-30T16:28:38.160876Z",
  "last_location_at": "2026-10-30T16:28:38.160876Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

Done: an outdated driver app finished its trip, then was asked to update before going online.

`GET /api/admin/v1/settings` → **200**

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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T16:28:34.967288Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "dfa70358-2b68-4047-9dda-ad5e92519a92",
  "expected_version": 1,
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "reason": "Sandbox: app version scenario over"
}
```

```json
{
  "version": 2,
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T16:28:38.770675473Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "00e389b2-d527-4eb5-a044-863f04cb6354",
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
  "last_heartbeat_at": "2026-10-30T16:28:38.160876Z",
  "last_location_at": "2026-10-30T16:28:38.160876Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00e389b2-d527-4eb5-a044-863f04cb6354/close` → **200**

```json
{
  "command_id": "91aec9cc-dbc6-4e8e-9a4d-aafea7b6d3b8",
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

# Scenario: bonuses

## The admin starts «Осінь −10 %» in Kyiv

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
  "session_id": "a2f16e54-5ea7-489a-9c70-6914fb8f2a6d",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg2MTksImlhdCI6MTc5MzM3NzcxOSwianRpIjoiMzZhZTQ3OTgtMWI2Mi00MTViLWJkZTItZGFlODM5NWNkMWMwIiwic2lkIjoiYTJmMTZlNTQtNWVhNy00ODlhLTljNzAtNjkxNGZiOGYyYTZkIn0.8H5zqLdXfnXUsbMXT3phd2sFMdMDlP-SNGV_dgWGsXc",
  "access_expires_at": "2026-10-30T16:43:39.96758331Z",
  "refresh_token": "PXqBOIAuFX8JlYPvtOShRc3vY7FPWdMXH7B2shdq0pk",
  "refresh_expires_at": "2026-10-31T04:28:39.966920814Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "d9c68351-8322-47e4-bd69-45428714a58f",
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
  "id": "8a968e69-fd59-4d9b-9a72-b1c29df7fbb9",
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
  "created_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "created_at": "2026-10-30T16:28:40.276082Z",
  "updated_at": "2026-10-30T16:28:40.276082Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639084679",
  "device_ref": "sandbox-21169"
}
```

```json
{
  "challenge_id": "2760d9fd-0d19-43e1-8d77-ad37e03192c8",
  "expires_at": "2026-10-30T16:33:40.577524254Z",
  "resend_available_at": "2026-10-30T16:28:41.577524254Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639084679` → **200**

```json
{
  "phone": "+380639084679",
  "audience": "CLIENT",
  "code": "707161",
  "sent_at": "2026-10-30T16:28:40.581934816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2760d9fd-0d19-43e1-8d77-ad37e03192c8",
  "code": "707161",
  "device_ref": "sandbox-21169"
}
```

```json
{
  "session_id": "2df9a721-4c94-45a5-9a66-fbd46aa4d3de",
  "subject": {
    "type": "CLIENT",
    "id": "731b5ad0-c187-493f-8df2-6ae2ae28dadd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzFiNWFkMC1jMTg3LTQ5M2YtOGRmMi02YWUyYWUyOGRhZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4NjIwLCJpYXQiOjE3OTMzNzc3MjAsImp0aSI6IjFmYzc2NDNiLWU2ZDctNDE5MC1hYzRhLWM1NmE0OTZhYjAwZiIsInNpZCI6IjJkZjlhNzIxLTRjOTQtNDVhNS05YTY2LWZiZDQ2YWE0ZDNkZSJ9.T3epeEJL6Tn6ack4baJ5hMyPDooo15lcmsOclbL95E8",
  "access_expires_at": "2026-10-30T16:43:40.934567604Z",
  "refresh_token": "mufb39X79JvBpAKgVpb6aQ-LzBkyfsfZiw6K9JYO5qE",
  "refresh_expires_at": "2026-11-29T16:28:40.933869658Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639084679` → **200**

```json
{
  "client_id": "731b5ad0-c187-493f-8df2-6ae2ae28dadd"
}
```

`POST /api/admin/v1/rider-wallets/731b5ad0-c187-493f-8df2-6ae2ae28dadd/top-ups` → **201**

```json
{
  "command_id": "2e2a3296-5b3a-4653-90b4-bee929e24060",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "731b5ad0-c187-493f-8df2-6ae2ae28dadd",
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
      "id": "eb2a05b8-358c-4bf8-abd2-9cd02d721f64",
      "at": "2026-10-30T16:28:41.512954Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6ce8c48a-b44a-481a-9487-4a055c00e1dd",
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
  "id": "395292a7-3a8e-4176-8418-2ff7524a2728",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:33:41.836126Z",
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
      "id": "8a968e69-fd59-4d9b-9a72-b1c29df7fbb9",
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
  "device_ref": "sandbox-3818"
}
```

```json
{
  "challenge_id": "1d593f55-405e-4829-8faa-2d87c055c7f6",
  "expires_at": "2026-10-30T16:33:42.145436487Z",
  "resend_available_at": "2026-10-30T16:28:43.145436487Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "983056",
  "sent_at": "2026-10-30T16:28:42.154711446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d593f55-405e-4829-8faa-2d87c055c7f6",
  "code": "983056",
  "device_ref": "sandbox-3818"
}
```

```json
{
  "session_id": "4d654435-e6f7-44ae-a720-846778b9fb2a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODYyMiwiaWF0IjoxNzkzMzc3NzIyLCJqdGkiOiI5MjRmN2NlMS1kZGE4LTQ2ODUtOGQ0Yy0wZGNjOTE2Nzk3N2UiLCJzaWQiOiI0ZDY1NDQzNS1lNmY3LTQ0YWUtYTcyMC04NDY3NzhiOWZiMmEifQ.O_4p_doEyQon9CuGgHrTSFzqGvz-LWqXrrQSCxONG6s",
  "access_expires_at": "2026-10-30T16:43:42.501540748Z",
  "refresh_token": "dgYSD9h9tNC78vvDx32cblADpyTSCsEy-nfBHM43QeQ",
  "refresh_expires_at": "2026-11-29T16:28:42.500901663Z",
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
  "command_id": "ed7b2816-98c5-4ceb-ad61-1905383f5172",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:28:43Z",
    "sequence": 1793377723837
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e0dcdf7-fa79-4ec6-9c54-5d5a56faa4f1",
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
  "last_heartbeat_at": "2026-10-30T16:28:43.104423Z",
  "last_location_at": "2026-10-30T16:28:43.104423Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "75072b66-b244-4965-9f08-d7d5201d4a0d",
  "quote_id": "395292a7-3a8e-4176-8418-2ff7524a2728",
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
  "id": "36cf7301-5039-4c25-9188-699c2652b348",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "731b5ad0-c187-493f-8df2-6ae2ae28dadd",
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
  "created_at": "2026-10-30T16:28:43.411498Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "pickup_eta": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "731b5ad0-c187-493f-8df2-6ae2ae28dadd",
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
      "id": "eb2a05b8-358c-4bf8-abd2-9cd02d721f64",
      "at": "2026-10-30T16:28:41.512954Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
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
    "id": "dfb3a323-3b0a-4431-96e1-dd4dc32f92bf",
    "order_id": "36cf7301-5039-4c25-9188-699c2652b348",
    "expires_at": "2026-10-30T16:28:58.41873Z",
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

`POST /api/driver/v1/offers/dfb3a323-3b0a-4431-96e1-dd4dc32f92bf/accept` → **200**

```json
{
  "command_id": "5077c92f-61a1-4d4f-8dd9-612483b87f67"
}
```

```json
{
  "id": "503f8928-982e-4eb5-b20a-7253f87e24b2",
  "order_id": "36cf7301-5039-4c25-9188-699c2652b348",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a81617cb-58ba-446e-add7-d3ab8518ad5a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a81617cb-58ba-446e-add7-d3ab8518ad5a",
  "order_id": "36cf7301-5039-4c25-9188-699c2652b348",
  "assignment_id": "503f8928-982e-4eb5-b20a-7253f87e24b2",
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

(the car drives 3 s to the next point)

`POST /api/driver/v1/work-sessions/8e0dcdf7-fa79-4ec6-9c54-5d5a56faa4f1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:28:47Z",
    "sequence": 1793377727949
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e0dcdf7-fa79-4ec6-9c54-5d5a56faa4f1",
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
  "last_heartbeat_at": "2026-10-30T16:28:47.969913Z",
  "last_location_at": "2026-10-30T16:28:47.969913Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a81617cb-58ba-446e-add7-d3ab8518ad5a/arrive` → **200**

```json
{
  "command_id": "8ab927f1-add9-4391-b286-80f144a3eeac",
  "expected_version": 0
}
```

```json
{
  "id": "a81617cb-58ba-446e-add7-d3ab8518ad5a",
  "order_id": "36cf7301-5039-4c25-9188-699c2652b348",
  "assignment_id": "503f8928-982e-4eb5-b20a-7253f87e24b2",
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
  "arrived_at": "2026-10-30T16:28:48.2708Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a81617cb-58ba-446e-add7-d3ab8518ad5a/start` → **200**

```json
{
  "command_id": "a2b74cca-c9a1-4e67-8c97-42cad96575b5",
  "expected_version": 1
}
```

```json
{
  "id": "a81617cb-58ba-446e-add7-d3ab8518ad5a",
  "order_id": "36cf7301-5039-4c25-9188-699c2652b348",
  "assignment_id": "503f8928-982e-4eb5-b20a-7253f87e24b2",
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
  "arrived_at": "2026-10-30T16:28:48.2708Z",
  "started_at": "2026-10-30T16:28:48.56814Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/a81617cb-58ba-446e-add7-d3ab8518ad5a/complete` → **200**

```json
{
  "command_id": "754ddaaa-a611-44ee-9131-227367b73144",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:28:48Z",
  "cash_received": true
}
```

```json
{
  "id": "a81617cb-58ba-446e-add7-d3ab8518ad5a",
  "order_id": "36cf7301-5039-4c25-9188-699c2652b348",
  "assignment_id": "503f8928-982e-4eb5-b20a-7253f87e24b2",
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
  "arrived_at": "2026-10-30T16:28:48.2708Z",
  "started_at": "2026-10-30T16:28:48.56814Z",
  "completed_at": "2026-10-30T16:28:48.883026Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "731b5ad0-c187-493f-8df2-6ae2ae28dadd",
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
      "id": "492b5064-8316-4218-b99e-19e0de05d925",
      "at": "2026-10-30T16:28:48.959121Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "36cf7301-5039-4c25-9188-699c2652b348"
    },
    {
      "id": "eb2a05b8-358c-4bf8-abd2-9cd02d721f64",
      "at": "2026-10-30T16:28:41.512954Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/8a968e69-fd59-4d9b-9a72-b1c29df7fbb9/archive` → **200**

```json
{
  "command_id": "88913dd1-c382-4629-b3f9-dca96e9f1c9d",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "8a968e69-fd59-4d9b-9a72-b1c29df7fbb9",
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
  "created_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "created_at": "2026-10-30T16:28:40.276082Z",
  "updated_at": "2026-10-30T16:28:52.517773Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e0dcdf7-fa79-4ec6-9c54-5d5a56faa4f1",
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
  "last_heartbeat_at": "2026-10-30T16:28:47.969913Z",
  "last_location_at": "2026-10-30T16:28:47.969913Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e0dcdf7-fa79-4ec6-9c54-5d5a56faa4f1/close` → **200**

```json
{
  "command_id": "c32d3cef-de51-431e-bf71-1d009ef0be08",
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

Done: order 36cf7301-5039-4c25-9188-699c2652b348.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-25997"
}
```

```json
{
  "challenge_id": "fdda584b-db7c-49df-bef4-80fb4f01b8cb",
  "expires_at": "2026-10-30T16:33:53.400587041Z",
  "resend_available_at": "2026-10-30T16:28:54.400587041Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "918301",
  "sent_at": "2026-10-30T16:28:53.404343915Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fdda584b-db7c-49df-bef4-80fb4f01b8cb",
  "code": "918301",
  "device_ref": "sandbox-25997"
}
```

```json
{
  "session_id": "6604c1b1-e537-4ee7-ad20-3d1ade3c3e65",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODYzMywiaWF0IjoxNzkzMzc3NzMzLCJqdGkiOiJhNmQ5NzMwMC0yNjFkLTQ3YWQtYTBiMS04YTYwMzQ0OTdjNzEiLCJzaWQiOiI2NjA0YzFiMS1lNTM3LTRlZTctYWQyMC0zZDFhZGUzYzNlNjUifQ.OTPhhMeXVfNxPIu-2qM0rn5XLEwNdQVoCtKzbtD2o6s",
  "access_expires_at": "2026-10-30T16:43:53.724013846Z",
  "refresh_token": "VHc7-aiGd1c7hWPahk6mPS7PejGSdLvm9DZ169Rf9UU",
  "refresh_expires_at": "2026-11-29T16:28:53.723371168Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
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
  "driver_id": "5a000000-0000-4000-8000-000000000405",
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
  "command_id": "c12d22bb-c7ee-404b-b400-aabcbe11f2cf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:28:54Z",
    "sequence": 1793377734592
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "6afe27bb-6f68-44e3-96a7-636f7399c998",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T16:28:54.612197Z",
  "last_location_at": "2026-10-30T16:28:54.612197Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/6afe27bb-6f68-44e3-96a7-636f7399c998/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:28:59Z",
    "sequence": 1793377739901
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "6afe27bb-6f68-44e3-96a7-636f7399c998",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T16:28:59.921647Z",
  "last_location_at": "2026-10-30T16:28:54.612197Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_STALE"
  ],
  "accepted": false
}
```

## The operator's map still shows her in Warsaw

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
  "session_id": "b9a8cd59-3b2c-4164-9cc2-60292929d831",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg2NDAsImlhdCI6MTc5MzM3Nzc0MCwianRpIjoiNzE3OGQyMDctNTBmNC00YjZjLWJkM2MtNzAyODljYTEwZWQ1Iiwic2lkIjoiYjlhOGNkNTktM2IyYy00MTY0LTljYzItNjAyOTI5MjlkODMxIn0.z_FQb7z_UvJ3Fh1lMh7nYqdML3ZpABtpTc5QKzgscJU",
  "access_expires_at": "2026-10-30T16:44:00.520432846Z",
  "refresh_token": "s3Q39KitBMf0lnKWmeal7fabl3Y3HvzFCPKPHlctMsU",
  "refresh_expires_at": "2026-10-31T04:29:00.519806528Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T16:29:00.796707752Z",
  "drivers": [
    {
      "driver_id": "5a000000-0000-4000-8000-000000000405",
      "name": "Anna Wiśniewska",
      "car": {
        "registration_number": "WA0002T",
        "make": "Kia",
        "model": "Ceed",
        "color": "blue",
        "classes": [
          "STANDARD"
        ]
      },
      "has_payment_terminal": false,
      "status": "NO_SIGNAL",
      "occupancy": "FREE",
      "connection": "CONNECTED",
      "geolocation": "STALE",
      "location": {
        "lat": 52.2297,
        "lon": 21.0122
      },
      "last_location_at": "2026-10-30T16:28:54.612197Z",
      "last_heartbeat_at": "2026-10-30T16:28:59.921647Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/6afe27bb-6f68-44e3-96a7-636f7399c998/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:29:01Z",
    "sequence": 1793377741901
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "6afe27bb-6f68-44e3-96a7-636f7399c998",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T16:29:01.110419Z",
  "last_location_at": "2026-10-30T16:29:01.110419Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

Done: the jump to Lviv was refused, the map kept Warsaw, the next plausible fix was accepted.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "6afe27bb-6f68-44e3-96a7-636f7399c998",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T16:29:01.110419Z",
  "last_location_at": "2026-10-30T16:29:01.110419Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6afe27bb-6f68-44e3-96a7-636f7399c998/close` → **200**

```json
{
  "command_id": "83a16049-aa90-4d6b-873e-03972ad33742",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
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

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-28503"
}
```

```json
{
  "challenge_id": "b35543c0-2d53-411a-89d0-0b03f1d5ed27",
  "expires_at": "2026-10-30T16:34:01.974680879Z",
  "resend_available_at": "2026-10-30T16:29:02.974680879Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "000909",
  "sent_at": "2026-10-30T16:29:01.978571708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b35543c0-2d53-411a-89d0-0b03f1d5ed27",
  "code": "000909",
  "device_ref": "sandbox-28503"
}
```

```json
{
  "session_id": "8fcab16f-f2a0-450f-9504-1688fa414707",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODY0MiwiaWF0IjoxNzkzMzc3NzQyLCJqdGkiOiIyYjk5ZDE3OS05ZTQzLTRjODctYjA1OS1jNTQwNzgwODQ5YzgiLCJzaWQiOiI4ZmNhYjE2Zi1mMmEwLTQ1MGYtOTUwNC0xNjg4ZmE0MTQ3MDcifQ.ko_b9GMlY6_S4DE1d77zsdYjMIL8K1YP4PUW5friCjw",
  "access_expires_at": "2026-10-30T16:44:02.286915452Z",
  "refresh_token": "7JiyWCTkFu9w9YGKobLT4xMYSruuqlnsFkcuYuOke5M",
  "refresh_expires_at": "2026-11-29T16:29:02.286284546Z",
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

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-18217"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "b5a120f1-8217-4006-9166-1f43e0b0bb85",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-18217"
}
```

```json
{
  "challenge_id": "f9d56aa2-5a99-4f74-b409-9aea2be4bf4c",
  "expires_at": "2026-10-30T16:34:04.141025774Z",
  "resend_available_at": "2026-10-30T16:29:05.141025774Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "826695",
  "sent_at": "2026-10-30T16:29:04.144269985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9d56aa2-5a99-4f74-b409-9aea2be4bf4c",
  "code": "826695",
  "device_ref": "sandbox-18217"
}
```

```json
{
  "session_id": "7cd09425-00aa-4df2-928c-13cf5f6f332d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODY0NCwiaWF0IjoxNzkzMzc3NzQ0LCJqdGkiOiIyYzE5ZTg1OS04Y2U0LTRmZGItOTg0Zi02NzA1Nzk3ZTI5NGUiLCJzaWQiOiI3Y2QwOTQyNS0wMGFhLTRkZjItOTI4Yy0xM2NmNWY2ZjMzMmQifQ.3worre2RzVd0qBMOeLFNH3VH3eyEou-K3_4D4VAGTdo",
  "access_expires_at": "2026-10-30T16:44:04.451556074Z",
  "refresh_token": "FsHtE4Vze36zvz1529kFMpoma4OfsxCgKgeX5wyoIsM",
  "refresh_expires_at": "2026-11-29T16:29:04.45095816Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-14578"
}
```

```json
{
  "challenge_id": "10d2e24e-0a43-48ce-81ab-aeb11ca4b166",
  "expires_at": "2026-10-30T16:34:04.725733977Z",
  "resend_available_at": "2026-10-30T16:29:05.725733977Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "253960",
  "sent_at": "2026-10-30T16:29:04.728697771Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10d2e24e-0a43-48ce-81ab-aeb11ca4b166",
  "code": "253960",
  "device_ref": "sandbox-14578"
}
```

```json
{
  "session_id": "05ce71e4-fda4-445c-9ccc-fa7414e94635",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODY0NSwiaWF0IjoxNzkzMzc3NzQ1LCJqdGkiOiJlY2JlNDBiYS00NGY3LTQwNzQtYmEwYy1hNjhhNTE4NTU5M2UiLCJzaWQiOiIwNWNlNzFlNC1mZGE0LTQ0NWMtOWNjYy1mYTc0MTRlOTQ2MzUifQ.nfthHWAZlUrtZG9ykvW_J5ov4kcg8BpbsKkm1wgqHP8",
  "access_expires_at": "2026-10-30T16:44:05.040693992Z",
  "refresh_token": "dLR7FOqug5m0pYB3xawe6Gv5vUby7tSiIArPMCCjHgo",
  "refresh_expires_at": "2026-11-29T16:29:05.040047994Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
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
  "driver_id": "5a000000-0000-4000-8000-000000000405",
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

(the car drives 183 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "71a94b7b-fff2-49db-87af-436e76a8a92c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:32:08Z",
    "sequence": 1793377928937
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aaf267b5-bf0c-4d8b-a27a-3389acadca5e",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T16:32:08.95764Z",
  "last_location_at": "2026-10-30T16:32:08.95764Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600072229",
  "device_ref": "sandbox-15924"
}
```

```json
{
  "challenge_id": "1147b8c7-f191-4795-9693-c6a132951b26",
  "expires_at": "2026-10-30T16:37:09.256124147Z",
  "resend_available_at": "2026-10-30T16:32:10.256124147Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600072229` → **200**

```json
{
  "phone": "+48600072229",
  "audience": "CLIENT",
  "code": "702008",
  "sent_at": "2026-10-30T16:32:09.259123921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1147b8c7-f191-4795-9693-c6a132951b26",
  "code": "702008",
  "device_ref": "sandbox-15924"
}
```

```json
{
  "session_id": "1b9d1fe5-7463-4daa-b361-b5e4f80b43a5",
  "subject": {
    "type": "CLIENT",
    "id": "08522a16-6242-439a-bb3a-395eefe52491"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODUyMmExNi02MjQyLTQzOWEtYmIzYS0zOTVlZWZlNTI0OTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4ODI5LCJpYXQiOjE3OTMzNzc5MjksImp0aSI6ImNkMDk4NzRmLTFjZTMtNDg0MC05MGRkLWViN2MxNmZkYjJhYSIsInNpZCI6IjFiOWQxZmU1LTc0NjMtNGRhYS1iMzYxLWI1ZTRmODBiNDNhNSJ9.ECCSwdtfEC_JAdAClRXkgnvcJYAzku4KsmzOIj9CNbE",
  "access_expires_at": "2026-10-30T16:47:09.56946694Z",
  "refresh_token": "kmyvgcM_u4yFaaRUmItCtzPQLnncWTqGPC9IBhgA0-E",
  "refresh_expires_at": "2026-11-29T16:32:09.568816597Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0a8e147a-d965-4686-a97b-f0724a08aee0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  }
}
```

```json
{
  "id": "0516a6eb-e32e-4bcb-a464-4bca9f1eaeaf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:37:09.860490Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 4942,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "88a6eae4-01a5-4fcd-b8e7-796abcc9fba2",
  "quote_id": "0516a6eb-e32e-4bcb-a464-4bca9f1eaeaf",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH"
}
```

```json
{
  "id": "d70e67a8-49ee-4c8b-a37e-f0ec5d530922",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "08522a16-6242-439a-bb3a-395eefe52491",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T16:32:10.193018Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d70e67a8-49ee-4c8b-a37e-f0ec5d530922` → **200**

```json
{
  "id": "d70e67a8-49ee-4c8b-a37e-f0ec5d530922",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "08522a16-6242-439a-bb3a-395eefe52491",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T16:32:10.193018Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Anna, 10 km away, does not see it, and her claim is refused: the order stays in the ALL tab

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[]
```

`POST /api/driver/v1/orders/d70e67a8-49ee-4c8b-a37e-f0ec5d530922/claim` → **422**

```json
{
  "command_id": "19c50d0d-0c29-429e-9034-7e12700cdf48"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d70e67a8-49ee-4c8b-a37e-f0ec5d530922/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "78487b2c-0fbd-47da-8fb3-c44406d68d65"
}
```

`GET /api/rider/v1/orders/d70e67a8-49ee-4c8b-a37e-f0ec5d530922` → **200**

```json
{
  "id": "d70e67a8-49ee-4c8b-a37e-f0ec5d530922",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "08522a16-6242-439a-bb3a-395eefe52491",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T16:32:10.193018Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A script on Anna's phone keeps claiming: from the 31st claim in 10 minutes, 429

`POST /api/driver/v1/orders/d2357270-69ca-4b71-b842-b141d5731ef4/claim` → **404**

```json
{
  "command_id": "cc2caf82-6098-4619-a336-9ffee153beb0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d2357270-69ca-4b71-b842-b141d5731ef4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8fed5abb-ea2a-4136-9c65-5a949b12653f"
}
```

`POST /api/driver/v1/orders/b6538d4f-0f98-4ddb-a03f-e8fbf4fcabe2/claim` → **404**

```json
{
  "command_id": "c3217e46-c005-44dd-b00a-b4dc17495dd0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b6538d4f-0f98-4ddb-a03f-e8fbf4fcabe2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "84ef5ff5-139a-4223-81ce-393210097be1"
}
```

`POST /api/driver/v1/orders/494c95c6-8919-4b5d-bbdf-f1fbf033af0a/claim` → **404**

```json
{
  "command_id": "e51d2a34-e133-4b71-9aff-78c609e4f649"
}
```

```json
{
  "instance": "/api/driver/v1/orders/494c95c6-8919-4b5d-bbdf-f1fbf033af0a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "782f7007-8c3a-49ad-9437-bc30990b93ae"
}
```

`POST /api/driver/v1/orders/92eeea78-9940-41fc-9926-64f71616ab36/claim` → **404**

```json
{
  "command_id": "13c66ba0-4fdd-4a60-93e9-1a7b37d4334c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/92eeea78-9940-41fc-9926-64f71616ab36/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b7e91b7e-392b-45ea-90e0-338a1fce869a"
}
```

`POST /api/driver/v1/orders/86455717-a10e-43e6-9c1f-68988202bb27/claim` → **404**

```json
{
  "command_id": "c290aaac-3a18-430d-9649-ff5976f8b8ae"
}
```

```json
{
  "instance": "/api/driver/v1/orders/86455717-a10e-43e6-9c1f-68988202bb27/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4d01c5ec-f858-4d34-90fe-7213ba10c745"
}
```

`POST /api/driver/v1/orders/b093cb80-b4f4-4a06-9af0-7312914f16f0/claim` → **404**

```json
{
  "command_id": "6ca1787a-4747-4237-8ab1-7aee969aa20f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b093cb80-b4f4-4a06-9af0-7312914f16f0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "efd65ca4-11bb-4e7d-beea-4ca92adb1368"
}
```

`POST /api/driver/v1/orders/1ccbc6d7-4ba7-4e4b-9597-ff7ca828d8e6/claim` → **404**

```json
{
  "command_id": "7f877c30-5862-4cf6-b067-1345d5c7d756"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1ccbc6d7-4ba7-4e4b-9597-ff7ca828d8e6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fef17283-1e02-4d53-bd6a-28853957f458"
}
```

`POST /api/driver/v1/orders/7a72dbab-8595-4bc1-ace7-995192f91d57/claim` → **404**

```json
{
  "command_id": "a03ca3af-120f-4c36-9b39-055011f9b939"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7a72dbab-8595-4bc1-ace7-995192f91d57/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e680cdc8-1381-4790-8f32-f05aafad0fbb"
}
```

`POST /api/driver/v1/orders/7d384e6e-c016-4874-8e63-6cdffc3fb604/claim` → **404**

```json
{
  "command_id": "80d72e3b-0015-4e07-9d0b-6ac488030b57"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7d384e6e-c016-4874-8e63-6cdffc3fb604/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "505c63cd-8576-460d-8323-56b1022e3421"
}
```

`POST /api/driver/v1/orders/a08bf3ec-7a45-4f68-8943-6ea43a6cfb2f/claim` → **404**

```json
{
  "command_id": "ab5196f7-19e9-4b28-a528-2031ae026fbe"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a08bf3ec-7a45-4f68-8943-6ea43a6cfb2f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "dd820e54-1abf-4f21-950c-9bf1aeb3df12"
}
```

`POST /api/driver/v1/orders/8e3d8eb4-f3e1-4f3f-90f3-f15db9f32250/claim` → **404**

```json
{
  "command_id": "a41ec970-0be7-4e97-b7b6-93924189da0a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8e3d8eb4-f3e1-4f3f-90f3-f15db9f32250/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "03d3fbd7-44d8-4511-b91e-6b8fc5149cb1"
}
```

`POST /api/driver/v1/orders/845175e9-2b79-4ca8-add9-7251e94d168d/claim` → **404**

```json
{
  "command_id": "3e11f977-02a3-403a-934e-c41bacbeb781"
}
```

```json
{
  "instance": "/api/driver/v1/orders/845175e9-2b79-4ca8-add9-7251e94d168d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "377770e7-48cc-4585-afe1-619219813522"
}
```

`POST /api/driver/v1/orders/8f3bc20a-96fa-4783-abc3-31ad74a26bfd/claim` → **404**

```json
{
  "command_id": "200f7440-d9e1-4aac-ba82-9c94ebdcd7d0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8f3bc20a-96fa-4783-abc3-31ad74a26bfd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b75f1273-34a1-43bd-8b33-011bd8597fcd"
}
```

`POST /api/driver/v1/orders/08504f81-d1ef-4fe6-b609-e1f17f76e5cb/claim` → **404**

```json
{
  "command_id": "504af2ab-4ada-46e1-893c-a54f921d6019"
}
```

```json
{
  "instance": "/api/driver/v1/orders/08504f81-d1ef-4fe6-b609-e1f17f76e5cb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f6899fee-4ec5-49b5-b09e-2c7066b0b9f8"
}
```

`POST /api/driver/v1/orders/6ad153e7-6d36-423a-ad90-493710ef5914/claim` → **404**

```json
{
  "command_id": "8a717235-82f6-4bfe-9ab9-78163bc7d59f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6ad153e7-6d36-423a-ad90-493710ef5914/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7d125734-fe7f-4fa3-a628-4fe408b255e4"
}
```

`POST /api/driver/v1/orders/629184f9-e4ce-4c19-a48a-2bdf04b8ff91/claim` → **404**

```json
{
  "command_id": "75cfee59-44b7-4d8a-a067-b78743ea9115"
}
```

```json
{
  "instance": "/api/driver/v1/orders/629184f9-e4ce-4c19-a48a-2bdf04b8ff91/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9bd94fec-3acb-48c4-b94e-4c1ff1d080c5"
}
```

`POST /api/driver/v1/orders/9b2eac70-de2d-457d-ac56-880bc7fd5f2e/claim` → **404**

```json
{
  "command_id": "8b54e5ea-3c1b-4ec4-af3e-8ab5abdd6055"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9b2eac70-de2d-457d-ac56-880bc7fd5f2e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "84927f8b-fcd4-4d8e-8ba6-e23f5efe6874"
}
```

`POST /api/driver/v1/orders/6b0ba37b-547f-4a24-840f-a4c912360945/claim` → **404**

```json
{
  "command_id": "694f3bfc-060e-4ca8-a9ab-1ec6fd38ad6b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6b0ba37b-547f-4a24-840f-a4c912360945/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a393afaf-6df9-423d-a5b3-4cdafbd33a32"
}
```

`POST /api/driver/v1/orders/ff437394-979b-44d5-a5bb-10328abca60c/claim` → **404**

```json
{
  "command_id": "24e0159d-f97f-4035-bf98-9906b4bca9d4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ff437394-979b-44d5-a5bb-10328abca60c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d28ac3aa-1e5e-4fca-9a21-6eef57c2cf8c"
}
```

`POST /api/driver/v1/orders/e4d404a1-c863-4bde-b219-fb6d28bf2eaa/claim` → **404**

```json
{
  "command_id": "1273b161-031d-4583-bba1-b1d42635cdc5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e4d404a1-c863-4bde-b219-fb6d28bf2eaa/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "04fe9012-d4c0-435c-95c8-24c6ae46a04e"
}
```

`POST /api/driver/v1/orders/9c97f5ff-f0d8-4be1-8979-e79c8c70aa11/claim` → **404**

```json
{
  "command_id": "a1a81e33-c190-468a-b4bc-05ad3b9ac932"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9c97f5ff-f0d8-4be1-8979-e79c8c70aa11/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0706683e-80c5-4c62-a65d-e4beb2b1553e"
}
```

`POST /api/driver/v1/orders/ce74eb53-d138-469e-9284-61278ea5f3ba/claim` → **404**

```json
{
  "command_id": "8d78d303-8656-4d02-8d36-b60fd49aaf2e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ce74eb53-d138-469e-9284-61278ea5f3ba/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "54e1931c-2f6b-4ff8-bac2-66a5a9f7ad62"
}
```

`POST /api/driver/v1/orders/a5982d04-d0d3-4633-8f4b-44af0ba23b19/claim` → **404**

```json
{
  "command_id": "f581211a-cdbe-4375-9c66-2ea4398d4630"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a5982d04-d0d3-4633-8f4b-44af0ba23b19/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "34358c02-dda0-45f3-ae64-6b9203185d13"
}
```

`POST /api/driver/v1/orders/468424cc-f617-43bf-a078-1a1e8b3d377a/claim` → **404**

```json
{
  "command_id": "1638abc1-cd75-4c89-9bb9-e4dc6ecbfc82"
}
```

```json
{
  "instance": "/api/driver/v1/orders/468424cc-f617-43bf-a078-1a1e8b3d377a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fd5d8ba2-60ab-4684-b373-b3bbe88e3176"
}
```

`POST /api/driver/v1/orders/e8ef5fc1-46ef-4c02-8b23-c01856354ceb/claim` → **404**

```json
{
  "command_id": "ff568b9d-e003-4841-8f48-98918de33c8f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e8ef5fc1-46ef-4c02-8b23-c01856354ceb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "33b35648-2f64-470c-b0bd-cdd73a81a613"
}
```

`POST /api/driver/v1/orders/499982ad-07ea-4b2b-a3aa-e10bff8335bb/claim` → **404**

```json
{
  "command_id": "3c967f8a-3e50-44d5-9d76-162f6119a555"
}
```

```json
{
  "instance": "/api/driver/v1/orders/499982ad-07ea-4b2b-a3aa-e10bff8335bb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d2df82c4-c11b-4d98-b26c-54a3c375027a"
}
```

`POST /api/driver/v1/orders/7473220d-faf8-4684-b116-d0094fcbb7ae/claim` → **404**

```json
{
  "command_id": "ba4692d8-3eb0-403e-8a9f-5ef3d706d624"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7473220d-faf8-4684-b116-d0094fcbb7ae/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3031c413-9084-4a9f-80b5-67ce96468961"
}
```

`POST /api/driver/v1/orders/a36e8335-4f67-4c49-b5cb-2403fbc00dee/claim` → **404**

```json
{
  "command_id": "2ccfbe86-8241-40aa-950e-be3889211405"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a36e8335-4f67-4c49-b5cb-2403fbc00dee/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9fc1eef5-a849-48d1-ad15-7dd3864b6707"
}
```

`POST /api/driver/v1/orders/f42294a3-a94a-4fe0-911f-be8cd443707e/claim` → **404**

```json
{
  "command_id": "97777647-a79b-4147-8efc-0164897439e2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f42294a3-a94a-4fe0-911f-be8cd443707e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6c3ec2f9-9f1f-49e6-9971-c8b4018ec920"
}
```

`POST /api/driver/v1/orders/96e30743-8b73-4316-a09e-7b7047aef40b/claim` → **429**

```json
{
  "command_id": "ec7f17ab-3bc7-42c3-9e47-daf21a92464c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/96e30743-8b73-4316-a09e-7b7047aef40b/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "61a34f14-89f3-461d-916f-2b28f674b8db",
  "retryable": true,
  "retry_after_seconds": 591
}
```

## Piotr goes online next to the pickup on his phone; his other phone cannot claim, the phone with the shift can

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
  "command_id": "1a1d181b-801c-4e99-9622-1548a5b9670c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:32:21Z",
    "sequence": 1793377941666
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "44841c29-4d90-449f-b1d5-458adee6242e",
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
  "last_heartbeat_at": "2026-10-30T16:32:21.086297Z",
  "last_location_at": "2026-10-30T16:32:21.086297Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "d70e67a8-49ee-4c8b-a37e-f0ec5d530922",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 52.2297,
      "lon": 21.0122
    },
    "pickup_label": "PKiN",
    "dropoff_label": "Lotnisko",
    "payment_method": "CASH",
    "price_minor": 4942,
    "currency": "PLN",
    "distance_m": 590
  }
]
```

`POST /api/driver/v1/orders/d70e67a8-49ee-4c8b-a37e-f0ec5d530922/claim` → **409**

```json
{
  "command_id": "23986731-1aa9-49b9-8702-5f019ffd147e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d70e67a8-49ee-4c8b-a37e-f0ec5d530922/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "884a76a2-0b11-4e8e-87d1-c36ad87a767b"
}
```

`POST /api/driver/v1/orders/d70e67a8-49ee-4c8b-a37e-f0ec5d530922/claim` → **200**

```json
{
  "command_id": "1fcd747a-03f3-4532-88a4-4c1b3578cd1f"
}
```

```json
{
  "id": "8cf6d59c-0091-4b26-a349-6a9305546150",
  "order_id": "d70e67a8-49ee-4c8b-a37e-f0ec5d530922",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "3b1b4219-f8f7-48e3-bdd2-1d491dec5c76",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3b1b4219-f8f7-48e3-bdd2-1d491dec5c76",
  "order_id": "d70e67a8-49ee-4c8b-a37e-f0ec5d530922",
  "assignment_id": "8cf6d59c-0091-4b26-a349-6a9305546150",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "price_minor": 4942,
  "currency": "PLN",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3b1b4219-f8f7-48e3-bdd2-1d491dec5c76/cancel` → **200**

```json
{
  "command_id": "b2082a89-109e-4e33-9988-aeb45c8cc749",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "3b1b4219-f8f7-48e3-bdd2-1d491dec5c76",
  "order_id": "d70e67a8-49ee-4c8b-a37e-f0ec5d530922",
  "assignment_id": "8cf6d59c-0091-4b26-a349-6a9305546150",
  "phase": "ABORTED",
  "version": 1,
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "price_minor": 4942,
  "currency": "PLN",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

Done: far claim 422, the 31st claim 429, the phone without the shift 409, the phone with it took the order.

`GET /api/rider/v1/orders/d70e67a8-49ee-4c8b-a37e-f0ec5d530922` → **200**

```json
{
  "id": "d70e67a8-49ee-4c8b-a37e-f0ec5d530922",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "08522a16-6242-439a-bb3a-395eefe52491",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "8cf6d59c-0091-4b26-a349-6a9305546150",
    "order_id": "d70e67a8-49ee-4c8b-a37e-f0ec5d530922",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "3b1b4219-f8f7-48e3-bdd2-1d491dec5c76",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:32:10.193018Z",
  "cancellation": {
    "by": "DRIVER",
    "reason_code": "PASSENGER_ASKED",
    "reason_labels": {
      "ru": "Пассажир попросил отменить",
      "pl": "Pasażer poprosił o anulowanie",
      "uk": "Пасажир попросив скасувати",
      "en": "Passenger asked to cancel"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aaf267b5-bf0c-4d8b-a27a-3389acadca5e",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T16:32:08.95764Z",
  "last_location_at": "2026-10-30T16:32:08.95764Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aaf267b5-bf0c-4d8b-a27a-3389acadca5e/close` → **200**

```json
{
  "command_id": "162136a6-f1c7-45a6-89c6-5c11fe5f0911",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
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
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "44841c29-4d90-449f-b1d5-458adee6242e",
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
  "last_heartbeat_at": "2026-10-30T16:32:21.086297Z",
  "last_location_at": "2026-10-30T16:32:21.086297Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/44841c29-4d90-449f-b1d5-458adee6242e/close` → **200**

```json
{
  "command_id": "e517f9af-1e16-48e0-8c29-c420f79034e0",
  "expected_version": 0
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
  "session_id": "3f3955f9-5e7e-483e-8baf-3f7529d812c3",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg4NDQsImlhdCI6MTc5MzM3Nzk0NCwianRpIjoiYWZlNjBiZTgtMTRkNy00NGQ2LWJiZmItYmZlMjdhZjE5N2E2Iiwic2lkIjoiM2YzOTU1ZjktNWU3ZS00ODNlLThiYWYtM2Y3NTI5ZDgxMmMzIn0.Gw1Shvc2481irdaxXRobEMUj8kw470q68yrUCYql570",
  "access_expires_at": "2026-10-30T16:47:24.593028642Z",
  "refresh_token": "d3K9bUt6YREwdHLrozDGWQsmCRTf3FjBV51MviH_FFc",
  "refresh_expires_at": "2026-10-31T04:32:24.592349446Z",
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
  "command_id": "ffbe0b80-f147-4eba-a83f-810b669185d4",
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
  "session_id": "9fc9df83-ccd9-4dc8-b0a6-df336cbe5169",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg4NDUsImlhdCI6MTc5MzM3Nzk0NSwianRpIjoiMTMyOWRkOWMtM2IxNS00MTgxLTgxYTItZGNkM2FiZjVmYTAzIiwic2lkIjoiOWZjOWRmODMtY2NkOS00ZGM4LWIwYTYtZGYzMzZjYmU1MTY5In0.Lp3DsWx2cd5RPoandq6j2IpO9aU7tiuu6rxbAcltiGU",
  "access_expires_at": "2026-10-30T16:47:25.76380329Z",
  "refresh_token": "z6bmenpMzjYeXGN2TpGncHjC2uNmvaW_MnVfcNidndg",
  "refresh_expires_at": "2026-10-31T04:32:25.76320685Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2485314881",
    "linkedid": "1730052700.2485314881",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678688114"
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
    "id": "1730052700.2485314881",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "e4099f8e-fbcc-4415-9d23-59814af17947",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380678688114",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T16:32:26.045985Z",
      "answered_at": null,
      "ended_at": "2026-10-30T16:32:26.070971Z",
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
    "id": "1730052600.1563218339",
    "linkedid": "1730052600.1563218339",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678688114"
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
      "id": "fc07eb46-36ae-4b34-9224-0805127bfc0a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678688114",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T16:32:26.397143Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/fc07eb46-36ae-4b34-9224-0805127bfc0a/answer` → **200**

```json
{
  "command_id": "01481214-175f-4775-892a-ebf0123a29ce"
}
```

```json
{
  "id": "fc07eb46-36ae-4b34-9224-0805127bfc0a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678688114",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "order_ids": [],
  "started_at": "2026-10-30T16:32:26.397143Z",
  "answered_at": "2026-10-30T16:32:26.716471Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1563218339",
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
    "id": "1730052600.1563218339",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "fc07eb46-36ae-4b34-9224-0805127bfc0a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678688114",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [],
      "started_at": "2026-10-30T16:32:26.397143Z",
      "answered_at": "2026-10-30T16:32:26.716471Z",
      "ended_at": "2026-10-30T16:32:27.024329Z",
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
      "id": "fc07eb46-36ae-4b34-9224-0805127bfc0a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678688114",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [],
      "started_at": "2026-10-30T16:32:26.397143Z",
      "answered_at": "2026-10-30T16:32:26.716471Z",
      "ended_at": "2026-10-30T16:32:27.024329Z",
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
      "id": "fc07eb46-36ae-4b34-9224-0805127bfc0a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678688114",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [],
      "started_at": "2026-10-30T16:32:26.397143Z",
      "answered_at": "2026-10-30T16:32:26.716471Z",
      "ended_at": "2026-10-30T16:32:27.024329Z",
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
      "id": "fc07eb46-36ae-4b34-9224-0805127bfc0a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678688114",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [],
      "started_at": "2026-10-30T16:32:26.397143Z",
      "answered_at": "2026-10-30T16:32:26.716471Z",
      "ended_at": "2026-10-30T16:32:27.024329Z",
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
      "id": "fc07eb46-36ae-4b34-9224-0805127bfc0a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678688114",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [],
      "started_at": "2026-10-30T16:32:26.397143Z",
      "answered_at": "2026-10-30T16:32:26.716471Z",
      "ended_at": "2026-10-30T16:32:27.024329Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T16:32:35.607881Z"
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
      "id": "fc07eb46-36ae-4b34-9224-0805127bfc0a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678688114",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [],
      "started_at": "2026-10-30T16:32:26.397143Z",
      "answered_at": "2026-10-30T16:32:26.716471Z",
      "ended_at": "2026-10-30T16:32:27.024329Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T16:32:35.607881Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/fc07eb46-36ae-4b34-9224-0805127bfc0a/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/fc07eb46-36ae-4b34-9224-0805127bfc0a/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=fc07eb46-36ae-4b34-9224-0805127bfc0a` → **200**

```json
{
  "changes": [
    {
      "id": "185eaae0-3f0f-4e6b-9bde-212254b71b1d",
      "occurred_at": "2026-10-30T16:32:36.83648Z",
      "actor_type": "STAFF",
      "actor_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fc07eb46-36ae-4b34-9224-0805127bfc0a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0f1ce56e-93f4-49fe-afb1-b0b29b603656\", \"order_ids\": []}",
      "correlation_id": "694b6383-4c33-4093-b267-dbf1a71f8394"
    },
    {
      "id": "81da44a6-9fe1-4aeb-9315-b9ccf952d3d0",
      "occurred_at": "2026-10-30T16:32:36.805027Z",
      "actor_type": "STAFF",
      "actor_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fc07eb46-36ae-4b34-9224-0805127bfc0a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0f1ce56e-93f4-49fe-afb1-b0b29b603656\", \"order_ids\": []}",
      "correlation_id": "290ae51d-472f-444f-9f0d-0b6212c53a72"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call fc07eb46-36ae-4b34-9224-0805127bfc0a recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25173"
}
```

```json
{
  "challenge_id": "f8ac16b8-ea1a-4755-90dc-cc4724acf06d",
  "expires_at": "2026-10-30T16:37:37.175018621Z",
  "resend_available_at": "2026-10-30T16:32:38.175018621Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "543996",
  "sent_at": "2026-10-30T16:32:37.177947865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8ac16b8-ea1a-4755-90dc-cc4724acf06d",
  "code": "543996",
  "device_ref": "sandbox-25173"
}
```

```json
{
  "session_id": "15705f55-9afa-4582-983d-214cf89a9c9a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODg1NywiaWF0IjoxNzkzMzc3OTU3LCJqdGkiOiI5MDk3MmM4ZS02MDlhLTQ4NWItYjdjYy1hYTAyOGUzNGExNTIiLCJzaWQiOiIxNTcwNWY1NS05YWZhLTQ1ODItOTgzZC0yMTRjZjg5YTljOWEifQ.9903KW4Rj62J2d-TjuznMdOmOawF3qmlXX0c2bkbLKs",
  "access_expires_at": "2026-10-30T16:47:37.488460756Z",
  "refresh_token": "TSJYK2SvkYaxoMJ0GkTwWSGW8_sZM77_SjVPKe21Rt0",
  "refresh_expires_at": "2026-11-29T16:32:37.487930439Z",
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
  "command_id": "66ca96f1-f46c-4ea0-8f79-07e7630f9680",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:32:38Z",
    "sequence": 1793377958602
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b56d9f18-9f4e-4e1a-8c59-df36166ec945",
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
  "last_heartbeat_at": "2026-10-30T16:32:38.079602Z",
  "last_location_at": "2026-10-30T16:32:38.079602Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The operator takes a phone order for a caller without the app

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
  "session_id": "3193eba7-5269-4d2e-a8a0-ca68bf91dead",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg4NTgsImlhdCI6MTc5MzM3Nzk1OCwianRpIjoiMTJiYzhhYTAtNWM2Ni00MTI1LTllZmEtNGRjMzBjODcyNWMwIiwic2lkIjoiMzE5M2ViYTctNTI2OS00ZDJlLWE4YTAtY2E2OGJmOTFkZWFkIn0.hfkrZ_bqzM1z3FCRuefOZ0nJs9ZX9UR3Y7YtQMll5Ys",
  "access_expires_at": "2026-10-30T16:47:38.68480839Z",
  "refresh_token": "EQqrzUM_gXFRup7aPSrp1a9IUpWqVIBTcTX4KveD2gg",
  "refresh_expires_at": "2026-10-31T04:32:38.684157126Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9eefb858-2aaf-4928-9a0d-f485e7ff39f9",
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
  "id": "4747f5a1-e18c-4f45-8f74-5933c835e896",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:37:38.973930Z",
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
  "command_id": "309e0bd0-0ab1-40ac-925c-ea2e332d6c3c",
  "quote_id": "4747f5a1-e18c-4f45-8f74-5933c835e896",
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
    "name": "Олена",
    "phone": "+380674592644"
  }
}
```

```json
{
  "id": "e2bae62c-c65a-4861-a2ea-ca535ead7ad2",
  "short_number": 5,
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
  "created_at": "2026-10-30T16:32:39.289751Z",
  "caller": {
    "name": "Олена",
    "phone": "+380674592644"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Ivan accepts: the caller gets the car and the plate by SMS

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "811e136a-0567-42f1-a121-19583993bb75",
    "order_id": "e2bae62c-c65a-4861-a2ea-ca535ead7ad2",
    "expires_at": "2026-10-30T16:32:54.295325Z",
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
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/811e136a-0567-42f1-a121-19583993bb75/accept` → **200**

```json
{
  "command_id": "b2017faa-e03a-4de4-9062-46bea69966f8"
}
```

```json
{
  "id": "0720d456-68a1-4a37-a118-3774bfb72ea5",
  "order_id": "e2bae62c-c65a-4861-a2ea-ca535ead7ad2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6545c4a9-a051-4bdd-931a-6b561fe17cbd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380674592644` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674592644` → **200**

```json
[
  {
    "phone": "+380674592644",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:32:41.225586983Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674592644` → **200**

```json
[
  {
    "phone": "+380674592644",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:32:41.225586983Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674592644` → **200**

```json
[
  {
    "phone": "+380674592644",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:32:41.225586983Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6545c4a9-a051-4bdd-931a-6b561fe17cbd",
  "order_id": "e2bae62c-c65a-4861-a2ea-ca535ead7ad2",
  "assignment_id": "0720d456-68a1-4a37-a118-3774bfb72ea5",
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
    "name": "Олена",
    "phone": "+380674592644"
  }
}
```

`POST /api/driver/v1/work-sessions/b56d9f18-9f4e-4e1a-8c59-df36166ec945/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:32:41Z",
    "sequence": 1793377961610
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b56d9f18-9f4e-4e1a-8c59-df36166ec945",
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
  "last_heartbeat_at": "2026-10-30T16:32:41.629828Z",
  "last_location_at": "2026-10-30T16:32:41.629828Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/6545c4a9-a051-4bdd-931a-6b561fe17cbd/arrive` → **200**

```json
{
  "command_id": "85ce9dce-eaf3-4af8-9502-136d0204e863",
  "expected_version": 0
}
```

```json
{
  "id": "6545c4a9-a051-4bdd-931a-6b561fe17cbd",
  "order_id": "e2bae62c-c65a-4861-a2ea-ca535ead7ad2",
  "assignment_id": "0720d456-68a1-4a37-a118-3774bfb72ea5",
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
  "arrived_at": "2026-10-30T16:32:41.929137Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674592644"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380674592644` → **200**

```json
[
  {
    "phone": "+380674592644",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:32:41.225586983Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674592644` → **200**

```json
[
  {
    "phone": "+380674592644",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:32:41.225586983Z"
  },
  {
    "phone": "+380674592644",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T16:32:43.233582256Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674592644` → **200**

```json
[
  {
    "phone": "+380674592644",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:32:41.225586983Z"
  },
  {
    "phone": "+380674592644",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T16:32:43.233582256Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674592644` → **200**

```json
[
  {
    "phone": "+380674592644",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T16:32:41.225586983Z"
  },
  {
    "phone": "+380674592644",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T16:32:43.233582256Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/6545c4a9-a051-4bdd-931a-6b561fe17cbd/start` → **200**

```json
{
  "command_id": "b77ca458-26df-4d24-812e-bc6943d5a75b",
  "expected_version": 1
}
```

```json
{
  "id": "6545c4a9-a051-4bdd-931a-6b561fe17cbd",
  "order_id": "e2bae62c-c65a-4861-a2ea-ca535ead7ad2",
  "assignment_id": "0720d456-68a1-4a37-a118-3774bfb72ea5",
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
  "arrived_at": "2026-10-30T16:32:41.929137Z",
  "started_at": "2026-10-30T16:32:43.334863Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674592644"
  }
}
```

`POST /api/driver/v1/trips/6545c4a9-a051-4bdd-931a-6b561fe17cbd/complete` → **200**

```json
{
  "command_id": "0988268f-8c91-428d-b7ea-03613748d3e6",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:32:43Z",
  "cash_received": true
}
```

```json
{
  "id": "6545c4a9-a051-4bdd-931a-6b561fe17cbd",
  "order_id": "e2bae62c-c65a-4861-a2ea-ca535ead7ad2",
  "assignment_id": "0720d456-68a1-4a37-a118-3774bfb72ea5",
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
  "arrived_at": "2026-10-30T16:32:41.929137Z",
  "started_at": "2026-10-30T16:32:43.334863Z",
  "completed_at": "2026-10-30T16:32:43.633829Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

Done: two SMS to the caller of a phone order.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b56d9f18-9f4e-4e1a-8c59-df36166ec945",
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
  "last_heartbeat_at": "2026-10-30T16:32:41.629828Z",
  "last_location_at": "2026-10-30T16:32:41.629828Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b56d9f18-9f4e-4e1a-8c59-df36166ec945/close` → **200**

```json
{
  "command_id": "4fb66d19-9e06-42d7-a3e9-d2e2aab59181",
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

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637043207",
  "device_ref": "sandbox-4228"
}
```

```json
{
  "challenge_id": "b2f1008b-40b2-490b-9111-6d2e393ebc99",
  "expires_at": "2026-10-30T16:37:44.542058785Z",
  "resend_available_at": "2026-10-30T16:32:45.542058785Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637043207` → **200**

```json
{
  "phone": "+380637043207",
  "audience": "CLIENT",
  "code": "889198",
  "sent_at": "2026-10-30T16:32:44.545391696Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2f1008b-40b2-490b-9111-6d2e393ebc99",
  "code": "889198",
  "device_ref": "sandbox-4228"
}
```

```json
{
  "session_id": "8ba1e5ae-7b80-464e-93e4-57ceafa302e6",
  "subject": {
    "type": "CLIENT",
    "id": "c4bb3472-3596-462f-80ab-433b53e31e40"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGJiMzQ3Mi0zNTk2LTQ2MmYtODBhYi00MzNiNTNlMzFlNDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4ODY0LCJpYXQiOjE3OTMzNzc5NjQsImp0aSI6IjIwZmMwOTllLTIwOTUtNDRjYS1hYzc5LThjMWRhMjNjZDIwOCIsInNpZCI6IjhiYTFlNWFlLTdiODAtNDY0ZS05M2U0LTU3Y2VhZmEzMDJlNiJ9.PfEONdV7txWjS3UO5rZ3Luk_iWQrnUxWqSaIiEDDxT4",
  "access_expires_at": "2026-10-30T16:47:44.856487672Z",
  "refresh_token": "P9pt-5pWdpAIsqi0czDdTNQZwSzQZ-HLJ5rYIytVae4",
  "refresh_expires_at": "2026-11-29T16:32:44.855817382Z",
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
        "ru": "Передумал ехать",
        "pl": "Zmiana planów",
        "uk": "Передумав їхати",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
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
  "device_ref": "sandbox-27028"
}
```

```json
{
  "challenge_id": "d96c3c18-6472-4263-9a2c-0accbbbe7224",
  "expires_at": "2026-10-30T16:37:45.433973009Z",
  "resend_available_at": "2026-10-30T16:32:46.433973009Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "266952",
  "sent_at": "2026-10-30T16:32:45.437503199Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d96c3c18-6472-4263-9a2c-0accbbbe7224",
  "code": "266952",
  "device_ref": "sandbox-27028"
}
```

```json
{
  "session_id": "65d55c48-1db5-469b-be38-e4262d1ca412",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODg2NSwiaWF0IjoxNzkzMzc3OTY1LCJqdGkiOiIxNTUyMzMwMC1iNWE3LTRkYjEtYTZmMS0xYjRhNDY5MTllYjMiLCJzaWQiOiI2NWQ1NWM0OC0xZGI1LTQ2OWItYmUzOC1lNDI2MmQxY2E0MTIifQ.wkXqTlTMmIGWQHxMmFytEDgyqXg2mZ1Bf_zMMwPDKFU",
  "access_expires_at": "2026-10-30T16:47:45.757006226Z",
  "refresh_token": "_hFCi_VMVwFpA1W9bWJpPBxtstnijQW6XsJ9MW1CMNo",
  "refresh_expires_at": "2026-11-29T16:32:45.756391381Z",
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
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
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
  "session_id": "1b984567-28a6-4296-a9b5-56cf465401b5",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg4NjYsImlhdCI6MTc5MzM3Nzk2NiwianRpIjoiM2E0MzliNmEtODMwNi00MGMzLTg5NTEtZjczM2IwN2M1Zjc4Iiwic2lkIjoiMWI5ODQ1NjctMjhhNi00Mjk2LWE5YjUtNTZjZjQ2NTQwMWI1In0.yWOOV6MRvD3oVRa3HIEeMehMd7tyZCXcOkOB_aAeG7U",
  "access_expires_at": "2026-10-30T16:47:46.622737117Z",
  "refresh_token": "6Y5cfghi1mdEhZIHB9WKLFPzAcuBQwzNrppc7pg8bCc",
  "refresh_expires_at": "2026-10-31T04:32:46.622057369Z",
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
  "session_id": "4a3b4e52-3a88-4330-830a-1bfa8e4e18d2",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg4NjcsImlhdCI6MTc5MzM3Nzk2NywianRpIjoiOWFiMDVmYWMtMjFjYi00ZGNkLTgzMjQtMzM1MjViNTNlNTVjIiwic2lkIjoiNGEzYjRlNTItM2E4OC00MzMwLTgzMGEtMWJmYThlNGUxOGQyIn0.GWOXgCBz5j5jC83Ts_KpmGHDzeDSJ52M1wq_xXKZgO4",
  "access_expires_at": "2026-10-30T16:47:47.191276572Z",
  "refresh_token": "ROAIePYdbLkYDKT6STinEv-QM0czCNrbl65HdaVrjvQ",
  "refresh_expires_at": "2026-10-31T04:32:47.190723633Z",
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
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "ru": "ДТП",
        "pl": "Wypadek",
        "uk": "ДТП",
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
  "command_id": "47b9478c-96fa-42a9-814a-b72287d91158",
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
  "id": "8c269b98-c3e5-48b5-9642-391d7fdd4b94",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:37:47.777163Z",
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
  "command_id": "ad75b0f2-b925-4815-8d09-c42fe0b6c343",
  "quote_id": "8c269b98-c3e5-48b5-9642-391d7fdd4b94",
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
  "id": "ee6d3554-6261-45ba-88c4-a66a0684067a",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4bb3472-3596-462f-80ab-433b53e31e40",
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
  "created_at": "2026-10-30T16:32:48.076916Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ee6d3554-6261-45ba-88c4-a66a0684067a` → **200**

```json
{
  "id": "ee6d3554-6261-45ba-88c4-a66a0684067a",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4bb3472-3596-462f-80ab-433b53e31e40",
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
  "created_at": "2026-10-30T16:32:48.076916Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ee6d3554-6261-45ba-88c4-a66a0684067a/cancel` → **200**

```json
{
  "command_id": "95427b0c-b86c-4be7-b27d-1a9d63602a5a",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ee6d3554-6261-45ba-88c4-a66a0684067a",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c4bb3472-3596-462f-80ab-433b53e31e40",
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
  "created_at": "2026-10-30T16:32:48.076916Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
      "en": "The wait is too long"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
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
  "command_id": "c8cde2c5-10e9-4220-872a-fc519ec245a3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:32:49Z",
    "sequence": 1793377969336
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "040deaf0-66f5-4c3b-b79e-4de251690ba6",
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
  "last_heartbeat_at": "2026-10-30T16:32:49.354409Z",
  "last_location_at": "2026-10-30T16:32:49.354409Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27023"
}
```

```json
{
  "challenge_id": "bfe44328-dfde-4220-aeee-415df2d12415",
  "expires_at": "2026-10-30T16:37:49.641524716Z",
  "resend_available_at": "2026-10-30T16:32:50.641524716Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "551533",
  "sent_at": "2026-10-30T16:32:49.644491713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bfe44328-dfde-4220-aeee-415df2d12415",
  "code": "551533",
  "device_ref": "sandbox-27023"
}
```

```json
{
  "session_id": "8c162459-dd9c-47d3-b669-a0b92a7c1993",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODg2OSwiaWF0IjoxNzkzMzc3OTY5LCJqdGkiOiI1Y2Q4YjA0ZC04NTkzLTQ5MzUtOWVjYS0yOWY4MDlkMzVlZjciLCJzaWQiOiI4YzE2MjQ1OS1kZDljLTQ3ZDMtYjY2OS1hMGI5MmE3YzE5OTMifQ.37DFkiBT2VMJbnPayPU3VxXnoUR6RGJbW-qEWX_pri8",
  "access_expires_at": "2026-10-30T16:47:49.957978237Z",
  "refresh_token": "kEgYy3g5AcT2t8O6G1U-tynq7ySXJd04_e9hDny5uPw",
  "refresh_expires_at": "2026-11-29T16:32:49.95734122Z",
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
  "command_id": "44804ced-c4bd-4aa2-82ed-37295a67c426",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:32:50Z",
    "sequence": 1793377970557
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3010898b-b1bb-4a57-aab7-d3aaa30b566f",
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
  "last_heartbeat_at": "2026-10-30T16:32:50.577595Z",
  "last_location_at": "2026-10-30T16:32:50.577595Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e7bcccde-330e-415c-afce-846af6b73f9f",
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
  "id": "14c26198-1342-46a8-80cf-474e367ae838",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:37:50.883632Z",
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
  "command_id": "e2566d09-4f77-40a3-9214-b0fe03782ff8",
  "quote_id": "14c26198-1342-46a8-80cf-474e367ae838",
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
  "id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c4bb3472-3596-462f-80ab-433b53e31e40",
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
  "created_at": "2026-10-30T16:32:51.183893Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "522097d5-8263-40dd-8252-4f9641585037",
    "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
    "expires_at": "2026-10-30T16:33:06.187413Z",
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

`POST /api/driver/v1/offers/522097d5-8263-40dd-8252-4f9641585037/accept` → **200**

```json
{
  "command_id": "c0553ad3-a747-4a3e-80c4-4d0ed4cea7b1"
}
```

```json
{
  "id": "ea0c8965-8010-4f8b-bc53-fe5ec5d21913",
  "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e73306df-ba94-48eb-be3a-cc0e74bca710",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e73306df-ba94-48eb-be3a-cc0e74bca710",
  "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
  "assignment_id": "ea0c8965-8010-4f8b-bc53-fe5ec5d21913",
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

`POST /api/driver/v1/trips/e73306df-ba94-48eb-be3a-cc0e74bca710/cancel` → **200**

```json
{
  "command_id": "a186acfb-cd37-4d06-a21e-134ef1ed54ac",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "e73306df-ba94-48eb-be3a-cc0e74bca710",
  "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
  "assignment_id": "ea0c8965-8010-4f8b-bc53-fe5ec5d21913",
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

`GET /api/rider/v1/orders/fc142050-c4ba-487d-a582-b2ae92eeeadb` → **200**

```json
{
  "id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c4bb3472-3596-462f-80ab-433b53e31e40",
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
    "id": "ea0c8965-8010-4f8b-bc53-fe5ec5d21913",
    "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e73306df-ba94-48eb-be3a-cc0e74bca710",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:32:51.183893Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "0aa8f619-4882-4f46-b188-0e9537537052",
    "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
    "expires_at": "2026-10-30T16:33:07.4149Z",
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

`POST /api/driver/v1/offers/0aa8f619-4882-4f46-b188-0e9537537052/accept` → **200**

```json
{
  "command_id": "5d4c0861-39b4-42bd-9f68-e00a4086975c"
}
```

```json
{
  "id": "6c017456-358a-4734-8c43-131734689648",
  "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d5bb9b76-0a0f-4935-a9e6-19e42310884c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d5bb9b76-0a0f-4935-a9e6-19e42310884c",
  "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
  "assignment_id": "6c017456-358a-4734-8c43-131734689648",
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

`POST /api/driver/v1/trips/d5bb9b76-0a0f-4935-a9e6-19e42310884c/cancel` → **200**

```json
{
  "command_id": "d219aad0-3486-4559-89e2-02f97eaacfad",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "d5bb9b76-0a0f-4935-a9e6-19e42310884c",
  "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
  "assignment_id": "6c017456-358a-4734-8c43-131734689648",
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
{
  "items": [
    {
      "id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
      "short_number": 7,
      "status": "CANCELLED",
      "created_at": "2026-10-30T16:32:51.183893Z",
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
          "ru": "Пассажир попросил отменить",
          "pl": "Pasażer poprosił o anulowanie",
          "uk": "Пасажир попросив скасувати",
          "en": "Passenger asked to cancel"
        }
      },
      "pickup_at": null
    },
    {
      "id": "ee6d3554-6261-45ba-88c4-a66a0684067a",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T16:32:48.076916Z",
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
          "ru": "Долго ждать машину",
          "pl": "Zbyt długie oczekiwanie",
          "uk": "Довго чекати авто",
          "en": "The wait is too long"
        }
      },
      "pickup_at": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/fc142050-c4ba-487d-a582-b2ae92eeeadb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:32:51.184494Z",
      "actor": {
        "type": "CLIENT",
        "id": "c4bb3472-3596-462f-80ab-433b53e31e40",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
        "quote_id": "14c26198-1342-46a8-80cf-474e367ae838",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "512c0548-30c4-4fa8-8c1f-27848f0822a7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:32:51.186501Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
        "attempt_id": "059363ab-5f3b-4e1e-828b-286de8850baf",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "512c0548-30c4-4fa8-8c1f-27848f0822a7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T16:32:51.21728Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "522097d5-8263-40dd-8252-4f9641585037",
        "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "512c0548-30c4-4fa8-8c1f-27848f0822a7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T16:32:51.827662Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "522097d5-8263-40dd-8252-4f9641585037",
        "order_id": "fc142050-c4ba-487d-a582-b2ae92eeeadb",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "ea0c8965-8010-4f8b-bc53-fe5ec5d21913"
      },
      "correlation_id": "3db81558-fd79-434d-b8fe-5af22078657a"
```

Done: orders ee6d3554-6261-45ba-88c4-a66a0684067a, fc142050-c4ba-487d-a582-b2ae92eeeadb.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732446268",
  "device_ref": "sandbox-15712"
}
```

```json
{
  "challenge_id": "07e8790b-e43b-4ed3-8b7c-2fcecdc42328",
  "expires_at": "2026-10-30T16:37:54.758197422Z",
  "resend_available_at": "2026-10-30T16:32:55.758197422Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732446268` → **200**

```json
{
  "phone": "+380732446268",
  "audience": "CLIENT",
  "code": "763271",
  "sent_at": "2026-10-30T16:32:54.760928107Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07e8790b-e43b-4ed3-8b7c-2fcecdc42328",
  "code": "763271",
  "device_ref": "sandbox-15712"
}
```

```json
{
  "session_id": "90bc45d0-7424-4334-bb23-44e177a45f81",
  "subject": {
    "type": "CLIENT",
    "id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODllYjg3MS0yZDliLTRmNTctODNhOS05MGMyYTcxOTg3YWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4ODc1LCJpYXQiOjE3OTMzNzc5NzUsImp0aSI6IjMyMzIyNWRiLTk4MGEtNGZjNC1iNzgyLTY4YTQ2Mjg2ZDk1MiIsInNpZCI6IjkwYmM0NWQwLTc0MjQtNDMzNC1iYjIzLTQ0ZTE3N2E0NWY4MSJ9.tNCWaoNc6I483oX7LBv-Pzk3uc51tEasceHaAcLx40A",
  "access_expires_at": "2026-10-30T16:47:55.063544005Z",
  "refresh_token": "fqAx2B50yYnWJCw0-9AqtaCkLGZ1HAN9_XKeM6SIlAU",
  "refresh_expires_at": "2026-11-29T16:32:55.062948941Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e0325295-bf5d-47b4-ade4-2b331ee5f92b",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8626c0a6-25f9-45ee-b318-406ec26b8d1b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8626c0a6-25f9-45ee-b318-406ec26b8d1b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "66d2f1e987897d5eb6721ee94bed4bf2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8626c0a6-25f9-45ee-b318-406ec26b8d1b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732446268"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8626c0a6-25f9-45ee-b318-406ec26b8d1b",
  "expires_at": "2026-10-30T17:02:55.352433Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/8626c0a6-25f9-45ee-b318-406ec26b8d1b` → **200**

```json
{
  "id": "8626c0a6-25f9-45ee-b318-406ec26b8d1b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T17:02:55.352433Z",
  "card": {
    "id": "e0d18243-2254-442c-a3b5-12ebe8e41ca6",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8071",
    "card_type": "Visa",
    "created_at": "2026-10-30T16:32:55.665656Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "e0d18243-2254-442c-a3b5-12ebe8e41ca6",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8071",
      "card_type": "Visa",
      "created_at": "2026-10-30T16:32:55.665656Z"
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
  "device_ref": "sandbox-13050"
}
```

```json
{
  "challenge_id": "d89bdee1-2715-4984-95b7-10213435682f",
  "expires_at": "2026-10-30T16:37:56.256521307Z",
  "resend_available_at": "2026-10-30T16:32:57.256521307Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "466491",
  "sent_at": "2026-10-30T16:32:56.259304982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d89bdee1-2715-4984-95b7-10213435682f",
  "code": "466491",
  "device_ref": "sandbox-13050"
}
```

```json
{
  "session_id": "c067d691-9b88-43f5-9e3e-c6760219df4b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODg3NiwiaWF0IjoxNzkzMzc3OTc2LCJqdGkiOiI5MzVjYzQ2OS1kM2Y3LTRmMmUtODUwOC04NmQ2ZDVlNDVmMWQiLCJzaWQiOiJjMDY3ZDY5MS05Yjg4LTQzZjUtOWUzZS1jNjc2MDIxOWRmNGIifQ.5LlPlazGv8UPeE9k9LbodXSEpX1TKGvGcpVGxFhz-as",
  "access_expires_at": "2026-10-30T16:47:56.564454419Z",
  "refresh_token": "7ZBOxWha1CKwJnQijfqdUm8a3v5WERWx3Oz3ynRmPJA",
  "refresh_expires_at": "2026-11-29T16:32:56.563813436Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3010898b-b1bb-4a57-aab7-d3aaa30b566f",
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
  "last_heartbeat_at": "2026-10-30T16:32:50.577595Z",
  "last_location_at": "2026-10-30T16:32:50.577595Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3010898b-b1bb-4a57-aab7-d3aaa30b566f/handover` → **200**

```json
{
  "command_id": "fd7cf89f-834f-4119-989c-40c421aebe78",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3010898b-b1bb-4a57-aab7-d3aaa30b566f",
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
  "last_heartbeat_at": "2026-10-30T16:32:50.577595Z",
  "last_location_at": "2026-10-30T16:32:50.577595Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/3010898b-b1bb-4a57-aab7-d3aaa30b566f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:33:39Z",
    "sequence": 1793378019441
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3010898b-b1bb-4a57-aab7-d3aaa30b566f",
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
  "last_heartbeat_at": "2026-10-30T16:33:39.461439Z",
  "last_location_at": "2026-10-30T16:33:39.461439Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b4e3e37f-1a8c-441a-93ec-3e95131ba768",
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
  "id": "28e2448a-d55e-411c-8c9a-6ad5b2279b98",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:38:39.768079Z",
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

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "758e44a0-35b9-47fb-9716-297662fe8f99",
  "quote_id": "28e2448a-d55e-411c-8c9a-6ad5b2279b98",
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
  "payment_method": "CARD",
  "wallet_minor": 0
}
```

```json
{
  "id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac",
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
  "created_at": "2026-10-30T16:33:40.073378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1db50766-6996-4d54-84d2-ed3097bbaf16` → **200**

```json
{
  "id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "short_number": 8,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac",
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
  "created_at": "2026-10-30T16:33:40.073378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1db50766-6996-4d54-84d2-ed3097bbaf16` → **200**

```json
{
  "id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac",
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
  "created_at": "2026-10-30T16:33:40.073378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "49b17620-83b3-49ca-9e57-42de5a9736c8",
    "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
    "expires_at": "2026-10-30T16:33:55.555546Z",
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

`POST /api/driver/v1/offers/49b17620-83b3-49ca-9e57-42de5a9736c8/accept` → **200**

```json
{
  "command_id": "c66a5283-91ed-43bf-9042-ed3611c62cd9"
}
```

```json
{
  "id": "d04be058-09cc-4e44-8e5f-3678c7c6f097",
  "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0683fc90-fd05-497d-8dc2-a3adcc945f32",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0683fc90-fd05-497d-8dc2-a3adcc945f32",
  "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "assignment_id": "d04be058-09cc-4e44-8e5f-3678c7c6f097",
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

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/3010898b-b1bb-4a57-aab7-d3aaa30b566f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:33:48Z",
    "sequence": 1793378028883
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3010898b-b1bb-4a57-aab7-d3aaa30b566f",
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
  "last_heartbeat_at": "2026-10-30T16:33:48.902551Z",
  "last_location_at": "2026-10-30T16:33:48.902551Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0683fc90-fd05-497d-8dc2-a3adcc945f32/arrive` → **200**

```json
{
  "command_id": "736ac005-5f8d-4b12-954e-0818182162fb",
  "expected_version": 0
}
```

```json
{
  "id": "0683fc90-fd05-497d-8dc2-a3adcc945f32",
  "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "assignment_id": "d04be058-09cc-4e44-8e5f-3678c7c6f097",
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
  "arrived_at": "2026-10-30T16:33:49.195089Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0683fc90-fd05-497d-8dc2-a3adcc945f32/start` → **200**

```json
{
  "command_id": "a42ee9f1-5d57-4fec-9b83-a213402e9da0",
  "expected_version": 1
}
```

```json
{
  "id": "0683fc90-fd05-497d-8dc2-a3adcc945f32",
  "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "assignment_id": "d04be058-09cc-4e44-8e5f-3678c7c6f097",
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
  "arrived_at": "2026-10-30T16:33:49.195089Z",
  "started_at": "2026-10-30T16:33:49.488077Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0683fc90-fd05-497d-8dc2-a3adcc945f32/complete` → **200**

```json
{
  "command_id": "a9bd4535-5669-4374-9ec0-a12796116754",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:33:49Z",
  "cash_received": true
}
```

```json
{
  "id": "0683fc90-fd05-497d-8dc2-a3adcc945f32",
  "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "assignment_id": "d04be058-09cc-4e44-8e5f-3678c7c6f097",
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
  "arrived_at": "2026-10-30T16:33:49.195089Z",
  "started_at": "2026-10-30T16:33:49.488077Z",
  "completed_at": "2026-10-30T16:33:49.798279Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/1db50766-6996-4d54-84d2-ed3097bbaf16` → **200**

```json
{
  "id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac",
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
    "id": "d04be058-09cc-4e44-8e5f-3678c7c6f097",
    "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0683fc90-fd05-497d-8dc2-a3adcc945f32",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:33:40.073378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1db50766-6996-4d54-84d2-ed3097bbaf16` → **200**

```json
{
  "id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac",
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
    "id": "d04be058-09cc-4e44-8e5f-3678c7c6f097",
    "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0683fc90-fd05-497d-8dc2-a3adcc945f32",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:33:40.073378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1db50766-6996-4d54-84d2-ed3097bbaf16` → **200**

```json
{
  "id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac",
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
    "id": "d04be058-09cc-4e44-8e5f-3678c7c6f097",
    "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0683fc90-fd05-497d-8dc2-a3adcc945f32",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:33:40.073378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1db50766-6996-4d54-84d2-ed3097bbaf16` → **200**

```json
{
  "id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac",
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
    "id": "d04be058-09cc-4e44-8e5f-3678c7c6f097",
    "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0683fc90-fd05-497d-8dc2-a3adcc945f32",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:33:40.073378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
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

`GET /api/rider/v1/orders/1db50766-6996-4d54-84d2-ed3097bbaf16/tip` → **200**

```json
{
  "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
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
  "available_until": "2026-10-31T16:33:49.798279Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1db50766-6996-4d54-84d2-ed3097bbaf16/tip` → **201**

```json
{
  "command_id": "9fbbdf7d-12c7-4e3f-972d-d3bffe9f36eb",
  "amount_minor": 2500
}
```

```json
{
  "id": "7da03645-7f71-4e95-9f64-29fb25f825f5",
  "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T16:33:54.869094Z"
}
```

`GET /api/rider/v1/orders/1db50766-6996-4d54-84d2-ed3097bbaf16/tip` → **200**

```json
{
  "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
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
  "available_until": "2026-10-31T16:33:49.798279Z",
  "open": false,
  "tip": {
    "id": "7da03645-7f71-4e95-9f64-29fb25f825f5",
    "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T16:33:54.869094Z"
  }
}
```

`GET /api/rider/v1/orders/1db50766-6996-4d54-84d2-ed3097bbaf16/tip` → **200**

```json
{
  "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
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
  "available_until": "2026-10-31T16:33:49.798279Z",
  "open": false,
  "tip": {
    "id": "7da03645-7f71-4e95-9f64-29fb25f825f5",
    "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T16:33:54.869094Z"
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
      "id": "026ba1e0-263c-490f-bae4-7e410c6ca6be",
      "at": "2026-10-30T16:33:56.73035Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
      "counterpart_id": null
    },
    {
      "id": "16960f05-a71b-4800-9f7e-6ee5c1971487",
      "at": "2026-10-30T16:33:50.672217Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ac880b8a-6afa-4db6-a2cb-2aee5fcb9623",
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
  "id": "3451a062-6c60-40e4-986e-a40420e2bd23",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:38:57.036587Z",
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

## Bonuses cover the fare; 300 minor units remain for a larger card tip

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
  "session_id": "232f6aa3-006e-4803-8f4f-0c068f15a66a",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg5MzcsImlhdCI6MTc5MzM3ODAzNywianRpIjoiOTQyYzdkYWUtYTY2MC00YmU4LWEyYzctMWY4MWYwNDk3NzYwIiwic2lkIjoiMjMyZjZhYTMtMDA2ZS00ODAzLThmNGYtMGMwNjhmMTVhNjZhIn0.s23Byl7-9wjQWXQW00Vqnhu_Opjudja9ZkoE2QZGyEA",
  "access_expires_at": "2026-10-30T16:48:57.627375163Z",
  "refresh_token": "NsrgKwytPHTjEFTWsG_5Ubh2AQ-ei9i9pmAHMSHBrfA",
  "refresh_expires_at": "2026-10-31T04:33:57.626856657Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380732446268` → **200**

```json
{
  "client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac"
}
```

`POST /api/admin/v1/rider-wallets/a89eb871-2d9b-4f57-83a9-90c2a71987ac/top-ups` → **201**

```json
{
  "command_id": "b2d54f2e-1b5c-423f-bd5f-75dda7622c0e",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 0,
      "available_minor": 16597
    }
  ],
  "entries": [
    {
      "id": "c9e22e2e-7f22-49c3-82cb-4a275b4cf4c0",
      "at": "2026-10-30T16:33:58.1964Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "49c8d9d5-33f8-4755-bd67-d402f6b9d9da",
  "quote_id": "3451a062-6c60-40e4-986e-a40420e2bd23",
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
  "payment_method": "CARD",
  "wallet_minor": 16297
}
```

```json
{
  "id": "9682575a-6558-4961-985a-2eb3fea5881c",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac",
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
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T16:33:58.498798Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9682575a-6558-4961-985a-2eb3fea5881c` → **200**

```json
{
  "id": "9682575a-6558-4961-985a-2eb3fea5881c",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac",
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
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-30T16:33:58.498798Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "8c864e52-adfb-47a1-b5d9-0a6b6244d7ee",
    "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
    "expires_at": "2026-10-30T16:34:13.504161Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4437,
      "lon": 30.497
    },
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "payment_method": "CASH",
    "price_minor": 16297,
    "currency": "UAH",
    "distance_m": 11
  }
]
```

`POST /api/driver/v1/offers/8c864e52-adfb-47a1-b5d9-0a6b6244d7ee/accept` → **200**

```json
{
  "command_id": "a61c4df7-c10d-4ee2-85b8-8ae295c8d488"
}
```

```json
{
  "id": "3a677e4a-1d88-4c80-a8f6-8e708ad2c165",
  "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "43a135a5-8302-4a06-b70b-babaeedb24f0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "43a135a5-8302-4a06-b70b-babaeedb24f0",
  "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
  "assignment_id": "3a677e4a-1d88-4c80-a8f6-8e708ad2c165",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/3010898b-b1bb-4a57-aab7-d3aaa30b566f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:34:00Z",
    "sequence": 1793378040688
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3010898b-b1bb-4a57-aab7-d3aaa30b566f",
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
  "last_heartbeat_at": "2026-10-30T16:34:00.027899Z",
  "last_location_at": "2026-10-30T16:34:00.027899Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/43a135a5-8302-4a06-b70b-babaeedb24f0/arrive` → **200**

```json
{
  "command_id": "0a47ad73-0dbd-4cdc-844b-a9cdd66becb8",
  "expected_version": 0
}
```

```json
{
  "id": "43a135a5-8302-4a06-b70b-babaeedb24f0",
  "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
  "assignment_id": "3a677e4a-1d88-4c80-a8f6-8e708ad2c165",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T16:34:00.326269Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/43a135a5-8302-4a06-b70b-babaeedb24f0/start` → **200**

```json
{
  "command_id": "70836e48-8552-4b23-bfd8-bbd5758fd5d4",
  "expected_version": 1
}
```

```json
{
  "id": "43a135a5-8302-4a06-b70b-babaeedb24f0",
  "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
  "assignment_id": "3a677e4a-1d88-4c80-a8f6-8e708ad2c165",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T16:34:00.326269Z",
  "started_at": "2026-10-30T16:34:00.634502Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/43a135a5-8302-4a06-b70b-babaeedb24f0/complete` → **200**

```json
{
  "command_id": "08e489b7-fe2f-4778-902b-18c86ab34255",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:34:00Z",
  "cash_received": true
}
```

```json
{
  "id": "43a135a5-8302-4a06-b70b-babaeedb24f0",
  "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
  "assignment_id": "3a677e4a-1d88-4c80-a8f6-8e708ad2c165",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-30T16:34:00.326269Z",
  "started_at": "2026-10-30T16:34:00.634502Z",
  "completed_at": "2026-10-30T16:34:00.939397Z",
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a89eb871-2d9b-4f57-83a9-90c2a71987ac",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 16297,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "c9e22e2e-7f22-49c3-82cb-4a275b4cf4c0",
      "at": "2026-10-30T16:33:58.1964Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_id": null
    }
  ]
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16352,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/rider/v1/orders/9682575a-6558-4961-985a-2eb3fea5881c/tip` → **200**

```json
{
  "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
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
  "method": "WALLET",
  "available_until": "2026-10-31T16:34:00.939397Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9682575a-6558-4961-985a-2eb3fea5881c/tip` → **201**

```json
{
  "command_id": "7d528255-d2c7-4661-a7ea-ef43d09b1019",
  "amount_minor": 2500
}
```

```json
{
  "id": "c58a1b40-3e34-4cbe-9a19-37755dec0017",
  "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T16:34:02.095518Z"
}
```

`GET /api/rider/v1/orders/9682575a-6558-4961-985a-2eb3fea5881c/tip` → **200**

```json
{
  "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
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
  "method": "WALLET",
  "available_until": "2026-10-31T16:34:00.939397Z",
  "open": false,
  "tip": {
    "id": "c58a1b40-3e34-4cbe-9a19-37755dec0017",
    "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T16:34:02.095518Z"
  }
}
```

`GET /api/rider/v1/orders/9682575a-6558-4961-985a-2eb3fea5881c/tip` → **200**

```json
{
  "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
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
  "method": "WALLET",
  "available_until": "2026-10-31T16:34:00.939397Z",
  "open": false,
  "tip": {
    "id": "c58a1b40-3e34-4cbe-9a19-37755dec0017",
    "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T16:34:02.095518Z"
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "e5c9b2c5-ee4a-4093-994a-9a5855e41b88",
      "at": "2026-10-30T16:34:03.814674Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
      "counterpart_id": null
    },
    {
      "id": "8eb4604f-33e6-43e2-969b-e9c35f04c8de",
      "at": "2026-10-30T16:34:01.78578Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9682575a-6558-4961-985a-2eb3fea5881c",
      "counterpart_id": null
    },
    {
      "id": "026ba1e0-263c-490f-bae4-7e410c6ca6be",
      "at": "2026-10-30T16:33:56.73035Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
      "counterpart_id": null
    },
    {
      "id": "16960f05-a71b-4800-9f7e-6ee5c1971487",
      "at": "2026-10-30T16:33:50.672217Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1db50766-6996-4d54-84d2-ed3097bbaf16",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3010898b-b1bb-4a57-aab7-d3aaa30b566f",
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
  "last_heartbeat_at": "2026-10-30T16:34:00.027899Z",
  "last_location_at": "2026-10-30T16:34:00.027899Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3010898b-b1bb-4a57-aab7-d3aaa30b566f/close` → **200**

```json
{
  "command_id": "613b4071-f50f-43a8-a27f-d668c4fd2128",
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

Done: card order 9682575a-6558-4961-985a-2eb3fea5881c.

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

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730418020",
  "device_ref": "sandbox-15685"
}
```

```json
{
  "challenge_id": "2094d3e4-9892-43ba-a71b-2c1cdb09eb96",
  "expires_at": "2026-10-30T16:39:05.122055482Z",
  "resend_available_at": "2026-10-30T16:34:06.122055482Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730418020` → **200**

```json
{
  "phone": "+380730418020",
  "audience": "CLIENT",
  "code": "222327",
  "sent_at": "2026-10-30T16:34:05.124767862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2094d3e4-9892-43ba-a71b-2c1cdb09eb96",
  "code": "222327",
  "device_ref": "sandbox-15685"
}
```

```json
{
  "session_id": "1a262b9d-cce9-49de-907b-3d8a10ea4053",
  "subject": {
    "type": "CLIENT",
    "id": "7b937248-f23c-4b1e-8e49-7d3dcbf4a0ad"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjkzNzI0OC1mMjNjLTRiMWUtOGU0OS03ZDNkY2JmNGEwYWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4OTQ1LCJpYXQiOjE3OTMzNzgwNDUsImp0aSI6IjUzZTBmMzI5LWQ3NTQtNDRjNC04ZDU0LTNiYmFjY2NlOTY4MCIsInNpZCI6IjFhMjYyYjlkLWNjZTktNDlkZS05MDdiLTNkOGExMGVhNDA1MyJ9.oE_bcM9T3ekY-Mu4Cyx0MKKE7hwT4jItnUwvp3OuvSU",
  "access_expires_at": "2026-10-30T16:49:05.449857232Z",
  "refresh_token": "Oxob4c5Jh0JglEZRrLIFGXPiMPsxoRxnll5g4dlP7pw",
  "refresh_expires_at": "2026-11-29T16:34:05.44918241Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "c0fbbd66-623d-4e7f-8049-91ef8b1570f6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "89b28b19-a574-4f1b-b5f4-4f521df441d4",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-89b28b19-a574-4f1b-b5f4-4f521df441d4",
    "orderDate": "1793378045",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "06abee04d1243ff961de435cbe8638b5",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=89b28b19-a574-4f1b-b5f4-4f521df441d4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730418020"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=89b28b19-a574-4f1b-b5f4-4f521df441d4",
  "created_at": "2026-10-30T16:34:05.742059Z",
  "expires_at": "2026-10-30T17:04:05.742059Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/89b28b19-a574-4f1b-b5f4-4f521df441d4` → **200**

```json
{
  "id": "89b28b19-a574-4f1b-b5f4-4f521df441d4",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T16:34:05.742059Z",
  "expires_at": "2026-10-30T17:04:05.742059Z",
  "completed_at": "2026-10-30T16:34:06.033121Z",
  "masked_pan": "41****6878",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "7b937248-f23c-4b1e-8e49-7d3dcbf4a0ad",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "7b937248-f23c-4b1e-8e49-7d3dcbf4a0ad",
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
      "id": "e8d0dfde-6e1a-4b43-8e14-5aef37b4a57b",
      "at": "2026-10-30T16:34:06.8343Z",
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
  "client_id": "7b937248-f23c-4b1e-8e49-7d3dcbf4a0ad",
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
      "id": "e8d0dfde-6e1a-4b43-8e14-5aef37b4a57b",
      "at": "2026-10-30T16:34:06.8343Z",
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
  "device_ref": "sandbox-28176"
}
```

```json
{
  "challenge_id": "d7a29463-6775-4a9c-b6b4-e5a23a62dcc4",
  "expires_at": "2026-10-30T16:39:08.21499228Z",
  "resend_available_at": "2026-10-30T16:34:09.21499228Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "927156",
  "sent_at": "2026-10-30T16:34:08.217519511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7a29463-6775-4a9c-b6b4-e5a23a62dcc4",
  "code": "927156",
  "device_ref": "sandbox-28176"
}
```

```json
{
  "session_id": "7973c3ce-0314-4b44-bccc-3e7ee3f89528",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODk0OCwiaWF0IjoxNzkzMzc4MDQ4LCJqdGkiOiI1OGFkZmI5Zi1kNmEwLTRlY2UtOTQ5MC0zNmE5MWVhM2I0YzkiLCJzaWQiOiI3OTczYzNjZS0wMzE0LTRiNDQtYmNjYy0zZTdlZTNmODk1MjgifQ.Z830aVDRe8LnusFj5W_DZyAu_QU2DhDFRTuDLAoGjT0",
  "access_expires_at": "2026-10-30T16:49:08.531297026Z",
  "refresh_token": "fNdXjNOUXgBYWDyMWxQHxDLIzapEJaFyeydUrtqMrpo",
  "refresh_expires_at": "2026-11-29T16:34:08.530349284Z",
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
  "command_id": "e8118e35-664f-4ac2-9d83-df8a62d8d341",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "b33602ce-de32-4085-8a73-91c6e6fe6767",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b33602ce-de32-4085-8a73-91c6e6fe6767",
    "orderDate": "1793378049",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "d26ecf4cda2574e17bdf9b880a857f76",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b33602ce-de32-4085-8a73-91c6e6fe6767",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b33602ce-de32-4085-8a73-91c6e6fe6767",
  "created_at": "2026-10-30T16:34:09.098746Z",
  "expires_at": "2026-10-30T17:04:09.098746Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/b33602ce-de32-4085-8a73-91c6e6fe6767` → **200**

```json
{
  "id": "b33602ce-de32-4085-8a73-91c6e6fe6767",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T16:34:09.098746Z",
  "expires_at": "2026-10-30T17:04:09.098746Z",
  "completed_at": "2026-10-30T16:34:09.380828Z",
  "masked_pan": "41****5782",
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
      "id": "868ac244-5d95-40f3-9ff8-b614cab9d243",
      "at": "2026-10-30T16:34:09.842312Z",
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
  "command_id": "7ffb60c0-6ea0-40db-ade1-d6f820a6c1ce",
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
  "correlation_id": "b42a42e5-45e1-4b64-8672-12a1c5ba99ac"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: cash-dispute

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25540"
}
```

```json
{
  "challenge_id": "003a481b-6c37-4959-8759-a40cb279d6ce",
  "expires_at": "2026-10-30T16:39:11.559661559Z",
  "resend_available_at": "2026-10-30T16:34:12.559661559Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "849102",
  "sent_at": "2026-10-30T16:34:11.562716885Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "003a481b-6c37-4959-8759-a40cb279d6ce",
  "code": "849102",
  "device_ref": "sandbox-25540"
}
```

```json
{
  "session_id": "a001f5f3-bb95-4c3b-8411-497bf33063b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODk1MSwiaWF0IjoxNzkzMzc4MDUxLCJqdGkiOiIxNmYyYTM4ZS04ZGE1LTQ3ZTctYTk5Mi0xYWM5ODVkZWI3MWUiLCJzaWQiOiJhMDAxZjVmMy1iYjk1LTRjM2ItODQxMS00OTdiZjMzMDYzYjEifQ.HDUBFA-kjeGfFZsXaKD9mRkAO9W0Jb_jmXXhw6W-eXQ",
  "access_expires_at": "2026-10-30T16:49:11.88556426Z",
  "refresh_token": "v5Rezgy41RttxxC1Sy5sq9OAlIuoE8-xgvMZvSXDhk0",
  "refresh_expires_at": "2026-11-29T16:34:11.884885142Z",
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
  "command_id": "cade897f-0a09-4917-8a46-5b9006cdab37",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:34:12Z",
    "sequence": 1793378052474
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ac1f7433-273f-4f7b-9124-444084252354",
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
  "last_heartbeat_at": "2026-10-30T16:34:12.492843Z",
  "last_location_at": "2026-10-30T16:34:12.492843Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639064522",
  "device_ref": "sandbox-32742"
}
```

```json
{
  "challenge_id": "43fdf8b9-4099-42d0-9ef2-1ab5071b45b1",
  "expires_at": "2026-10-30T16:39:12.777361325Z",
  "resend_available_at": "2026-10-30T16:34:13.777361325Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639064522` → **200**

```json
{
  "phone": "+380639064522",
  "audience": "CLIENT",
  "code": "785622",
  "sent_at": "2026-10-30T16:34:12.779901683Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43fdf8b9-4099-42d0-9ef2-1ab5071b45b1",
  "code": "785622",
  "device_ref": "sandbox-32742"
}
```

```json
{
  "session_id": "3c56d3de-0628-49cd-ba1c-561fb2d62f35",
  "subject": {
    "type": "CLIENT",
    "id": "32bed55e-c55a-49f1-8b6a-fe8cade1771e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMmJlZDU1ZS1jNTVhLTQ5ZjEtOGI2YS1mZThjYWRlMTc3MWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4OTUzLCJpYXQiOjE3OTMzNzgwNTMsImp0aSI6IjdlZjVlODA5LTJhNmQtNGEwOC04Y2NhLTgxN2MzMzA2MTQ4MyIsInNpZCI6IjNjNTZkM2RlLTA2MjgtNDljZC1iYTFjLTU2MWZiMmQ2MmYzNSJ9.yfmJdtsPRPumWYuOPzXXZ0GwB3GD1NS1B6idgKrXjRc",
  "access_expires_at": "2026-10-30T16:49:13.088409815Z",
  "refresh_token": "DnqclVX5A0x7lps-aTnyradgdWH6D9vqbe2xRGhP1zY",
  "refresh_expires_at": "2026-11-29T16:34:13.087765004Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4cd7a388-83aa-401b-993f-63aecd7664b5",
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
  "id": "038c4c43-8b53-452e-ab82-fc3b657d8ed2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:39:13.373382Z",
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
  "command_id": "a48a0375-fe71-4cb5-a41e-0819c63d5073",
  "quote_id": "038c4c43-8b53-452e-ab82-fc3b657d8ed2",
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
  "id": "038911dc-7e5c-4dbf-bbf3-975f2072092f",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32bed55e-c55a-49f1-8b6a-fe8cade1771e",
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
  "created_at": "2026-10-30T16:34:13.674645Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Ivan drives; at the end the rider has no money and leaves

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "53ab06bd-470b-494c-9f4b-fd3d403d3070",
    "order_id": "038911dc-7e5c-4dbf-bbf3-975f2072092f",
    "expires_at": "2026-10-30T16:34:28.677794Z",
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
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/53ab06bd-470b-494c-9f4b-fd3d403d3070/accept` → **200**

```json
{
  "command_id": "f3c1f391-912a-4f31-8dc3-24007bc7eded"
}
```

```json
{
  "id": "9ae65f8c-097d-48b2-beb4-a502aa8d443f",
  "order_id": "038911dc-7e5c-4dbf-bbf3-975f2072092f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2ea62c54-fc90-44bf-aeb0-f802dd6a5d1f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2ea62c54-fc90-44bf-aeb0-f802dd6a5d1f",
  "order_id": "038911dc-7e5c-4dbf-bbf3-975f2072092f",
  "assignment_id": "9ae65f8c-097d-48b2-beb4-a502aa8d443f",
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
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ac1f7433-273f-4f7b-9124-444084252354/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:34:14Z",
    "sequence": 1793378054875
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ac1f7433-273f-4f7b-9124-444084252354",
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
  "last_heartbeat_at": "2026-10-30T16:34:14.894604Z",
  "last_location_at": "2026-10-30T16:34:14.894604Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2ea62c54-fc90-44bf-aeb0-f802dd6a5d1f/arrive` → **200**

```json
{
  "command_id": "08c4b80e-1f18-4980-bc50-599639829051",
  "expected_version": 0
}
```

```json
{
  "id": "2ea62c54-fc90-44bf-aeb0-f802dd6a5d1f",
  "order_id": "038911dc-7e5c-4dbf-bbf3-975f2072092f",
  "assignment_id": "9ae65f8c-097d-48b2-beb4-a502aa8d443f",
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
  "arrived_at": "2026-10-30T16:34:15.184009Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2ea62c54-fc90-44bf-aeb0-f802dd6a5d1f/start` → **200**

```json
{
  "command_id": "85389d81-e315-4cd2-9138-c29d4e825fa7",
  "expected_version": 1
}
```

```json
{
  "id": "2ea62c54-fc90-44bf-aeb0-f802dd6a5d1f",
  "order_id": "038911dc-7e5c-4dbf-bbf3-975f2072092f",
  "assignment_id": "9ae65f8c-097d-48b2-beb4-a502aa8d443f",
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
  "arrived_at": "2026-10-30T16:34:15.184009Z",
  "started_at": "2026-10-30T16:34:15.487071Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2ea62c54-fc90-44bf-aeb0-f802dd6a5d1f/complete` → **200**

```json
{
  "command_id": "bdc5c6f9-1431-42c5-9fa2-359d0443709f",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:34:15Z",
  "cash_received": false
}
```

```json
{
  "id": "2ea62c54-fc90-44bf-aeb0-f802dd6a5d1f",
  "order_id": "038911dc-7e5c-4dbf-bbf3-975f2072092f",
  "assignment_id": "9ae65f8c-097d-48b2-beb4-a502aa8d443f",
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
  "arrived_at": "2026-10-30T16:34:15.184009Z",
  "started_at": "2026-10-30T16:34:15.487071Z",
  "completed_at": "2026-10-30T16:34:15.789317Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Finance sees the dispute, with its deadline

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
  "session_id": "77e161f1-4baf-4398-a23b-21873f6df56c",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzg5NTYsImlhdCI6MTc5MzM3ODA1NiwianRpIjoiOTRiMjVlNjgtODJkMy00YWM1LTg4MDMtMGI3ZGJjOGViNmFkIiwic2lkIjoiNzdlMTYxZjEtNGJhZi00Mzk4LWEyM2ItMjE4NzNmNmRmNTZjIn0.qNOn0x6rbgUYxzmngLo7F6FYQpUm9Y1ywFLeFZi3bu8",
  "access_expires_at": "2026-10-30T16:49:16.425868406Z",
  "refresh_token": "-Sb3kiQykz4fLKC1eX1jpiVDb_mJONC1QyXcKO0AzlY",
  "refresh_expires_at": "2026-10-31T04:34:16.425105471Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/038911dc-7e5c-4dbf-bbf3-975f2072092f/cash-dispute` → **200**

```json
{
  "order_id": "038911dc-7e5c-4dbf-bbf3-975f2072092f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "32bed55e-c55a-49f1-8b6a-fe8cade1771e",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T16:34:15.901176Z",
  "decide_by": "2026-11-13T16:34:15.901176Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T16:34:15.901176Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "038911dc-7e5c-4dbf-bbf3-975f2072092f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "32bed55e-c55a-49f1-8b6a-fe8cade1771e",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T16:34:15.901176Z",
      "decide_by": "2026-11-13T16:34:15.901176Z",
      "decision": null,
      "decided_by": null,
      "reason": null,
      "decided_at": null,
      "version": 1
    }
  ]
}
```

## Finance decides: the rider did not pay, the service pays the driver

`POST /api/admin/v1/orders/038911dc-7e5c-4dbf-bbf3-975f2072092f/cash-dispute/decide` → **400**

```json
{
  "command_id": "07486f62-b2eb-4089-b100-2b147c3cf3e1",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/038911dc-7e5c-4dbf-bbf3-975f2072092f/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ede5547b-490c-4a02-b62f-b132dd298f9d",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/038911dc-7e5c-4dbf-bbf3-975f2072092f/cash-dispute/decide` → **200**

```json
{
  "command_id": "59527496-552d-47e1-97e1-e7878e8156de",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "038911dc-7e5c-4dbf-bbf3-975f2072092f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "32bed55e-c55a-49f1-8b6a-fe8cade1771e",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T16:34:15.901176Z",
  "decide_by": "2026-11-13T16:34:15.901176Z",
  "decision": "PAY_DRIVER",
  "decided_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T16:34:17.682827Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/038911dc-7e5c-4dbf-bbf3-975f2072092f/cash-dispute/decide` → **409**

```json
{
  "command_id": "dc3075e3-c65f-4254-8e9f-2a4d746e3966",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/038911dc-7e5c-4dbf-bbf3-975f2072092f/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2f7b15f0-d6b8-46ff-97ec-57d48a047af8"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ac1f7433-273f-4f7b-9124-444084252354",
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
  "last_heartbeat_at": "2026-10-30T16:34:14.894604Z",
  "last_location_at": "2026-10-30T16:34:14.894604Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ac1f7433-273f-4f7b-9124-444084252354/close` → **200**

```json
{
  "command_id": "42fecde7-52a4-4320-a26a-0decf5caf30b",
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

# Scenario: chargeback

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739142085",
  "device_ref": "sandbox-8954"
}
```

```json
{
  "challenge_id": "3b50e280-93c5-4d11-8370-8b01dcbc26ac",
  "expires_at": "2026-10-30T16:39:18.85786717Z",
  "resend_available_at": "2026-10-30T16:34:19.85786717Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739142085` → **200**

```json
{
  "phone": "+380739142085",
  "audience": "CLIENT",
  "code": "125366",
  "sent_at": "2026-10-30T16:34:18.860643782Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b50e280-93c5-4d11-8370-8b01dcbc26ac",
  "code": "125366",
  "device_ref": "sandbox-8954"
}
```

```json
{
  "session_id": "1239328c-d76c-4e95-a742-e4fc15b4fb31",
  "subject": {
    "type": "CLIENT",
    "id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYTZiNmZhNC05ZWQ1LTQxNTUtOTZlNi1lZWVlNDU5MmMxMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc4OTU5LCJpYXQiOjE3OTMzNzgwNTksImp0aSI6IjhlYTc2ODNmLWJkZTMtNDMwOS1iMmM1LWY0OTBkNmEyZmFiOSIsInNpZCI6IjEyMzkzMjhjLWQ3NmMtNGU5NS1hNzQyLWU0ZmMxNWI0ZmIzMSJ9.sXjQ76QqaBCzhW-n33jGQjNB2IaFoRc1qe_jdEYd5Is",
  "access_expires_at": "2026-10-30T16:49:19.177207918Z",
  "refresh_token": "7hrt785Doq4hxFAJYbRftV8dSMYgR5ZSjmSW0KC7sFY",
  "refresh_expires_at": "2026-11-29T16:34:19.176678362Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b085f2cf-5712-46aa-8691-7d6fd8fd83c9",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c54ab906-be3c-4881-b89f-27132a465732",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c54ab906-be3c-4881-b89f-27132a465732",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "692ed565bfe31779cd16c03ffc373ca0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c54ab906-be3c-4881-b89f-27132a465732",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739142085"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c54ab906-be3c-4881-b89f-27132a465732",
  "expires_at": "2026-10-30T17:04:19.462453Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/c54ab906-be3c-4881-b89f-27132a465732` → **200**

```json
{
  "id": "c54ab906-be3c-4881-b89f-27132a465732",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T17:04:19.462453Z",
  "card": {
    "id": "3d945fe1-2d32-4c5e-9dc7-0a438a695277",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0537",
    "card_type": "Visa",
    "created_at": "2026-10-30T16:34:19.749755Z"
  },
  "failure_reason": null
}
```

## Andrii is online nearby

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16603"
}
```

```json
{
  "challenge_id": "b61da2e0-2b61-4476-b20b-46741974dbb8",
  "expires_at": "2026-10-30T16:39:20.053414655Z",
  "resend_available_at": "2026-10-30T16:34:21.053414655Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "097838",
  "sent_at": "2026-10-30T16:34:20.056133621Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b61da2e0-2b61-4476-b20b-46741974dbb8",
  "code": "097838",
  "device_ref": "sandbox-16603"
}
```

```json
{
  "session_id": "607fa23f-af26-461f-b373-aab27be463aa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3ODk2MCwiaWF0IjoxNzkzMzc4MDYwLCJqdGkiOiIxZmMwYjZlNC04ZjJhLTRmOTItYTY2OC04ZGM5OGIzMTk2OTciLCJzaWQiOiI2MDdmYTIzZi1hZjI2LTQ2MWYtYjM3My1hYWIyN2JlNDYzYWEifQ.1TTkZfcdRh5kPoBOuMNb-8amaWEXJUzFFpobsUZ2GgU",
  "access_expires_at": "2026-10-30T16:49:20.379340094Z",
  "refresh_token": "NhwsjFmFMrw7DcEkeItKthYAdGiL_0f69RAU2V_0MJ8",
  "refresh_expires_at": "2026-11-29T16:34:20.378829354Z",
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
  "command_id": "16874371-bb1d-4ab5-ad65-9a81e7d1a926",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:34:20Z",
    "sequence": 1793378060962
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ea072ded-21bf-4a16-9003-76e4cab44fbd",
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
  "last_heartbeat_at": "2026-10-30T16:34:20.981084Z",
  "last_location_at": "2026-10-30T16:34:20.981084Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "07208747-bc06-4489-a938-5f442b977825",
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
  "id": "9292ea0c-3166-4b09-ba9f-9d5a03f2d01e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:39:21.281975Z",
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

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "93c29183-2075-4b84-954c-c205e67c40b7",
  "quote_id": "9292ea0c-3166-4b09-ba9f-9d5a03f2d01e",
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
  "id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119",
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
  "created_at": "2026-10-30T16:34:21.594088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6` → **200**

```json
{
  "id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "short_number": 11,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119",
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
  "created_at": "2026-10-30T16:34:21.594088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6` → **200**

```json
{
  "id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119",
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
  "created_at": "2026-10-30T16:34:21.594088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7eb7531c-df2d-44b2-995b-eb9f4c1b27a1",
    "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
    "expires_at": "2026-10-30T16:34:36.940304Z",
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

`POST /api/driver/v1/offers/7eb7531c-df2d-44b2-995b-eb9f4c1b27a1/accept` → **200**

```json
{
  "command_id": "26ded615-d139-4eab-b209-f3638e603159"
}
```

```json
{
  "id": "54503e1a-ee00-4cdf-830b-fd500fa4f843",
  "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2a08fe56-39d1-4698-8c6a-928a18d004bd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2a08fe56-39d1-4698-8c6a-928a18d004bd",
  "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "assignment_id": "54503e1a-ee00-4cdf-830b-fd500fa4f843",
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

`POST /api/rider/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/messages` → **201**

```json
{
  "command_id": "cedfbe0b-3fe6-41c3-af1c-1541184726d0",
  "body": "Я біля входу, мій номер +380739142085, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "724db039-3ba4-49ba-9e7e-d3f45753ca33",
  "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380739142085, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T16:34:24.382868118Z"
}
```

`POST /api/driver/v1/trips/2a08fe56-39d1-4698-8c6a-928a18d004bd/messages` → **201**

```json
{
  "command_id": "a208b43f-02d4-4cf2-836b-a5cc0e730d56",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "7c1604a8-d479-4130-bf5b-11a29188304b",
  "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T16:34:24.674212574Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/ea072ded-21bf-4a16-9003-76e4cab44fbd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:34:29Z",
    "sequence": 1793378069980
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ea072ded-21bf-4a16-9003-76e4cab44fbd",
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
  "last_heartbeat_at": "2026-10-30T16:34:30.000173Z",
  "last_location_at": "2026-10-30T16:34:30.000173Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2a08fe56-39d1-4698-8c6a-928a18d004bd/arrive` → **200**

```json
{
  "command_id": "2adca2b2-c068-4b8f-9a0a-020d6ed5682d",
  "expected_version": 0
}
```

```json
{
  "id": "2a08fe56-39d1-4698-8c6a-928a18d004bd",
  "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "assignment_id": "54503e1a-ee00-4cdf-830b-fd500fa4f843",
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
  "arrived_at": "2026-10-30T16:34:30.29134Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2a08fe56-39d1-4698-8c6a-928a18d004bd/start` → **200**

```json
{
  "command_id": "1dcbf5e7-4b57-44f6-b5a2-d601733ea3c1",
  "expected_version": 1
}
```

```json
{
  "id": "2a08fe56-39d1-4698-8c6a-928a18d004bd",
  "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "assignment_id": "54503e1a-ee00-4cdf-830b-fd500fa4f843",
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
  "arrived_at": "2026-10-30T16:34:30.29134Z",
  "started_at": "2026-10-30T16:34:30.591578Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/ea072ded-21bf-4a16-9003-76e4cab44fbd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:36:00Z",
    "sequence": 1793378160908
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ea072ded-21bf-4a16-9003-76e4cab44fbd",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-30T16:36:00.928594Z",
  "last_location_at": "2026-10-30T16:36:00.928594Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2a08fe56-39d1-4698-8c6a-928a18d004bd/complete` → **200**

```json
{
  "command_id": "996e6ac5-cc96-4317-b70f-d09ee1edd393",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:36:01Z",
  "cash_received": false
}
```

```json
{
  "id": "2a08fe56-39d1-4698-8c6a-928a18d004bd",
  "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "assignment_id": "54503e1a-ee00-4cdf-830b-fd500fa4f843",
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
  "arrived_at": "2026-10-30T16:34:30.29134Z",
  "started_at": "2026-10-30T16:34:30.591578Z",
  "completed_at": "2026-10-30T16:36:01.231464Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6` → **200**

```json
{
  "id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119",
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
    "id": "54503e1a-ee00-4cdf-830b-fd500fa4f843",
    "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2a08fe56-39d1-4698-8c6a-928a18d004bd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:34:21.594088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6` → **200**

```json
{
  "id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119",
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
    "id": "54503e1a-ee00-4cdf-830b-fd500fa4f843",
    "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2a08fe56-39d1-4698-8c6a-928a18d004bd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:34:21.594088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6` → **200**

```json
{
  "id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "short_number": 11,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119",
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
    "id": "54503e1a-ee00-4cdf-830b-fd500fa4f843",
    "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2a08fe56-39d1-4698-8c6a-928a18d004bd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:34:21.594088Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ea072ded-21bf-4a16-9003-76e4cab44fbd",
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
  "last_heartbeat_at": "2026-10-30T16:36:00.928594Z",
  "last_location_at": "2026-10-30T16:36:00.928594Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ea072ded-21bf-4a16-9003-76e4cab44fbd/close` → **200**

```json
{
  "command_id": "07f572ee-0d5a-4276-8653-932b15f618c2",
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

## The bank disputes the payment: finance exports the evidence

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
  "session_id": "bb6791c0-7a68-4d3d-a513-e7fdc98d8ab6",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkwNjUsImlhdCI6MTc5MzM3ODE2NSwianRpIjoiMGNjYWY1ZGEtMmYyYi00OWUwLTkzNjktYjk2ZWZiOWMxMWY5Iiwic2lkIjoiYmI2NzkxYzAtN2E2OC00ZDNkLWE1MTMtZTdmZGM5OGQ4YWI2In0.HAktoU5KiWipw6w0skkdkzHEKNxd_KZ2OapF7tmvYyY",
  "access_expires_at": "2026-10-30T16:51:05.277912909Z",
  "refresh_token": "cZjvxXtPSTMyNXOIfm-p4A11XbdMQon19_LESVRxn08",
  "refresh_expires_at": "2026-10-31T04:36:05.277326075Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "72b788c4-d0d8-4eec-ae4c-9458d7cf403c"
}
```

`GET /api/admin/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T16:36:05.845876091Z",
  "order": {
    "id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
    "short_number": 11,
    "status": "FULFILLED",
    "payment_method": "CARD",
    "payment_state": "PAID",
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "quoted_price_minor": 16297,
    "final_price_minor": 16297,
    "currency": "UAH",
    "wallet_minor": 0,
    "discount_minor": 0,
    "fare": {
      "amount_minor": 16297,
      "currency": "UAH",
      "policy": "M1_AGREED_PLUS_WAITING",
      "agreed_minor": 16297,
      "waiting_seconds": 0,
      "free_waiting_seconds": 180,
      "charged_waiting_seconds": 0,
      "waiting_minor": 0
    },
    "created_at": "2026-10-30T16:34:21.594088Z",
    "assigned_at": "2026-10-30T16:34:23.802317Z",
    "arrived_at": "2026-10-30T16:34:30.29134Z",
    "started_at": "2026-10-30T16:34:30.591578Z",
    "completed_at": "2026-10-30T16:36:01.231464Z"
  },
  "driver": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "vehicle": {
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "registration_number": "AA0003TX"
    }
  },
  "track": {
    "points": 0,
    "flagged_points": 0,
    "first_point_at": null,
    "last_point_at": null,
    "duration_seconds": 0,
    "length_meters": 0
  },
  "rider": {
    "id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119",
    "registered_at": "2026-10-30T16:34:19.174971Z",
    "trips_last_year": [
      {
        "currency": "UAH",
        "trips": 1,
        "total_minor": 16297
      }
    ]
  },
  "card_operations": [
    {
      "type": "AUTH",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "WaitingAuthComplete",
      "created_at": "2026-10-30T16:34:21.596205Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T16:36:02.16343Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/chargebacks` → **422**

```json
{
  "command_id": "d7aab981-667d-4fb3-8a29-6ddca62c17f2",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "116074df-6c90-4ff3-97df-fbc82599d259"
}
```

`POST /api/admin/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/chargebacks` → **201**

```json
{
  "command_id": "21c76e5e-7261-4995-90a0-0f665da48e69",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "c4818305-d509-49ab-a0cf-031c8c722b36",
  "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T16:36:06.50016Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/chargebacks` → **201**

```json
{
  "command_id": "21c76e5e-7261-4995-90a0-0f665da48e69",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "c4818305-d509-49ab-a0cf-031c8c722b36",
  "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T16:36:06.50016Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/0a6b6fa4-9ed5-4155-96e6-eeee4592c119` → **200**

```json
{
  "client": {
    "id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119",
    "phone": "+380739142085",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T16:34:19.174971Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T16:34:21.594088Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
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
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`GET /api/admin/v1/clients/0a6b6fa4-9ed5-4155-96e6-eeee4592c119` → **200**

```json
{
  "client": {
    "id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119",
    "phone": "+380739142085",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T16:34:19.174971Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T16:34:21.594088Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
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
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [
    {
      "currency": "UAH",
      "amount_minor": 16297
    }
  ],
  "cases": []
}
```

## The provider's risk managers win it back: the debt is gone; a second answer is refused

`POST /api/admin/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/chargebacks/c4818305-d509-49ab-a0cf-031c8c722b36/resolve` → **200**

```json
{
  "command_id": "89dca617-d72e-4867-80ae-c15bad14d151",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "c4818305-d509-49ab-a0cf-031c8c722b36",
  "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T16:36:06.50016Z",
  "resolved_at": "2026-10-30T16:36:08.762593Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/0a6b6fa4-9ed5-4155-96e6-eeee4592c119` → **200**

```json
{
  "client": {
    "id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119",
    "phone": "+380739142085",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T16:34:19.174971Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T16:34:21.594088Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
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
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [
    {
      "currency": "UAH",
      "amount_minor": 16297
    }
  ],
  "cases": []
}
```

`GET /api/admin/v1/clients/0a6b6fa4-9ed5-4155-96e6-eeee4592c119` → **200**

```json
{
  "client": {
    "id": "0a6b6fa4-9ed5-4155-96e6-eeee4592c119",
    "phone": "+380739142085",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T16:34:19.174971Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
      "short_number": 11,
      "status": "FULFILLED",
      "created_at": "2026-10-30T16:34:21.594088Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
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
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`POST /api/admin/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/chargebacks/c4818305-d509-49ab-a0cf-031c8c722b36/resolve` → **409**

```json
{
  "command_id": "27c7adc9-5a75-4c51-8f78-15986303b948",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/chargebacks/c4818305-d509-49ab-a0cf-031c8c722b36/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5e409441-c7af-4d05-bca7-8f7f5105c418"
}
```

`GET /api/admin/v1/orders/64f8be61-b6a2-42ed-84e7-711a0ee942e6/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "c4818305-d509-49ab-a0cf-031c8c722b36",
      "order_id": "64f8be61-b6a2-42ed-84e7-711a0ee942e6",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T16:36:06.50016Z",
      "resolved_at": "2026-10-30T16:36:08.762593Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 64f8be61-b6a2-42ed-84e7-711a0ee942e6 without phone or card digits; chargeback c4818305-d509-49ab-a0cf-031c8c722b36 recorded and won.

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
  "session_id": "89a62785-9949-4b8e-9412-237c9d5b9baa",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkwNzEsImlhdCI6MTc5MzM3ODE3MSwianRpIjoiODJmOGY0ZWYtNzAxMS00YjI1LTk0ZWItYTJmOWI0ZjY2ZDNiIiwic2lkIjoiODlhNjI3ODUtOTk0OS00YjhlLTk0MTItMjM3YzlkNWI5YmFhIn0.4rB5vjCsrG-H2hCna2EVM5wUF79i_pzd8n9I4vSluB0",
  "access_expires_at": "2026-10-30T16:51:11.841354156Z",
  "refresh_token": "8cszVf3F2eKrTTE-AqVxzGNDNFyXptQ9VYhodRZt2K0",
  "refresh_expires_at": "2026-10-31T04:36:11.840804221Z",
  "password_change_required": false
}
```

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 2,
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
  ],
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "rider_ios": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "driver_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
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
  "return_zone_meters": 0,
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
  "phone": "+48600385306",
  "device_ref": "sandbox-91"
}
```

```json
{
  "challenge_id": "18abe8e6-4bd7-4057-a382-278d59fb0c18",
  "expires_at": "2026-10-30T16:41:12.698542087Z",
  "resend_available_at": "2026-10-30T16:36:13.698542087Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600385306` → **200**

```json
{
  "phone": "+48600385306",
  "audience": "CLIENT",
  "code": "810218",
  "sent_at": "2026-10-30T16:36:12.701289382Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18abe8e6-4bd7-4057-a382-278d59fb0c18",
  "code": "810218",
  "device_ref": "sandbox-91"
}
```

```json
{
  "session_id": "df5d9e89-1cdf-48c1-a9eb-a37f5284505e",
  "subject": {
    "type": "CLIENT",
    "id": "ee21b9a2-d632-425b-9467-7bab9cc533dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZTIxYjlhMi1kNjMyLTQyNWItOTQ2Ny03YmFiOWNjNTMzZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MDczLCJpYXQiOjE3OTMzNzgxNzMsImp0aSI6IjE0OTBmODI0LWQ0ODMtNGJjNC04OTE4LTI2ZTZlNGFlOWEyYyIsInNpZCI6ImRmNWQ5ZTg5LTFjZGYtNDhjMS1hOWViLWEzN2Y1Mjg0NTA1ZSJ9.ijrfP9ytlsvBNLE9Cex4saALvCUxBbz-AnaJiwo2xHc",
  "access_expires_at": "2026-10-30T16:51:13.006662832Z",
  "refresh_token": "9WK3pRlWGOlnlE8_8oLupcQpqyAJNLSCxz-ako4T75I",
  "refresh_expires_at": "2026-11-29T16:36:13.006022143Z",
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
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **400**

```json
{
  "command_id": "3c9e7979-9fcf-4cfa-9d49-6a5562a0cab7",
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
  "correlation_id": "d39b9b5e-835d-43a2-8adf-08c33af800b4",
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
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **200**

```json
{
  "command_id": "2faf99b3-4476-4603-a784-b7b7ca9ce8b5",
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
  "return_zone_meters": 0,
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-30T16:36:14.154952026Z",
  "version": 1
}
```

## The apps see the pause, and the rider's order is refused

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 2,
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
  ],
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "rider_ios": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "driver_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3c6a510d-7a1a-47f6-9184-cc4fe212fdb9",
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
  "id": "ad0910d5-701a-4b9d-b710-b40c92a4cb21",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:41:14.759235Z",
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
  "command_id": "07fcd6ec-74d4-4229-a32a-3d7da6d991f9",
  "quote_id": "ad0910d5-701a-4b9d-b710-b40c92a4cb21",
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
  "correlation_id": "7856ab48-2217-4594-8439-a2625fb79c32"
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
  "return_zone_meters": 0,
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-30T16:36:14.154952Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "1017848f-a6f0-4b4d-aa5c-4f24a50ac87f",
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
  "return_zone_meters": 0,
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
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 2
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "64f4b468-e1e4-48fb-bd06-3a658bc869fd",
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
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f38cb635-0c9e-4b6e-84cf-042dd6e282ba",
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
  "id": "fa496d50-3240-4958-a233-a9eb857f1829",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:41:16.566102Z",
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
  "command_id": "5db1a07f-cb69-484c-9694-1c64346692f9",
  "quote_id": "fa496d50-3240-4958-a233-a9eb857f1829",
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
  "correlation_id": "37db2a27-1053-4081-a125-fef61bef6d69"
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
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "64421686-28a0-41ce-984c-c9ee282100f4",
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
      "from": "19:00",
      "to": "20:00"
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
      "from": "19:00",
      "to": "20:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "da4009b6-0ce7-40dc-9528-9488a66e352b",
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
  "id": "e6bb0560-2127-4806-a749-824ebc6abd07",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:41:17.822942Z",
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
  "command_id": "841dc3a8-e69b-4e29-a82e-4e1feadfae70",
  "quote_id": "e6bb0560-2127-4806-a749-824ebc6abd07",
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
  "correlation_id": "4106c95b-3a41-463f-a0b2-bfbc3e25abc3"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "2bbedecf-ba3d-4fd3-9550-91ce725f6b1f",
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
  "correlation_id": "1a913d91-36df-4129-8b9c-fcf932ab0e95",
  "current_version": 4
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
      "from": "19:00",
      "to": "20:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "e6bcf28e-3513-49b1-af5d-4536d7da4015",
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
  "return_zone_meters": 0,
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
  "phone": "+380670970242",
  "device_ref": "sandbox-15834"
}
```

```json
{
  "challenge_id": "ee252762-085d-4847-aea1-db54441270e2",
  "expires_at": "2026-10-30T16:41:19.335816351Z",
  "resend_available_at": "2026-10-30T16:36:20.335816351Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670970242` → **200**

```json
{
  "phone": "+380670970242",
  "audience": "CLIENT",
  "code": "467511",
  "sent_at": "2026-10-30T16:36:19.338348481Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee252762-085d-4847-aea1-db54441270e2",
  "code": "467511",
  "device_ref": "sandbox-15834"
}
```

```json
{
  "session_id": "ebad84fb-b879-4e18-a9ff-5cf7861a1de2",
  "subject": {
    "type": "CLIENT",
    "id": "e6c01694-0965-4c0a-8cd0-477987d84968"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmMwMTY5NC0wOTY1LTRjMGEtOGNkMC00Nzc5ODdkODQ5NjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MDc5LCJpYXQiOjE3OTMzNzgxNzksImp0aSI6IjNiOTA0OGE5LTQzMGYtNGY5ZS1iNDZiLTY2NTI4NzJhNGRmNSIsInNpZCI6ImViYWQ4NGZiLWI4NzktNGUxOC1hOWZmLTVjZjc4NjFhMWRlMiJ9.cRFNPn0YNe0JZjsEsEyPpJfsMnrNKbdnOoUemJl4Yes",
  "access_expires_at": "2026-10-30T16:51:19.652799289Z",
  "refresh_token": "F9-HB2A5k-4qAc8PBUc-lezy2i3DVpDIhqwYReQiWHo",
  "refresh_expires_at": "2026-11-29T16:36:19.652234992Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e6c01694-0965-4c0a-8cd0-477987d84968",
  "session_id": "ebad84fb-b879-4e18-a9ff-5cf7861a1de2",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "880fa049-edda-469d-8b46-9d0f7ed5f78c",
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
  "id": "322b45b2-02a8-45ab-83ba-ae3313ca0431",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:41:20.208274Z",
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
  "challenge_id": "221d3628-1f15-4918-9cc5-73b398c3a44d",
  "expires_at": "2026-10-30T16:41:22.499153717Z",
  "resend_available_at": "2026-10-30T16:36:23.499153717Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670970242` → **200**

```json
{
  "phone": "+380670970242",
  "audience": "CLIENT",
  "code": "189938",
  "sent_at": "2026-10-30T16:36:22.501535699Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "fddc167a-12d5-4017-b934-167ad8c93784",
  "challenge_id": "221d3628-1f15-4918-9cc5-73b398c3a44d",
  "otp_code": "189938"
}
```

```json
{
  "client_id": "e6c01694-0965-4c0a-8cd0-477987d84968",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T16:36:22.817255322Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "670e425e-ee82-4224-b641-2960deda26f0",
  "quote_id": "322b45b2-02a8-45ab-83ba-ae3313ca0431",
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
  "correlation_id": "343f6b43-5fbc-45e5-a15f-7dec4f85833d"
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
  "session_id": "b6b1baf8-cd93-4e50-80d2-1a7242bf1f31",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkwODMsImlhdCI6MTc5MzM3ODE4MywianRpIjoiNjQ1ODNjN2UtZjNmMi00MDMwLTkzMDUtMjVmOGI1MWY2NGZkIiwic2lkIjoiYjZiMWJhZjgtY2Q5My00ZTUwLTgwZDItMWE3MjQyYmYxZjMxIn0._HawwT3CSSP06O_v-BkGkLXim5Y_2m7DOtLGNbZqRKE",
  "access_expires_at": "2026-10-30T16:51:23.716596684Z",
  "refresh_token": "WWgZg1xf12gYvN4qp01CGevkVK7Ddme1Ym1K5NogKwA",
  "refresh_expires_at": "2026-10-31T04:36:23.715975496Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "e6c01694-0965-4c0a-8cd0-477987d84968",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T16:36:22.817255Z",
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

`POST /api/admin/v1/client-deletions/e6c01694-0965-4c0a-8cd0-477987d84968/complete` → **200**

```json
{
  "command_id": "e93cfd48-0f72-43c7-a16b-8c945cc3d7a1",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "e6c01694-0965-4c0a-8cd0-477987d84968",
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
  "correlation_id": "ea12878f-1653-455f-924a-eaac41121052"
}
```

Done: client e6c01694-0965-4c0a-8cd0-477987d84968 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669210072",
  "device_ref": "sandbox-12305"
}
```

```json
{
  "challenge_id": "9c91808d-a19b-442f-989f-6a3a33c80d29",
  "expires_at": "2026-10-30T16:41:24.886498151Z",
  "resend_available_at": "2026-10-30T16:36:25.886498151Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669210072` → **200**

```json
{
  "phone": "+380669210072",
  "audience": "CLIENT",
  "code": "994068",
  "sent_at": "2026-10-30T16:36:24.889710647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c91808d-a19b-442f-989f-6a3a33c80d29",
  "code": "994068",
  "device_ref": "sandbox-12305"
}
```

```json
{
  "session_id": "a7d6b1df-808d-452c-a914-4d68b4845a76",
  "subject": {
    "type": "CLIENT",
    "id": "8874041e-bf19-499b-b668-8c878c6c5a32"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODc0MDQxZS1iZjE5LTQ5OWItYjY2OC04Yzg3OGM2YzVhMzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MDg1LCJpYXQiOjE3OTMzNzgxODUsImp0aSI6IjRmNjdkY2RmLWUyZjQtNDQ2MC05MjQ4LTY4YzZhYTYwNzJiNCIsInNpZCI6ImE3ZDZiMWRmLTgwOGQtNDUyYy1hOTE0LTRkNjhiNDg0NWE3NiJ9.mi-6wzi9_PKeH2i9asd8RrECDV_97jVcbf_7nlHgoBg",
  "access_expires_at": "2026-10-30T16:51:25.196767531Z",
  "refresh_token": "pm6c__OxYBQYpN7rTx3XGHUUalMi9bwcdKiNE5jkoAg",
  "refresh_expires_at": "2026-11-29T16:36:25.196175186Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8874041e-bf19-499b-b668-8c878c6c5a32",
  "session_id": "a7d6b1df-808d-452c-a914-4d68b4845a76",
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
  "session_id": "e49a8fbd-148c-41a8-98f2-304456097e35",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkwODYsImlhdCI6MTc5MzM3ODE4NiwianRpIjoiZjNlNzE2NTEtZjUyZC00MWZhLTljM2EtMDk3NDllYTdjZDQ2Iiwic2lkIjoiZTQ5YThmYmQtMTQ4Yy00MWE4LTk4ZjItMzA0NDU2MDk3ZTM1In0.QVprmrojuPROvbDx9RkjWOBtdH1SNSLBxzAnCBV85FE",
  "access_expires_at": "2026-10-30T16:51:26.065325733Z",
  "refresh_token": "RKcViRVfsHRKD2hqaoLTEvxbZhfHMrtnDBlBNwi82bk",
  "refresh_expires_at": "2026-10-31T04:36:26.064719696Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9210072&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "8874041e-bf19-499b-b668-8c878c6c5a32",
      "phone": "+380669210072",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T16:36:25.194584Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/8874041e-bf19-499b-b668-8c878c6c5a32` → **200**

```json
{
  "client": {
    "id": "8874041e-bf19-499b-b668-8c878c6c5a32",
    "phone": "+380669210072",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T16:36:25.194584Z",
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

`POST /api/admin/v1/clients/8874041e-bf19-499b-b668-8c878c6c5a32/block` → **400**

```json
{
  "command_id": "b714527f-7043-4490-95d8-578593189465",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/8874041e-bf19-499b-b668-8c878c6c5a32/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b2f8cee3-8cfe-4142-89be-c9acdffd7f0f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/8874041e-bf19-499b-b668-8c878c6c5a32/block` → **200**

```json
{
  "command_id": "ecc91c4b-0da7-4fef-a39f-4e9764ab6a77",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "8874041e-bf19-499b-b668-8c878c6c5a32",
  "phone": "+380669210072",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T16:36:25.194584Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T16:36:27.263776Z",
    "by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
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
  "correlation_id": "aa6d59e1-73cb-45a0-99fa-58292a735732"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669210072",
  "device_ref": "sandbox-12753"
}
```

```json
{
  "challenge_id": "489630fa-1dab-4be5-a979-4d763621ebc9",
  "expires_at": "2026-10-30T16:41:29.840528656Z",
  "resend_available_at": "2026-10-30T16:36:30.840528656Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669210072` → **200**

```json
{
  "phone": "+380669210072",
  "audience": "CLIENT",
  "code": "686227",
  "sent_at": "2026-10-30T16:36:29.842984904Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "489630fa-1dab-4be5-a979-4d763621ebc9",
  "code": "686227",
  "device_ref": "sandbox-12753"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "9ad328bb-4b48-42a4-9488-17145b254bba"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/8874041e-bf19-499b-b668-8c878c6c5a32` → **200**

```json
{
  "client": {
    "id": "8874041e-bf19-499b-b668-8c878c6c5a32",
    "phone": "+380669210072",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T16:36:25.194584Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T16:36:27.263776Z",
      "by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
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

`POST /api/admin/v1/clients/8874041e-bf19-499b-b668-8c878c6c5a32/unblock` → **200**

```json
{
  "command_id": "14b37b01-6ae3-4d87-9218-acfe63c51ef0",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "8874041e-bf19-499b-b668-8c878c6c5a32",
  "phone": "+380669210072",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T16:36:25.194584Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669210072",
  "device_ref": "sandbox-26744"
}
```

```json
{
  "challenge_id": "8a3ec518-8f29-4b1e-98a3-85bf07f8370c",
  "expires_at": "2026-10-30T16:41:33.054080774Z",
  "resend_available_at": "2026-10-30T16:36:34.054080774Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669210072` → **200**

```json
{
  "phone": "+380669210072",
  "audience": "CLIENT",
  "code": "292821",
  "sent_at": "2026-10-30T16:36:33.064363606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a3ec518-8f29-4b1e-98a3-85bf07f8370c",
  "code": "292821",
  "device_ref": "sandbox-26744"
}
```

```json
{
  "session_id": "d04f8c3b-7cb2-432c-bf94-bfb5a98d4740",
  "subject": {
    "type": "CLIENT",
    "id": "8874041e-bf19-499b-b668-8c878c6c5a32"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODc0MDQxZS1iZjE5LTQ5OWItYjY2OC04Yzg3OGM2YzVhMzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MDkzLCJpYXQiOjE3OTMzNzgxOTMsImp0aSI6ImJlZWZlYjU4LTQxZGYtNDU5OS04OTY4LTI5MTMyZTcxOWY5OSIsInNpZCI6ImQwNGY4YzNiLTdjYjItNDMyYy1iZjk0LWJmYjVhOThkNDc0MCJ9.h7P1fRb4AGHwuEuOkhgT7GrID9kq53lS0BuL8hSoZkE",
  "access_expires_at": "2026-10-30T16:51:33.376786977Z",
  "refresh_token": "Y7ISlofV_QAi3xb-lIUT0SM4pSGMxaN5zb244zC3oz8",
  "refresh_expires_at": "2026-11-29T16:36:33.376242414Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8874041e-bf19-499b-b668-8c878c6c5a32",
  "session_id": "d04f8c3b-7cb2-432c-bf94-bfb5a98d4740",
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
  "phone": "+380664374982",
  "device_ref": "sandbox-10511"
}
```

```json
{
  "challenge_id": "284bf81a-3ac3-408e-ba95-c1a9086e2461",
  "expires_at": "2026-10-30T16:41:33.973282532Z",
  "resend_available_at": "2026-10-30T16:36:34.973282532Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664374982` → **200**

```json
{
  "phone": "+380664374982",
  "audience": "CLIENT",
  "code": "060112",
  "sent_at": "2026-10-30T16:36:33.976124371Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "284bf81a-3ac3-408e-ba95-c1a9086e2461",
  "code": "060112",
  "device_ref": "sandbox-10511"
}
```

```json
{
  "session_id": "2403c721-0556-4358-8232-498a2c93a189",
  "subject": {
    "type": "CLIENT",
    "id": "ed5916c6-49cf-4f62-b3fe-55b37e6be39a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZDU5MTZjNi00OWNmLTRmNjItYjNmZS01NWIzN2U2YmUzOWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MDk0LCJpYXQiOjE3OTMzNzgxOTQsImp0aSI6IjgzM2I2ZGUzLTE2N2ItNDRhYi04MmQ5LTdjYWVmMzhkNTAzMSIsInNpZCI6IjI0MDNjNzIxLTA1NTYtNDM1OC04MjMyLTQ5OGEyYzkzYTE4OSJ9.hXbwqlcKRpGzDRd1e_wUJddTg1QhWwIv_LaCzaz6LgU",
  "access_expires_at": "2026-10-30T16:51:34.284770799Z",
  "refresh_token": "q28CUyE8KteWF3vErljX3YiEfxS56FQ4URfjz75vpbU",
  "refresh_expires_at": "2026-11-29T16:36:34.284087483Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f8aae592-f37f-4271-ad8d-45dabd9a0f39",
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
  "id": "9a5b80d4-893b-4747-ae26-4261f94addf5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:41:34.577511Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: a9b18fa3-18d5-443b-8c0e-520a1c025ce5) → **201**

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
  "session_id": "a3c78b9d-7994-4f5d-97eb-e0b056dbe167",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkwOTUsImlhdCI6MTc5MzM3ODE5NSwianRpIjoiOTYyYmUzNjAtZWViOC00NWM1LTk3M2EtOWIxOTVhYjdiZjg5Iiwic2lkIjoiYTNjNzhiOWQtNzk5NC00ZjVkLTk3ZWItZTBiMDU2ZGJlMTY3In0.zWYFcEfoPWBwvBaV0iWxJA_uKMT8EWe1CEqJev5uYV8",
  "access_expires_at": "2026-10-30T16:51:35.233944589Z",
  "refresh_token": "FBD_1qkrS63pxH0vFq2QZn4VjuNqv8XVAXiGYIaiuag",
  "refresh_expires_at": "2026-10-31T04:36:35.233384395Z",
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
  "session_id": "e5d1f1aa-2d64-45c9-a6a0-12547c616844",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkwOTUsImlhdCI6MTc5MzM3ODE5NSwianRpIjoiNTIzODQxNDgtMTE2MC00OTgwLTg5YzUtNzJmNDIxNTE1MjIxIiwic2lkIjoiZTVkMWYxYWEtMmQ2NC00NWM5LWE2YTAtMTI1NDdjNjE2ODQ0In0.0LJ54WK0gDv6WTTuvdxGm3o6apReFoMxbVfymctV6Vo",
  "access_expires_at": "2026-10-30T16:51:35.809427082Z",
  "refresh_token": "V2LPTfKxuOIA3XOGpIFATSr-SmcX0iEl67gKnrB0VPk",
  "refresh_expires_at": "2026-10-31T04:36:35.808885533Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/002b6ed2-3145-4cdf-b344-7f6100a4afa3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:36:34.8679Z",
      "actor": {
        "type": "CLIENT",
        "id": "ed5916c6-49cf-4f62-b3fe-55b37e6be39a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "002b6ed2-3145-4cdf-b344-7f6100a4afa3",
        "quote_id": "9a5b80d4-893b-4747-ae26-4261f94addf5",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a9b18fa3-18d5-443b-8c0e-520a1c025ce5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:36:34.870034Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "002b6ed2-3145-4cdf-b344-7f6100a4afa3",
        "attempt_id": "84596cba-a8b2-461f-b839-1c91f7c924c0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a9b18fa3-18d5-443b-8c0e-520a1c025ce5"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T16:36:34.917642Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "002b6ed2-3145-4cdf-b344-7f6100a4afa3",
        "attempt_id": "84596cba-a8b2-461f-b839-1c91f7c924c0"
      },
      "correlation_id": "a9b18fa3-18d5-443b-8c0e-520a1c025ce5"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "84596cba-a8b2-461f-b839-1c91f7c924c0",
        "generation": 1,
        "started_at": "2026-10-30T16:36:34.868876Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T16:36:34.917642Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T16:36:34.870916Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/a9b18fa3-18d5-443b-8c0e-520a1c025ce5` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "002b6ed2-3145-4cdf-b344-7f6100a4afa3:0",
      "order_id": "002b6ed2-3145-4cdf-b344-7f6100a4afa3",
      "at": "2026-10-30T16:36:34.8679Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "002b6ed2-3145-4cdf-b344-7f6100a4afa3:1",
      "order_id": "002b6ed2-3145-4cdf-b344-7f6100a4afa3",
      "at": "2026-10-30T16:36:34.870034Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "002b6ed2-3145-4cdf-b344-7f6100a4afa3:2",
      "order_id": "002b6ed2-3145-4cdf-b344-7f6100a4afa3",
      "at": "2026-10-30T16:36:34.917642Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/9a3f0c18-4e8c-4650-8fbf-e4dc8eadb86a` → **200**

```json
{
  "found": []
}
```

Done: request a9b18fa3-18d5-443b-8c0e-520a1c025ce5 — order 002b6ed2-3145-4cdf-b344-7f6100a4afa3 found by its id.

`GET /api/rider/v1/orders/002b6ed2-3145-4cdf-b344-7f6100a4afa3` → **200**

```json
{
  "id": "002b6ed2-3145-4cdf-b344-7f6100a4afa3",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ed5916c6-49cf-4f62-b3fe-55b37e6be39a",
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
  "created_at": "2026-10-30T16:36:34.867361Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/002b6ed2-3145-4cdf-b344-7f6100a4afa3/cancel` → **200**

```json
{
  "command_id": "31e07daa-dc2f-4f5d-8e71-da580858414b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "002b6ed2-3145-4cdf-b344-7f6100a4afa3",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ed5916c6-49cf-4f62-b3fe-55b37e6be39a",
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
  "created_at": "2026-10-30T16:36:34.867361Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636545416",
  "device_ref": "sandbox-19360"
}
```

```json
{
  "challenge_id": "94c043dd-59ae-4f4f-a215-e499471236d7",
  "expires_at": "2026-10-30T16:41:37.573753013Z",
  "resend_available_at": "2026-10-30T16:36:38.573753013Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636545416` → **200**

```json
{
  "phone": "+380636545416",
  "audience": "CLIENT",
  "code": "345145",
  "sent_at": "2026-10-30T16:36:37.577488103Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94c043dd-59ae-4f4f-a215-e499471236d7",
  "code": "345145",
  "device_ref": "sandbox-19360"
}
```

```json
{
  "session_id": "8dce60f1-0ac5-49bf-8c36-8f9b0696d0b8",
  "subject": {
    "type": "CLIENT",
    "id": "789b3667-d324-4eee-8d7b-c0481fa426c0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ODliMzY2Ny1kMzI0LTRlZWUtOGQ3Yi1jMDQ4MWZhNDI2YzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MDk3LCJpYXQiOjE3OTMzNzgxOTcsImp0aSI6ImQ3ZjQxMWIyLThhMmUtNDc2Ni04YzgzLTFjMWFmYTYwNGFlZCIsInNpZCI6IjhkY2U2MGYxLTBhYzUtNDliZi04YzM2LThmOWIwNjk2ZDBiOCJ9.7G4Rwhfif8GNCoSg3Iqr-HsB9SB69iLk4zO4tcSjUCY",
  "access_expires_at": "2026-10-30T16:51:37.881030929Z",
  "refresh_token": "PsLqS94F-FL7BPh7qStoND5JlarLjft9r6Uh24igCp4",
  "refresh_expires_at": "2026-11-29T16:36:37.880465545Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "6c0879a5-2e69-445c-b97c-09e50a9c6bd4",
  "expires_at": "2026-10-30T16:41:40.166994995Z",
  "resend_available_at": "2026-10-30T16:36:41.166994995Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636545416` → **200**

```json
{
  "phone": "+380636545416",
  "audience": "CLIENT",
  "code": "632269",
  "sent_at": "2026-10-30T16:36:40.169428993Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "d28515a3-ac3c-4012-a928-6158336a028d",
  "challenge_id": "6c0879a5-2e69-445c-b97c-09e50a9c6bd4",
  "otp_code": "632269"
}
```

```json
{
  "id": "03dc924d-1808-44e6-8003-a6e69dea6eef",
  "state": "PENDING",
  "created_at": "2026-10-30T16:36:40.477236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/03dc924d-1808-44e6-8003-a6e69dea6eef` → **200**

```json
{
  "id": "03dc924d-1808-44e6-8003-a6e69dea6eef",
  "state": "PENDING",
  "created_at": "2026-10-30T16:36:40.477236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/03dc924d-1808-44e6-8003-a6e69dea6eef` → **200**

```json
{
  "id": "03dc924d-1808-44e6-8003-a6e69dea6eef",
  "state": "PENDING",
  "created_at": "2026-10-30T16:36:40.477236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/03dc924d-1808-44e6-8003-a6e69dea6eef` → **200**

```json
{
  "id": "03dc924d-1808-44e6-8003-a6e69dea6eef",
  "state": "PENDING",
  "created_at": "2026-10-30T16:36:40.477236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/03dc924d-1808-44e6-8003-a6e69dea6eef` → **200**

```json
{
  "id": "03dc924d-1808-44e6-8003-a6e69dea6eef",
  "state": "PENDING",
  "created_at": "2026-10-30T16:36:40.477236Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/03dc924d-1808-44e6-8003-a6e69dea6eef` → **200**

```json
{
  "id": "03dc924d-1808-44e6-8003-a6e69dea6eef",
  "state": "READY",
  "created_at": "2026-10-30T16:36:40.477236Z",
  "ready_at": "2026-10-30T16:36:45.631577Z",
  "expires_at": "2026-11-06T16:36:45.631577Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/03dc924d-1808-44e6-8003-a6e69dea6eef/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636403596",
  "device_ref": "sandbox-26050"
}
```

```json
{
  "challenge_id": "e0b39e86-8f8e-4405-ad44-7c42f19348d4",
  "expires_at": "2026-10-30T16:41:46.200852044Z",
  "resend_available_at": "2026-10-30T16:36:47.200852044Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636403596` → **200**

```json
{
  "phone": "+380636403596",
  "audience": "CLIENT",
  "code": "512128",
  "sent_at": "2026-10-30T16:36:46.203753764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0b39e86-8f8e-4405-ad44-7c42f19348d4",
  "code": "512128",
  "device_ref": "sandbox-26050"
}
```

```json
{
  "session_id": "d364e7ce-48de-4f34-a918-30417f1e8a25",
  "subject": {
    "type": "CLIENT",
    "id": "3ddc28d3-af6f-4ff0-97a9-55402e7cc0f4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZGRjMjhkMy1hZjZmLTRmZjAtOTdhOS01NTQwMmU3Y2MwZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MTA2LCJpYXQiOjE3OTMzNzgyMDYsImp0aSI6IjkyMjcxNGUxLTFiMDQtNDIzNS1hNzA5LWQyMTdjNTA0MTlmMSIsInNpZCI6ImQzNjRlN2NlLTQ4ZGUtNGYzNC1hOTE4LTMwNDE3ZjFlOGEyNSJ9.xzHlDaj5uhk9psxFqpMQHHh7tOD_0EhwddHsfEFhXWI",
  "access_expires_at": "2026-10-30T16:51:46.516680935Z",
  "refresh_token": "AOHAlv61PMfv6iHar1f5Gjj29rkKTyUSH8NDgJmHwqA",
  "refresh_expires_at": "2026-11-29T16:36:46.516078194Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/03dc924d-1808-44e6-8003-a6e69dea6eef/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/03dc924d-1808-44e6-8003-a6e69dea6eef/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9ef8f40b-bd6d-4a12-a3c9-94dddf408569"
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
  "session_id": "0cd3d28b-8a18-40b0-9dba-2b8184032a88",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkxMDcsImlhdCI6MTc5MzM3ODIwNywianRpIjoiYTYwYzYzOTctN2I3Yy00MTk3LTlhNTktNTYzMGY3YjAxZmMyIiwic2lkIjoiMGNkM2QyOGItOGExOC00MGIwLTlkYmEtMmI4MTg0MDMyYTg4In0.3BqAnhFxEgLFfrGKEcVIlim9TDt6-ZBzjlFN0ftsYtE",
  "access_expires_at": "2026-10-30T16:51:47.368886713Z",
  "refresh_token": "TPAM7MG_2UcK9r61D8n0nwYshZwwgnrQI2zQ8xfQwho",
  "refresh_expires_at": "2026-10-31T04:36:47.368243703Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "789b3667-d324-4eee-8d7b-c0481fa426c0",
  "session_id": "8dce60f1-0ac5-49bf-8c36-8f9b0696d0b8",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/789b3667-d324-4eee-8d7b-c0481fa426c0/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "03dc924d-1808-44e6-8003-a6e69dea6eef",
      "state": "READY",
      "created_at": "2026-10-30T16:36:40.477236Z",
      "ready_at": "2026-10-30T16:36:45.631577Z",
      "expires_at": "2026-11-06T16:36:45.631577Z",
      "size_bytes": 1030
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
  "device_ref": "sandbox-1843"
}
```

```json
{
  "challenge_id": "e02eaff2-6e29-4b1b-8459-f200a95ee886",
  "expires_at": "2026-10-30T16:41:48.218173756Z",
  "resend_available_at": "2026-10-30T16:36:49.218173756Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "105479",
  "sent_at": "2026-10-30T16:36:48.220872975Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e02eaff2-6e29-4b1b-8459-f200a95ee886",
  "code": "105479",
  "device_ref": "sandbox-1843"
}
```

```json
{
  "session_id": "d0e77d21-e8ec-47d2-831e-e99427a56a25",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTEwOCwiaWF0IjoxNzkzMzc4MjA4LCJqdGkiOiIzNjRkNzQwZi1hOGQwLTRmZjgtOTY1OC1mZWY4Zjg1YjRjOGMiLCJzaWQiOiJkMGU3N2QyMS1lOGVjLTQ3ZDItODMxZS1lOTk0MjdhNTZhMjUifQ._yhfYkdiHOyy5z7kob2Lq1B_1r0MEq-cyuCeB-YZPFE",
  "access_expires_at": "2026-10-30T16:51:48.524778765Z",
  "refresh_token": "dUa_jpn-oLcLF0sDfdX94ZiEHSHPxl2AAVZcYQjjVAE",
  "refresh_expires_at": "2026-11-29T16:36:48.524147737Z",
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
  "device_ref": "sandbox-24753"
}
```

```json
{
  "challenge_id": "369622b7-b46d-4234-9fa8-c5842133c0d9",
  "expires_at": "2026-10-30T16:41:49.093859219Z",
  "resend_available_at": "2026-10-30T16:36:50.093859219Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "336528",
  "sent_at": "2026-10-30T16:36:49.096706206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "369622b7-b46d-4234-9fa8-c5842133c0d9",
  "code": "336528",
  "device_ref": "sandbox-24753"
}
```

```json
{
  "session_id": "062b8658-83ba-4e53-a906-f8186f906c80",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTEwOSwiaWF0IjoxNzkzMzc4MjA5LCJqdGkiOiIyMjA5MDk1MS1hZjg1LTRlNDAtYmZmZS1mZTc2NGRjMTM0MzMiLCJzaWQiOiIwNjJiODY1OC04M2JhLTRlNTMtYTkwNi1mODE4NmY5MDZjODAifQ.muon5pdVR0xHptvPDT0CTxIT0bkAmyMgWdug5_RTLKg",
  "access_expires_at": "2026-10-30T16:51:49.405944516Z",
  "refresh_token": "8KwQnT8zFJ0XX9e5Jm6kSKKjpjp92IFpmTNrUsqsysA",
  "refresh_expires_at": "2026-11-29T16:36:49.405320475Z",
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
  "command_id": "fa84145f-7701-4f00-9496-5553986356a1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:36:49Z",
    "sequence": 1793378209986
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "527b3381-f20e-47c3-abe2-f4aae6da196f",
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
  "last_heartbeat_at": "2026-10-30T16:36:50.005472Z",
  "last_location_at": "2026-10-30T16:36:50.005472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-22597"
}
```

```json
{
  "challenge_id": "27e5ccf8-462a-4cba-8dfb-b3354763bc59",
  "expires_at": "2026-10-30T16:41:50.286822232Z",
  "resend_available_at": "2026-10-30T16:36:51.286822232Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "153536",
  "sent_at": "2026-10-30T16:36:50.289254981Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27e5ccf8-462a-4cba-8dfb-b3354763bc59",
  "code": "153536",
  "device_ref": "sandbox-22597"
}
```

```json
{
  "session_id": "28ae31c4-19f2-4faf-8e90-4755f6b27b1d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTExMCwiaWF0IjoxNzkzMzc4MjEwLCJqdGkiOiJlYTNiMWRiOC01NTNmLTRkMzItYjg3OC1jNDU1YjdkZGRlZDciLCJzaWQiOiIyOGFlMzFjNC0xOWYyLTRmYWYtOGU5MC00NzU1ZjZiMjdiMWQifQ.1vzhq9SSomDoFem8U0ftavyjoapuqQ1WXUJO0l7mIo8",
  "access_expires_at": "2026-10-30T16:51:50.610321458Z",
  "refresh_token": "WWCGnXTq8S1TwjLko1L2x9yaX0tlM-FxmXKoIkLCMvU",
  "refresh_expires_at": "2026-11-29T16:36:50.609735676Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "040deaf0-66f5-4c3b-b79e-4de251690ba6",
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
  "last_heartbeat_at": "2026-10-30T16:32:49.354409Z",
  "last_location_at": "2026-10-30T16:32:49.354409Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/040deaf0-66f5-4c3b-b79e-4de251690ba6/handover` → **200**

```json
{
  "command_id": "d59b1498-f763-4aa9-802d-0d6dbe61f2d9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "040deaf0-66f5-4c3b-b79e-4de251690ba6",
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
  "last_heartbeat_at": "2026-10-30T16:32:49.354409Z",
  "last_location_at": "2026-10-30T16:32:49.354409Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/040deaf0-66f5-4c3b-b79e-4de251690ba6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:36:51Z",
    "sequence": 1793378211494
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "040deaf0-66f5-4c3b-b79e-4de251690ba6",
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
  "last_heartbeat_at": "2026-10-30T16:36:51.512047Z",
  "last_location_at": "2026-10-30T16:36:51.512047Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "session_id": "bac87113-950b-4ffd-8a9b-72fd3c898a0c",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkxMTIsImlhdCI6MTc5MzM3ODIxMiwianRpIjoiMDA4Mjc4YjctYTk5MC00Y2I1LWIzZWMtZWI5MDExM2U5ZjU2Iiwic2lkIjoiYmFjODcxMTMtOTUwYi00ZmZkLThhOWItNzJmZDNjODk4YTBjIn0.P0-B15li0_g34snB-jt2h1EfroAT-uE_fJ2PE928vkc",
  "access_expires_at": "2026-10-30T16:51:52.082772286Z",
  "refresh_token": "d_vVNCGenk9P4t9mXCW1uD_kdl7NWe3EkyES0zTXJ7c",
  "refresh_expires_at": "2026-10-31T04:36:52.082211911Z",
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
  "session_id": "21e8ebfe-87a9-48b7-ab8b-54c74f679bd9",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkxMTIsImlhdCI6MTc5MzM3ODIxMiwianRpIjoiNjM5MjMyMjAtNzZlMi00OGRiLTlhYjgtZjIxMGE2OGE0YmUzIiwic2lkIjoiMjFlOGViZmUtODdhOS00OGI3LWFiOGItNTRjNzRmNjc5YmQ5In0.n5CpKaOeTgCU4uviHuKgTx1OxKXhbQfsDvEb9FCkm-g",
  "access_expires_at": "2026-10-30T16:51:52.659563463Z",
  "refresh_token": "CEC-ie_sMy3lkbyyxiFQ4H8buDOdzFvBsBTMQLYvqkk",
  "refresh_expires_at": "2026-10-31T04:36:52.659055608Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684897034",
  "device_ref": "sandbox-6500"
}
```

```json
{
  "challenge_id": "32c5cb0a-2ecd-4fc9-b3bb-e8a716220ffd",
  "expires_at": "2026-10-30T16:41:52.941162769Z",
  "resend_available_at": "2026-10-30T16:36:53.941162769Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684897034` → **200**

```json
{
  "phone": "+380684897034",
  "audience": "CLIENT",
  "code": "938178",
  "sent_at": "2026-10-30T16:36:52.944102229Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32c5cb0a-2ecd-4fc9-b3bb-e8a716220ffd",
  "code": "938178",
  "device_ref": "sandbox-6500"
}
```

```json
{
  "session_id": "d84e4def-b3d5-46c7-a9cb-98cb77c272b1",
  "subject": {
    "type": "CLIENT",
    "id": "8e2f16fc-e2d4-45c6-975f-be4c6d5dfb22"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZTJmMTZmYy1lMmQ0LTQ1YzYtOTc1Zi1iZTRjNmQ1ZGZiMjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MTEzLCJpYXQiOjE3OTMzNzgyMTMsImp0aSI6IjMwYzhmZTgxLWZlZmItNGNiNi04YzczLTM5Mzg1NGRkN2Q2NiIsInNpZCI6ImQ4NGU0ZGVmLWIzZDUtNDZjNy1hOWNiLTk4Y2I3N2MyNzJiMSJ9.HeNL6oLGgyevgUShaq-uEPPcquBVhmzF-jfrwLiFkrI",
  "access_expires_at": "2026-10-30T16:51:53.25647363Z",
  "refresh_token": "S9WFFK2RiGAZiM9oqdOhtw_Tuhr1TwV1CvTEz5o7GqI",
  "refresh_expires_at": "2026-11-29T16:36:53.255934445Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4c9b2487-4a7f-4833-8a12-f31a443a5b51",
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
  "id": "65da9c97-8fff-4d5a-8f23-2c8cf918c407",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:41:53.541637Z",
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
  "command_id": "410f11b1-a4cd-49cf-838b-c2642cce3345",
  "quote_id": "65da9c97-8fff-4d5a-8f23-2c8cf918c407",
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
  "id": "b103e991-e514-4beb-9418-038b3616cbcb",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8e2f16fc-e2d4-45c6-975f-be4c6d5dfb22",
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
  "created_at": "2026-10-30T16:36:53.852307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c6514076-e388-4e7d-b6fd-9ce44790b21c",
    "order_id": "b103e991-e514-4beb-9418-038b3616cbcb",
    "expires_at": "2026-10-30T16:37:08.856484Z",
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

`POST /api/driver/v1/offers/c6514076-e388-4e7d-b6fd-9ce44790b21c/reject` → **204**

```json
{
  "command_id": "fbabaf73-19ee-4b1d-b9bc-468b77be9959"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6761f6d6-8e24-4e21-b290-674a7781e5ba",
    "order_id": "b103e991-e514-4beb-9418-038b3616cbcb",
    "expires_at": "2026-10-30T16:37:09.481306Z",
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

`POST /api/driver/v1/offers/6761f6d6-8e24-4e21-b290-674a7781e5ba/accept` → **200**

```json
{
  "command_id": "3153e24f-ddfb-46b3-a01c-2c8e7e9db609"
}
```

```json
{
  "id": "dd4a9018-32b5-4986-8ed1-6d5d3c597b54",
  "order_id": "b103e991-e514-4beb-9418-038b3616cbcb",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5bad6b3f-db28-4105-b4a3-1e128f6c004f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/b103e991-e514-4beb-9418-038b3616cbcb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:36:53.852774Z",
      "actor": {
        "type": "CLIENT",
        "id": "8e2f16fc-e2d4-45c6-975f-be4c6d5dfb22",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b103e991-e514-4beb-9418-038b3616cbcb",
        "quote_id": "65da9c97-8fff-4d5a-8f23-2c8cf918c407",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "8bc5c022-1caa-458c-bd89-bfc0e5d381ac"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:36:53.854844Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b103e991-e514-4beb-9418-038b3616cbcb",
        "attempt_id": "fd14a799-fbb6-49db-be0f-178db420ee69",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8bc5c022-1caa-458c-bd89-bfc0e5d381ac"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T16:36:53.885177Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c6514076-e388-4e7d-b6fd-9ce44790b21c",
        "order_id": "b103e991-e514-4beb-9418-038b3616cbcb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "8bc5c022-1caa-458c-bd89-bfc0e5d381ac"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T16:36:54.480211Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c6514076-e388-4e7d-b6fd-9ce44790b21c",
        "order_id": "b103e991-e514-4beb-9418-038b3616cbcb"
      },
      "correlation_id": "08d32d97-f192-4ce5-95d4-21ba8891d9c2"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order b103e991-e514-4beb-9418-038b3616cbcb — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/b103e991-e514-4beb-9418-038b3616cbcb` → **200**

```json
{
  "id": "b103e991-e514-4beb-9418-038b3616cbcb",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "8e2f16fc-e2d4-45c6-975f-be4c6d5dfb22",
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
    "id": "dd4a9018-32b5-4986-8ed1-6d5d3c597b54",
    "order_id": "b103e991-e514-4beb-9418-038b3616cbcb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5bad6b3f-db28-4105-b4a3-1e128f6c004f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:36:53.852307Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b103e991-e514-4beb-9418-038b3616cbcb/cancel` → **200**

```json
{
  "command_id": "7df296c6-67e5-4b23-be77-ed06f995a569",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b103e991-e514-4beb-9418-038b3616cbcb",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8e2f16fc-e2d4-45c6-975f-be4c6d5dfb22",
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
    "id": "dd4a9018-32b5-4986-8ed1-6d5d3c597b54",
    "order_id": "b103e991-e514-4beb-9418-038b3616cbcb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5bad6b3f-db28-4105-b4a3-1e128f6c004f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:36:53.852307Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
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
  "session_id": "527b3381-f20e-47c3-abe2-f4aae6da196f",
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
  "last_heartbeat_at": "2026-10-30T16:36:50.005472Z",
  "last_location_at": "2026-10-30T16:36:50.005472Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/527b3381-f20e-47c3-abe2-f4aae6da196f/close` → **200**

```json
{
  "command_id": "c5511552-a5eb-492c-95ef-2a6aecc31f36",
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
  "session_id": "040deaf0-66f5-4c3b-b79e-4de251690ba6",
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
  "last_heartbeat_at": "2026-10-30T16:36:51.512047Z",
  "last_location_at": "2026-10-30T16:36:51.512047Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/040deaf0-66f5-4c3b-b79e-4de251690ba6/close` → **200**

```json
{
  "command_id": "986a48f2-ba00-4b7e-aa63-c5adb49f2daf",
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

# Scenario: document-at-rest

## Oleh uploads a scan of his licence

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-30977"
}
```

```json
{
  "challenge_id": "6b53f226-660f-45e6-aaef-234c98d0be79",
  "expires_at": "2026-10-30T16:41:57.220738925Z",
  "resend_available_at": "2026-10-30T16:36:58.220738925Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "838526",
  "sent_at": "2026-10-30T16:36:57.22328676Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b53f226-660f-45e6-aaef-234c98d0be79",
  "code": "838526",
  "device_ref": "sandbox-30977"
}
```

```json
{
  "session_id": "e6fee60d-09b6-4c72-be3d-800b84913844",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTExNywiaWF0IjoxNzkzMzc4MjE3LCJqdGkiOiIwODYzNTQ3Yy1mMzVhLTQ1ODEtYWYyMC05MzRhY2VlYjE1M2UiLCJzaWQiOiJlNmZlZTYwZC0wOWI2LTRjNzItYmUzZC04MDBiODQ5MTM4NDQifQ.kOBZNR_W30NfUbb6hZtt--VJ_i7Q_Xyo4tvC-CrO1iE",
  "access_expires_at": "2026-10-30T16:51:57.550895967Z",
  "refresh_token": "-GdcbpS2DjeRdCsykf3WkoFA4SPWd9i1uO9e8MKCYlQ",
  "refresh_expires_at": "2026-11-29T16:36:57.550327418Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "29b89ed7-4233-43aa-a545-26faf1d2cc55",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "f0ca2642-f164-411e-84f7-c89613b3211f",
  "upload_path": "/api/driver/v1/uploads/f0ca2642-f164-411e-84f7-c89613b3211f",
  "expires_at": "2026-10-30T16:51:57.833330885Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/f0ca2642-f164-411e-84f7-c89613b3211f` → **200**

```json
{
  "file_id": "f0ca2642-f164-411e-84f7-c89613b3211f",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/f0ca2642-f164-411e-84f7-c89613b3211f`, first bytes `425a4631e168ea01` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/f0ca2642-f164-411e-84f7-c89613b3211f` → **200**

SHA-256 uploaded `d46d87baa45817d085a3cf63fc14662d31939a9e91c3d49352c86472c3e1f862`, downloaded `d46d87baa45817d085a3cf63fc14662d31939a9e91c3d49352c86472c3e1f862`.

Done: document f0ca2642-f164-411e-84f7-c89613b3211f is encrypted on disk and downloads unchanged.

# Scenario: driver-states

## Only the two drivers of this scenario are online: Near about 200 m from the pickup, Far about 600 m

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28"
}
```

```json
{
  "challenge_id": "88189d73-ab7c-428e-bc2c-58862339da7c",
  "expires_at": "2026-10-30T16:41:58.206453947Z",
  "resend_available_at": "2026-10-30T16:36:59.206453947Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "061584",
  "sent_at": "2026-10-30T16:36:58.209489336Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88189d73-ab7c-428e-bc2c-58862339da7c",
  "code": "061584",
  "device_ref": "sandbox-28"
}
```

```json
{
  "session_id": "58456568-e445-49e3-8da7-d6b7708b0065",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTExOCwiaWF0IjoxNzkzMzc4MjE4LCJqdGkiOiI1NGU2MTRjZi00YzM4LTQ1NGUtYWRiNS0zMjNmZmZjZTM0ZGMiLCJzaWQiOiI1ODQ1NjU2OC1lNDQ1LTQ5ZTMtOGRhNy1kNmI3NzA4YjAwNjUifQ.K80d4RfR8UDaulAfmFmVd5KAvn5kNcdvwsJRl7Un0yo",
  "access_expires_at": "2026-10-30T16:51:58.517350333Z",
  "refresh_token": "8pllUK37Mhlk0d589RazlguMm7Bwx3VjIwTpYH3Hp1Q",
  "refresh_expires_at": "2026-11-29T16:36:58.51684895Z",
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
  "device_ref": "sandbox-22813"
}
```

```json
{
  "challenge_id": "2e8549a3-f754-443e-bd44-59e4f6b226c8",
  "expires_at": "2026-10-30T16:41:59.091929704Z",
  "resend_available_at": "2026-10-30T16:37:00.091929704Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "277940",
  "sent_at": "2026-10-30T16:36:59.094352172Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e8549a3-f754-443e-bd44-59e4f6b226c8",
  "code": "277940",
  "device_ref": "sandbox-22813"
}
```

```json
{
  "session_id": "960e96a3-5c56-4712-84be-12ec418e0939",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTExOSwiaWF0IjoxNzkzMzc4MjE5LCJqdGkiOiIxMzgyOTIxZC02MWFlLTRlNjQtYjIzNS1lZWUzMjQ0MDJkY2EiLCJzaWQiOiI5NjBlOTZhMy01YzU2LTQ3MTItODRiZS0xMmVjNDE4ZTA5MzkifQ.WWBvTZI9FrS692iahQ5BYsUQ7JcACczV3LJlZcst3RY",
  "access_expires_at": "2026-10-30T16:51:59.395681545Z",
  "refresh_token": "-hZrUIunSR4CvbzQgFBB-hXKthWTpA69uYLQFfrv9TY",
  "refresh_expires_at": "2026-11-29T16:36:59.395115714Z",
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
  "command_id": "fe87fdcb-cddc-468e-aecd-018afa4af12f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:36:59Z",
    "sequence": 1793378219979
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
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
  "last_heartbeat_at": "2026-10-30T16:36:59.998228Z",
  "last_location_at": "2026-10-30T16:36:59.998228Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-23978"
}
```

```json
{
  "challenge_id": "665d2b7f-93cd-4306-8037-ac0d5b62f10c",
  "expires_at": "2026-10-30T16:42:00.284477967Z",
  "resend_available_at": "2026-10-30T16:37:01.284477967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "453802",
  "sent_at": "2026-10-30T16:37:00.287004216Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "665d2b7f-93cd-4306-8037-ac0d5b62f10c",
  "code": "453802",
  "device_ref": "sandbox-23978"
}
```

```json
{
  "session_id": "e5e8e906-691a-4988-9431-3d03b3ed3746",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTEyMCwiaWF0IjoxNzkzMzc4MjIwLCJqdGkiOiI0ODA4YzAyNC0wNjk0LTQwNzEtYmExYi00NzJmZTAwOTI2MjYiLCJzaWQiOiJlNWU4ZTkwNi02OTFhLTQ5ODgtOTQzMS0zZDAzYjNlZDM3NDYifQ.AbqSIW-ToOfipoLNdoQ-IeJuYRYlKw_-WOLIUlQGazI",
  "access_expires_at": "2026-10-30T16:52:00.598821811Z",
  "refresh_token": "HG-LHcGW3O-mItdn3eqa3h0su-Gq6cpwc0aesrCQG6E",
  "refresh_expires_at": "2026-11-29T16:37:00.598250938Z",
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
  "command_id": "0ea94070-724d-498d-b911-6868eb420cd1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:37:01Z",
    "sequence": 1793378221174
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6a90be62-248c-4bc3-bddd-17f55e73b05f",
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
  "last_heartbeat_at": "2026-10-30T16:37:01.192744Z",
  "last_location_at": "2026-10-30T16:37:01.192744Z",
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
  "session_id": "65d49f2d-1bdc-4762-bff7-faf78bfb7047",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkxMjEsImlhdCI6MTc5MzM3ODIyMSwianRpIjoiZjgwYjhkMjMtNGY2ZS00M2MwLTg5OGQtNGJiOWI2ODQ1N2FhIiwic2lkIjoiNjVkNDlmMmQtMWJkYy00NzYyLWJmZjctZmFmNzhiZmI3MDQ3In0.JD3rKfJJL1Du9kUItSkNK7VJm_I40L4mpcdk_1kOJZs",
  "access_expires_at": "2026-10-30T16:52:01.767204486Z",
  "refresh_token": "Ls0McgiQ6xX-RIrmiKM4M0YmRlo4SUguK_N4iwLlxjc",
  "refresh_expires_at": "2026-10-31T04:37:01.766644724Z",
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
  "session_id": "7bdbe3a4-7e9c-4a2f-8a19-897759ffe61b",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkxMjIsImlhdCI6MTc5MzM3ODIyMiwianRpIjoiYjgzYWQyNTUtZTNjOS00OTU2LWJhZjMtMGY1YmEyNTYzNjQ0Iiwic2lkIjoiN2JkYmUzYTQtN2U5Yy00YTJmLThhMTktODk3NzU5ZmZlNjFiIn0.COprjHpRo4b6jXK5l_BMFlywlarTN0Gu1iNj3ek512o",
  "access_expires_at": "2026-10-30T16:52:02.332214011Z",
  "refresh_token": "H2dqQPpXxkWajsGQXhDbG0hJsCDz9Iwnb2jaNiW9i00",
  "refresh_expires_at": "2026-10-31T04:37:02.331660761Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380682892514",
  "device_ref": "sandbox-3835"
}
```

```json
{
  "challenge_id": "44c4ef41-7087-4c64-902a-5dd51686b3e3",
  "expires_at": "2026-10-30T16:42:02.613453431Z",
  "resend_available_at": "2026-10-30T16:37:03.613453431Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380682892514` → **200**

```json
{
  "phone": "+380682892514",
  "audience": "CLIENT",
  "code": "035971",
  "sent_at": "2026-10-30T16:37:02.615960467Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44c4ef41-7087-4c64-902a-5dd51686b3e3",
  "code": "035971",
  "device_ref": "sandbox-3835"
}
```

```json
{
  "session_id": "4c19d6f1-d6c9-473c-a3c7-1feb7cf31436",
  "subject": {
    "type": "CLIENT",
    "id": "5ed21f3d-c899-4908-8b06-cd37fddf9447"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZWQyMWYzZC1jODk5LTQ5MDgtOGIwNi1jZDM3ZmRkZjk0NDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MTIyLCJpYXQiOjE3OTMzNzgyMjIsImp0aSI6IjRkM2NjMzNjLTA2YjctNDVlNy1iMTdjLWY5MzhjY2EzMTg0NCIsInNpZCI6IjRjMTlkNmYxLWQ2YzktNDczYy1hM2M3LTFmZWI3Y2YzMTQzNiJ9.6eUszu1Xmrc8H8YPdwxap3cvWSKVPlcZSir_uMcq8OM",
  "access_expires_at": "2026-10-30T16:52:02.917653218Z",
  "refresh_token": "_joWbb68qfrdodN_oMROUOOgOOCZXP5YH8TkPH7nCOA",
  "refresh_expires_at": "2026-11-29T16:37:02.917027231Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d0b7536e-ffef-45d4-ac81-fe2f63a192f1",
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
  "id": "0cd64b52-0353-4d9b-a207-3cb1582c8d8c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:42:03.213065Z",
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
  "command_id": "54baac55-1feb-424b-8a6a-b7472719eb3a",
  "quote_id": "0cd64b52-0353-4d9b-a207-3cb1582c8d8c",
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
  "id": "ccbe42cd-68e8-4d74-a2ec-cc535b669587",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
  "created_at": "2026-10-30T16:37:03.517562Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "2eaebc4f-a265-4b7d-b7e3-8d4b017dca03",
    "order_id": "ccbe42cd-68e8-4d74-a2ec-cc535b669587",
    "expires_at": "2026-10-30T16:37:18.52077Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
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
  "last_heartbeat_at": "2026-10-30T16:36:59.998228Z",
  "last_location_at": "2026-10-30T16:36:59.998228Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/pause` → **200**

```json
{
  "command_id": "837fb3c8-797e-43c5-b82f-5e699f328475",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:36:59.998228Z",
  "last_location_at": "2026-10-30T16:36:59.998228Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/2eaebc4f-a265-4b7d-b7e3-8d4b017dca03/accept` → **409**

```json
{
  "command_id": "9a01923f-4d5b-418c-ad7d-a28ff61a012d"
}
```

```json
{
  "instance": "/api/driver/v1/offers/2eaebc4f-a265-4b7d-b7e3-8d4b017dca03/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "ea865847-8743-46e9-94cd-987fa79d6a27"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4e90529e-01f6-4857-a92a-51db154cace7",
    "order_id": "ccbe42cd-68e8-4d74-a2ec-cc535b669587",
    "expires_at": "2026-10-30T16:37:19.437914Z",
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

`POST /api/driver/v1/offers/4e90529e-01f6-4857-a92a-51db154cace7/reject` → **204**

```json
{
  "command_id": "54b27bde-7000-4e27-85dc-6667414aa5d2"
}
```

`GET /api/operator/v1/orders/ccbe42cd-68e8-4d74-a2ec-cc535b669587/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:37:03.518019Z",
      "actor": {
        "type": "CLIENT",
        "id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ccbe42cd-68e8-4d74-a2ec-cc535b669587",
        "quote_id": "0cd64b52-0353-4d9b-a207-3cb1582c8d8c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "adf10240-5228-40c6-ae73-409c14aec5a9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:37:03.519966Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ccbe42cd-68e8-4d74-a2ec-cc535b669587",
        "attempt_id": "86ce8f2a-240c-457f-a2e5-83725c3a4bff",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "adf10240-5228-40c6-ae73-409c14aec5a9"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T16:37:03.547431Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2eaebc4f-a265-4b7d-b7e3-8d4b017dca03",
        "order_id": "ccbe42cd-68e8-4d74-a2ec-cc535b669587",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "adf10240-5228-40c6-ae73-409c14aec5a9"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-30T16:37:04.436926Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "2eaebc4f-a265-4b7d-b7e3-8d4b017dca03",
        "order_id": "ccbe42cd-68e8-4d74-a2ec-cc535b669587",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
      "correlation_id": "fa246612-1f38-43e0-91ac-5ba0b4d63230"
    },
```

`GET /api/operator/v1/orders/ccbe42cd-68e8-4d74-a2ec-cc535b669587` → **200**

```json
{
  "id": "ccbe42cd-68e8-4d74-a2ec-cc535b669587",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
  "created_at": "2026-10-30T16:37:03.517562Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ccbe42cd-68e8-4d74-a2ec-cc535b669587/cancel` → **200**

```json
{
  "command_id": "960711e3-2b3f-4aca-9537-dc66036e07d8",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ccbe42cd-68e8-4d74-a2ec-cc535b669587",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
  "created_at": "2026-10-30T16:37:03.517562Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

E2: offer 2eaebc4f-a265-4b7d-b7e3-8d4b017dca03 revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6a90be62-248c-4bc3-bddd-17f55e73b05f",
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
  "last_heartbeat_at": "2026-10-30T16:37:01.192744Z",
  "last_location_at": "2026-10-30T16:37:01.192744Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a90be62-248c-4bc3-bddd-17f55e73b05f/close` → **200**

```json
{
  "command_id": "32e042ca-5011-4d80-99b1-a39b722a8d01",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:36:59.998228Z",
  "last_location_at": "2026-10-30T16:36:59.998228Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/resume` → **200**

```json
{
  "command_id": "52a0adae-68bc-4336-b09e-f03532125658",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
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
  "last_heartbeat_at": "2026-10-30T16:36:59.998228Z",
  "last_location_at": "2026-10-30T16:36:59.998228Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:37:07Z",
    "sequence": 1793378227509
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
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
  "last_heartbeat_at": "2026-10-30T16:37:07.527279Z",
  "last_location_at": "2026-10-30T16:37:07.527279Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "892993e2-e529-4f33-9221-e9a1fa93e974",
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
  "id": "e4535d82-7b87-43fc-90f4-4ca8045e5d9a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:42:07.821782Z",
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
  "command_id": "40ecd6bf-91a2-4bdb-8d20-37482d02c915",
  "quote_id": "e4535d82-7b87-43fc-90f4-4ca8045e5d9a",
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
  "id": "26745764-5946-49a1-a23d-395802ab4116",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
  "created_at": "2026-10-30T16:37:08.122547Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "5956e5e9-8873-42b0-84cd-2fcd825a642e",
    "order_id": "26745764-5946-49a1-a23d-395802ab4116",
    "expires_at": "2026-10-30T16:37:23.126112Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:07.527279Z",
  "last_location_at": "2026-10-30T16:37:07.527279Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/5956e5e9-8873-42b0-84cd-2fcd825a642e/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/5956e5e9-8873-42b0-84cd-2fcd825a642e/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "dbc7f90b-a114-4824-8031-85b7e0dc02e0"
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:07.527279Z",
  "last_location_at": "2026-10-30T16:37:07.527279Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 1: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/26745764-5946-49a1-a23d-395802ab4116` → **200**

```json
{
  "id": "26745764-5946-49a1-a23d-395802ab4116",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
  "created_at": "2026-10-30T16:37:08.122547Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/26745764-5946-49a1-a23d-395802ab4116` → **200**

```json
{
  "id": "26745764-5946-49a1-a23d-395802ab4116",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
  "created_at": "2026-10-30T16:37:08.122547Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/26745764-5946-49a1-a23d-395802ab4116/cancel` → **200**

```json
{
  "command_id": "9dee4ac2-2a93-4b36-8ab9-cf76f2fef638",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "26745764-5946-49a1-a23d-395802ab4116",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
  "created_at": "2026-10-30T16:37:08.122547Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
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
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:07.527279Z",
  "last_location_at": "2026-10-30T16:37:07.527279Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/resume` → **200**

```json
{
  "command_id": "7a702fde-aa8b-41d7-a2a9-85f07ed8d991",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:07.527279Z",
  "last_location_at": "2026-10-30T16:37:07.527279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:37:10Z",
    "sequence": 1793378230675
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:10.694029Z",
  "last_location_at": "2026-10-30T16:37:10.694029Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a23a24e8-496b-4214-b512-22f997946705",
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
  "id": "0ae7ce29-2b98-4809-8426-bc2bda86662b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:42:10.994872Z",
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
  "command_id": "fe039339-0999-4923-9c3f-05668310e21c",
  "quote_id": "0ae7ce29-2b98-4809-8426-bc2bda86662b",
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
  "id": "46f31773-062f-4e1d-9b5b-b71555cedb49",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
  "created_at": "2026-10-30T16:37:11.291858Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "89a61cfb-ebea-4949-aecb-c58e6921a332",
    "order_id": "46f31773-062f-4e1d-9b5b-b71555cedb49",
    "expires_at": "2026-10-30T16:37:26.295508Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:10.694029Z",
  "last_location_at": "2026-10-30T16:37:10.694029Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/89a61cfb-ebea-4949-aecb-c58e6921a332/accept` → **200**

```json
{
  "id": "fcf100c8-3917-4860-99ff-155a7d209ba8",
  "order_id": "46f31773-062f-4e1d-9b5b-b71555cedb49",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9fafe614-828d-4e2d-b458-79bf5e1a544d",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:10.694029Z",
  "last_location_at": "2026-10-30T16:37:10.694029Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 2: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/46f31773-062f-4e1d-9b5b-b71555cedb49` → **200**

```json
{
  "id": "46f31773-062f-4e1d-9b5b-b71555cedb49",
  "short_number": 16,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "fcf100c8-3917-4860-99ff-155a7d209ba8",
    "order_id": "46f31773-062f-4e1d-9b5b-b71555cedb49",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9fafe614-828d-4e2d-b458-79bf5e1a544d",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:37:11.291858Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/46f31773-062f-4e1d-9b5b-b71555cedb49` → **200**

```json
{
  "id": "46f31773-062f-4e1d-9b5b-b71555cedb49",
  "short_number": 16,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "fcf100c8-3917-4860-99ff-155a7d209ba8",
    "order_id": "46f31773-062f-4e1d-9b5b-b71555cedb49",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9fafe614-828d-4e2d-b458-79bf5e1a544d",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:37:11.291858Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/46f31773-062f-4e1d-9b5b-b71555cedb49/cancel` → **200**

```json
{
  "command_id": "a0a177d6-f580-418b-87d4-4068bb8c8657",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "46f31773-062f-4e1d-9b5b-b71555cedb49",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "fcf100c8-3917-4860-99ff-155a7d209ba8",
    "order_id": "46f31773-062f-4e1d-9b5b-b71555cedb49",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9fafe614-828d-4e2d-b458-79bf5e1a544d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:37:11.291858Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
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
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 6,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:10.694029Z",
  "last_location_at": "2026-10-30T16:37:10.694029Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/resume` → **200**

```json
{
  "command_id": "f1dbbb99-a124-4da2-9e86-592c657d3631",
  "expected_version": 6
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:10.694029Z",
  "last_location_at": "2026-10-30T16:37:10.694029Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:37:13Z",
    "sequence": 1793378233739
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:13.758145Z",
  "last_location_at": "2026-10-30T16:37:13.758145Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b9a82ddf-187d-4248-9dd2-875ad1b240c4",
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
  "id": "1b85019b-6383-411b-b569-e02ef39ee9ae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:42:14.049215Z",
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
  "command_id": "a0abfe6f-4c70-4a4a-8b81-a2770c62f796",
  "quote_id": "1b85019b-6383-411b-b569-e02ef39ee9ae",
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
  "id": "9d6ddab2-c015-4e5b-96cd-5ca14203f9d6",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
  "created_at": "2026-10-30T16:37:14.359749Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7e0f1d58-f86a-4cf4-965c-04c96a8e530d",
    "order_id": "9d6ddab2-c015-4e5b-96cd-5ca14203f9d6",
    "expires_at": "2026-10-30T16:37:29.363288Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:13.758145Z",
  "last_location_at": "2026-10-30T16:37:13.758145Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/7e0f1d58-f86a-4cf4-965c-04c96a8e530d/accept` → **200**

```json
{
  "id": "e73cabc3-7dfe-48d0-ba1d-217e6299c4c7",
  "order_id": "9d6ddab2-c015-4e5b-96cd-5ca14203f9d6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e13d80f1-dd29-4616-a54a-cfd745c4405b",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 8,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:13.758145Z",
  "last_location_at": "2026-10-30T16:37:13.758145Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 3: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/9d6ddab2-c015-4e5b-96cd-5ca14203f9d6` → **200**

```json
{
  "id": "9d6ddab2-c015-4e5b-96cd-5ca14203f9d6",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "e73cabc3-7dfe-48d0-ba1d-217e6299c4c7",
    "order_id": "9d6ddab2-c015-4e5b-96cd-5ca14203f9d6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e13d80f1-dd29-4616-a54a-cfd745c4405b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:37:14.359749Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9d6ddab2-c015-4e5b-96cd-5ca14203f9d6` → **200**

```json
{
  "id": "9d6ddab2-c015-4e5b-96cd-5ca14203f9d6",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "e73cabc3-7dfe-48d0-ba1d-217e6299c4c7",
    "order_id": "9d6ddab2-c015-4e5b-96cd-5ca14203f9d6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e13d80f1-dd29-4616-a54a-cfd745c4405b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:37:14.359749Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9d6ddab2-c015-4e5b-96cd-5ca14203f9d6/cancel` → **200**

```json
{
  "command_id": "29d02b59-4e13-4fa2-871b-cd38a34f35b3",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9d6ddab2-c015-4e5b-96cd-5ca14203f9d6",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "e73cabc3-7dfe-48d0-ba1d-217e6299c4c7",
    "order_id": "9d6ddab2-c015-4e5b-96cd-5ca14203f9d6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e13d80f1-dd29-4616-a54a-cfd745c4405b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:37:14.359749Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
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
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 9,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:13.758145Z",
  "last_location_at": "2026-10-30T16:37:13.758145Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/resume` → **200**

```json
{
  "command_id": "b50370e0-631d-48a6-a225-a41b15486a64",
  "expected_version": 9
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 10,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:13.758145Z",
  "last_location_at": "2026-10-30T16:37:13.758145Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:37:16Z",
    "sequence": 1793378236868
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 10,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:16.888062Z",
  "last_location_at": "2026-10-30T16:37:16.888062Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "32249d3e-ce73-4486-b860-e20662a32b66",
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
  "id": "5b44403f-8fe2-4854-a2fc-f353711cfd9e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:42:17.184259Z",
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
  "command_id": "811837a6-93d0-46f8-b204-c21bfac075d5",
  "quote_id": "5b44403f-8fe2-4854-a2fc-f353711cfd9e",
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
  "id": "bbd96343-bfca-413e-a7d1-895589f49f64",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
  "created_at": "2026-10-30T16:37:17.487274Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ee34542a-2548-423a-b29e-59713d897212",
    "order_id": "bbd96343-bfca-413e-a7d1-895589f49f64",
    "expires_at": "2026-10-30T16:37:32.490459Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 10,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:16.888062Z",
  "last_location_at": "2026-10-30T16:37:16.888062Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 4, at the same moment:

`POST /api/driver/v1/offers/ee34542a-2548-423a-b29e-59713d897212/accept` → **200**

```json
{
  "id": "4c7b341f-414c-425a-8d9c-011caeba9124",
  "order_id": "bbd96343-bfca-413e-a7d1-895589f49f64",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c69b0140-5ac3-49bb-85b2-4492950671a2",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 11,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:16.888062Z",
  "last_location_at": "2026-10-30T16:37:16.888062Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 4: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/bbd96343-bfca-413e-a7d1-895589f49f64` → **200**

```json
{
  "id": "bbd96343-bfca-413e-a7d1-895589f49f64",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "4c7b341f-414c-425a-8d9c-011caeba9124",
    "order_id": "bbd96343-bfca-413e-a7d1-895589f49f64",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c69b0140-5ac3-49bb-85b2-4492950671a2",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:37:17.487274Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/bbd96343-bfca-413e-a7d1-895589f49f64` → **200**

```json
{
  "id": "bbd96343-bfca-413e-a7d1-895589f49f64",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "4c7b341f-414c-425a-8d9c-011caeba9124",
    "order_id": "bbd96343-bfca-413e-a7d1-895589f49f64",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c69b0140-5ac3-49bb-85b2-4492950671a2",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:37:17.487274Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bbd96343-bfca-413e-a7d1-895589f49f64/cancel` → **200**

```json
{
  "command_id": "d47ce65e-bc7e-443e-85f8-d61b5593f2b9",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "bbd96343-bfca-413e-a7d1-895589f49f64",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "4c7b341f-414c-425a-8d9c-011caeba9124",
    "order_id": "bbd96343-bfca-413e-a7d1-895589f49f64",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c69b0140-5ac3-49bb-85b2-4492950671a2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:37:17.487274Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
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
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 12,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:16.888062Z",
  "last_location_at": "2026-10-30T16:37:16.888062Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/resume` → **200**

```json
{
  "command_id": "d67866be-7ebb-42cc-9dc4-6c93de2c3c75",
  "expected_version": 12
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 13,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:16.888062Z",
  "last_location_at": "2026-10-30T16:37:16.888062Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:37:19Z",
    "sequence": 1793378239963
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 13,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:19.981854Z",
  "last_location_at": "2026-10-30T16:37:19.981854Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "431405fa-cfdd-4089-9b50-06bb7246adb8",
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
  "id": "fb500a13-7ab2-4312-ba76-643567dcf820",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:42:20.277900Z",
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
  "command_id": "20135a93-f22c-46d8-95f0-96afa13dee5f",
  "quote_id": "fb500a13-7ab2-4312-ba76-643567dcf820",
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
  "id": "f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
  "created_at": "2026-10-30T16:37:20.57301Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "2162ab15-cbff-46f4-bb1d-b004644f147a",
    "order_id": "f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949",
    "expires_at": "2026-10-30T16:37:35.576227Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 13,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:19.981854Z",
  "last_location_at": "2026-10-30T16:37:19.981854Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 5, at the same moment:

`POST /api/driver/v1/offers/2162ab15-cbff-46f4-bb1d-b004644f147a/accept` → **200**

```json
{
  "id": "4eadb354-f95d-45b6-9264-06c34f0ccc0c",
  "order_id": "f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3a899ca0-1f41-464e-9a09-24e4b4b7d9dc",
  "trip_phase": "TO_PICKUP"
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 14,
  "session_state": "OPEN",
  "intent": "PAUSE_AFTER_CURRENT",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:19.981854Z",
  "last_location_at": "2026-10-30T16:37:19.981854Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_PAUSE_AFTER_CURRENT",
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

Round 5: the accept won; the pause waits for the end of the trip.

`GET /api/operator/v1/orders/f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949` → **200**

```json
{
  "id": "f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "4eadb354-f95d-45b6-9264-06c34f0ccc0c",
    "order_id": "f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3a899ca0-1f41-464e-9a09-24e4b4b7d9dc",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:37:20.57301Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949` → **200**

```json
{
  "id": "f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "4eadb354-f95d-45b6-9264-06c34f0ccc0c",
    "order_id": "f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3a899ca0-1f41-464e-9a09-24e4b4b7d9dc",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:37:20.57301Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949/cancel` → **200**

```json
{
  "command_id": "1d246ca0-94da-4cb2-8e3a-c01da08445ec",
  "expected_version": 3,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "5ed21f3d-c899-4908-8b06-cd37fddf9447",
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
    "id": "4eadb354-f95d-45b6-9264-06c34f0ccc0c",
    "order_id": "f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3a899ca0-1f41-464e-9a09-24e4b4b7d9dc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:37:20.57301Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

E5: 4 rounds won by the accept, 1 by the pause; one winner each round, no 5xx.

## E4: a fix with 250 m accuracy keeps Near out of new orders; an accurate one brings him back

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 15,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:19.981854Z",
  "last_location_at": "2026-10-30T16:37:19.981854Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/resume` → **200**

```json
{
  "command_id": "c176b9ac-407e-4df9-9bd4-d809361a9ef6",
  "expected_version": 15
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 16,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:19.981854Z",
  "last_location_at": "2026-10-30T16:37:19.981854Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 250,
    "recorded_at": "2026-10-30T16:37:22Z",
    "sequence": 1793378242994
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 16,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:23.013879Z",
  "last_location_at": "2026-10-30T16:37:23.013879Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_INACCURATE"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:37:23Z",
    "sequence": 1793378243305
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 16,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:23.323769Z",
  "last_location_at": "2026-10-30T16:37:23.323769Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The support map shows when Near was last heard from

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T16:37:23.608171699Z",
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
        "lat": 50.4519,
        "lon": 30.5234
      },
      "last_location_at": "2026-10-30T16:37:23.323769Z",
      "last_heartbeat_at": "2026-10-30T16:37:23.323769Z",
      "order_id": null
    }
  ]
}
```

Done: E2, E5 (4/1), E4 and last_heartbeat_at 2026-10-30T16:37:23.323769Z.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9baa84ac-db60-41c5-9021-efd914402619",
  "session_version": 16,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:37:23.323769Z",
  "last_location_at": "2026-10-30T16:37:23.323769Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9baa84ac-db60-41c5-9021-efd914402619/close` → **200**

```json
{
  "command_id": "b616b00c-18cd-4d33-b3b0-1de0f29e4cef",
  "expected_version": 16
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

# Scenario: feature-flags

## The admin looks at the feature flags

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
  "session_id": "1356376b-b02c-4686-ad5b-5cfebc7c468a",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkxNDUsImlhdCI6MTc5MzM3ODI0NSwianRpIjoiMGY5NDc5MTMtNGFjYi00YjFjLWEzYmItNzY3YWU3ZTBlNTI0Iiwic2lkIjoiMTM1NjM3NmItYjAyYy00Njg2LWFkNWItNWNmZWJjN2M0NjhhIn0.9OozOfRZUektHlEJyiEhUFf_py3FmDF5jHBiSKXPoJM",
  "access_expires_at": "2026-10-30T16:52:25.077932332Z",
  "refresh_token": "E0bxh2ElKNXec3kfjOuVXmefWlPhGw7MBJwUbQQJI40",
  "refresh_expires_at": "2026-10-31T04:37:25.077039897Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/feature-flags` → **200**

```json
{
  "flags": [
    {
      "key": "card-payments",
      "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
      "owner": "payments",
      "review_by": "2027-06-30",
      "default_enabled": true,
      "enabled": true,
      "version": 0,
      "changed_by": null,
      "reason": null,
      "changed_at": null
    }
  ]
}
```

card-payments: {"enabled":true,"owner":"payments","review_by":"2027-06-30","version":0}

## Card payments are switched off for a provider incident

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "8f103710-a9d2-4a45-80fb-4919c19f635c",
  "expected_version": 0,
  "enabled": false,
  "reason": "Sandbox: provider incident"
}
```

```json
{
  "key": "card-payments",
  "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
  "owner": "payments",
  "review_by": "2027-06-30",
  "default_enabled": true,
  "enabled": false,
  "version": 1,
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T16:37:25.676074Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "43596f2f-f800-4f90-bfb5-d52a92e1c543",
  "expected_version": 0,
  "enabled": false,
  "reason": "An old version"
}
```

```json
{
  "instance": "/api/admin/v1/feature-flags/card-payments/change",
  "status": 409,
  "title": "Version conflict",
  "type": "https://errors.blizz.taxi/version-conflict",
  "code": "VERSION_CONFLICT",
  "correlation_id": "e7e98ac9-b4f7-4a35-ac35-b884731a2245",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "f3fb7c82-180d-496d-a4bb-b4ca99de476b",
  "expected_version": 0,
  "enabled": false,
  "reason": "x"
}
```

```json
{
  "instance": "/api/admin/v1/feature-flags/no-such-flag/change",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7267c457-2c6a-4d99-b1b1-a75b0d5ec52f"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636381749",
  "device_ref": "sandbox-17651"
}
```

```json
{
  "challenge_id": "5fb41e86-d1b2-4d85-a872-cbc592061e73",
  "expires_at": "2026-10-30T16:42:26.546932779Z",
  "resend_available_at": "2026-10-30T16:37:27.546932779Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636381749` → **200**

```json
{
  "phone": "+380636381749",
  "audience": "CLIENT",
  "code": "696525",
  "sent_at": "2026-10-30T16:37:26.550359306Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5fb41e86-d1b2-4d85-a872-cbc592061e73",
  "code": "696525",
  "device_ref": "sandbox-17651"
}
```

```json
{
  "session_id": "8e9eea4a-9cc8-4edc-8319-1990f2efe051",
  "subject": {
    "type": "CLIENT",
    "id": "32d583c0-f5bc-43f8-b0a4-d30ab0d9363b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMmQ1ODNjMC1mNWJjLTQzZjgtYjBhNC1kMzBhYjBkOTM2M2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MTQ2LCJpYXQiOjE3OTMzNzgyNDYsImp0aSI6ImNiOTBlZDE4LWIwYjgtNDBiZS04ZjRiLWE5Y2FmYjEyNDk4NSIsInNpZCI6IjhlOWVlYTRhLTljYzgtNGVkYy04MzE5LTE5OTBmMmVmZTA1MSJ9.W_xksTb8e4ugJM_oXole1VKGWPYI6GiFKnADoisK3Fs",
  "access_expires_at": "2026-10-30T16:52:26.853321457Z",
  "refresh_token": "mYcAXy90sTHDfFgVQ_WjOs67XG4xoLQhyeAvp0cBS1Q",
  "refresh_expires_at": "2026-11-29T16:37:26.852771373Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2eb61c82-08cc-47d9-bca3-9f150ede99d9",
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
  "id": "df6dddd2-5082-46d6-8558-5a0940b30343",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:42:27.130746Z",
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

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "3b14775e-b2a5-4ad8-a877-11290a860372",
  "quote_id": "df6dddd2-5082-46d6-8558-5a0940b30343",
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
  "payment_method": "CARD"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "Payment method not offered",
  "type": "https://errors.blizz.taxi/payment-method-not-offered",
  "code": "PAYMENT_METHOD_NOT_OFFERED",
  "correlation_id": "e0ff5a8b-c8c7-4af5-ad07-300b5849d020"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e6bf3b88-f5e4-457e-bdf7-708ee05b74ed",
  "quote_id": "df6dddd2-5082-46d6-8558-5a0940b30343",
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
  "id": "5c6e9323-a802-4a68-9067-f4d2e57fb7fe",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32d583c0-f5bc-43f8-b0a4-d30ab0d9363b",
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
  "created_at": "2026-10-30T16:37:27.704188Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5c6e9323-a802-4a68-9067-f4d2e57fb7fe/cancel` → **200**

```json
{
  "command_id": "4ae2178e-e780-4b2e-bffc-34d5faf3b306",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5c6e9323-a802-4a68-9067-f4d2e57fb7fe",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "32d583c0-f5bc-43f8-b0a4-d30ab0d9363b",
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
  "created_at": "2026-10-30T16:37:27.704188Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "17e306ae-5ef1-4fca-a0e4-1e6b9006ab54",
  "expected_version": 1,
  "enabled": true,
  "reason": "Sandbox: incident over"
}
```

```json
{
  "key": "card-payments",
  "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
  "owner": "payments",
  "review_by": "2027-06-30",
  "default_enabled": true,
  "enabled": true,
  "version": 2,
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T16:37:28.346851Z"
}
```

Done: a new card order refused while the flag was off; a cash order went through; the flag is on again.

`GET /api/admin/v1/feature-flags` → **200**

```json
{
  "flags": [
    {
      "key": "card-payments",
      "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
      "owner": "payments",
      "review_by": "2027-06-30",
      "default_enabled": true,
      "enabled": true,
      "version": 2,
      "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T16:37:28.346851Z"
    }
  ]
}
```

# Scenario: full-ride

## Start-up data for the apps

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 2,
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
  ],
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "rider_ios": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "driver_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
```

## Driver signs in and goes online 200 m from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23484"
}
```

```json
{
  "challenge_id": "d395d399-1099-49d9-8579-f6c72761f9ca",
  "expires_at": "2026-10-30T16:42:29.211256317Z",
  "resend_available_at": "2026-10-30T16:37:30.211256317Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "221948",
  "sent_at": "2026-10-30T16:37:29.213736743Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d395d399-1099-49d9-8579-f6c72761f9ca",
  "code": "221948",
  "device_ref": "sandbox-23484"
}
```

```json
{
  "session_id": "f7bc8cc6-a995-41c6-bca5-c69414bebf63",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTE0OSwiaWF0IjoxNzkzMzc4MjQ5LCJqdGkiOiI1YjhkOTY1ZS1kMDg1LTRmNGUtOWQ3NS0xYTRiNzFiMmYyZTgiLCJzaWQiOiJmN2JjOGNjNi1hOTk1LTQxYzYtYmNhNS1jNjk0MTRiZWJmNjMifQ.JRdYfkjr2DAsDHOP_afH3FzFmytzobsqmLPbnYidDyI",
  "access_expires_at": "2026-10-30T16:52:29.524998927Z",
  "refresh_token": "rxHDR8Z3w1NNpFQMD51BhFw_Y285enxN4_SFpQMaEy4",
  "refresh_expires_at": "2026-11-29T16:37:29.524143067Z",
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
  "command_id": "b42656a8-e92f-4b57-ad9b-27eab0bc8a3e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:37:30Z",
    "sequence": 1793378250906
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11c9edd8-9804-40b9-9d99-4d991cf97fcc",
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
  "last_heartbeat_at": "2026-10-30T16:37:30.108155Z",
  "last_location_at": "2026-10-30T16:37:30.108155Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679300664",
  "device_ref": "sandbox-10467"
}
```

```json
{
  "challenge_id": "15ff10b4-1a5e-4d1c-a228-24585a7b0b96",
  "expires_at": "2026-10-30T16:42:30.393993363Z",
  "resend_available_at": "2026-10-30T16:37:31.393993363Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679300664` → **200**

```json
{
  "phone": "+380679300664",
  "audience": "CLIENT",
  "code": "378019",
  "sent_at": "2026-10-30T16:37:30.396420612Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15ff10b4-1a5e-4d1c-a228-24585a7b0b96",
  "code": "378019",
  "device_ref": "sandbox-10467"
}
```

```json
{
  "session_id": "f9b5eeab-3c38-4325-90c8-a8e269aa3af6",
  "subject": {
    "type": "CLIENT",
    "id": "29987fa9-148f-41f7-9221-85ab19db3df6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOTk4N2ZhOS0xNDhmLTQxZjctOTIyMS04NWFiMTlkYjNkZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MTUwLCJpYXQiOjE3OTMzNzgyNTAsImp0aSI6IjU1YzMyZmZmLTIyZDMtNGY0OS04MDY0LTQyMDE4NTgwZmIxNSIsInNpZCI6ImY5YjVlZWFiLTNjMzgtNDMyNS05MGM4LWE4ZTI2OWFhM2FmNiJ9.Nc2UUHpaMz__LG1nbryH62cL1FUG3qFpwoK7KGsNMSs",
  "access_expires_at": "2026-10-30T16:52:30.710574808Z",
  "refresh_token": "2Ckx2kGcwUUqOWfueqvekD7rrzLZ1A4krS34oTR3NIw",
  "refresh_expires_at": "2026-11-29T16:37:30.710016047Z",
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
  "command_id": "6388872f-6bfc-4956-9450-970662e88c9e",
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
  "id": "a7bfcc07-f406-4fe2-b8b1-e1a2517a1172",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:42:31.288582Z",
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
  "command_id": "4a2e6b7d-d60f-4694-9bcf-dc6f76ec17f6",
  "platform": "ANDROID",
  "token": "sandbox-driver-8be9b6e5-45cd-4950-bb5e-70b1a9e2f401"
}
```

```json
{
  "id": "172a230f-4dde-4fc8-8cb5-d09f6db3550e",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T16:37:31.585146Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "39cf7295-fcc0-4b20-a072-c92d58d1900c",
  "platform": "ANDROID",
  "token": "sandbox-rider-d70d0f8c-348d-40dc-ad8a-b37d960b43ec"
}
```

```json
{
  "id": "c44706c9-ae03-4ff1-918d-b9d604bbef48",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T16:37:31.870722Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "939df422-c5fe-438f-921a-595cd9f207ab",
  "quote_id": "a7bfcc07-f406-4fe2-b8b1-e1a2517a1172",
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
  "id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29987fa9-148f-41f7-9221-85ab19db3df6",
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
  "created_at": "2026-10-30T16:37:32.162256Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "10874c61-3bb7-4de0-b15c-b2bd54018ac4",
    "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
    "expires_at": "2026-10-30T16:37:47.165149Z",
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

`POST /api/driver/v1/offers/10874c61-3bb7-4de0-b15c-b2bd54018ac4/accept` → **200**

```json
{
  "command_id": "483cde93-a8f4-40cb-ab97-3553c44fdb56"
}
```

```json
{
  "id": "6f608113-ab94-43b5-9252-08ad32d78bc3",
  "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a2a18984-b085-4979-8721-16907c4225c6",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T16:37:32.139Z` → **200**

```json
[
  {
    "at": "2026-10-30T16:37:32.8202665Z",
    "token_suffix": "e2f401",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "09a61feb-270b-412e-8575-79fb48ef1ede",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679300664&after=2026-10-30T16:37:32.139Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380679300664&after=2026-10-30T16:37:32.139Z` → **200**

```json
[
  {
    "at": "2026-10-30T16:37:33.825377558Z",
    "token_suffix": "0b43ec",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "e18d8e99-1333-418f-bcbb-7df5065ac188",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/00d3b65e-52ed-45fe-953c-d1be5e79a0fe/messages` → **201**

```json
{
  "command_id": "5ecaee98-5936-415f-942e-879cf9e2051f",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "948c9d81-643b-4ed2-a69b-5c26bf8e1610",
  "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T16:37:34.141289769Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a2a18984-b085-4979-8721-16907c4225c6",
  "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
  "assignment_id": "6f608113-ab94-43b5-9252-08ad32d78bc3",
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

`POST /api/driver/v1/trips/a2a18984-b085-4979-8721-16907c4225c6/messages` → **201**

```json
{
  "command_id": "f8b3318b-33f9-4a08-9ed3-eb51353b7e3a",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "6ee7485d-c100-480f-94cd-77f061e2fbea",
  "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T16:37:34.722848729Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/00d3b65e-52ed-45fe-953c-d1be5e79a0fe/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/a2a18984-b085-4979-8721-16907c4225c6/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679300664"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/11c9edd8-9804-40b9-9d99-4d991cf97fcc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:37:35Z",
    "sequence": 1793378255583
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11c9edd8-9804-40b9-9d99-4d991cf97fcc",
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
  "last_heartbeat_at": "2026-10-30T16:37:35.601134Z",
  "last_location_at": "2026-10-30T16:37:35.601134Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a2a18984-b085-4979-8721-16907c4225c6",
  "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
  "assignment_id": "6f608113-ab94-43b5-9252-08ad32d78bc3",
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

`POST /api/driver/v1/trips/a2a18984-b085-4979-8721-16907c4225c6/arrive` → **200**

```json
{
  "command_id": "04f4f97a-99bd-4fce-9083-427cbf3d714c",
  "expected_version": 0
}
```

```json
{
  "id": "a2a18984-b085-4979-8721-16907c4225c6",
  "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
  "assignment_id": "6f608113-ab94-43b5-9252-08ad32d78bc3",
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
  "arrived_at": "2026-10-30T16:37:36.168642Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a2a18984-b085-4979-8721-16907c4225c6/start` → **200**

```json
{
  "command_id": "89bc4b50-8117-4a4c-8da4-c3a19908c786",
  "expected_version": 1
}
```

```json
{
  "id": "a2a18984-b085-4979-8721-16907c4225c6",
  "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
  "assignment_id": "6f608113-ab94-43b5-9252-08ad32d78bc3",
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
  "arrived_at": "2026-10-30T16:37:36.168642Z",
  "started_at": "2026-10-30T16:37:36.457357Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/11c9edd8-9804-40b9-9d99-4d991cf97fcc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:38:24Z",
    "sequence": 1793378304775
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11c9edd8-9804-40b9-9d99-4d991cf97fcc",
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
  "last_heartbeat_at": "2026-10-30T16:38:24.79342Z",
  "last_location_at": "2026-10-30T16:38:24.79342Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/a2a18984-b085-4979-8721-16907c4225c6/complete` → **200**

```json
{
  "command_id": "fc58667d-57e1-4527-a69c-bde896da3f7a",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:38:25Z",
  "cash_received": true
}
```

```json
{
  "id": "a2a18984-b085-4979-8721-16907c4225c6",
  "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
  "assignment_id": "6f608113-ab94-43b5-9252-08ad32d78bc3",
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
  "arrived_at": "2026-10-30T16:37:36.168642Z",
  "started_at": "2026-10-30T16:37:36.457357Z",
  "completed_at": "2026-10-30T16:38:25.097646Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/00d3b65e-52ed-45fe-953c-d1be5e79a0fe` → **200**

```json
{
  "id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
  "short_number": 21,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "29987fa9-148f-41f7-9221-85ab19db3df6",
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
    "id": "6f608113-ab94-43b5-9252-08ad32d78bc3",
    "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a2a18984-b085-4979-8721-16907c4225c6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:37:32.162256Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
      "short_number": 21,
      "status": "FULFILLED",
      "created_at": "2026-10-30T16:37:32.162256Z",
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
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/driver/v1/trips` → **200**

```json
{
  "items": [
    {
      "id": "a2a18984-b085-4979-8721-16907c4225c6",
      "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
      "order_short_number": 21,
      "created_at": "2026-10-30T16:37:32.758122Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "3a899ca0-1f41-464e-9a09-24e4b4b7d9dc",
      "order_id": "f40b3e1e-a2b9-4ff2-8e25-48cacdd4b949",
      "order_short_number": 19,
      "created_at": "2026-10-30T16:37:21.465851Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "c69b0140-5ac3-49bb-85b2-4492950671a2",
      "order_id": "bbd96343-bfca-413e-a7d1-895589f49f64",
      "order_short_number": 18,
      "created_at": "2026-10-30T16:37:18.382914Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "e13d80f1-dd29-4616-a54a-cfd745c4405b",
      "order_id": "9d6ddab2-c015-4e5b-96cd-5ca14203f9d6",
      "order_short_number": 17,
      "created_at": "2026-10-30T16:37:15.235198Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "9fafe614-828d-4e2d-b458-79bf5e1a544d",
      "order_id": "46f31773-062f-4e1d-9b5b-b71555cedb49",
      "order_short_number": 16,
      "created_at": "2026-10-30T16:37:12.184491Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": null,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "ABORTED"
    },
    {
      "id": "2ea62c54-fc90-44bf-aeb0-f802dd6a5d1f",
      "order_id": "038911dc-7e5c-4dbf-bbf3-975f2072092f",
      "order_short_number": 10,
      "created_at": "2026-10-30T16:34:14.293387Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "6545c4a9-a051-4bdd-931a-6b561fe17cbd",
      "order_id": "e2bae62c-c65a-4861-a2ea-ca535ead7ad2",
      "order_short_number": 5,
      "created_at": "2026-10-30T16:32:39.916049Z",
      "pickup_label": "Майдан",
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 5679,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-30&to=2026-10-30` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-30",
  "to": "2026-10-30",
  "days": [
    {
      "date": "2026-10-30",
      "figures": {
        "trips": 5,
        "fare_minor": 52585,
        "commission_minor": 7890,
        "driver_share_minor": 44695,
        "held_minor": 0,
        "cash_minor": 39016,
        "cashless_minor": 13569,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": 5679
      }
    }
  ],
  "total": {
    "trips": 5,
    "fare_minor": 52585,
    "commission_minor": 7890,
    "driver_share_minor": 44695,
    "held_minor": 0,
    "cash_minor": 39016,
    "cashless_minor": 13569,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": 5679
  },
  "balance_minor": 5679
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/00d3b65e-52ed-45fe-953c-d1be5e79a0fe/tip` → **200**

```json
{
  "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
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
  "available_until": "2026-10-31T16:38:25.097646Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/00d3b65e-52ed-45fe-953c-d1be5e79a0fe/tip` → **201**

```json
{
  "command_id": "8470f437-a45d-426d-a1d1-0e2eb1e53224",
  "amount_minor": 1100
}
```

```json
{
  "id": "38eb5d58-536b-4dab-8cc1-3598a1f98183",
  "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T16:38:30.147946Z"
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
  "session_id": "875e55ce-7ddf-4516-8e21-1ddf2f599cd9",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkyMTAsImlhdCI6MTc5MzM3ODMxMCwianRpIjoiYzkzOWU1MjEtNjA2ZS00NGI1LTlkMGItMmY1MDc3NGMxMjZmIiwic2lkIjoiODc1ZTU1Y2UtN2RkZi00NTE2LThlMjEtMWRkZjJmNTk5Y2Q5In0.y-trcb8loL-qAwxRTVqn7mpSJZ3-xFlQo727-8-Yyzc",
  "access_expires_at": "2026-10-30T16:53:30.739595751Z",
  "refresh_token": "3ZbvIdwCGyt9ndpAis8r_3CJwJofWJ0grOkokAAkF3g",
  "refresh_expires_at": "2026-10-31T04:38:30.738741082Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-30&to=2026-10-30` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-30",
  "to": "2026-10-30",
  "days": [
    {
      "date": "2026-10-30",
      "counts": {
        "created": 20,
        "fulfilled": 8,
        "cancelled": 12,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 19,
          "PHONE": 1
        },
        "by_payment": {
          "CASH": 18,
          "CARD": 2
        },
        "cancelled_by": {
          "RIDER": 3,
          "DRIVER": 1,
          "STAFF": 8
        }
      }
    }
  ],
  "total": {
    "created": 20,
    "fulfilled": 8,
    "cancelled": 12,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 19,
      "PHONE": 1
    },
    "by_payment": {
      "CASH": 18,
      "CARD": 2
    },
    "cancelled_by": {
      "RIDER": 3,
      "DRIVER": 1,
      "STAFF": 8
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "STAFF",
      "code": "NO_CARS",
      "count": 8
    },
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 2
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
  "generated_at": "2026-10-30T16:38:31.026315923Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-30&to=2026-10-30` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-30",
  "to": "2026-10-30",
  "days": [
    {
      "date": "2026-10-30",
      "figures": {
        "trips": 8,
        "fares_minor": 101476,
        "service_rides_minor": 0,
        "commission_minor": 15225,
        "driver_share_minor": 86251,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 32594,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 39016,
        "tips_minor": 5000,
        "rider_debt_change_minor": 10517
      }
    }
  ],
  "total": {
    "trips": 8,
    "fares_minor": 101476,
    "service_rides_minor": 0,
    "commission_minor": 15225,
    "driver_share_minor": 86251,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 32594,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 39016,
    "tips_minor": 5000,
    "rider_debt_change_minor": 10517
  },
  "generated_at": "2026-10-30T16:38:31.307340809Z"
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
  "session_id": "7357d940-fdd0-4e0d-bd63-36b68f11e9be",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkyMTEsImlhdCI6MTc5MzM3ODMxMSwianRpIjoiZTBhNjRhMDctYzUwOC00MTM4LWJjMDgtZDFkZmQ1ZTBkZmExIiwic2lkIjoiNzM1N2Q5NDAtZmRkMC00ZTBkLWJkNjMtMzZiNjhmMTFlOWJlIn0.kSZmiCtTB0HhGc8B_DnbcTPe8cZzl7rJhn_Xbj9T6fA",
  "access_expires_at": "2026-10-30T16:53:31.896698832Z",
  "refresh_token": "foZmHIN7UvXIf05mvzrVJ98-Gsef9BZ119FguxVP4-s",
  "refresh_expires_at": "2026-10-31T04:38:31.896050631Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/00d3b65e-52ed-45fe-953c-d1be5e79a0fe/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:37:32.162689Z",
      "actor": {
        "type": "CLIENT",
        "id": "29987fa9-148f-41f7-9221-85ab19db3df6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
        "quote_id": "a7bfcc07-f406-4fe2-b8b1-e1a2517a1172",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9e5b0076-8ec7-436e-bb84-badb664f4bfc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:37:32.164382Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
        "attempt_id": "54e15a3c-2059-4cbd-b154-0b7006ad94e2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9e5b0076-8ec7-436e-bb84-badb664f4bfc"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T16:37:32.170298Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "10874c61-3bb7-4de0-b15c-b2bd54018ac4",
        "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "9e5b0076-8ec7-436e-bb84-badb664f4bfc"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T16:37:32.760699Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "10874c61-3bb7-4de0-b15c-b2bd54018ac4",
        "order_id": "00d3b65e-52ed-45fe-953c-d1be5e79a0fe",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6f608113-ab94-43b5-9252-08ad32d78bc3"
      },
      "correlation_id": "930b20b0-b83d-41ef-a326-08fd17edad91"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T16:38:32.4780837Z",
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
      "last_location_at": "2026-10-30T16:38:24.79342Z",
      "last_heartbeat_at": "2026-10-30T16:38:24.79342Z",
      "order_id": null
    }
  ]
}
```

Done: order 00d3b65e-52ed-45fe-953c-d1be5e79a0fe.

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
  "session_id": "d5529b0e-ae2e-4e77-9c1e-c2391918f797",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkyMTMsImlhdCI6MTc5MzM3ODMxMywianRpIjoiZDRkMDIxYzAtMGZhMS00OTA3LTgwZmEtMGZmNjYyYTdmMmExIiwic2lkIjoiZDU1MjliMGUtYWUyZS00ZTc3LTljMWUtYzIzOTE5MThmNzk3In0.tYYXVRAZzmci44scE3m0UaeetJiRscKBjn7Zr7Y2Uvo",
  "access_expires_at": "2026-10-30T16:53:33.06432205Z",
  "refresh_token": "vLJPOj2LuaLYrZ30fcJW1Zav-hqGy8FbzIffl4eKdIg",
  "refresh_expires_at": "2026-10-31T04:38:33.063738131Z",
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
  "command_id": "374f272f-68f5-4ef3-8d53-f17abc9f8bf0",
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
  "timestamp": "2026-10-30T16:38:33.000+0000",
  "channel": {
    "id": "1730052000.2416319342",
    "linkedid": "1730052000.2416319342",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674989482"
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
  "timestamp": "2026-10-30T16:38:33.000+0000",
  "channel": {
    "id": "1730052000.2416319342",
    "linkedid": "1730052000.2416319342",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674989482"
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
  "session_id": "527d0453-a4b6-4fec-97ba-65a5362f0cd2",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkyMTQsImlhdCI6MTc5MzM3ODMxNCwianRpIjoiZmVmZGJmNWUtOTZiMC00YjFlLTliMDAtZjIwNTQwNjIwMmIyIiwic2lkIjoiNTI3ZDA0NTMtYTRiNi00ZmVjLTk3YmEtNjVhNTM2MmYwY2QyIn0.9Ew3-AssAFL0puarYYexOQY18Qde0EEmTqymI_u_-vY",
  "access_expires_at": "2026-10-30T16:53:34.250384441Z",
  "refresh_token": "_GLwNyzIeONUKLgIe-on3JXiELrjmrNT8_S2DSALwgs",
  "refresh_expires_at": "2026-10-31T04:38:34.249828204Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "0a08587f-1b55-4aff-aa3b-dcd236cb7406",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674989482",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T16:38:33Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/0a08587f-1b55-4aff-aa3b-dcd236cb7406/answer` → **200**

```json
{
  "command_id": "06f733a8-1a3f-41de-ab3d-45b352020ca9"
}
```

```json
{
  "id": "0a08587f-1b55-4aff-aa3b-dcd236cb7406",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674989482",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "order_ids": [],
  "started_at": "2026-10-30T16:38:33Z",
  "answered_at": "2026-10-30T16:38:34.828147Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2416319342",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "588724be-873e-4e02-ae92-15fbda2bec68",
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
  "id": "dd7d1d56-1bcb-4df9-bbe1-aa6de396f925",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:43:35.149711Z",
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
  "command_id": "dbc39d3a-5257-4623-bae4-67b368437c85",
  "quote_id": "dd7d1d56-1bcb-4df9-bbe1-aa6de396f925",
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
    "phone": "+380674989482"
  },
  "call_id": "0a08587f-1b55-4aff-aa3b-dcd236cb7406"
}
```

```json
{
  "id": "caa6aebd-a407-4649-8ad4-d7d12f907243",
  "short_number": 22,
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
  "created_at": "2026-10-30T16:38:35.457571Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674989482"
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
    "id": "1730052000.2416319342",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "0a08587f-1b55-4aff-aa3b-dcd236cb7406",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674989482",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [
        "caa6aebd-a407-4649-8ad4-d7d12f907243"
      ],
      "started_at": "2026-10-30T16:38:33Z",
      "answered_at": "2026-10-30T16:38:34.828147Z",
      "ended_at": "2026-10-30T16:38:35.797465Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "fc07eb46-36ae-4b34-9224-0805127bfc0a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678688114",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [],
      "started_at": "2026-10-30T16:32:26.397143Z",
      "answered_at": "2026-10-30T16:32:26.716471Z",
      "ended_at": "2026-10-30T16:32:27.024329Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T16:32:35.607881Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/caa6aebd-a407-4649-8ad4-d7d12f907243` → **200**

```json
{
  "id": "caa6aebd-a407-4649-8ad4-d7d12f907243",
  "short_number": 22,
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
  "created_at": "2026-10-30T16:38:35.457571Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674989482"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/caa6aebd-a407-4649-8ad4-d7d12f907243` → **200**

```json
{
  "id": "caa6aebd-a407-4649-8ad4-d7d12f907243",
  "short_number": 22,
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
  "created_at": "2026-10-30T16:38:35.457571Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674989482"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/caa6aebd-a407-4649-8ad4-d7d12f907243/cancel` → **200**

```json
{
  "command_id": "f6176967-dde0-490a-9789-89df07e32aa8",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "caa6aebd-a407-4649-8ad4-d7d12f907243",
  "short_number": 22,
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
  "created_at": "2026-10-30T16:38:35.457571Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674989482"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 0a08587f-1b55-4aff-aa3b-dcd236cb7406 with order caa6aebd-a407-4649-8ad4-d7d12f907243.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23336"
}
```

```json
{
  "challenge_id": "2b9f6dea-024d-42dc-bbec-6631df421468",
  "expires_at": "2026-10-30T16:43:37.047798515Z",
  "resend_available_at": "2026-10-30T16:38:38.047798515Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "260361",
  "sent_at": "2026-10-30T16:38:37.051707489Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b9f6dea-024d-42dc-bbec-6631df421468",
  "code": "260361",
  "device_ref": "sandbox-23336"
}
```

```json
{
  "session_id": "31b50a19-9b94-41e8-91b7-664a320288fa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTIxNywiaWF0IjoxNzkzMzc4MzE3LCJqdGkiOiJmN2EyOWE1Yi00NDlhLTRlODAtOTY5OS0yNjJjMDdmM2I4ZmYiLCJzaWQiOiIzMWI1MGExOS05Yjk0LTQxZTgtOTFiNy02NjRhMzIwMjg4ZmEifQ.LBnSAwhaZyS09C8yAEjIr7S4hnItC39FmMX_Yct1RDw",
  "access_expires_at": "2026-10-30T16:53:37.356660531Z",
  "refresh_token": "EdDxuYaawMQ6y0lpuEZQe7eFq0QQjnFPKTIVSbNVkGQ",
  "refresh_expires_at": "2026-11-29T16:38:37.355870854Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11c9edd8-9804-40b9-9d99-4d991cf97fcc",
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
  "last_heartbeat_at": "2026-10-30T16:38:24.79342Z",
  "last_location_at": "2026-10-30T16:38:24.79342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/11c9edd8-9804-40b9-9d99-4d991cf97fcc/handover` → **200**

```json
{
  "command_id": "b131f443-b013-4908-9de7-60ae97eed5cd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11c9edd8-9804-40b9-9d99-4d991cf97fcc",
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
  "last_heartbeat_at": "2026-10-30T16:38:24.79342Z",
  "last_location_at": "2026-10-30T16:38:24.79342Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 85 s to the next point)

`POST /api/driver/v1/work-sessions/11c9edd8-9804-40b9-9d99-4d991cf97fcc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:40:03Z",
    "sequence": 1793378403246
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11c9edd8-9804-40b9-9d99-4d991cf97fcc",
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
  "last_heartbeat_at": "2026-10-30T16:40:03.264741Z",
  "last_location_at": "2026-10-30T16:40:03.264741Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667211794",
  "device_ref": "sandbox-8868"
}
```

```json
{
  "challenge_id": "e92eeaaa-3f2e-433a-b733-695bda1805ea",
  "expires_at": "2026-10-30T16:45:03.545730047Z",
  "resend_available_at": "2026-10-30T16:40:04.545730047Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667211794` → **200**

```json
{
  "phone": "+380667211794",
  "audience": "CLIENT",
  "code": "742165",
  "sent_at": "2026-10-30T16:40:03.550353617Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e92eeaaa-3f2e-433a-b733-695bda1805ea",
  "code": "742165",
  "device_ref": "sandbox-8868"
}
```

```json
{
  "session_id": "17e3157e-5ce3-4e37-aeb1-70689356a0c5",
  "subject": {
    "type": "CLIENT",
    "id": "49978f31-463c-4b56-bf74-7a0e81a93fef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OTk3OGYzMS00NjNjLTRiNTYtYmY3NC03YTBlODFhOTNmZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5MzAzLCJpYXQiOjE3OTMzNzg0MDMsImp0aSI6IjVlMDAxMThjLTY5OTYtNDY3OS04NTE5LTcwMzI5ZTY4OWM5OCIsInNpZCI6IjE3ZTMxNTdlLTVjZTMtNGUzNy1hZWIxLTcwNjg5MzU2YTBjNSJ9.SFAqS2fWt5gbkC5y7WdnE4th7lc1UoqOjblyTFZN4rA",
  "access_expires_at": "2026-10-30T16:55:03.859615961Z",
  "refresh_token": "FCTX8ZYlieXmoX9Xx_EYz50WMROUG-XPM_TYnv2v4Bs",
  "refresh_expires_at": "2026-11-29T16:40:03.858913396Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aa42237e-5a4c-47c8-a25d-7ac130e8a00c",
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
  "id": "746f2af5-1e3e-4692-baa6-88de86cb15bc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:45:04.142866Z",
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
  "command_id": "d7a819fb-c7fb-411f-acc4-945cdba4067f",
  "quote_id": "746f2af5-1e3e-4692-baa6-88de86cb15bc",
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
  "id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "49978f31-463c-4b56-bf74-7a0e81a93fef",
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
  "created_at": "2026-10-30T16:40:04.440939Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "f9a0f694-45cf-418c-a72c-f8e1ccae748e",
    "order_id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
    "expires_at": "2026-10-30T16:40:19.444531Z",
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

`POST /api/driver/v1/offers/f9a0f694-45cf-418c-a72c-f8e1ccae748e/accept` → **200**

```json
{
  "command_id": "8b63fe60-eb87-4dce-94b5-ace5fd5a97ad"
}
```

```json
{
  "id": "90bd0aa2-ee84-4a45-bd1e-8fc8d1528146",
  "order_id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ed7647ad-bc9c-44a4-a0b6-ab9c59d3f04b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ed7647ad-bc9c-44a4-a0b6-ab9c59d3f04b",
  "order_id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
  "assignment_id": "90bd0aa2-ee84-4a45-bd1e-8fc8d1528146",
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

`POST /api/driver/v1/work-sessions/11c9edd8-9804-40b9-9d99-4d991cf97fcc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:40:05Z",
    "sequence": 1793378405620
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11c9edd8-9804-40b9-9d99-4d991cf97fcc",
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
  "last_heartbeat_at": "2026-10-30T16:40:05.638705Z",
  "last_location_at": "2026-10-30T16:40:05.638705Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ed7647ad-bc9c-44a4-a0b6-ab9c59d3f04b/arrive` → **200**

```json
{
  "command_id": "ee979c5f-7670-4462-b31e-5a2b283df5ec",
  "expected_version": 0
}
```

```json
{
  "id": "ed7647ad-bc9c-44a4-a0b6-ab9c59d3f04b",
  "order_id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
  "assignment_id": "90bd0aa2-ee84-4a45-bd1e-8fc8d1528146",
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
  "arrived_at": "2026-10-30T16:40:05.927582Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ed7647ad-bc9c-44a4-a0b6-ab9c59d3f04b/start` → **200**

```json
{
  "command_id": "78ae937a-3ec9-4787-991d-ac530d2b1871",
  "expected_version": 1
}
```

```json
{
  "id": "ed7647ad-bc9c-44a4-a0b6-ab9c59d3f04b",
  "order_id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
  "assignment_id": "90bd0aa2-ee84-4a45-bd1e-8fc8d1528146",
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
  "arrived_at": "2026-10-30T16:40:05.927582Z",
  "started_at": "2026-10-30T16:40:06.223567Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/11c9edd8-9804-40b9-9d99-4d991cf97fcc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:41:05Z",
    "sequence": 1793378465563
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11c9edd8-9804-40b9-9d99-4d991cf97fcc",
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
  "last_heartbeat_at": "2026-10-30T16:41:05.582426Z",
  "last_location_at": "2026-10-30T16:41:05.582426Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-8534"
}
```

```json
{
  "challenge_id": "8665eda7-cb9e-4ca0-9451-9bb7543ca2f2",
  "expires_at": "2026-10-30T16:46:05.861959146Z",
  "resend_available_at": "2026-10-30T16:41:06.861959146Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "316601",
  "sent_at": "2026-10-30T16:41:05.865642851Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8665eda7-cb9e-4ca0-9451-9bb7543ca2f2",
  "code": "316601",
  "device_ref": "sandbox-8534"
}
```

```json
{
  "session_id": "ec063d87-390e-4702-9200-9dc6d30dd8d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTM2NiwiaWF0IjoxNzkzMzc4NDY2LCJqdGkiOiI0NGI3YTM5Mi1iYWVjLTQ1ZmItOWVlYS05YTRkMzA5MTYyMTgiLCJzaWQiOiJlYzA2M2Q4Ny0zOTBlLTQ3MDItOTIwMC05ZGM2ZDMwZGQ4ZDgifQ.FoteaeQAelF5tyU6XL87nLKHDmnZXQ0-gOBndw77VOY",
  "access_expires_at": "2026-10-30T16:56:06.170806672Z",
  "refresh_token": "sxTVSkrf0NJ9Jxc8mQquIDmr7xqzuYABbIF4MW542gY",
  "refresh_expires_at": "2026-11-29T16:41:06.170105776Z",
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
  "command_id": "34c78217-8456-4f29-bdc2-24761b6798d1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:41:06Z",
    "sequence": 1793378466755
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3e7364b6-567c-47ea-9ad8-4a684062f4ee",
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
  "last_heartbeat_at": "2026-10-30T16:41:06.772779Z",
  "last_location_at": "2026-10-30T16:41:06.772779Z",
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
  "session_id": "7105ec06-2b22-44f6-bfbd-e68ad47afb16",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkzNjcsImlhdCI6MTc5MzM3ODQ2NywianRpIjoiNjE2ZGJmMGUtM2ZiOC00ZDVlLTg5NGQtZmJmY2Q4YmI3OTM1Iiwic2lkIjoiNzEwNWVjMDYtMmIyMi00NGY2LWJmYmQtZTY4YWQ0N2FmYjE2In0.Gth7mRuYkna1vHTNUzwsAYSygZKtvb4jssKvuLS64Dc",
  "access_expires_at": "2026-10-30T16:56:07.353567716Z",
  "refresh_token": "0W2ik11Hfd75a5nIrHACkw-n6lueBKvLjyJcl292JVo",
  "refresh_expires_at": "2026-10-31T04:41:07.352989287Z",
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
  "session_id": "bdfdd788-1af4-4367-815a-4b523cb95b2b",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkzNjcsImlhdCI6MTc5MzM3ODQ2NywianRpIjoiMmVmYTU0YmMtMzIzMi00MWI3LWFhMTctMjI2Yzc4MWFlMzc0Iiwic2lkIjoiYmRmZGQ3ODgtMWFmNC00MzY3LTgxNWEtNGI1MjNjYjk1YjJiIn0.rtKEOTLMKGolUdEzO9YDRuR_PlfpXIjTGDJQlKe6RZs",
  "access_expires_at": "2026-10-30T16:56:07.937868408Z",
  "refresh_token": "tjuyjYs743XlDlt3CGGJr_buBOE9acUJkyTmTWBYIA8",
  "refresh_expires_at": "2026-10-31T04:41:07.937288757Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/559d4e23-c47e-4e63-adc1-741c0cf36c13` → **200**

```json
{
  "id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
  "short_number": 23,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "49978f31-463c-4b56-bf74-7a0e81a93fef",
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
    "id": "90bd0aa2-ee84-4a45-bd1e-8fc8d1528146",
    "order_id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ed7647ad-bc9c-44a4-a0b6-ab9c59d3f04b",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T16:40:04.440939Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/559d4e23-c47e-4e63-adc1-741c0cf36c13/interrupt` → **200**

```json
{
  "command_id": "f774e541-d12d-43a0-a115-81bbfb3e3154",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
    "short_number": 23,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "49978f31-463c-4b56-bf74-7a0e81a93fef",
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
      "id": "90bd0aa2-ee84-4a45-bd1e-8fc8d1528146",
      "order_id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "ed7647ad-bc9c-44a4-a0b6-ab9c59d3f04b",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T16:40:04.440939Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "9b52a8de-0f29-4d83-a4f2-996d8d867e92",
    "short_number": 24,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "49978f31-463c-4b56-bf74-7a0e81a93fef",
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
    "id": "732ed2c8-a68d-45b5-a6b0-242c8635bdeb",
    "order_id": "9b52a8de-0f29-4d83-a4f2-996d8d867e92",
    "expires_at": "2026-10-30T16:41:23.549385Z",
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

`POST /api/driver/v1/offers/732ed2c8-a68d-45b5-a6b0-242c8635bdeb/accept` → **200**

```json
{
  "command_id": "360a9db5-7741-4db6-9253-5fc701de9d50"
}
```

```json
{
  "id": "20ad1af0-1147-4195-83e2-339606a883c3",
  "order_id": "9b52a8de-0f29-4d83-a4f2-996d8d867e92",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e9132a0b-d04a-4731-b090-68b4f8bdd3a5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9132a0b-d04a-4731-b090-68b4f8bdd3a5",
  "order_id": "9b52a8de-0f29-4d83-a4f2-996d8d867e92",
  "assignment_id": "20ad1af0-1147-4195-83e2-339606a883c3",
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
  "session_id": "3e7364b6-567c-47ea-9ad8-4a684062f4ee",
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
  "last_heartbeat_at": "2026-10-30T16:41:06.772779Z",
  "last_location_at": "2026-10-30T16:41:06.772779Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3e7364b6-567c-47ea-9ad8-4a684062f4ee/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:41:10Z",
    "sequence": 1793378470579
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3e7364b6-567c-47ea-9ad8-4a684062f4ee",
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
  "last_heartbeat_at": "2026-10-30T16:41:10.075911Z",
  "last_location_at": "2026-10-30T16:41:10.075911Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e9132a0b-d04a-4731-b090-68b4f8bdd3a5/arrive` → **200**

```json
{
  "command_id": "23105c55-6f5f-4098-9e17-e88fcd08ba6f",
  "expected_version": 0
}
```

```json
{
  "id": "e9132a0b-d04a-4731-b090-68b4f8bdd3a5",
  "order_id": "9b52a8de-0f29-4d83-a4f2-996d8d867e92",
  "assignment_id": "20ad1af0-1147-4195-83e2-339606a883c3",
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
  "arrived_at": "2026-10-30T16:41:10.367892Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9132a0b-d04a-4731-b090-68b4f8bdd3a5/start` → **200**

```json
{
  "command_id": "3b65741a-9fca-47f5-94b4-21141c2bdbe7",
  "expected_version": 1
}
```

```json
{
  "id": "e9132a0b-d04a-4731-b090-68b4f8bdd3a5",
  "order_id": "9b52a8de-0f29-4d83-a4f2-996d8d867e92",
  "assignment_id": "20ad1af0-1147-4195-83e2-339606a883c3",
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
  "arrived_at": "2026-10-30T16:41:10.367892Z",
  "started_at": "2026-10-30T16:41:10.675659Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e9132a0b-d04a-4731-b090-68b4f8bdd3a5/complete` → **200**

```json
{
  "command_id": "d081c0b8-3adc-4498-8a2a-0ce0a1b4ae2b",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:41:10Z"
}
```

```json
{
  "id": "e9132a0b-d04a-4731-b090-68b4f8bdd3a5",
  "order_id": "9b52a8de-0f29-4d83-a4f2-996d8d867e92",
  "assignment_id": "20ad1af0-1147-4195-83e2-339606a883c3",
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
  "arrived_at": "2026-10-30T16:41:10.367892Z",
  "started_at": "2026-10-30T16:41:10.675659Z",
  "completed_at": "2026-10-30T16:41:10.97483Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "9b52a8de-0f29-4d83-a4f2-996d8d867e92",
      "short_number": 24,
      "status": "FULFILLED",
      "created_at": "2026-10-30T16:41:08.539127Z",
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
      "id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
      "short_number": 23,
      "status": "CANCELLED",
      "created_at": "2026-10-30T16:40:04.440939Z",
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
          "ru": "Поломка автомобиля в пути",
          "pl": "Awaria auta w trasie",
          "uk": "Поломка автомобіля в дорозі",
          "en": "Vehicle broke down on the way"
        }
      },
      "pickup_at": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
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

`GET /api/operator/v1/orders/559d4e23-c47e-4e63-adc1-741c0cf36c13/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T16:40:04.441542Z",
      "actor": {
        "type": "CLIENT",
        "id": "49978f31-463c-4b56-bf74-7a0e81a93fef",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
        "quote_id": "746f2af5-1e3e-4692-baa6-88de86cb15bc",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "42fa111e-59ee-43b5-a858-19cf6716e05e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T16:40:04.443705Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
        "attempt_id": "91d393b4-de41-47f5-bc47-f036b64d15f9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "42fa111e-59ee-43b5-a858-19cf6716e05e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T16:40:04.469674Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f9a0f694-45cf-418c-a72c-f8e1ccae748e",
        "order_id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "42fa111e-59ee-43b5-a858-19cf6716e05e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T16:40:05.053407Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f9a0f694-45cf-418c-a72c-f8e1ccae748e",
        "order_id": "559d4e23-c47e-4e63-adc1-741c0cf36c13",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "90bd0aa2-ee84-4a45-bd1e-8fc8d1528146"
      },
      "correlation_id": "8f3ce0da-1fca-4d66-b30f-aafa7de8d6b8"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/9b52a8de-0f29-4d83-a4f2-996d8d867e92/tip` → **200**

```json
{
  "order_id": "9b52a8de-0f29-4d83-a4f2-996d8d867e92",
  "currency": "UAH",
  "trip_cost_minor": 13074,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1400
    },
    {
      "percent": 15,
      "amount_minor": 2000
    },
    {
      "percent": 20,
      "amount_minor": 2700
    },
    {
      "percent": 25,
      "amount_minor": 3300
    }
  ],
  "min_minor": 100,
  "max_minor": 13100,
  "method": null,
  "available_until": "2026-10-31T16:41:10.97483Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/9b52a8de-0f29-4d83-a4f2-996d8d867e92/tip` → **409**

```json
{
  "command_id": "e0791aa1-d9e0-4708-a364-df28462d4f22",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/9b52a8de-0f29-4d83-a4f2-996d8d867e92/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3d672a3e-1894-467c-92c1-a866204f2528"
}
```

Done: interrupted 559d4e23-c47e-4e63-adc1-741c0cf36c13, follow-up 9b52a8de-0f29-4d83-a4f2-996d8d867e92.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "11c9edd8-9804-40b9-9d99-4d991cf97fcc",
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
  "last_heartbeat_at": "2026-10-30T16:41:05.582426Z",
  "last_location_at": "2026-10-30T16:41:05.582426Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/11c9edd8-9804-40b9-9d99-4d991cf97fcc/close` → **200**

```json
{
  "command_id": "75f0b79d-44aa-44df-86d2-47be463f2e6a",
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
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3e7364b6-567c-47ea-9ad8-4a684062f4ee",
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
  "last_heartbeat_at": "2026-10-30T16:41:10.075911Z",
  "last_location_at": "2026-10-30T16:41:10.075911Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3e7364b6-567c-47ea-9ad8-4a684062f4ee/close` → **200**

```json
{
  "command_id": "6a14091c-3b97-46f9-9567-295925ddec7a",
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
  "session_id": "7e95338c-1f70-4095-b38e-f4a6c7776cc2",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzkzNzcsImlhdCI6MTc5MzM3ODQ3NywianRpIjoiMGMzMjY3ZjMtZGU1YS00MGFlLTk4YjAtMDM5Mjk1MDdlMTQxIiwic2lkIjoiN2U5NTMzOGMtMWY3MC00MDk1LWIzOGUtZjRhNmM3Nzc2Y2MyIn0.7m3rdCcow25yOtyB0Nsb006P3rrhPAF32BvSpza02YQ",
  "access_expires_at": "2026-10-30T16:56:17.172758183Z",
  "refresh_token": "PNXGLVH1iLqlObysS6V7DRvLSzoc_fGHzMogEw7J5wo",
  "refresh_expires_at": "2026-10-31T04:41:17.172137446Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "0354210c-678e-4f77-b11f-a6512e8594a2",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T16:41:17Z"
}
```

```json
{
  "id": "73f85271-3856-4068-8b03-b079f09a3522",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T16:41:17Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/73f85271-3856-4068-8b03-b079f09a3522/publish` → **200**

```json
{
  "command_id": "5095c326-2034-4aa8-a044-28f10fa6ae34",
  "expected_version": 0
}
```

```json
{
  "id": "73f85271-3856-4068-8b03-b079f09a3522",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T16:41:17.882482Z",
  "published_at": "2026-10-30T16:41:17.882482Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "73f85271-3856-4068-8b03-b079f09a3522",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T16:41:17.882482Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638703247",
  "device_ref": "sandbox-26741"
}
```

```json
{
  "challenge_id": "98c1bda5-2d3d-417d-ab92-5b0b01a111ce",
  "expires_at": "2026-10-30T16:46:18.473714589Z",
  "resend_available_at": "2026-10-30T16:41:19.473714589Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638703247` → **200**

```json
{
  "phone": "+380638703247",
  "audience": "CLIENT",
  "code": "754796",
  "sent_at": "2026-10-30T16:41:18.477278117Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98c1bda5-2d3d-417d-ab92-5b0b01a111ce",
  "code": "754796",
  "device_ref": "sandbox-26741"
}
```

```json
{
  "session_id": "8563e91c-f8e0-456f-ab22-2eea53eff4cf",
  "subject": {
    "type": "CLIENT",
    "id": "7c94d4d9-4f86-469c-856e-d72df83c2de4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Yzk0ZDRkOS00Zjg2LTQ2OWMtODU2ZS1kNzJkZjgzYzJkZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5Mzc4LCJpYXQiOjE3OTMzNzg0NzgsImp0aSI6ImY0NzlhZGMyLWJlMGUtNGZjZS1hZTBhLTIwNWRmNTRiODU4YSIsInNpZCI6Ijg1NjNlOTFjLWY4ZTAtNDU2Zi1hYjIyLTJlZWE1M2VmZjRjZiJ9.u9epvWC0QoaCdwxMABNFAdDly7GSX_AT3LHW2DUCnf8",
  "access_expires_at": "2026-10-30T16:56:18.783153974Z",
  "refresh_token": "b3rQ8AIIlJ_R2sN1U2PlGFw03yFSjLiKKegvsQsDs2g",
  "refresh_expires_at": "2026-11-29T16:41:18.782581035Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "73f85271-3856-4068-8b03-b079f09a3522",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T16:41:17.882482Z",
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
  "command_id": "f8439dfe-569d-4698-9b47-0081105d82f9",
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
  "id": "9692a148-d00d-4459-aafb-e5891a6f872d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:46:19.348127Z",
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
  "command_id": "dc451425-6933-4713-b87e-afe85442bd9b",
  "quote_id": "9692a148-d00d-4459-aafb-e5891a6f872d",
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
  "correlation_id": "efd84b78-9eaf-43b5-9b80-dfc9ae8fc197"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "4f74521e-8858-4db3-bf2a-f01d8cf9ad84",
  "version_id": "73f85271-3856-4068-8b03-b079f09a3522",
  "language": "uk"
}
```

```json
{
  "version_id": "73f85271-3856-4068-8b03-b079f09a3522",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T16:41:19.930914Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cc3108ac-b01c-4b48-9561-4c10d8752639",
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
  "id": "6f0d945c-d671-4c95-b29a-0b00e8cc3442",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:46:20.227762Z",
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
  "command_id": "0940704a-80f0-4ccf-9e54-73780f83c3b1",
  "quote_id": "6f0d945c-d671-4c95-b29a-0b00e8cc3442",
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
  "id": "01836b85-2447-4e5b-ba11-9cf877b09b4f",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7c94d4d9-4f86-469c-856e-d72df83c2de4",
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
  "created_at": "2026-10-30T16:41:20.528394Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/01836b85-2447-4e5b-ba11-9cf877b09b4f` → **200**

```json
{
  "id": "01836b85-2447-4e5b-ba11-9cf877b09b4f",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7c94d4d9-4f86-469c-856e-d72df83c2de4",
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
  "created_at": "2026-10-30T16:41:20.528394Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/01836b85-2447-4e5b-ba11-9cf877b09b4f/cancel` → **200**

```json
{
  "command_id": "0cab66a8-5a71-4a90-b10d-3e42ba07daf5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "01836b85-2447-4e5b-ba11-9cf877b09b4f",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7c94d4d9-4f86-469c-856e-d72df83c2de4",
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
  "created_at": "2026-10-30T16:41:20.528394Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/73f85271-3856-4068-8b03-b079f09a3522` → **409**

```json
{
  "command_id": "dfb452a9-739f-4705-9153-5fc2f7a0a784",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T16:41:21Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/73f85271-3856-4068-8b03-b079f09a3522",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e4ad76cb-39c4-4a96-84da-d2385388f20e"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5e5fb458-11e8-4666-8a08-230ae45d16d2",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T16:41:21Z"
}
```

```json
{
  "id": "a25c71b7-ab27-4dd4-8272-0a347dbc8bd0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T16:41:21Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/a25c71b7-ab27-4dd4-8272-0a347dbc8bd0/publish` → **200**

```json
{
  "command_id": "996b2f98-82b5-4684-a3ca-e58ed0f5e5ff",
  "expected_version": 0
}
```

```json
{
  "id": "a25c71b7-ab27-4dd4-8272-0a347dbc8bd0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T16:41:22.065713Z",
  "published_at": "2026-10-30T16:41:22.065713Z",
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
  "device_ref": "sandbox-25664"
}
```

```json
{
  "challenge_id": "63db553a-0d65-4141-a0c5-c3490fe608f1",
  "expires_at": "2026-10-30T16:46:22.364418682Z",
  "resend_available_at": "2026-10-30T16:41:23.364418682Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "551039",
  "sent_at": "2026-10-30T16:41:22.366861089Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63db553a-0d65-4141-a0c5-c3490fe608f1",
  "code": "551039",
  "device_ref": "sandbox-25664"
}
```

```json
{
  "session_id": "15a1046a-b959-48e9-8461-935d58812620",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTM4MiwiaWF0IjoxNzkzMzc4NDgyLCJqdGkiOiJiZTFkZWY3MC0zZTc4LTQ5MDQtYmNhYy1kNzAyMjdhOWZjMDMiLCJzaWQiOiIxNWExMDQ2YS1iOTU5LTQ4ZTktODQ2MS05MzVkNTg4MTI2MjAifQ.iyke_M7o0td2e2eFAXr27lK3J4n5WYyebNcOP8XIgRA",
  "access_expires_at": "2026-10-30T16:56:22.698279046Z",
  "refresh_token": "Q_BoY7vypHB4xvXjqPDMWz8g_0JdV9cG6Fd8OdFoBPc",
  "refresh_expires_at": "2026-11-29T16:41:22.697763107Z",
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

(the car drives 71 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "e84104f7-adce-482d-9ee4-e126beff7bbd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:42:34Z",
    "sequence": 1793378554274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b6091ba7-f8fd-46e4-bf79-721a52da858e",
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
  "last_heartbeat_at": "2026-10-30T16:42:34.291967Z",
  "last_location_at": "2026-10-30T16:42:34.291967Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678246608",
  "device_ref": "sandbox-19746"
}
```

```json
{
  "challenge_id": "f5643d41-4b5d-481b-bcc4-03fcef17282b",
  "expires_at": "2026-10-30T16:47:34.593807402Z",
  "resend_available_at": "2026-10-30T16:42:35.593807402Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678246608` → **200**

```json
{
  "phone": "+380678246608",
  "audience": "CLIENT",
  "code": "006710",
  "sent_at": "2026-10-30T16:42:34.596744284Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5643d41-4b5d-481b-bcc4-03fcef17282b",
  "code": "006710",
  "device_ref": "sandbox-19746"
}
```

```json
{
  "session_id": "70d5a465-d800-4121-99a4-d946365870cc",
  "subject": {
    "type": "CLIENT",
    "id": "189aed9d-80fa-486a-8467-9d50be9a913e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODlhZWQ5ZC04MGZhLTQ4NmEtODQ2Ny05ZDUwYmU5YTkxM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NDU0LCJpYXQiOjE3OTMzNzg1NTQsImp0aSI6IjUxOTFkZTU3LWQxOTAtNDZmYy1iODk0LWExMTY5NmUzYTdjOSIsInNpZCI6IjcwZDVhNDY1LWQ4MDAtNDEyMS05OWE0LWQ5NDYzNjU4NzBjYyJ9.bebksfLOtGAL4QcGGBmqKhNd7t1-E-mvOiOLA50unC0",
  "access_expires_at": "2026-10-30T16:57:34.903772328Z",
  "refresh_token": "3EZ-FtSB8McQNmnoZKZMu2Fyls1jMCsra64aWPbdIc8",
  "refresh_expires_at": "2026-11-29T16:42:34.903231697Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "10461fd7-adc5-468d-96b4-079aef582f2c",
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
  "id": "cab11ba5-f54a-4fa8-ae13-411960f2058f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:47:35.191205Z",
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
  "command_id": "d1df5ea8-7435-4f71-9681-a04395b1859d",
  "quote_id": "cab11ba5-f54a-4fa8-ae13-411960f2058f",
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
    "phone": "+380679943723"
  }
}
```

```json
{
  "id": "1a6e1e5e-ec08-4c9f-b605-0f6230026c6d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
  "created_at": "2026-10-30T16:42:35.495583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "819ba17c-443d-4039-aac5-e05504777a8a",
    "order_id": "1a6e1e5e-ec08-4c9f-b605-0f6230026c6d",
    "expires_at": "2026-10-30T16:42:50.499305Z",
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

`POST /api/driver/v1/offers/819ba17c-443d-4039-aac5-e05504777a8a/accept` → **200**

```json
{
  "command_id": "7895d865-8205-4231-9ac6-b0dc84fabd6e"
}
```

```json
{
  "id": "58059739-cf46-4f1c-8070-601779fd690a",
  "order_id": "1a6e1e5e-ec08-4c9f-b605-0f6230026c6d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "119bb722-5924-4f8e-a3d0-343ad6e4d7e5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "119bb722-5924-4f8e-a3d0-343ad6e4d7e5",
  "order_id": "1a6e1e5e-ec08-4c9f-b605-0f6230026c6d",
  "assignment_id": "58059739-cf46-4f1c-8070-601779fd690a",
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
    "phone": "+380679943723"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "182bf580-2941-42c8-974b-2596f3fc0fe1",
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
  "id": "91d7f363-5723-431d-be55-7c6ac10f74fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:47:36.691725Z",
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
  "command_id": "d5ccd4b3-1dd9-44aa-a9f0-b12b6457976d",
  "quote_id": "91d7f363-5723-431d-be55-7c6ac10f74fe",
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
  "id": "d428ea87-89eb-46ac-ba86-7f55d051788d",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
  "created_at": "2026-10-30T16:42:36.988595Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3fa0388f-5368-4af4-834c-4a12a484b808",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T19:42:37Z"
}
```

```json
{
  "id": "a502024a-0967-4cb6-978f-79f889fdd3b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:47:37.318482Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T19:42:37Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7305abc5-8058-4b54-ac98-795910f9256f",
  "quote_id": "a502024a-0967-4cb6-978f-79f889fdd3b7",
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
  "pickup_at": "2026-10-30T19:42:37Z"
}
```

```json
{
  "id": "06d14a60-cf85-4a9c-a876-d16d3f311062",
  "short_number": 28,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
  "created_at": "2026-10-30T16:42:37.616861Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T19:42:37Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The fourth is refused: at most three active orders, orders for later included

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9f4116d9-b38a-4a00-b28e-b720bfeccbd8",
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
  "id": "07a81a6f-9ab6-4978-afe9-4b44fadc8ba6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:47:37.932524Z",
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
  "command_id": "7e45b263-2c1c-4653-b57a-23de341ffc8f",
  "quote_id": "07a81a6f-9ab6-4978-afe9-4b44fadc8ba6",
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
  "correlation_id": "a33044d1-6243-45e4-bd59-57d5af32430b"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "06d14a60-cf85-4a9c-a876-d16d3f311062",
      "short_number": 28,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
      "created_at": "2026-10-30T16:42:37.616861Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T19:42:37Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d428ea87-89eb-46ac-ba86-7f55d051788d",
      "short_number": 27,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
      "created_at": "2026-10-30T16:42:36.988595Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "1a6e1e5e-ec08-4c9f-b605-0f6230026c6d",
      "short_number": 26,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "d428ea87-89eb-46ac-ba86-7f55d051788d",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
  "created_at": "2026-10-30T16:42:36.988595Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/1a6e1e5e-ec08-4c9f-b605-0f6230026c6d` → **200**

```json
{
  "id": "1a6e1e5e-ec08-4c9f-b605-0f6230026c6d",
  "short_number": 26,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
    "id": "58059739-cf46-4f1c-8070-601779fd690a",
    "order_id": "1a6e1e5e-ec08-4c9f-b605-0f6230026c6d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "119bb722-5924-4f8e-a3d0-343ad6e4d7e5",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T16:42:35.495583Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": {
    "seconds": 40,
    "distance_metres": 275,
    "source": "STRAIGHT_LINE",
    "location_at": "2026-10-30T16:42:34.291967Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/1a6e1e5e-ec08-4c9f-b605-0f6230026c6d/cancel` → **200**

```json
{
  "command_id": "6da632a9-ea89-4082-9730-6066857cf7d3",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1a6e1e5e-ec08-4c9f-b605-0f6230026c6d",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
    "id": "58059739-cf46-4f1c-8070-601779fd690a",
    "order_id": "1a6e1e5e-ec08-4c9f-b605-0f6230026c6d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "119bb722-5924-4f8e-a3d0-343ad6e4d7e5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T16:42:35.495583Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d428ea87-89eb-46ac-ba86-7f55d051788d` → **200**

```json
{
  "id": "d428ea87-89eb-46ac-ba86-7f55d051788d",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
  "created_at": "2026-10-30T16:42:36.988595Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d428ea87-89eb-46ac-ba86-7f55d051788d/cancel` → **200**

```json
{
  "command_id": "6a73713f-4e73-4999-9093-893435f00d20",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d428ea87-89eb-46ac-ba86-7f55d051788d",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
  "created_at": "2026-10-30T16:42:36.988595Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/06d14a60-cf85-4a9c-a876-d16d3f311062` → **200**

```json
{
  "id": "06d14a60-cf85-4a9c-a876-d16d3f311062",
  "short_number": 28,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
  "created_at": "2026-10-30T16:42:37.616861Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T19:42:37Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/06d14a60-cf85-4a9c-a876-d16d3f311062/cancel` → **200**

```json
{
  "command_id": "5f869969-3883-4ab2-a801-ad4d273bb830",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "06d14a60-cf85-4a9c-a876-d16d3f311062",
  "short_number": 28,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "189aed9d-80fa-486a-8467-9d50be9a913e",
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
  "created_at": "2026-10-30T16:42:37.616861Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-30T19:42:37Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b6091ba7-f8fd-46e4-bf79-721a52da858e",
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
  "last_heartbeat_at": "2026-10-30T16:42:34.291967Z",
  "last_location_at": "2026-10-30T16:42:34.291967Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b6091ba7-f8fd-46e4-bf79-721a52da858e/close` → **200**

```json
{
  "command_id": "e7104e5b-63f0-425d-a104-18db7e56766a",
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

Done: orders 1a6e1e5e-ec08-4c9f-b605-0f6230026c6d, d428ea87-89eb-46ac-ba86-7f55d051788d, 06d14a60-cf85-4a9c-a876-d16d3f311062.

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
  "session_id": "a3e531b3-9005-4f0a-ad4b-b83556b1afa1",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk0NjEsImlhdCI6MTc5MzM3ODU2MSwianRpIjoiMzdlNzg1NWEtMDAyOC00MjI0LWI5NGQtZTEwMjZlNjk3ZTU0Iiwic2lkIjoiYTNlNTMxYjMtOTAwNS00ZjBhLWFkNGItYjgzNTU2YjFhZmExIn0.J9QrqsJ_yPBOlMDIINZZGrwll3AVXldqWgXONmnFzJ4",
  "access_expires_at": "2026-10-30T16:57:41.79147632Z",
  "refresh_token": "4v1cKGM2HSn0VmNlyV-mkGr-2HspppmFEWEj0UQZQMk",
  "refresh_expires_at": "2026-10-31T04:42:41.79092931Z",
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
  "session_id": "4d58619e-74ca-43c0-85ef-fed85f0f9ac5",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk0NjIsImlhdCI6MTc5MzM3ODU2MiwianRpIjoiMGRmZTJmNzEtM2M5Ni00MzY4LTg5ZDktNzE4MmU2YTkzZmYzIiwic2lkIjoiNGQ1ODYxOWUtNzRjYS00M2MwLTg1ZWYtZmVkODVmMGY5YWM1In0.XLzqpiUHHwawnzzSZS6IlQT7evP_iJ2oywZ5TrJKU3k",
  "access_expires_at": "2026-10-30T16:57:42.368240947Z",
  "refresh_token": "acjxidT6BGxfUHJLIFBUekhbgd2qQRNdgr7UzqbbCME",
  "refresh_expires_at": "2026-10-31T04:42:42.367703287Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2977"
}
```

```json
{
  "challenge_id": "e1a17b16-a82c-4cd6-85ce-ac521a6064be",
  "expires_at": "2026-10-30T16:47:42.650276049Z",
  "resend_available_at": "2026-10-30T16:42:43.650276049Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "509009",
  "sent_at": "2026-10-30T16:42:42.653658442Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1a17b16-a82c-4cd6-85ce-ac521a6064be",
  "code": "509009",
  "device_ref": "sandbox-2977"
}
```

```json
{
  "session_id": "84df3818-2bb3-4e3e-aa6d-0186f9a36082",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTQ2MiwiaWF0IjoxNzkzMzc4NTYyLCJqdGkiOiI2ZmQzMjMxNS0wMjNjLTRiYTMtOTZkMi0zZjkwZjQ2Y2ZmZDgiLCJzaWQiOiI4NGRmMzgxOC0yYmIzLTRlM2UtYWE2ZC0wMTg2ZjlhMzYwODIifQ.23t7ibDe23dideaQGS0RdDxHi8mRCNCuMQiK4mOJqU4",
  "access_expires_at": "2026-10-30T16:57:42.957434243Z",
  "refresh_token": "TiIh4dFwbYVIDAJyyuXC86GsqCqO8-U3TxDpviNuXkI",
  "refresh_expires_at": "2026-11-29T16:42:42.956775707Z",
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
  "command_id": "385c4d41-f792-402e-98ac-2ed8b6d7d82c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:42:43Z",
    "sequence": 1793378563534
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0baeafd6-0e19-4af5-a7cc-f608622313a6",
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
  "last_heartbeat_at": "2026-10-30T16:42:43.552024Z",
  "last_location_at": "2026-10-30T16:42:43.552024Z",
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
  "command_id": "ef7b820f-69de-450e-8cbc-43a46d839ef4",
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
  "effective_at": "2026-10-30T16:42:44.125603Z",
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T16:32:43.639497Z",
  "last_entries": [
    {
      "order_id": "e2bae62c-c65a-4861-a2ea-ca535ead7ad2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T16:32:43.639497Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "84e9c62b-4507-463b-85ce-a6fc99338114",
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
  "id": "4002fbd4-d1e6-435d-bcad-1f1c18170fa8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:47:44.695325Z",
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
  "command_id": "ae242469-9a54-401c-a7db-b517f343d915",
  "quote_id": "4002fbd4-d1e6-435d-bcad-1f1c18170fa8",
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
    "phone": "+3806711115077"
  }
}
```

```json
{
  "id": "f9afba2d-b0b1-4016-bdcf-32bfc02a8db2",
  "short_number": 29,
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
  "created_at": "2026-10-30T16:42:44.99669Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115077"
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
    "id": "e4587b95-867d-4a0c-962a-c5ad4db5de78",
    "order_id": "f9afba2d-b0b1-4016-bdcf-32bfc02a8db2",
    "expires_at": "2026-10-30T16:43:00.000718Z",
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

`POST /api/driver/v1/offers/e4587b95-867d-4a0c-962a-c5ad4db5de78/accept` → **200**

```json
{
  "command_id": "9b908308-ac1c-467b-89d7-1009a60e8cad"
}
```

```json
{
  "id": "4c26fdc5-abb2-41a6-805d-137466f5acae",
  "order_id": "f9afba2d-b0b1-4016-bdcf-32bfc02a8db2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bfb3b1ae-13a2-4784-8ef8-826e6c95147a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bfb3b1ae-13a2-4784-8ef8-826e6c95147a",
  "order_id": "f9afba2d-b0b1-4016-bdcf-32bfc02a8db2",
  "assignment_id": "4c26fdc5-abb2-41a6-805d-137466f5acae",
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
    "phone": "+3806711115077"
  }
}
```

`POST /api/driver/v1/work-sessions/0baeafd6-0e19-4af5-a7cc-f608622313a6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:42:46Z",
    "sequence": 1793378566208
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0baeafd6-0e19-4af5-a7cc-f608622313a6",
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
  "last_heartbeat_at": "2026-10-30T16:42:46.226234Z",
  "last_location_at": "2026-10-30T16:42:46.226234Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/bfb3b1ae-13a2-4784-8ef8-826e6c95147a/arrive` → **200**

```json
{
  "command_id": "af4e2cec-bfe2-4fce-9ec9-2551f507462e",
  "expected_version": 0
}
```

```json
{
  "id": "bfb3b1ae-13a2-4784-8ef8-826e6c95147a",
  "order_id": "f9afba2d-b0b1-4016-bdcf-32bfc02a8db2",
  "assignment_id": "4c26fdc5-abb2-41a6-805d-137466f5acae",
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
  "arrived_at": "2026-10-30T16:42:46.515833Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711115077"
  }
}
```

`POST /api/driver/v1/trips/bfb3b1ae-13a2-4784-8ef8-826e6c95147a/start` → **200**

```json
{
  "command_id": "e7a67cd9-139b-42fc-aec6-2634f0953134",
  "expected_version": 1
}
```

```json
{
  "id": "bfb3b1ae-13a2-4784-8ef8-826e6c95147a",
  "order_id": "f9afba2d-b0b1-4016-bdcf-32bfc02a8db2",
  "assignment_id": "4c26fdc5-abb2-41a6-805d-137466f5acae",
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
  "arrived_at": "2026-10-30T16:42:46.515833Z",
  "started_at": "2026-10-30T16:42:46.81677Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711115077"
  }
}
```

`POST /api/driver/v1/trips/bfb3b1ae-13a2-4784-8ef8-826e6c95147a/complete` → **200**

```json
{
  "command_id": "28976e27-d401-4823-8b66-22dde990bb30",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:42:47Z",
  "cash_received": true
}
```

```json
{
  "id": "bfb3b1ae-13a2-4784-8ef8-826e6c95147a",
  "order_id": "f9afba2d-b0b1-4016-bdcf-32bfc02a8db2",
  "assignment_id": "4c26fdc5-abb2-41a6-805d-137466f5acae",
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
  "arrived_at": "2026-10-30T16:42:46.515833Z",
  "started_at": "2026-10-30T16:42:46.81677Z",
  "completed_at": "2026-10-30T16:42:47.120453Z",
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
  "command_id": "55a5e79e-649b-4c57-9fec-d51733c84ba9",
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
  "id": "6e361ba0-583f-4fad-a4f8-fad688855cff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:47:47.427185Z",
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
  "command_id": "b4081749-4be2-44ff-ab69-c88fd938462c",
  "quote_id": "6e361ba0-583f-4fad-a4f8-fad688855cff",
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
    "phone": "+3806711112408"
  }
}
```

```json
{
  "id": "3919b385-98ca-4523-94e5-1f42c3278264",
  "short_number": 30,
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
  "created_at": "2026-10-30T16:42:47.715723Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112408"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/3919b385-98ca-4523-94e5-1f42c3278264` → **200**

```json
{
  "id": "3919b385-98ca-4523-94e5-1f42c3278264",
  "short_number": 30,
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
  "created_at": "2026-10-30T16:42:47.715723Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112408"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3919b385-98ca-4523-94e5-1f42c3278264/cancel` → **200**

```json
{
  "command_id": "91c985ba-0005-4dd9-a2df-741809e8ffb1",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "3919b385-98ca-4523-94e5-1f42c3278264",
  "short_number": 30,
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
  "created_at": "2026-10-30T16:42:47.715723Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112408"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
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
  "staff_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T16:32:43.639497Z",
  "last_entries": [
    {
      "order_id": "3919b385-98ca-4523-94e5-1f42c3278264",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T16:42:48.351567Z"
    },
    {
      "order_id": "f9afba2d-b0b1-4016-bdcf-32bfc02a8db2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T16:42:47.125495Z"
    },
    {
      "order_id": "e2bae62c-c65a-4861-a2ea-ca535ead7ad2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T16:32:43.639497Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0baeafd6-0e19-4af5-a7cc-f608622313a6",
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
  "last_heartbeat_at": "2026-10-30T16:42:46.226234Z",
  "last_location_at": "2026-10-30T16:42:46.226234Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0baeafd6-0e19-4af5-a7cc-f608622313a6/close` → **200**

```json
{
  "command_id": "62ebd6b4-54f5-445a-a0a7-f972fec44519",
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

Done: operator bonus for fulfilled f9afba2d-b0b1-4016-bdcf-32bfc02a8db2 and operator-fault cancellation 3919b385-98ca-4523-94e5-1f42c3278264.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679804893",
  "device_ref": "sandbox-185"
}
```

```json
{
  "challenge_id": "c0d68317-7bd6-4491-a9f1-68f11de15f78",
  "expires_at": "2026-10-30T16:47:52.773357289Z",
  "resend_available_at": "2026-10-30T16:42:53.773357289Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679804893` → **200**

```json
{
  "phone": "+380679804893",
  "audience": "CLIENT",
  "code": "091112",
  "sent_at": "2026-10-30T16:42:52.775965209Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679749494",
  "device_ref": "sandbox-26946",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "a17526bb-fe3b-4b0d-b177-5ad171f9285f",
  "expires_at": "2026-10-30T16:47:54.283508728Z",
  "resend_available_at": "2026-10-30T16:42:55.283508728Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679749494` → **200**

```json
{
  "phone": "+380679749494",
  "audience": "CLIENT",
  "code": "003727",
  "sent_at": "2026-10-30T16:42:54.285701174Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679749494",
  "device_ref": "sandbox-32111",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "3bea3ed3-752d-4853-8c50-cf7e5d677efa",
  "expires_at": "2026-10-30T16:47:55.787536939Z",
  "resend_available_at": "2026-10-30T16:42:56.787536939Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679749494` → **200**

```json
{
  "phone": "+380679749494",
  "audience": "CLIENT",
  "code": "290153",
  "sent_at": "2026-10-30T16:42:55.790823024Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675100000",
  "device_ref": "sandbox-4516"
}
```

```json
{
  "challenge_id": "0a99abc5-dda0-44f3-8a44-2d52b078227a",
  "expires_at": "2026-10-30T16:47:57.307432921Z",
  "resend_available_at": "2026-10-30T16:42:58.307432921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675100000",
  "device_ref": "sandbox-20426"
}
```

```json
{
  "challenge_id": "592ab60f-c12e-46a9-bec7-6ec544a07537",
  "expires_at": "2026-10-30T16:47:58.78970894Z",
  "resend_available_at": "2026-10-30T16:42:59.78970894Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675100000` → **200**

```json
{
  "phone": "+380675100000",
  "audience": "CLIENT",
  "code": "681615",
  "sent_at": "2026-10-30T16:42:58.792695119Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675100000",
  "device_ref": "sandbox-22654",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "935a8339-b98c-48ce-b331-7c4abf681ec9",
  "expires_at": "2026-10-30T16:48:00.301606611Z",
  "resend_available_at": "2026-10-30T16:43:01.301606611Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675100000` → **200**

```json
{
  "phone": "+380675100000",
  "audience": "CLIENT",
  "code": "014181",
  "sent_at": "2026-10-30T16:43:00.304744331Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675100000",
  "device_ref": "sandbox-32581",
  "channel": "VOICE"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "222bd94c-3fa8-494b-9e34-f008779f7748",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000009283"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "f12a96f0-5366-4eab-bedd-419921c58aa3"
}
```

`GET /sandbox/v1/otp?phone=%2B442000009283` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120032481"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "7224a451-411f-49be-b222-dbc15b6fd20e"
}
```

`GET /sandbox/v1/otp?phone=%2B37120032481` → **404**

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
  "session_id": "9553c714-d691-4c2d-988a-dcdbc0b75fdd",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk0ODMsImlhdCI6MTc5MzM3ODU4MywianRpIjoiYWYzODFiMzYtNmRhMi00MGY1LWFlZWUtMzhhNTc0MjVmMTAzIiwic2lkIjoiOTU1M2M3MTQtZDY5MS00YzJkLTk4OGEtZGNkYmMwYjc1ZmRkIn0.eEKMvvqYTd3ph5cmwEVQ0gmkLOvUInB9Hu1xe-BjdSc",
  "access_expires_at": "2026-10-30T16:58:03.009113752Z",
  "refresh_token": "7VYG2eI9IQnytp8bmmeB6fjNyP2SDcCaVBawuDuZMUc",
  "refresh_expires_at": "2026-10-31T04:43:03.008536413Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675100000` → **200**

```json
{
  "deliveries": [
    {
      "id": "9f6396c7-2e15-42ab-9b03-903d62f14046",
      "challenge_id": "935a8339-b98c-48ce-b331-7c4abf681ec9",
      "phone": "+380675100000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-204e73c6-50bf-4c33-af51-9c991a1851ea",
      "error": null,
      "attempted_at": "2026-10-30T16:43:00.305145Z"
    },
    {
      "id": "9c36d636-4f59-4a9a-a616-1d0568baf007",
      "challenge_id": "592ab60f-c12e-46a9-bec7-6ec544a07537",
      "phone": "+380675100000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-df09ba45-ebe4-4dd2-8643-2a9cb2dbc1ae",
      "error": null,
      "attempted_at": "2026-10-30T16:42:58.792917Z"
    },
    {
      "id": "af8061d6-f2ca-423b-a51c-8fda0c22dfa9",
      "challenge_id": "0a99abc5-dda0-44f3-8a44-2d52b078227a",
      "phone": "+380675100000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T16:42:57.310538Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675100000` → **200**

```json
{
  "phone": "+380675100000",
  "audience": "CLIENT",
  "code": "014181",
  "sent_at": "2026-10-30T16:43:00.304744331Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679749494` → **200**

```json
{
  "deliveries": [
    {
      "id": "279cee8a-e2df-46a6-8c84-fd573c23da7b",
      "challenge_id": "3bea3ed3-752d-4853-8c50-cf7e5d677efa",
      "phone": "+380679749494",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-7e94fe9b-f4df-486e-9cc9-821061f9fbd9",
      "error": null,
      "attempted_at": "2026-10-30T16:42:55.791156Z"
    },
    {
      "id": "0822d643-6e14-48d4-bd71-71c6f1a47d97",
      "challenge_id": "a17526bb-fe3b-4b0d-b177-5ad171f9285f",
      "phone": "+380679749494",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b341db10-e685-4c1f-9793-11b16156a382",
      "error": null,
      "attempted_at": "2026-10-30T16:42:54.28607Z"
    }
  ]
}
```

Done: SMS to +380679804893; SMS then a call to +380679749494; a failed SMS, two calls and a refused third to +380675100000; +44 and +371 refused.

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
  "session_id": "53bf4331-4d5e-4232-9e22-a4b5a03a3c6a",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk0ODQsImlhdCI6MTc5MzM3ODU4NCwianRpIjoiOTVjN2ZiMDMtNmVmZC00NDA5LWFhOTQtN2MyNjFlMTNhMzY4Iiwic2lkIjoiNTNiZjQzMzEtNGQ1ZS00MjMyLTllMjItYTRiNWEwM2EzYzZhIn0.z_Pqh7pvQ8BnAGYG4WW2H3JHOvpHRsHqjfYJCdNBTCc",
  "access_expires_at": "2026-10-30T16:58:04.214464685Z",
  "refresh_token": "KR2ZHJjvvY6zfXGaZlA_FB8tKE0RQXQNK2gzHS6p_e8",
  "refresh_expires_at": "2026-10-31T04:43:04.213932884Z",
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
  "session_id": "ab2ea066-136d-45b0-bdfb-f4acdc56fbe7",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk0ODQsImlhdCI6MTc5MzM3ODU4NCwianRpIjoiOWI1YjFhNzEtMTMyMC00MzJmLTljZmQtYzkxODBhYzJlMmJiIiwic2lkIjoiYWIyZWEwNjYtMTM2ZC00NWIwLWJkZmItZjRhY2RjNTZmYmU3In0.RsKsNfW8TelUSxfbTsYQvMqglULDWzAPc350a5hQMS0",
  "access_expires_at": "2026-10-30T16:58:04.790753807Z",
  "refresh_token": "ut8OV9gUnXde-EIdAS-eQDm_bvB2f_EROCpabqeuezE",
  "refresh_expires_at": "2026-10-31T04:43:04.790191266Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
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
    "payments.retry",
    "promotions.manage",
    "support.manage",
    "clients.manage",
    "clients.delete",
    "operator-bonuses.manage",
    "retention.manage",
    "settings.manage",
    "flags.manage",
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

`POST /api/admin/v1/staff-extensions/ac5d2bb3-fc7c-46e7-9336-3d1329aad56f` → **200**

```json
{
  "command_id": "c371b19e-eefe-43a0-ba50-bfa35fa39e7f",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "7d748f66-8d57-47c8-b98b-332e7b6ece15",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T16:43:05.971307Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T16:43:05.971307Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5f3aa3d5-f44d-4f4e-aeb8-50da7d192d70",
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
  "id": "80ca448b-97b8-4bdc-a41b-7200dbae474f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:48:06.542246Z",
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
  "command_id": "bb4ba8aa-5e87-47d6-bfae-11490dea5135",
  "quote_id": "80ca448b-97b8-4bdc-a41b-7200dbae474f",
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
    "phone": "+380672681706"
  }
}
```

```json
{
  "id": "474138cf-0bf2-4112-bf7c-fbe222475563",
  "short_number": 31,
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
  "created_at": "2026-10-30T16:43:06.837456Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672681706"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/474138cf-0bf2-4112-bf7c-fbe222475563/calls` → **201**

```json
{
  "command_id": "fac5a49d-9d83-4fea-b84e-509cb5322452",
  "to": "CALLER"
}
```

```json
{
  "id": "0ce29e72-6b50-4b4a-afb4-3ad67dda97e9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "order_ids": [
    "474138cf-0bf2-4112-bf7c-fbe222475563"
  ],
  "started_at": "2026-10-30T16:43:07.156143Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/474138cf-0bf2-4112-bf7c-fbe222475563/calls` → **201**

```json
{
  "command_id": "fac5a49d-9d83-4fea-b84e-509cb5322452",
  "to": "CALLER"
}
```

```json
{
  "id": "0ce29e72-6b50-4b4a-afb4-3ad67dda97e9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "order_ids": [
    "474138cf-0bf2-4112-bf7c-fbe222475563"
  ],
  "started_at": "2026-10-30T16:43:07.156143Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "0ce29e72-6b50-4b4a-afb4-3ad67dda97e9",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380672681706",
    "at": "2026-10-30T16:43:07.158685559Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "0ce29e72-6b50-4b4a-afb4-3ad67dda97e9",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.29427",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "0ce29e72-6b50-4b4a-afb4-3ad67dda97e9"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "0ce29e72-6b50-4b4a-afb4-3ad67dda97e9",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=474138cf-0bf2-4112-bf7c-fbe222475563` → **200**

```json
{
  "calls": [
    {
      "id": "0ce29e72-6b50-4b4a-afb4-3ad67dda97e9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [
        "474138cf-0bf2-4112-bf7c-fbe222475563"
      ],
      "started_at": "2026-10-30T16:43:07.156143Z",
      "answered_at": "2026-10-30T16:43:07.824573Z",
      "ended_at": "2026-10-30T16:43:07.846568Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=474138cf-0bf2-4112-bf7c-fbe222475563` → **200**

```json
{
  "calls": [
    {
      "id": "0ce29e72-6b50-4b4a-afb4-3ad67dda97e9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [
        "474138cf-0bf2-4112-bf7c-fbe222475563"
      ],
      "started_at": "2026-10-30T16:43:07.156143Z",
      "answered_at": "2026-10-30T16:43:07.824573Z",
      "ended_at": "2026-10-30T16:43:07.846568Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=474138cf-0bf2-4112-bf7c-fbe222475563` → **200**

```json
{
  "calls": [
    {
      "id": "0ce29e72-6b50-4b4a-afb4-3ad67dda97e9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [
        "474138cf-0bf2-4112-bf7c-fbe222475563"
      ],
      "started_at": "2026-10-30T16:43:07.156143Z",
      "answered_at": "2026-10-30T16:43:07.824573Z",
      "ended_at": "2026-10-30T16:43:07.846568Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=474138cf-0bf2-4112-bf7c-fbe222475563` → **200**

```json
{
  "calls": [
    {
      "id": "0ce29e72-6b50-4b4a-afb4-3ad67dda97e9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [
        "474138cf-0bf2-4112-bf7c-fbe222475563"
      ],
      "started_at": "2026-10-30T16:43:07.156143Z",
      "answered_at": "2026-10-30T16:43:07.824573Z",
      "ended_at": "2026-10-30T16:43:07.846568Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=474138cf-0bf2-4112-bf7c-fbe222475563` → **200**

```json
{
  "calls": [
    {
      "id": "0ce29e72-6b50-4b4a-afb4-3ad67dda97e9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "order_ids": [
        "474138cf-0bf2-4112-bf7c-fbe222475563"
      ],
      "started_at": "2026-10-30T16:43:07.156143Z",
      "answered_at": "2026-10-30T16:43:07.824573Z",
      "ended_at": "2026-10-30T16:43:07.846568Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T16:43:15.688953Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/474138cf-0bf2-4112-bf7c-fbe222475563` → **200**

```json
{
  "id": "474138cf-0bf2-4112-bf7c-fbe222475563",
  "short_number": 31,
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
  "created_at": "2026-10-30T16:43:06.837456Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672681706"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/474138cf-0bf2-4112-bf7c-fbe222475563/cancel` → **200**

```json
{
  "command_id": "a1363ac1-1c08-4eec-b6c0-acb32d2d9897",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "474138cf-0bf2-4112-bf7c-fbe222475563",
  "short_number": 31,
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
  "created_at": "2026-10-30T16:43:06.837456Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672681706"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "command_id": "2577a499-e1e6-4f6a-8e3b-0883dab8268c",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T16:43:18.056734Z",
  "extension": "101"
}
```

Done: outgoing call 0ce29e72-6b50-4b4a-afb4-3ad67dda97e9 from order 474138cf-0bf2-4112-bf7c-fbe222475563, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634733319",
  "device_ref": "sandbox-24839"
}
```

```json
{
  "challenge_id": "741855dd-8ba3-49a6-8159-91b5d9403287",
  "expires_at": "2026-10-30T16:48:18.355015201Z",
  "resend_available_at": "2026-10-30T16:43:19.355015201Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634733319` → **200**

```json
{
  "phone": "+380634733319",
  "audience": "CLIENT",
  "code": "011136",
  "sent_at": "2026-10-30T16:43:18.357881157Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "741855dd-8ba3-49a6-8159-91b5d9403287",
  "code": "011136",
  "device_ref": "sandbox-24839"
}
```

```json
{
  "session_id": "c648b06a-88e0-4efb-8516-735dbe2f2ade",
  "subject": {
    "type": "CLIENT",
    "id": "3992f78b-1391-4ba7-9575-9d660f0943ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTkyZjc4Yi0xMzkxLTRiYTctOTU3NS05ZDY2MGYwOTQzYWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NDk4LCJpYXQiOjE3OTMzNzg1OTgsImp0aSI6ImVkNGVmYzQ1LTBlMDMtNGU0Ny1iNmNiLTM2ZGE2MDMzMjM4ZiIsInNpZCI6ImM2NDhiMDZhLTg4ZTAtNGVmYi04NTE2LTczNWRiZTJmMmFkZSJ9.XTgwuahgVy4tucHS9JUYq1_hExFfqFayU80M4NOS0lw",
  "access_expires_at": "2026-10-30T16:58:18.662800095Z",
  "refresh_token": "wb_kFpnM8I-ceL2cRu49ow5jG3wjP1QaKCKrPTyaEY8",
  "refresh_expires_at": "2026-11-29T16:43:18.66226094Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3992f78b-1391-4ba7-9575-9d660f0943ae",
  "session_id": "c648b06a-88e0-4efb-8516-735dbe2f2ade",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634733319",
  "device_ref": "sandbox-18679"
}
```

```json
{
  "challenge_id": "fbd24b87-82c4-4ded-93cd-3d3c06b46525",
  "expires_at": "2026-10-30T16:48:21.230407476Z",
  "resend_available_at": "2026-10-30T16:43:22.230407476Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634733319` → **200**

```json
{
  "phone": "+380634733319",
  "audience": "CLIENT",
  "code": "794834",
  "sent_at": "2026-10-30T16:43:21.235079482Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fbd24b87-82c4-4ded-93cd-3d3c06b46525",
  "code": "794834",
  "device_ref": "sandbox-18679"
}
```

```json
{
  "session_id": "7b2dab6b-3c10-4614-85c0-24a5e7dc50e2",
  "subject": {
    "type": "CLIENT",
    "id": "3992f78b-1391-4ba7-9575-9d660f0943ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTkyZjc4Yi0xMzkxLTRiYTctOTU3NS05ZDY2MGYwOTQzYWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NTAxLCJpYXQiOjE3OTMzNzg2MDEsImp0aSI6Ijg0NzRjNGJjLTJmZDQtNDFkMi1hMTY1LTM2OTA5MjZmZDZiOSIsInNpZCI6IjdiMmRhYjZiLTNjMTAtNDYxNC04NWMwLTI0YTVlN2RjNTBlMiJ9.Ua3ryNBiJRK9FMrsKNLkpddsIrHNP-jCEMOrAq4uaPA",
  "access_expires_at": "2026-10-30T16:58:21.553821581Z",
  "refresh_token": "V_D9i5RF6x2YmJcmXu3sWJVbADKyJSCXjHqBz_Rl9rU",
  "refresh_expires_at": "2026-11-29T16:43:21.553226271Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "038ac669-a228-460f-83b9-1021afc1f0cc",
  "expires_at": "2026-10-30T16:48:23.838712514Z",
  "resend_available_at": "2026-10-30T16:43:24.838712514Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634733319` → **200**

```json
{
  "phone": "+380634733319",
  "audience": "CLIENT",
  "code": "546775",
  "sent_at": "2026-10-30T16:43:23.842073415Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639051302"
}
```

```json
{
  "challenge_id": "9678ee0b-7fd9-4a48-927f-01811815a67f",
  "expires_at": "2026-10-30T16:48:24.148075216Z",
  "resend_available_at": "2026-10-30T16:43:25.148075216Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639051302` → **200**

```json
{
  "phone": "+380639051302",
  "audience": "CLIENT",
  "code": "285302",
  "sent_at": "2026-10-30T16:43:24.150718804Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "e531296d-5082-48d6-8883-80e1554cecf6",
  "current_challenge_id": "038ac669-a228-460f-83b9-1021afc1f0cc",
  "current_code": "000000",
  "new_challenge_id": "9678ee0b-7fd9-4a48-927f-01811815a67f",
  "new_code": "285302"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "f09bbab7-b7a8-450f-8b2f-406ceb710115"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "c5dbc5e2-5970-48b3-afbf-f05cd55bd815",
  "current_challenge_id": "038ac669-a228-460f-83b9-1021afc1f0cc",
  "current_code": "546775",
  "new_challenge_id": "9678ee0b-7fd9-4a48-927f-01811815a67f",
  "new_code": "285302"
}
```

```json
{
  "subject_id": "3992f78b-1391-4ba7-9575-9d660f0943ae",
  "phone": "+380639051302",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3992f78b-1391-4ba7-9575-9d660f0943ae",
  "session_id": "c648b06a-88e0-4efb-8516-735dbe2f2ade",
  "account_state": "ACTIVE"
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
  "correlation_id": "461579c8-ac58-4c8a-b2a2-8bfe8f8cd81b"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639051302",
  "device_ref": "sandbox-10302"
}
```

```json
{
  "challenge_id": "1de66dca-11bf-495a-b323-79e9aeff775c",
  "expires_at": "2026-10-30T16:48:27.614423899Z",
  "resend_available_at": "2026-10-30T16:43:28.614423899Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639051302` → **200**

```json
{
  "phone": "+380639051302",
  "audience": "CLIENT",
  "code": "435320",
  "sent_at": "2026-10-30T16:43:27.617032347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1de66dca-11bf-495a-b323-79e9aeff775c",
  "code": "435320",
  "device_ref": "sandbox-10302"
}
```

```json
{
  "session_id": "6c450b95-d90b-4b6e-aca1-0984371f16ce",
  "subject": {
    "type": "CLIENT",
    "id": "3992f78b-1391-4ba7-9575-9d660f0943ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTkyZjc4Yi0xMzkxLTRiYTctOTU3NS05ZDY2MGYwOTQzYWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NTA3LCJpYXQiOjE3OTMzNzg2MDcsImp0aSI6ImQxYmUwMDU4LTIwYjMtNDQ5Yi1hZTFkLWQ2NjI1MDQ5ZTdmMiIsInNpZCI6IjZjNDUwYjk1LWQ5MGItNGI2ZS1hY2ExLTA5ODQzNzFmMTZjZSJ9.fAjYuBLRRd9ef-rQOgPeEiKpHZqlFeXJzdjsJQ4s5sY",
  "access_expires_at": "2026-10-30T16:58:27.920110388Z",
  "refresh_token": "evgJ1JcN3dM3yRnddVIg3E4ycEaFTTNpCGzX4TvbtdY",
  "refresh_expires_at": "2026-11-29T16:43:27.919558178Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3992f78b-1391-4ba7-9575-9d660f0943ae",
  "session_id": "6c450b95-d90b-4b6e-aca1-0984371f16ce",
  "account_state": "ACTIVE"
}
```

## The rider loses the phone: support checks who it is and sends a code to the new phone

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
  "session_id": "6b76837c-86ca-4e2b-a7b9-cd1108ab535d",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk1MDgsImlhdCI6MTc5MzM3ODYwOCwianRpIjoiMjg4NWFlYjItYTA3Yi00ZTc4LWE0NjAtOWVlMmJiOGJiZGU3Iiwic2lkIjoiNmI3NjgzN2MtODZjYS00ZTJiLWE3YjktY2QxMTA4YWI1MzVkIn0.DrV-Nsz1Umw8FWIjnkyRwcKtYIQkS09iCZbqj6VYLRU",
  "access_expires_at": "2026-10-30T16:58:28.765085218Z",
  "refresh_token": "Aoh1w8ACr_SS0Bm2VrVV_ffftO5sDmCjpfcwrPpKobY",
  "refresh_expires_at": "2026-10-31T04:43:28.76451796Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/3992f78b-1391-4ba7-9575-9d660f0943ae` → **200**

```json
{
  "client": {
    "id": "3992f78b-1391-4ba7-9575-9d660f0943ae",
    "phone": "+380639051302",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T16:43:18.660751Z",
    "version": 3,
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

`POST /api/admin/v1/clients/3992f78b-1391-4ba7-9575-9d660f0943ae/phone/new-code` → **201**

```json
{
  "phone": "+380632312094"
}
```

```json
{
  "challenge_id": "96acaaca-f2ea-4e57-8986-f88c23cf3941",
  "expires_at": "2026-10-30T16:48:29.388543905Z",
  "resend_available_at": "2026-10-30T16:43:30.388543905Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632312094` → **200**

```json
{
  "phone": "+380632312094",
  "audience": "CLIENT",
  "code": "625704",
  "sent_at": "2026-10-30T16:43:29.391161404Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/3992f78b-1391-4ba7-9575-9d660f0943ae/phone` → **422**

```json
{
  "command_id": "47332690-bf7f-4324-8c32-79912d0b02f1",
  "expected_version": 3,
  "new_challenge_id": "96acaaca-f2ea-4e57-8986-f88c23cf3941",
  "new_code": "625705",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/3992f78b-1391-4ba7-9575-9d660f0943ae/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "bf471321-7654-4efc-91c0-4ad37d3bc574"
}
```

`POST /api/admin/v1/clients/3992f78b-1391-4ba7-9575-9d660f0943ae/phone` → **400**

```json
{
  "command_id": "a3361f67-9bce-420a-9445-546abc59960a",
  "expected_version": 3,
  "new_challenge_id": "96acaaca-f2ea-4e57-8986-f88c23cf3941",
  "new_code": "625704",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/3992f78b-1391-4ba7-9575-9d660f0943ae/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a98c3e82-b093-4fdd-80c6-6ce1e0809953",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/3992f78b-1391-4ba7-9575-9d660f0943ae/phone` → **200**

```json
{
  "command_id": "2a23be2a-2c61-48ab-a2c7-616b57462c5a",
  "expected_version": 3,
  "new_challenge_id": "96acaaca-f2ea-4e57-8986-f88c23cf3941",
  "new_code": "625704",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "3992f78b-1391-4ba7-9575-9d660f0943ae",
  "phone": "+380632312094",
  "version": 4
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
  "correlation_id": "098d4afc-74e8-4256-913c-6d096f9f6dba"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632312094",
  "device_ref": "sandbox-31713"
}
```

```json
{
  "challenge_id": "df694743-eacb-401d-8820-4d637eb5fe0b",
  "expires_at": "2026-10-30T16:48:30.844020711Z",
  "resend_available_at": "2026-10-30T16:43:31.844020711Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632312094` → **200**

```json
{
  "phone": "+380632312094",
  "audience": "CLIENT",
  "code": "566107",
  "sent_at": "2026-10-30T16:43:30.846771236Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df694743-eacb-401d-8820-4d637eb5fe0b",
  "code": "566107",
  "device_ref": "sandbox-31713"
}
```

```json
{
  "session_id": "ba6a26af-0062-4459-9cfc-52c61536dd9c",
  "subject": {
    "type": "CLIENT",
    "id": "3992f78b-1391-4ba7-9575-9d660f0943ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTkyZjc4Yi0xMzkxLTRiYTctOTU3NS05ZDY2MGYwOTQzYWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NTExLCJpYXQiOjE3OTMzNzg2MTEsImp0aSI6ImMwN2VhYzRhLTUxMzItNDkyYy04ZjFjLWJjNWVmMWJiMTgxNSIsInNpZCI6ImJhNmEyNmFmLTAwNjItNDQ1OS05Y2ZjLTUyYzYxNTM2ZGQ5YyJ9.-Ez9AmYThG99JJRgj6CUUT_fayKwFS9ycnLUOgPBwG0",
  "access_expires_at": "2026-10-30T16:58:31.149525424Z",
  "refresh_token": "btD0TubKMnURiW9hDkfNckordzKP0Uw5jsXZTqdtHFY",
  "refresh_expires_at": "2026-11-29T16:43:31.149014212Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3992f78b-1391-4ba7-9575-9d660f0943ae",
  "session_id": "ba6a26af-0062-4459-9cfc-52c61536dd9c",
  "account_state": "ACTIVE"
}
```

Done: changed with both codes (one was not enough), then by support with a code to the new phone and a reason; sessions ended each time.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635539824",
  "device_ref": "sandbox-26441"
}
```

```json
{
  "challenge_id": "205669fb-4164-445d-abaa-fb0ce80abfcb",
  "expires_at": "2026-10-30T16:48:31.720521607Z",
  "resend_available_at": "2026-10-30T16:43:32.720521607Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635539824` → **200**

```json
{
  "phone": "+380635539824",
  "audience": "CLIENT",
  "code": "509055",
  "sent_at": "2026-10-30T16:43:31.722914465Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "205669fb-4164-445d-abaa-fb0ce80abfcb",
  "code": "509055",
  "device_ref": "sandbox-26441"
}
```

```json
{
  "session_id": "95bd3246-5de4-4446-9f72-7f960197ad46",
  "subject": {
    "type": "CLIENT",
    "id": "d555ec4f-66bc-4f02-8d0f-ee401f49571d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTU1ZWM0Zi02NmJjLTRmMDItOGQwZi1lZTQwMWY0OTU3MWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NTEyLCJpYXQiOjE3OTMzNzg2MTIsImp0aSI6IjIzOWE4MGFmLTFhZmMtNDgwMC1hNWMyLTZiMzc5MWUyMGM2MiIsInNpZCI6Ijk1YmQzMjQ2LTVkZTQtNDQ0Ni05ZjcyLTdmOTYwMTk3YWQ0NiJ9.HY0XVJV1KV7wjGtO5mt5V7_SDSwdmgV59AYOjXk8nhA",
  "access_expires_at": "2026-10-30T16:58:32.030580303Z",
  "refresh_token": "JH93y5VoUnLuxAdygpn24MHiWJsT1UIUoemIYB2L03I",
  "refresh_expires_at": "2026-11-29T16:43:32.030059749Z",
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
  "session_id": "ddd883da-7d15-48ea-8357-f4950aa4710d",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk1MTMsImlhdCI6MTc5MzM3ODYxMywianRpIjoiOGU1NTJiZjQtN2JkNy00MGQ2LWE2MTAtYTUzM2VlMjQ5ZDY2Iiwic2lkIjoiZGRkODgzZGEtN2QxNS00OGVhLTgzNTctZjQ5NTBhYTQ3MTBkIn0.BZkEyTq4ThWopNOcKmKNC1K_rBv1SIAla7PraA5IYgc",
  "access_expires_at": "2026-10-30T16:58:33.189188082Z",
  "refresh_token": "RQcSnRJAsZa4DraEUODwrTGEGop6_zVCboGN6BIgHpo",
  "refresh_expires_at": "2026-10-31T04:43:33.188646972Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635539824` → **200**

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
  "correlation_id": "18de5442-2c38-4126-b0b7-89483c8b1fc0"
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
  "session_id": "f8033136-9e1f-4bd4-a115-f17e9720f18c",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk1MTQsImlhdCI6MTc5MzM3ODYxNCwianRpIjoiMDNiNTAyNjUtZDkyYy00MmRmLWJiMmYtODMzMWZmZTM4NDZlIiwic2lkIjoiZjgwMzMxMzYtOWUxZi00YmQ0LWExMTUtZjE3ZTk3MjBmMThjIn0.xswupItEEBjwFcffoAcdATdHayaQbR5GeHhQpAVRzk0",
  "access_expires_at": "2026-10-30T16:58:34.350030921Z",
  "refresh_token": "SIcCIcRQre4z8Rt0BU7ot82_919A-5If1nosX42L-So",
  "refresh_expires_at": "2026-10-31T04:43:34.349442643Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/settings` → **200**

```json
{
  "version": 2,
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T16:28:38.770675Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "08044631-4590-4c49-8d6a-34153c673158",
  "expected_version": 2,
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "reason": "Sandbox: pre-orders by reservation"
}
```

```json
{
  "version": 3,
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
    },
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T16:43:34.943036473Z"
}
```

## The rider books the airport for 2026-10-30T19:43:34Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600964956",
  "device_ref": "sandbox-14121"
}
```

```json
{
  "challenge_id": "9eedbf7b-ab62-4427-8d9e-66510cf93624",
  "expires_at": "2026-10-30T16:48:35.251561626Z",
  "resend_available_at": "2026-10-30T16:43:36.251561626Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600964956` → **200**

```json
{
  "phone": "+48600964956",
  "audience": "CLIENT",
  "code": "051004",
  "sent_at": "2026-10-30T16:43:35.254318322Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9eedbf7b-ab62-4427-8d9e-66510cf93624",
  "code": "051004",
  "device_ref": "sandbox-14121"
}
```

```json
{
  "session_id": "28a97179-bcb8-425b-a9a5-b68a9bd6b352",
  "subject": {
    "type": "CLIENT",
    "id": "8df80ce9-f7d7-4e34-9fcf-bd316adcd2b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGY4MGNlOS1mN2Q3LTRlMzQtOWZjZi1iZDMxNmFkY2QyYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NTE1LCJpYXQiOjE3OTMzNzg2MTUsImp0aSI6Ijg4YzVlYzAwLWZhNzAtNDNiYy04YTFhLTRhMzJkMTAzZjNmOCIsInNpZCI6IjI4YTk3MTc5LWJjYjgtNDI1Yi1hOWE1LWI2OGE5YmQ2YjM1MiJ9.WHgABJ8GfUaKu9vMWwIcDM_xI_ybZlT1NpUjYISBJJc",
  "access_expires_at": "2026-10-30T16:58:35.565565519Z",
  "refresh_token": "gYvy4q4kQ28-i-1wow14_DhISszKivAMQl5iRznNvp8",
  "refresh_expires_at": "2026-11-29T16:43:35.565015102Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d0c5afe-1f14-4585-90b0-1083465b23ed",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T19:43:34Z"
}
```

```json
{
  "id": "6d6a6222-80f4-49a5-8a8a-89c26c2418a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:48:35.859780Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T19:43:34Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "628c5e49-a076-43ee-b5f5-55587870a7ef",
  "quote_id": "6d6a6222-80f4-49a5-8a8a-89c26c2418a3",
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
  "pickup_at": "2026-10-30T19:43:34Z"
}
```

```json
{
  "id": "0e80fbbf-157b-4e12-bbdb-4b709e59e8de",
  "short_number": 32,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8df80ce9-f7d7-4e34-9fcf-bd316adcd2b0",
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
  "created_at": "2026-10-30T16:43:36.158795Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T19:43:34Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-1794"
}
```

```json
{
  "challenge_id": "91ce636d-ee2f-40fc-8fe4-aa0e05d7e21e",
  "expires_at": "2026-10-30T16:48:36.457100645Z",
  "resend_available_at": "2026-10-30T16:43:37.457100645Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "740022",
  "sent_at": "2026-10-30T16:43:36.459813886Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91ce636d-ee2f-40fc-8fe4-aa0e05d7e21e",
  "code": "740022",
  "device_ref": "sandbox-1794"
}
```

```json
{
  "session_id": "922af971-4165-44c9-b713-4a2fad9ad7fc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTUxNiwiaWF0IjoxNzkzMzc4NjE2LCJqdGkiOiI2M2I1ZjlmNi1iYTUwLTQ5MjQtOTkwNy1hN2FlZDU0YjAyZjYiLCJzaWQiOiI5MjJhZjk3MS00MTY1LTQ0YzktYjcxMy00YTJmYWQ5YWQ3ZmMifQ.vKUK7GbpoTY5mRp3CeEir1-J86ZW3hxuf5YU5B_7GJ4",
  "access_expires_at": "2026-10-30T16:58:36.758306206Z",
  "refresh_token": "GzV1CeQsiz4Dk79QLIQhwmguQlM3qIWcjV4Br-w2-OY",
  "refresh_expires_at": "2026-11-29T16:43:36.757773021Z",
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
  "command_id": "920e9015-f1d7-41a9-bef3-74002e6d1a94",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:43:37Z",
    "sequence": 1793378617327
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "067886b6-cbe9-4bcc-a442-d302503c17e3",
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
  "last_heartbeat_at": "2026-10-30T16:43:37.345498Z",
  "last_location_at": "2026-10-30T16:43:37.345498Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "0e80fbbf-157b-4e12-bbdb-4b709e59e8de",
      "short_number": 32,
      "pickup_at": "2026-10-30T19:43:34Z",
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

`POST /api/driver/v1/preorders/0e80fbbf-157b-4e12-bbdb-4b709e59e8de/reserve` → **200**

```json
{
  "command_id": "9280b499-1f31-49c8-8ce5-1e6fe5a81700"
}
```

```json
{
  "id": "96c42fa9-4042-4b72-b39b-f48cba58bf9a",
  "state": "RESERVED",
  "order": {
    "order_id": "0e80fbbf-157b-4e12-bbdb-4b709e59e8de",
    "short_number": 32,
    "pickup_at": "2026-10-30T19:43:34Z",
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
  "reserved_at": "2026-10-30T16:43:37.921494Z",
  "confirm_from": "2026-10-30T19:13:34Z",
  "confirm_until": "2026-10-30T19:23:34Z",
  "drop_until": "2026-10-30T18:43:34Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "96c42fa9-4042-4b72-b39b-f48cba58bf9a",
      "state": "RESERVED",
      "order": {
        "order_id": "0e80fbbf-157b-4e12-bbdb-4b709e59e8de",
        "short_number": 32,
        "pickup_at": "2026-10-30T19:43:34Z",
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
      "reserved_at": "2026-10-30T16:43:37.921494Z",
      "confirm_from": "2026-10-30T19:13:34Z",
      "confirm_until": "2026-10-30T19:23:34Z",
      "drop_until": "2026-10-30T18:43:34Z"
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
      "id": "96c42fa9-4042-4b72-b39b-f48cba58bf9a",
      "state": "RESERVED",
      "order": {
        "order_id": "0e80fbbf-157b-4e12-bbdb-4b709e59e8de",
        "short_number": 32,
        "pickup_at": "2026-10-30T19:43:34Z",
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
      "reserved_at": "2026-10-30T16:43:37.921494Z",
      "confirm_from": "2026-10-30T19:13:34Z",
      "confirm_until": "2026-10-30T19:23:34Z",
      "drop_until": "2026-10-30T18:43:34Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/96c42fa9-4042-4b72-b39b-f48cba58bf9a/confirm` → **409**

```json
{
  "command_id": "17bf3b5a-5416-4838-9930-9d135c0ba447"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/96c42fa9-4042-4b72-b39b-f48cba58bf9a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f21b2c90-8fb7-4f1f-bead-17ef106baf9c"
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
  "session_id": "6d85b1e2-14ba-46a3-b4ee-6eeb8156e060",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk1MTksImlhdCI6MTc5MzM3ODYxOSwianRpIjoiNGI1ZGZjM2ItZDJhNS00NzE5LWJjNDItYmFlZmFmYTI2OTY3Iiwic2lkIjoiNmQ4NWIxZTItMTRiYS00NmEzLWI0ZWUtNmVlYjgxNTZlMDYwIn0.F3Zunk3TW_9RCQXOEeKNr-_N1fAwyYnirMx0YyyluSI",
  "access_expires_at": "2026-10-30T16:58:39.371008976Z",
  "refresh_token": "vq7WoCsh2jb_GqZBOA8KYfuKhA6BokjMji7kNKmLdTA",
  "refresh_expires_at": "2026-10-31T04:43:39.37035332Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0e80fbbf-157b-4e12-bbdb-4b709e59e8de` → **200**

```json
{
  "id": "0e80fbbf-157b-4e12-bbdb-4b709e59e8de",
  "short_number": 32,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8df80ce9-f7d7-4e34-9fcf-bd316adcd2b0",
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
  "created_at": "2026-10-30T16:43:36.158795Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T19:43:34Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "96c42fa9-4042-4b72-b39b-f48cba58bf9a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T16:43:37.921494Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0e80fbbf-157b-4e12-bbdb-4b709e59e8de/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T16:43:36.159906Z",
      "actor": {
        "type": "CLIENT",
        "id": "8df80ce9-f7d7-4e34-9fcf-bd316adcd2b0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "0e80fbbf-157b-4e12-bbdb-4b709e59e8de",
        "preorder": true,
        "quote_id": "6d6a6222-80f4-49a5-8a8a-89c26c2418a3",
        "pickup_at": "2026-10-30T19:43:34Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "6bb96c87-ebb3-491f-bd3b-80ba1f8dba93"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T16:43:37.922855Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0e80fbbf-157b-4e12-bbdb-4b709e59e8de",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "96c42fa9-4042-4b72-b39b-f48cba58bf9a"
      },
      "correlation_id": "4bfadafe-f0de-44cb-9b06-5a0b73021859"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 0e80fbbf-157b-4e12-bbdb-4b709e59e8de, reservation 96c42fa9-4042-4b72-b39b-f48cba58bf9a.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25824"
}
```

```json
{
  "challenge_id": "cef01c61-c17e-485b-9f64-040e8a1b759d",
  "expires_at": "2026-10-30T16:48:40.245786016Z",
  "resend_available_at": "2026-10-30T16:43:41.245786016Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "556642",
  "sent_at": "2026-10-30T16:43:40.248827422Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cef01c61-c17e-485b-9f64-040e8a1b759d",
  "code": "556642",
  "device_ref": "sandbox-25824"
}
```

```json
{
  "session_id": "3d670687-c676-42a6-8239-bc634fbe7442",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTUyMCwiaWF0IjoxNzkzMzc4NjIwLCJqdGkiOiJhNjUzZmE1MS03N2FkLTQzYTItYjU3My1mOGRlZTZlNmRiM2UiLCJzaWQiOiIzZDY3MDY4Ny1jNjc2LTQyYTYtODIzOS1iYzYzNGZiZTc0NDIifQ.B79RGXuj8a37IZmSsDQEZ2uktR-GcOmBccsPr1T1L3Q",
  "access_expires_at": "2026-10-30T16:58:40.551325655Z",
  "refresh_token": "o6_u0A3-MztMuG8Q0BlOVLI8c3mmc6oEwBTc8jKsddE",
  "refresh_expires_at": "2026-11-29T16:43:40.550811608Z",
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
  "command_id": "a5fcabdb-f641-4581-9853-a834e0d8193d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:43:41Z",
    "sequence": 1793378621130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8293ef9b-484d-446b-85ae-0c5dc101356d",
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
  "last_heartbeat_at": "2026-10-30T16:43:41.147725Z",
  "last_location_at": "2026-10-30T16:43:41.147725Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671508601",
  "device_ref": "sandbox-23625"
}
```

```json
{
  "challenge_id": "d59e3791-d454-4747-9c9c-36f9e41bb799",
  "expires_at": "2026-10-30T16:48:41.427131052Z",
  "resend_available_at": "2026-10-30T16:43:42.427131052Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671508601` → **200**

```json
{
  "phone": "+380671508601",
  "audience": "CLIENT",
  "code": "377426",
  "sent_at": "2026-10-30T16:43:41.429829691Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d59e3791-d454-4747-9c9c-36f9e41bb799",
  "code": "377426",
  "device_ref": "sandbox-23625"
}
```

```json
{
  "session_id": "82b1f756-8e72-4987-98d4-3948142b768c",
  "subject": {
    "type": "CLIENT",
    "id": "be071c04-8591-4a32-98f3-c8100368d8a9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTA3MWMwNC04NTkxLTRhMzItOThmMy1jODEwMDM2OGQ4YTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NTIxLCJpYXQiOjE3OTMzNzg2MjEsImp0aSI6ImQ4MDVlMDJiLWE0ZTUtNDNlZi1iYThkLTUyNDdiNjZhOGIxOCIsInNpZCI6IjgyYjFmNzU2LThlNzItNDk4Ny05OGQ0LTM5NDgxNDJiNzY4YyJ9.eGyo71rl3ULkG2K2aZ0LvtYpe5dnWIklrFAGJbDUVrY",
  "access_expires_at": "2026-10-30T16:58:41.739670125Z",
  "refresh_token": "yWcoY0sQxxquQB6GO_X9mOL-cyhE7AM24H7DoXEdg_Y",
  "refresh_expires_at": "2026-11-29T16:43:41.739144046Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7950e2ba-c73c-414e-b0fc-037251171441",
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
  "id": "9d3bf811-77ff-431a-8635-bc27366a5674",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:48:42.023474Z",
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
  "command_id": "3a3b71eb-9a49-4c55-992c-635ef567b983",
  "quote_id": "9d3bf811-77ff-431a-8635-bc27366a5674",
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
  "id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
  "short_number": 33,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "be071c04-8591-4a32-98f3-c8100368d8a9",
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
  "created_at": "2026-10-30T16:43:42.319204Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "17f1741a-3b94-4bfb-bbd0-5aa7800250a4",
    "order_id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
    "expires_at": "2026-10-30T16:43:57.321948Z",
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

`POST /api/driver/v1/offers/17f1741a-3b94-4bfb-bbd0-5aa7800250a4/accept` → **200**

```json
{
  "command_id": "47881517-21f9-418f-ae31-38f64bb31b53"
}
```

```json
{
  "id": "f4571cc6-5dd9-46fd-9f83-8bb9ea4c7d26",
  "order_id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "98af99c1-32b2-4861-a10c-cee48291b85c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "98af99c1-32b2-4861-a10c-cee48291b85c",
  "order_id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
  "assignment_id": "f4571cc6-5dd9-46fd-9f83-8bb9ea4c7d26",
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

`POST /api/driver/v1/work-sessions/8293ef9b-484d-446b-85ae-0c5dc101356d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:43:43Z",
    "sequence": 1793378623499
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8293ef9b-484d-446b-85ae-0c5dc101356d",
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
  "last_heartbeat_at": "2026-10-30T16:43:43.517404Z",
  "last_location_at": "2026-10-30T16:43:43.517404Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "98af99c1-32b2-4861-a10c-cee48291b85c",
  "order_id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
  "assignment_id": "f4571cc6-5dd9-46fd-9f83-8bb9ea4c7d26",
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

`POST /api/driver/v1/trips/98af99c1-32b2-4861-a10c-cee48291b85c/arrive` → **200**

```json
{
  "command_id": "0c3df157-a35d-4fe0-acb1-5f62e230c94e",
  "expected_version": 0
}
```

```json
{
  "id": "98af99c1-32b2-4861-a10c-cee48291b85c",
  "order_id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
  "assignment_id": "f4571cc6-5dd9-46fd-9f83-8bb9ea4c7d26",
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
  "arrived_at": "2026-10-30T16:43:44.075698Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/98af99c1-32b2-4861-a10c-cee48291b85c/start` → **200**

```json
{
  "command_id": "2297038e-f16c-44a2-ab2e-ff332c1edddf",
  "expected_version": 1
}
```

```json
{
  "id": "98af99c1-32b2-4861-a10c-cee48291b85c",
  "order_id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
  "assignment_id": "f4571cc6-5dd9-46fd-9f83-8bb9ea4c7d26",
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
  "arrived_at": "2026-10-30T16:43:44.075698Z",
  "started_at": "2026-10-30T16:43:44.37796Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/8293ef9b-484d-446b-85ae-0c5dc101356d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:44:32Z",
    "sequence": 1793378672687
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8293ef9b-484d-446b-85ae-0c5dc101356d",
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
  "last_heartbeat_at": "2026-10-30T16:44:32.705839Z",
  "last_location_at": "2026-10-30T16:44:32.705839Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/98af99c1-32b2-4861-a10c-cee48291b85c/complete` → **200**

```json
{
  "command_id": "7e02a8b2-6a33-45c1-b388-13a41856e6f6",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:44:32Z",
  "cash_received": true
}
```

```json
{
  "id": "98af99c1-32b2-4861-a10c-cee48291b85c",
  "order_id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
  "assignment_id": "f4571cc6-5dd9-46fd-9f83-8bb9ea4c7d26",
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
  "arrived_at": "2026-10-30T16:43:44.075698Z",
  "started_at": "2026-10-30T16:43:44.37796Z",
  "completed_at": "2026-10-30T16:44:32.995081Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/dd0946f7-e2e4-4a8d-9421-350d1d14112b/rating` → **200**

```json
{
  "command_id": "237dc7f8-c8aa-4c58-a12e-c1e2d917c733",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
  "score": 5,
  "created_at": "2026-10-30T16:44:33.307310947Z"
}
```

`POST /api/driver/v1/orders/dd0946f7-e2e4-4a8d-9421-350d1d14112b/rating` → **200**

```json
{
  "command_id": "68c8cc6f-8892-44e3-8c09-e9f00440c506",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
  "score": 4,
  "created_at": "2026-10-30T16:44:33.59933553Z"
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
  "session_id": "716d2da1-8905-4308-a60f-f275c53b5c1e",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk1NzQsImlhdCI6MTc5MzM3ODY3NCwianRpIjoiYTRjY2YxNzctNThjNy00OTJkLThmZDgtNmM3Y2Q5NjZmNTJhIiwic2lkIjoiNzE2ZDJkYTEtODkwNS00MzA4LWE2MGYtZjI3NWM1M2I1YzFlIn0.AsWdEZQvdMUZuLfM5AY1cjEIJvy5tkCLXFMl1kvAHlQ",
  "access_expires_at": "2026-10-30T16:59:34.464126029Z",
  "refresh_token": "ZnkSFSeMKn4sRhUvMTfa9G4FyOlD-w6wYV6wstTw_qQ",
  "refresh_expires_at": "2026-10-31T04:44:34.463580098Z",
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
  "session_id": "378f91dd-45b9-498f-b65e-5be6eb2ab86b",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk1NzUsImlhdCI6MTc5MzM3ODY3NSwianRpIjoiZWZiZGUzNzYtZmQ0NC00NzYzLWI5MTMtNDA1YjE2OTU3N2Q2Iiwic2lkIjoiMzc4ZjkxZGQtNDViOS00OThmLWI2NWUtNWJlNmViMmFiODZiIn0.C0cut2awGr-h0H3EQruQf4_bgN0EYR0XN7sA2Uzpxag",
  "access_expires_at": "2026-10-30T16:59:35.040935872Z",
  "refresh_token": "cfJ0jSzhbpuNixP7hGZ6NRvHXsRQj4Z8a67K4aO5NC8",
  "refresh_expires_at": "2026-10-31T04:44:35.040290013Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dd0946f7-e2e4-4a8d-9421-350d1d14112b/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
      "author_type": "RIDER",
      "author_id": "be071c04-8591-4a32-98f3-c8100368d8a9",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T16:44:33.307311Z"
    },
    {
      "order_id": "dd0946f7-e2e4-4a8d-9421-350d1d14112b",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "be071c04-8591-4a32-98f3-c8100368d8a9",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T16:44:33.599336Z"
    }
  ]
}
```

Done: ratings for order dd0946f7-e2e4-4a8d-9421-350d1d14112b.

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
  "session_id": "6294b747-67b6-4011-ae38-e86a48530898",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk1NzUsImlhdCI6MTc5MzM3ODY3NSwianRpIjoiZWE1NWNlYzEtYmI3OC00M2U1LWFjN2MtYzA0ODJiZTYxMzQxIiwic2lkIjoiNjI5NGI3NDctNjdiNi00MDExLWFlMzgtZTg2YTQ4NTMwODk4In0.b_CQAYoCnr3XMhw970dTXYJKXT__fxvsAXP330oqGag",
  "access_expires_at": "2026-10-30T16:59:35.919308347Z",
  "refresh_token": "IFLXGRBbjbCGC-Dt732pFnl24G0sMUrvA1tD5EdLi2c",
  "refresh_expires_at": "2026-10-31T04:44:35.918776455Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "c95cf82c-2f77-400e-9ff0-efb2d039fc30",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "0c8e05a3-7b1c-4dc3-9823-035a36855cd4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:44:36.213179Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0c8e05a3-7b1c-4dc3-9823-035a36855cd4` → **200**

```json
{
  "id": "0c8e05a3-7b1c-4dc3-9823-035a36855cd4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:44:36.213179Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0c8e05a3-7b1c-4dc3-9823-035a36855cd4` → **200**

```json
{
  "id": "0c8e05a3-7b1c-4dc3-9823-035a36855cd4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:44:36.213179Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0c8e05a3-7b1c-4dc3-9823-035a36855cd4` → **200**

```json
{
  "id": "0c8e05a3-7b1c-4dc3-9823-035a36855cd4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:44:36.213179Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0c8e05a3-7b1c-4dc3-9823-035a36855cd4` → **200**

```json
{
  "id": "0c8e05a3-7b1c-4dc3-9823-035a36855cd4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:44:36.213179Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0c8e05a3-7b1c-4dc3-9823-035a36855cd4` → **200**

```json
{
  "id": "0c8e05a3-7b1c-4dc3-9823-035a36855cd4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T16:44:36.213179Z",
  "ready_at": "2026-10-30T16:44:40.86219Z",
  "expires_at": "2026-10-31T16:44:40.86219Z"
}
```

`GET /api/admin/v1/reports/exports/0c8e05a3-7b1c-4dc3-9823-035a36855cd4/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,31,11,20,0,0,26,5,0,28,2,0,1,7,1,12
total,31,11,20,0,0,26,5,0,28,2,0,1,7,1,12
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "0d1f3082-251c-45c0-8e42-f93a2d7d12a9",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "695478ba-c6d0-45bb-82fa-45c32a68cba7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:44:41.965833Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/695478ba-c6d0-45bb-82fa-45c32a68cba7` → **200**

```json
{
  "id": "695478ba-c6d0-45bb-82fa-45c32a68cba7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:44:41.965833Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/695478ba-c6d0-45bb-82fa-45c32a68cba7` → **200**

```json
{
  "id": "695478ba-c6d0-45bb-82fa-45c32a68cba7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:44:41.965833Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/695478ba-c6d0-45bb-82fa-45c32a68cba7` → **200**

```json
{
  "id": "695478ba-c6d0-45bb-82fa-45c32a68cba7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T16:44:41.965833Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/695478ba-c6d0-45bb-82fa-45c32a68cba7` → **200**

```json
{
  "id": "695478ba-c6d0-45bb-82fa-45c32a68cba7",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T16:44:41.965833Z",
  "ready_at": "2026-10-30T16:44:45.870559Z",
  "expires_at": "2026-10-31T16:44:45.870559Z"
}
```

`GET /api/admin/v1/reports/exports/695478ba-c6d0-45bb-82fa-45c32a68cba7/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/05408e2a-e6a8-4c4a-b123-cb495f5c1680` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/05408e2a-e6a8-4c4a-b123-cb495f5c1680",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3732ab07-ada7-4db2-9d9c-8b25ea97edba"
}
```

Done: both reports were built in the background and downloaded.

# Scenario: retention

## Technical data retention

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
  "session_id": "ba6ca2e1-a9d1-4e08-82ed-2c93e5ec7dc5",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk1ODYsImlhdCI6MTc5MzM3ODY4NiwianRpIjoiNTVjZDY5NmItNDg0Ny00NmU4LWE3Y2ItNDY5NGJkZTI1YTIwIiwic2lkIjoiYmE2Y2EyZTEtYTlkMS00ZTA4LTgyZWQtMmM5M2U1ZWM3ZGM1In0.F4VsbLG53FyfE1q6iPWLjHAF8PWiLe18RATXe4w_1QA",
  "access_expires_at": "2026-10-30T16:59:46.98669584Z",
  "refresh_token": "NGxJbyQIpINWMMI_ESVlejiQKKEiA2pHegIY0SzR1q4",
  "refresh_expires_at": "2026-10-31T04:44:46.986149684Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "68562819-4788-4d8f-a2e4-331d695716f6",
  "expected_version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Sandbox retention boundary"
}
```

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T16:44:47.578801518Z"
}
```

`POST /sandbox/v1/retention/fixtures/efcc16fb-5f1b-4a80-9a0f-4093aea22108` → **200**

```json
{
  "old_done": 1,
  "recent_done": 1,
  "failed": 1
}
```

`POST /sandbox/v1/retention/run` → **200**

```json
{
  "sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "sign_in_codes": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "code_deliveries": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "delivered_events": {
    "deleted": 1,
    "failures": 0,
    "examined": 1
  },
  "consumer_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "command_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "upload_sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "quarantined_files": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "call_recordings": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  }
}
```

`GET /sandbox/v1/retention/fixtures/efcc16fb-5f1b-4a80-9a0f-4093aea22108` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/efcc16fb-5f1b-4a80-9a0f-4093aea22108` → **204**

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T16:44:47.578802Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "527bac62-8f5e-4f92-9e0d-66bec52e30d1",
  "expected_version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Restore policy after retention sandbox"
}
```

```json
{
  "version": 2,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T16:44:48.268248058Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17648"
}
```

```json
{
  "challenge_id": "bad099ae-3735-43ea-a9c8-90f6efb8d239",
  "expires_at": "2026-10-30T16:49:48.562371497Z",
  "resend_available_at": "2026-10-30T16:44:49.562371497Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "815632",
  "sent_at": "2026-10-30T16:44:48.565059483Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bad099ae-3735-43ea-a9c8-90f6efb8d239",
  "code": "815632",
  "device_ref": "sandbox-17648"
}
```

```json
{
  "session_id": "f4d52af6-1e72-485c-b32a-096a2818e411",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTU4OCwiaWF0IjoxNzkzMzc4Njg4LCJqdGkiOiI5MTE3NWE5Yy1hZjgzLTRlYzQtODIxZi1lZjc0MTFiMDVkOTciLCJzaWQiOiJmNGQ1MmFmNi0xZTcyLTQ4NWMtYjMyYS0wOTZhMjgxOGU0MTEifQ.thINNs2HRwzHQOXKeAjYzdJNM_xpPRAr1yLntVoORXg",
  "access_expires_at": "2026-10-30T16:59:48.869047841Z",
  "refresh_token": "88Q3Gb_J39EIFVj47flk9FKcuL36YYaosIk_KrA4F6c",
  "refresh_expires_at": "2026-11-29T16:44:48.86850652Z",
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
  "command_id": "16f66e0d-b643-4a15-9526-edc634b0341f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:44:49Z",
    "sequence": 1793378689714
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "25423943-2752-4ff8-966a-703d221bd20b",
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
  "last_heartbeat_at": "2026-10-30T16:44:49.731836Z",
  "last_location_at": "2026-10-30T16:44:49.731836Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "71f4aea9-4bf7-43ac-836d-6098be81a038",
  "points": [
    {
      "sequence": 1793378692135,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T16:43:52Z"
    },
    {
      "sequence": 1793378692209,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T16:44:52Z"
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
  "session_id": "50e592a7-caec-497e-9a21-5ad211ee5216",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk1OTIsImlhdCI6MTc5MzM3ODY5MiwianRpIjoiNGJhOTM4NzgtYTJhYy00Y2QzLThiNzItNWEyMTgwMzc0NjMxIiwic2lkIjoiNTBlNTkyYTctY2FlYy00OTdlLTlhMjEtNWFkMjExZWU1MjE2In0.AbXOQ6HwfnF2i34PJHY3z4_TbKDwfLeE_XkZOz_IgQ0",
  "access_expires_at": "2026-10-30T16:59:52.640601382Z",
  "refresh_token": "0eo-0ni5G5WFju5DBJSwSpcEdikB3jy-4zhPR1O2JW4",
  "refresh_expires_at": "2026-10-31T04:44:52.640021577Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "eafd4d2d-7f2f-4153-88c7-ca201cf96cf3",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T16:44:52Z",
        "track_point_id": "8634580b-db12-45ee-b91c-56d9178a003e",
        "work_session_id": "25423943-2752-4ff8-966a-703d221bd20b"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T16:44:52Z",
      "reason": null,
      "reviewed_by": null,
      "reviewed_at": null,
      "review_reason": null,
      "version": 1
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
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
    "version": 12,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
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
  "history": [],
  "duplicates": []
}
```

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/eafd4d2d-7f2f-4153-88c7-ca201cf96cf3/confirm` → **200**

```json
{
  "command_id": "d6d9fcc7-d70e-4bf6-97b7-e62dffabcffe",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "eafd4d2d-7f2f-4153-88c7-ca201cf96cf3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T16:44:52Z",
    "track_point_id": "8634580b-db12-45ee-b91c-56d9178a003e",
    "work_session_id": "25423943-2752-4ff8-966a-703d221bd20b"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T16:44:52Z",
  "reason": null,
  "reviewed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reviewed_at": "2026-10-30T16:44:53.537899Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/eafd4d2d-7f2f-4153-88c7-ca201cf96cf3/dismiss` → **409**

```json
{
  "command_id": "1627f7d0-ef2b-4ab5-bd9f-06e24041d293",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/eafd4d2d-7f2f-4153-88c7-ca201cf96cf3/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ae264762-54e2-4f0e-bc07-5b1ce91ce822"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "402d5468-21b1-4039-a6cb-bb1278677d7c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "c8d2a57a-fc11-4e9a-8f7a-fe0d60fc0cdf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "raised_at": "2026-10-30T16:44:54.122234Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/c8d2a57a-fc11-4e9a-8f7a-fe0d60fc0cdf/dismiss` → **200**

```json
{
  "command_id": "75c8f70c-d436-4731-b3ab-ce754508445b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "c8d2a57a-fc11-4e9a-8f7a-fe0d60fc0cdf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "raised_at": "2026-10-30T16:44:54.122234Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reviewed_at": "2026-10-30T16:44:54.426246Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "137a8603-487e-4ca5-9eee-66cc4447c9d5",
  "expected_version": 12,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "eafd4d2d-7f2f-4153-88c7-ca201cf96cf3"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
  "version": 13,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
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
    "version": 13,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
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
      "actor_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T16:44:54.724822Z"
    }
  ],
  "duplicates": []
}
```

Done: flag eafd4d2d-7f2f-4153-88c7-ca201cf96cf3 confirmed, suspension named it, driver reinstated.

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
  "session_id": "d27e712d-ccb8-4c33-9444-ae1c2f519a04",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk1OTUsImlhdCI6MTc5MzM3ODY5NSwianRpIjoiMjQ1NTg2MDEtNWRmMS00Y2JlLTllMDItMTg5NDRjZWJjMDg3Iiwic2lkIjoiZDI3ZTcxMmQtY2NiOC00YzMzLTk0NDQtYWUxYzJmNTE5YTA0In0.upMmoRvkeJPU00mQdGC9cPENqX8kaMqub0ZvfZlZBHE",
  "access_expires_at": "2026-10-30T16:59:55.62182971Z",
  "refresh_token": "Rr7pfOKO7KbR3aI1-Z0w-ziFaYJzAC-jT8wK8ACDFaU",
  "refresh_expires_at": "2026-10-31T04:44:55.621275738Z",
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
    "version": 13,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
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
      "actor_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T16:44:54.724822Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "e50b915e-d3ce-4719-b021-f67f0619b464",
  "expected_version": 13,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 14,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
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
  "session_id": "25423943-2752-4ff8-966a-703d221bd20b",
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
  "last_heartbeat_at": "2026-10-30T16:44:49.731836Z",
  "last_location_at": "2026-10-30T16:44:49.731836Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/25423943-2752-4ff8-966a-703d221bd20b/close` → **200**

```json
{
  "command_id": "844d7108-08cc-41ff-8707-b24e5afd48ae",
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
  "session_id": "9dc9ddf5-82b4-4031-a03b-2162fff6d0e2",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk1OTcsImlhdCI6MTc5MzM3ODY5NywianRpIjoiMzRkMjg0NzctZjIzNS00YmQ4LWFjODktZThkODBkY2I5NDdmIiwic2lkIjoiOWRjOWRkZjUtODJiNC00MDMxLWEwM2ItMjE2MmZmZjZkMGUyIn0.G0TtMVDPDO7J2v3GVRcrkHK8wz_rShWSJ9NAW4PFsKU",
  "access_expires_at": "2026-10-30T16:59:57.366603427Z",
  "refresh_token": "B-Frrn7yr_3A7BgAG01Bm6JBDtIf59IAQ-L0Lk6Y0M8",
  "refresh_expires_at": "2026-10-31T04:44:57.366062369Z",
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
  "command_id": "0dcbbaaf-ca25-42d4-9c31-bfdcc30df531",
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
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T16:44:57.944047Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "0dcbbaaf-ca25-42d4-9c31-bfdcc30df531",
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
  "changed_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T16:44:57.944047Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48536154148",
  "device_ref": "sandbox-17042"
}
```

```json
{
  "challenge_id": "04a05796-ffc8-4cbf-ad5c-6e18d2f1f3dc",
  "expires_at": "2026-10-30T16:49:58.536278635Z",
  "resend_available_at": "2026-10-30T16:44:59.536278635Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48536154148` → **200**

```json
{
  "phone": "+48536154148",
  "audience": "CLIENT",
  "code": "998854",
  "sent_at": "2026-10-30T16:44:58.538844033Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04a05796-ffc8-4cbf-ad5c-6e18d2f1f3dc",
  "code": "998854",
  "device_ref": "sandbox-17042"
}
```

```json
{
  "session_id": "c88491e5-16f5-440c-83ee-ae2558efccf2",
  "subject": {
    "type": "CLIENT",
    "id": "1138063d-71e3-47c8-ba05-b7f0e06c5c7a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTM4MDYzZC03MWUzLTQ3YzgtYmEwNS1iN2YwZTA2YzVjN2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NTk4LCJpYXQiOjE3OTMzNzg2OTgsImp0aSI6ImQ5MzEwNDUwLTZlMDYtNDgzZi05MTViLWJiNmJmMjkxMjMxZiIsInNpZCI6ImM4ODQ5MWU1LTE2ZjUtNDQwYy04M2VlLWFlMjU1OGVmY2NmMiJ9.H01YnAI-pAbbPHhvnVybfsn7Uz7p1UHJrw4Gq7qDgLY",
  "access_expires_at": "2026-10-30T16:59:58.844043154Z",
  "refresh_token": "r3Jx1bsw4NoEu-oFAiWri1npyNEA9z9U6xcNO32n5cQ",
  "refresh_expires_at": "2026-11-29T16:44:58.843492558Z",
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
  "correlation_id": "dde7747e-da42-4609-a0e6-ca4012dcbc71"
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
  "device_ref": "sandbox-26436"
}
```

```json
{
  "challenge_id": "78298ceb-423f-42ba-9370-e58458df4207",
  "expires_at": "2026-10-30T16:49:59.691961539Z",
  "resend_available_at": "2026-10-30T16:45:00.691961539Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "511654",
  "sent_at": "2026-10-30T16:44:59.69439836Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78298ceb-423f-42ba-9370-e58458df4207",
  "code": "511654",
  "device_ref": "sandbox-26436"
}
```

```json
{
  "session_id": "0c01e07f-2356-477a-a95b-c780e4a80ff9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTYwMCwiaWF0IjoxNzkzMzc4NzAwLCJqdGkiOiJlZmYyMGU0Ni01ZDUxLTQxMmUtYjRmMy0yNDM1NjkwODU1OTkiLCJzaWQiOiIwYzAxZTA3Zi0yMzU2LTQ3N2EtYTk1Yi1jNzgwZTRhODBmZjkifQ.N_ozDt2kkSIlSzmbJ4QQfFN0QfnW8QXPkmTSL08L-tQ",
  "access_expires_at": "2026-10-30T17:00:00.000299698Z",
  "refresh_token": "T1WxKtRAgzIoxs22WgTR7bPDCDwhWRubjbTy1CuT9sY",
  "refresh_expires_at": "2026-11-29T16:44:59.999716297Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "067886b6-cbe9-4bcc-a442-d302503c17e3",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T16:43:37.345498Z",
  "last_location_at": "2026-10-30T16:43:37.345498Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/067886b6-cbe9-4bcc-a442-d302503c17e3/handover` → **200**

```json
{
  "command_id": "4b58da84-315c-4d1c-9966-50b19f4cc702",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "067886b6-cbe9-4bcc-a442-d302503c17e3",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T16:43:37.345498Z",
  "last_location_at": "2026-10-30T16:43:37.345498Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/067886b6-cbe9-4bcc-a442-d302503c17e3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:45:00Z",
    "sequence": 1793378700889
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "067886b6-cbe9-4bcc-a442-d302503c17e3",
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
  "last_heartbeat_at": "2026-10-30T16:45:00.907178Z",
  "last_location_at": "2026-10-30T16:45:00.907178Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "session_id": "067886b6-cbe9-4bcc-a442-d302503c17e3",
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
  "last_heartbeat_at": "2026-10-30T16:45:00.907178Z",
  "last_location_at": "2026-10-30T16:45:00.907178Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/067886b6-cbe9-4bcc-a442-d302503c17e3/close` → **200**

```json
{
  "command_id": "6e1ed811-8e00-412f-bd92-37624f239761",
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
  "correlation_id": "dbb9ec44-78f7-440d-aa3f-d9cf3a2dd865"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675183707",
  "device_ref": "sandbox-10929"
}
```

```json
{
  "challenge_id": "0881f780-b4b6-4254-99fc-7b03751107cd",
  "expires_at": "2026-10-30T16:50:02.363341887Z",
  "resend_available_at": "2026-10-30T16:45:03.363341887Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675183707` → **200**

```json
{
  "phone": "+380675183707",
  "audience": "CLIENT",
  "code": "732656",
  "sent_at": "2026-10-30T16:45:02.36584371Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0881f780-b4b6-4254-99fc-7b03751107cd",
  "code": "732656",
  "device_ref": "sandbox-10929"
}
```

```json
{
  "session_id": "148576f6-3e3f-44f3-8bf8-7916749fb494",
  "subject": {
    "type": "CLIENT",
    "id": "3548bb2b-8ef7-41dd-a73f-89f1f61d0a3d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNTQ4YmIyYi04ZWY3LTQxZGQtYTczZi04OWYxZjYxZDBhM2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NjAyLCJpYXQiOjE3OTMzNzg3MDIsImp0aSI6ImI1OWRiYjk2LTg1NWQtNGFiNy04ZDQyLTQ4ZWQwNDVhMzY5OCIsInNpZCI6IjE0ODU3NmY2LTNlM2YtNDRmMy04YmY4LTc5MTY3NDlmYjQ5NCJ9.3hy_VKyYRJRrAc_UBg71HL7ePZzg97LAke9hfvHoCvI",
  "access_expires_at": "2026-10-30T17:00:02.668016046Z",
  "refresh_token": "r6zZoZ_zjRZe4ztj4vn5Mi6GJQwBzZBOjR-EbUz6Ytk",
  "refresh_expires_at": "2026-11-29T16:45:02.667481302Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "55b70ce3-8adc-4f1e-9e87-6293002decdb",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "5240c11e-e5cb-4c7c-9d1b-46657d813c3f",
  "upload_path": "/api/rider/v1/uploads/5240c11e-e5cb-4c7c-9d1b-46657d813c3f",
  "expires_at": "2026-10-30T17:00:02.965786809Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/5240c11e-e5cb-4c7c-9d1b-46657d813c3f` → **200**

```json
{
  "file_id": "5240c11e-e5cb-4c7c-9d1b-46657d813c3f",
  "state": "REJECTED",
  "content_type": null,
  "size_bytes": 0,
  "reject_reason": "The file did not pass the malware check"
}
```

## A PDF with a JavaScript action behind a name escape (/J#61vaScript) is refused

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "fb769930-404f-4a3f-915f-a6a8b65d30e1",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "d460926a-ba5b-4b5b-b367-bbc28e7bc8cb",
  "upload_path": "/api/rider/v1/uploads/d460926a-ba5b-4b5b-b367-bbc28e7bc8cb",
  "expires_at": "2026-10-30T17:00:03.27500164Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/d460926a-ba5b-4b5b-b367-bbc28e7bc8cb` → **200**

```json
{
  "file_id": "d460926a-ba5b-4b5b-b367-bbc28e7bc8cb",
  "state": "REJECTED",
  "content_type": null,
  "size_bytes": 0,
  "reject_reason": "PDF with active content is not accepted"
}
```

## Rider uploads a photo and opens a support case

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "6d9a088a-971e-411b-895d-29248c687d04",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b2428bee-7199-4c14-b38a-b9ce9692875f",
  "upload_path": "/api/rider/v1/uploads/b2428bee-7199-4c14-b38a-b9ce9692875f",
  "expires_at": "2026-10-30T17:00:03.591049076Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/b2428bee-7199-4c14-b38a-b9ce9692875f` → **200**

```json
{
  "file_id": "b2428bee-7199-4c14-b38a-b9ce9692875f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "bcf38bda-39d7-46cb-8229-52d78a3cfe95",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "b2428bee-7199-4c14-b38a-b9ce9692875f"
  ]
}
```

```json
{
  "id": "15ecd464-f391-44c0-aee4-480792bb9ac5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3548bb2b-8ef7-41dd-a73f-89f1f61d0a3d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T16:45:03.907924Z",
  "updated_at": "2026-10-30T16:45:03.907924Z",
  "respond_by": "2026-10-30T20:45:03.907924Z",
  "messages": [
    {
      "id": "a393cc3b-7393-4317-8e6d-b3774e931c89",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3548bb2b-8ef7-41dd-a73f-89f1f61d0a3d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T16:45:03.908967Z",
      "attachments": [
        {
          "file_id": "b2428bee-7199-4c14-b38a-b9ce9692875f",
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
  "session_id": "4e2d84b3-d73f-4b28-9466-bfcf432a1c44",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk2MDQsImlhdCI6MTc5MzM3ODcwNCwianRpIjoiMzQxMzg0YzAtMDAxZC00NTYwLTk3MmUtMzU5MTcwMzJlNGU1Iiwic2lkIjoiNGUyZDg0YjMtZDczZi00YjI4LTk0NjYtYmZjZjQzMmExYzQ0In0._35QbV2cLTJJdfaZ-af6CCh3l1T1Vv927p9TCtfPKLQ",
  "access_expires_at": "2026-10-30T17:00:04.527187317Z",
  "refresh_token": "hS2Zx3x2LAxbNS9PnOuBfkgCfECrenfHopn3Sb1MWws",
  "refresh_expires_at": "2026-10-31T04:45:04.526658483Z",
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
  "session_id": "f00dcb95-df96-487b-aa15-9a1aff78ac61",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk2MDUsImlhdCI6MTc5MzM3ODcwNSwianRpIjoiMmVmYjNhZTItNGQ2Mi00NWY1LThjOGUtYjY3MjZjNmFjOTc2Iiwic2lkIjoiZjAwZGNiOTUtZGY5Ni00ODdiLWFhMTUtOWExYWZmNzhhYzYxIn0.hrelGf9-mwFzaT6Snc9gKcdj1mO4FDQbfTkl0rtWWYg",
  "access_expires_at": "2026-10-30T17:00:05.103787311Z",
  "refresh_token": "H2ouaPyBi-fF5zJi9XudrZwdB1PYfuPaKCk6qec4Kgo",
  "refresh_expires_at": "2026-10-31T04:45:05.103213451Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/15ecd464-f391-44c0-aee4-480792bb9ac5/attachments/b2428bee-7199-4c14-b38a-b9ce9692875f` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "b02e1a44-7bc1-4dce-8e18-9baf3244e680",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5bd63751-0fd3-428c-9638-6a0532563fb1",
  "upload_path": "/api/operator/v1/uploads/5bd63751-0fd3-428c-9638-6a0532563fb1",
  "expires_at": "2026-10-30T17:00:05.403202678Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/5bd63751-0fd3-428c-9638-6a0532563fb1` → **200**

```json
{
  "file_id": "5bd63751-0fd3-428c-9638-6a0532563fb1",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/15ecd464-f391-44c0-aee4-480792bb9ac5` → **200**

```json
{
  "id": "15ecd464-f391-44c0-aee4-480792bb9ac5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3548bb2b-8ef7-41dd-a73f-89f1f61d0a3d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T16:45:03.907924Z",
  "updated_at": "2026-10-30T16:45:03.907924Z",
  "respond_by": "2026-10-30T20:45:03.907924Z",
  "messages": [
    {
      "id": "a393cc3b-7393-4317-8e6d-b3774e931c89",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3548bb2b-8ef7-41dd-a73f-89f1f61d0a3d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T16:45:03.908967Z",
      "attachments": [
        {
          "file_id": "b2428bee-7199-4c14-b38a-b9ce9692875f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/15ecd464-f391-44c0-aee4-480792bb9ac5/comments` → **200**

```json
{
  "command_id": "ab934198-cee7-4ecc-9f3e-e43af2325995",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "5bd63751-0fd3-428c-9638-6a0532563fb1"
  ]
}
```

```json
{
  "id": "15ecd464-f391-44c0-aee4-480792bb9ac5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3548bb2b-8ef7-41dd-a73f-89f1f61d0a3d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T16:45:03.907924Z",
  "updated_at": "2026-10-30T16:45:06.036453Z",
  "respond_by": "2026-10-30T20:45:03.907924Z",
  "messages": [
    {
      "id": "a393cc3b-7393-4317-8e6d-b3774e931c89",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3548bb2b-8ef7-41dd-a73f-89f1f61d0a3d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T16:45:03.908967Z",
      "attachments": [
        {
          "file_id": "b2428bee-7199-4c14-b38a-b9ce9692875f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6415013e-6818-4356-85a6-ca7a34cc22b8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T16:45:06.036026Z",
      "attachments": [
        {
          "file_id": "5bd63751-0fd3-428c-9638-6a0532563fb1",
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

`GET /api/rider/v1/support/cases/15ecd464-f391-44c0-aee4-480792bb9ac5` → **200**

```json
{
  "id": "15ecd464-f391-44c0-aee4-480792bb9ac5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3548bb2b-8ef7-41dd-a73f-89f1f61d0a3d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T16:45:03.907924Z",
  "updated_at": "2026-10-30T16:45:06.036453Z",
  "respond_by": "2026-10-30T20:45:03.907924Z",
  "messages": [
    {
      "id": "a393cc3b-7393-4317-8e6d-b3774e931c89",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3548bb2b-8ef7-41dd-a73f-89f1f61d0a3d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T16:45:03.908967Z",
      "attachments": [
        {
          "file_id": "b2428bee-7199-4c14-b38a-b9ce9692875f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6415013e-6818-4356-85a6-ca7a34cc22b8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T16:45:06.036026Z",
      "attachments": [
        {
          "file_id": "5bd63751-0fd3-428c-9638-6a0532563fb1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/15ecd464-f391-44c0-aee4-480792bb9ac5/attachments/5bd63751-0fd3-428c-9638-6a0532563fb1` → **200**

Done: support case 15ecd464-f391-44c0-aee4-480792bb9ac5, rider attachment b2428bee-7199-4c14-b38a-b9ce9692875f, operator attachment 5bd63751-0fd3-428c-9638-6a0532563fb1.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734573387",
  "device_ref": "sandbox-6587"
}
```

```json
{
  "challenge_id": "4e854eef-1b82-40fa-92e5-7c143c4ac07a",
  "expires_at": "2026-10-30T16:50:06.670705463Z",
  "resend_available_at": "2026-10-30T16:45:07.670705463Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734573387` → **200**

```json
{
  "phone": "+380734573387",
  "audience": "CLIENT",
  "code": "483060",
  "sent_at": "2026-10-30T16:45:06.673109578Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e854eef-1b82-40fa-92e5-7c143c4ac07a",
  "code": "483060",
  "device_ref": "sandbox-6587"
}
```

```json
{
  "session_id": "cf379239-c88b-4eca-968f-961d02f2d9f0",
  "subject": {
    "type": "CLIENT",
    "id": "9efbcf24-1e72-4272-84e9-a5ef60363e60"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZWZiY2YyNC0xZTcyLTQyNzItODRlOS1hNWVmNjAzNjNlNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NjA2LCJpYXQiOjE3OTMzNzg3MDYsImp0aSI6IjU5MjYxODgzLTVjNTAtNDVhNi1iMTI0LTZiOGNmMWI2OWZjYyIsInNpZCI6ImNmMzc5MjM5LWM4OGItNGVjYS05NjhmLTk2MWQwMmYyZDlmMCJ9.koRPlX6_6p6xQe3PT--CUfEG4fgX9wehyydnRiUa594",
  "access_expires_at": "2026-10-30T17:00:06.98043391Z",
  "refresh_token": "Pt1sI-Dn0iS4WrUyqU53bdva1CLjdgz0w6pd1_Y9ZGk",
  "refresh_expires_at": "2026-11-29T16:45:06.979896566Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b764d79b-90c8-401a-9e7b-f31ac254bdfa",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "84abd719-339d-4ddc-96e0-01e84b305616",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-84abd719-339d-4ddc-96e0-01e84b305616",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "72f82fc40340cc2a12ff0b1233ba25fc",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=84abd719-339d-4ddc-96e0-01e84b305616",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734573387"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=84abd719-339d-4ddc-96e0-01e84b305616",
  "expires_at": "2026-10-30T17:15:07.263173Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/84abd719-339d-4ddc-96e0-01e84b305616` → **200**

```json
{
  "id": "84abd719-339d-4ddc-96e0-01e84b305616",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T17:15:07.263173Z",
  "card": {
    "id": "4398753c-fde3-49b9-a7dd-04a1b53c71d7",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8438",
    "card_type": "Visa",
    "created_at": "2026-10-30T16:45:07.546249Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0de71072-5d00-48b8-8ffb-cf02453df7a2",
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
  "id": "1bf57641-01e2-4272-8ce3-054b09269952",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:50:07.846538Z",
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

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "1a99a800-5d72-4675-876f-20246ed54f5b",
  "quote_id": "1bf57641-01e2-4272-8ce3-054b09269952",
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
  "id": "b55c40bc-f615-4f1b-b4be-44d2090ac00a",
  "short_number": 34,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9efbcf24-1e72-4272-84e9-a5ef60363e60",
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
  "created_at": "2026-10-30T16:45:08.149129Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b55c40bc-f615-4f1b-b4be-44d2090ac00a` → **200**

```json
{
  "id": "b55c40bc-f615-4f1b-b4be-44d2090ac00a",
  "short_number": 34,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9efbcf24-1e72-4272-84e9-a5ef60363e60",
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
  "created_at": "2026-10-30T16:45:08.149129Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b55c40bc-f615-4f1b-b4be-44d2090ac00a` → **200**

```json
{
  "id": "b55c40bc-f615-4f1b-b4be-44d2090ac00a",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9efbcf24-1e72-4272-84e9-a5ef60363e60",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T16:45:08.149129Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The rider decides to pay in cash

`GET /api/rider/v1/orders/b55c40bc-f615-4f1b-b4be-44d2090ac00a` → **200**

```json
{
  "id": "b55c40bc-f615-4f1b-b4be-44d2090ac00a",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9efbcf24-1e72-4272-84e9-a5ef60363e60",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T16:45:08.149129Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b55c40bc-f615-4f1b-b4be-44d2090ac00a/switch-to-cash` → **200**

```json
{
  "command_id": "09b566b4-5d05-4d60-b379-36440100f2a0",
  "expected_version": 3
}
```

```json
{
  "id": "b55c40bc-f615-4f1b-b4be-44d2090ac00a",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9efbcf24-1e72-4272-84e9-a5ef60363e60",
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
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T16:45:08.149129Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b55c40bc-f615-4f1b-b4be-44d2090ac00a/switch-to-cash` → **409**

```json
{
  "command_id": "016c169c-96a9-4a57-ae69-fb45ec8762f9",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/b55c40bc-f615-4f1b-b4be-44d2090ac00a/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0b9aa230-88b8-46af-8878-fe2563cdc3df"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/b55c40bc-f615-4f1b-b4be-44d2090ac00a` → **200**

```json
{
  "id": "b55c40bc-f615-4f1b-b4be-44d2090ac00a",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9efbcf24-1e72-4272-84e9-a5ef60363e60",
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
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T16:45:08.149129Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b55c40bc-f615-4f1b-b4be-44d2090ac00a/cancel` → **200**

```json
{
  "command_id": "9c937555-f778-4f3d-9832-36cfafc7ff90",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b55c40bc-f615-4f1b-b4be-44d2090ac00a",
  "short_number": 34,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9efbcf24-1e72-4272-84e9-a5ef60363e60",
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
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-30T16:45:08.149129Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

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
  "session_id": "f78985b1-e93e-412d-b00e-1b939ae99717",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk2MTEsImlhdCI6MTc5MzM3ODcxMSwianRpIjoiM2RjY2MwZDMtMzc2MS00ZGI4LTlhYTQtMTQ0NDBkNzAyMTVmIiwic2lkIjoiZjc4OTg1YjEtZTkzZS00MTJkLWIwMGUtMWI5MzlhZTk5NzE3In0.IsHG8MtFlEBYy3V-EW4FMOgFBGZ_o76tJGfFyswEs9U",
  "access_expires_at": "2026-10-30T17:00:11.879040942Z",
  "refresh_token": "UXErJ3lDvx4RGwH_1NTCRZNNgseUVu1N6xwNgiqKNPg",
  "refresh_expires_at": "2026-10-31T04:45:11.87842341Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6924"
}
```

```json
{
  "challenge_id": "d70ccc4e-29c8-4a7c-9894-da091360be6c",
  "expires_at": "2026-10-30T16:50:12.155568557Z",
  "resend_available_at": "2026-10-30T16:45:13.155568557Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "422480",
  "sent_at": "2026-10-30T16:45:12.159037495Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d70ccc4e-29c8-4a7c-9894-da091360be6c",
  "code": "422480",
  "device_ref": "sandbox-6924"
}
```

```json
{
  "session_id": "c5837a89-0954-42f7-8f60-d5e4214cb0a6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTYxMiwiaWF0IjoxNzkzMzc4NzEyLCJqdGkiOiIxMTNhYjhiMS1iYWI5LTQzYTktYmY0OS1kZjg5NGZjZTFhYzQiLCJzaWQiOiJjNTgzN2E4OS0wOTU0LTQyZjctOGY2MC1kNWU0MjE0Y2IwYTYifQ.-VgfF4wM4qOD0kZGKFk_R5DpdiIKj7klzVesxyQuT28",
  "access_expires_at": "2026-10-30T17:00:12.457670711Z",
  "refresh_token": "XqMRMd03MPgIUFElGLMwGzBqw-bFMzE14Pj5M7lhNtE",
  "refresh_expires_at": "2026-11-29T16:45:12.457107648Z",
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
  "version": 15,
  "has_payment_terminal": false,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
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
    "version": 15,
    "has_payment_terminal": false,
    "admission_city_ids": [
      "5a000000-0000-4000-8000-000000000001"
    ],
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
      "actor_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T16:44:54.724822Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T16:44:56.20968Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "d6c0de60-a880-4b8e-b59b-2bb715ab6424",
  "expected_version": 15,
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
  "version": 16,
  "has_payment_terminal": true,
  "admission_city_ids": [
    "5a000000-0000-4000-8000-000000000001"
  ],
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
  "device_ref": "sandbox-6553"
}
```

```json
{
  "challenge_id": "c4248ddc-cf3b-4925-9f92-44db131b7858",
  "expires_at": "2026-10-30T16:50:13.602942874Z",
  "resend_available_at": "2026-10-30T16:45:14.602942874Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "701126",
  "sent_at": "2026-10-30T16:45:13.605430663Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4248ddc-cf3b-4925-9f92-44db131b7858",
  "code": "701126",
  "device_ref": "sandbox-6553"
}
```

```json
{
  "session_id": "ccd45ccd-8fec-4c94-a579-44dde5bd0ac3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTYxMywiaWF0IjoxNzkzMzc4NzEzLCJqdGkiOiI3OTkyYjM5Ni0yMTQ3LTQ5NGItOTZmMS1iZTk1NWU4ZDAxNzciLCJzaWQiOiJjY2Q0NWNjZC04ZmVjLTRjOTQtYTU3OS00NGRkZTViZDBhYzMifQ.qIZGx3JR0vI3AgeGOvngHZVFjHjcayn_SFBQczZ8O7I",
  "access_expires_at": "2026-10-30T17:00:13.909678925Z",
  "refresh_token": "Du0NCrhIBHEluIwkggoNCMfWjnVBCBMqO6vw_FefgnI",
  "refresh_expires_at": "2026-11-29T16:45:13.90912906Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8293ef9b-484d-446b-85ae-0c5dc101356d",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:44:32.705839Z",
  "last_location_at": "2026-10-30T16:44:32.705839Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8293ef9b-484d-446b-85ae-0c5dc101356d/handover` → **200**

```json
{
  "command_id": "f81541e0-0f76-4d63-8f60-fee27ba07e72",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8293ef9b-484d-446b-85ae-0c5dc101356d",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T16:44:32.705839Z",
  "last_location_at": "2026-10-30T16:44:32.705839Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 7 s to the next point)

`POST /api/driver/v1/work-sessions/8293ef9b-484d-446b-85ae-0c5dc101356d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:45:21Z",
    "sequence": 1793378721774
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8293ef9b-484d-446b-85ae-0c5dc101356d",
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
  "last_heartbeat_at": "2026-10-30T16:45:21.792875Z",
  "last_location_at": "2026-10-30T16:45:21.792875Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "command_id": "1aa1bd14-eedf-47c3-844b-327b19df8463",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:45:22Z",
    "sequence": 1793378722379
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6f046b55-af05-427c-825e-44dc220c3198",
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
  "last_heartbeat_at": "2026-10-30T16:45:22.396661Z",
  "last_location_at": "2026-10-30T16:45:22.396661Z",
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
  "session_id": "27eb8758-9e98-4267-91c4-ab4f0c3605a9",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk2MjIsImlhdCI6MTc5MzM3ODcyMiwianRpIjoiMThiMmViYmYtNzhjYi00MzVkLThjMTktZGRlZmNlNzM0ZTRjIiwic2lkIjoiMjdlYjg3NTgtOWU5OC00MjY3LTkxYzQtYWI0ZjBjMzYwNWE5In0.YYpvhX5gmZ-tGsslojrhX0T2EsfAVQ6_WIPT1Cw7rMU",
  "access_expires_at": "2026-10-30T17:00:22.968650606Z",
  "refresh_token": "gfdV55xLCBjmDklBACJNEVagoKucj37omkadbulZprA",
  "refresh_expires_at": "2026-10-31T04:45:22.968004654Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0cf828dd-1a9a-416b-b375-7a5d09a00c44",
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
  "id": "34f65152-d118-4b63-a040-39c3e2d52694",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:50:23.248718Z",
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
  "command_id": "e2f2523f-9669-43a7-b1b8-6c9963b80ec9",
  "quote_id": "34f65152-d118-4b63-a040-39c3e2d52694",
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
  "id": "dae52a84-7b47-4a29-89c6-1db6ff532fd4",
  "short_number": 35,
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
  "created_at": "2026-10-30T16:45:23.552673Z",
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
    "id": "a6793c15-79c8-46ff-a9f9-f6b7ddc7ede3",
    "order_id": "dae52a84-7b47-4a29-89c6-1db6ff532fd4",
    "expires_at": "2026-10-30T16:45:38.55693Z",
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

`POST /api/driver/v1/offers/a6793c15-79c8-46ff-a9f9-f6b7ddc7ede3/accept` → **200**

```json
{
  "command_id": "62e115cb-7d20-4017-a968-ced541c878b0"
}
```

```json
{
  "id": "ff2692ef-5604-4f98-9032-62f96f53e6c0",
  "order_id": "dae52a84-7b47-4a29-89c6-1db6ff532fd4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a3d191a7-38b9-48ce-bc49-dea19122e29a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a3d191a7-38b9-48ce-bc49-dea19122e29a",
  "order_id": "dae52a84-7b47-4a29-89c6-1db6ff532fd4",
  "assignment_id": "ff2692ef-5604-4f98-9032-62f96f53e6c0",
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

(the car drives 9 s to the next point)

`POST /api/driver/v1/work-sessions/6f046b55-af05-427c-825e-44dc220c3198/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T16:45:34Z",
    "sequence": 1793378734349
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6f046b55-af05-427c-825e-44dc220c3198",
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
  "last_heartbeat_at": "2026-10-30T16:45:34.052564Z",
  "last_location_at": "2026-10-30T16:45:34.052564Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a3d191a7-38b9-48ce-bc49-dea19122e29a/arrive` → **200**

```json
{
  "command_id": "9a0f6224-64e7-4339-a9f3-e2de46dceb41",
  "expected_version": 0
}
```

```json
{
  "id": "a3d191a7-38b9-48ce-bc49-dea19122e29a",
  "order_id": "dae52a84-7b47-4a29-89c6-1db6ff532fd4",
  "assignment_id": "ff2692ef-5604-4f98-9032-62f96f53e6c0",
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
  "arrived_at": "2026-10-30T16:45:34.356128Z",
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

`POST /api/driver/v1/trips/a3d191a7-38b9-48ce-bc49-dea19122e29a/start` → **200**

```json
{
  "command_id": "73389d27-8d30-42d7-a734-fec368c72b53",
  "expected_version": 1
}
```

```json
{
  "id": "a3d191a7-38b9-48ce-bc49-dea19122e29a",
  "order_id": "dae52a84-7b47-4a29-89c6-1db6ff532fd4",
  "assignment_id": "ff2692ef-5604-4f98-9032-62f96f53e6c0",
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
  "arrived_at": "2026-10-30T16:45:34.356128Z",
  "started_at": "2026-10-30T16:45:34.655163Z",
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

`POST /api/driver/v1/trips/a3d191a7-38b9-48ce-bc49-dea19122e29a/complete` → **200**

```json
{
  "command_id": "4a6e24a6-ab68-4fe7-997e-0e519b272aef",
  "expected_version": 2,
  "reported_at": "2026-10-30T16:45:34Z",
  "cash_received": true
}
```

```json
{
  "id": "a3d191a7-38b9-48ce-bc49-dea19122e29a",
  "order_id": "dae52a84-7b47-4a29-89c6-1db6ff532fd4",
  "assignment_id": "ff2692ef-5604-4f98-9032-62f96f53e6c0",
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
  "arrived_at": "2026-10-30T16:45:34.356128Z",
  "started_at": "2026-10-30T16:45:34.655163Z",
  "completed_at": "2026-10-30T16:45:34.959244Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/dae52a84-7b47-4a29-89c6-1db6ff532fd4` → **200**

```json
{
  "id": "dae52a84-7b47-4a29-89c6-1db6ff532fd4",
  "short_number": 35,
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
    "id": "ff2692ef-5604-4f98-9032-62f96f53e6c0",
    "order_id": "dae52a84-7b47-4a29-89c6-1db6ff532fd4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a3d191a7-38b9-48ce-bc49-dea19122e29a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T16:45:23.552673Z",
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
      "balance_minor": 42061,
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
  "session_id": "8293ef9b-484d-446b-85ae-0c5dc101356d",
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
  "last_heartbeat_at": "2026-10-30T16:45:21.792875Z",
  "last_location_at": "2026-10-30T16:45:21.792875Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8293ef9b-484d-446b-85ae-0c5dc101356d/close` → **200**

```json
{
  "command_id": "34cf1d72-4165-4cf9-9902-24f85a519931",
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
  "session_id": "6f046b55-af05-427c-825e-44dc220c3198",
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
  "last_heartbeat_at": "2026-10-30T16:45:34.052564Z",
  "last_location_at": "2026-10-30T16:45:34.052564Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6f046b55-af05-427c-825e-44dc220c3198/close` → **200**

```json
{
  "command_id": "4151bd5f-b710-45a6-b217-fe9a407d5dd4",
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

Done: terminal order dae52a84-7b47-4a29-89c6-1db6ff532fd4 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8937"
}
```

```json
{
  "challenge_id": "215c5767-cbb2-48f1-aa5b-cc550614b327",
  "expires_at": "2026-10-30T16:50:40.026858133Z",
  "resend_available_at": "2026-10-30T16:45:41.026858133Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "451625",
  "sent_at": "2026-10-30T16:45:40.029729746Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "215c5767-cbb2-48f1-aa5b-cc550614b327",
  "code": "451625",
  "device_ref": "sandbox-8937"
}
```

```json
{
  "session_id": "9ce4c5df-cb2d-40bf-a58b-1f8b29844884",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTY0MCwiaWF0IjoxNzkzMzc4NzQwLCJqdGkiOiJhZjk0YzNiMC02NjMzLTRkNGMtYmRkZi1jNzA4NjVmYmRhNmYiLCJzaWQiOiI5Y2U0YzVkZi1jYjJkLTQwYmYtYTU4Yi0xZjhiMjk4NDQ4ODQifQ.9oqI4ffzWDIkPd1aUmvlUVGbmC8kR1L5sUF1Cu7KVJ4",
  "access_expires_at": "2026-10-30T17:00:40.338913788Z",
  "refresh_token": "GQgD-0GfDo5iCrhlCapOHkmZ9ZjLuaRdbXzloOWBYVQ",
  "refresh_expires_at": "2026-11-29T16:45:40.338366268Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-16054"
}
```

```json
{
  "challenge_id": "b204f54a-7bc4-4157-9c8d-c531e34bd648",
  "expires_at": "2026-10-30T16:50:40.89005216Z",
  "resend_available_at": "2026-10-30T16:45:41.89005216Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "384515",
  "sent_at": "2026-10-30T16:45:40.892753069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b204f54a-7bc4-4157-9c8d-c531e34bd648",
  "code": "384515",
  "device_ref": "sandbox-16054"
}
```

```json
{
  "session_id": "b04b570e-c3d6-4637-9706-a07f290c81dc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTY0MSwiaWF0IjoxNzkzMzc4NzQxLCJqdGkiOiJkMWE2YzBhZS04ZGZkLTQyNjMtYThhYy04MTM0MzllODRmMmMiLCJzaWQiOiJiMDRiNTcwZS1jM2Q2LTQ2MzctOTcwNi1hMDdmMjkwYzgxZGMifQ.StC28cvoRAh2Ua_kLVSESlN-sfckijDKGnOzZlVvnys",
  "access_expires_at": "2026-10-30T17:00:41.214216855Z",
  "refresh_token": "RDnC0ybPoSEdHbMN-KoIi9SK_fWB4XsVzXfmjcZ3BHg",
  "refresh_expires_at": "2026-11-29T16:45:41.213657774Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7060"
}
```

```json
{
  "challenge_id": "5b6f4611-b893-4abd-90dd-0468e2431c89",
  "expires_at": "2026-10-30T16:50:41.791221512Z",
  "resend_available_at": "2026-10-30T16:45:42.791221512Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "835918",
  "sent_at": "2026-10-30T16:45:41.794533598Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b6f4611-b893-4abd-90dd-0468e2431c89",
  "code": "835918",
  "device_ref": "sandbox-7060"
}
```

```json
{
  "session_id": "53911036-4aa0-444a-864d-01e92c6dbe34",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3OTY0MiwiaWF0IjoxNzkzMzc4NzQyLCJqdGkiOiJjYWY3MDg2ZS1lNjNjLTQ5ZGQtYmQwYy1kNWQ3MDgwZGM4ZDIiLCJzaWQiOiI1MzkxMTAzNi00YWEwLTQ0NGEtODY0ZC0wMWU5MmM2ZGJlMzQifQ.utL1uzBcpjGLOMdY7XSNsAEFOz1U_kJ5tGtSx_NWrEE",
  "access_expires_at": "2026-10-30T17:00:42.113537148Z",
  "refresh_token": "Cvg4FPMPEOAE7xRxZU-2vmhRn7Fb2GwP88auj1MxbcY",
  "refresh_expires_at": "2026-11-29T16:45:42.112998173Z",
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
  "audience": "CLIENT",
  "phone": "+380691051977",
  "device_ref": "sandbox-7706"
}
```

```json
{
  "challenge_id": "0e53aae4-ed8d-47f9-a894-ea37ec46c92a",
  "expires_at": "2026-10-30T16:50:42.692842062Z",
  "resend_available_at": "2026-10-30T16:45:43.692842062Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380691051977` → **200**

```json
{
  "phone": "+380691051977",
  "audience": "CLIENT",
  "code": "470206",
  "sent_at": "2026-10-30T16:45:42.695397208Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e53aae4-ed8d-47f9-a894-ea37ec46c92a",
  "code": "470206",
  "device_ref": "sandbox-7706"
}
```

```json
{
  "session_id": "20eff39b-d712-43be-8b1d-4bba3cf61c82",
  "subject": {
    "type": "CLIENT",
    "id": "ec7f30d1-ed95-495e-9559-91ae0cc82958"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYzdmMzBkMS1lZDk1LTQ5NWUtOTU1OS05MWFlMGNjODI5NTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5NjQzLCJpYXQiOjE3OTMzNzg3NDMsImp0aSI6ImE3YzE4NDZmLWFhNDctNDE4Yi1hMTA4LTVmNzMxMWI4ZDNlZSIsInNpZCI6IjIwZWZmMzliLWQ3MTItNDNiZS04YjFkLTRiYmEzY2Y2MWM4MiJ9.BBt6SyGiur41uWoPyaPJAXcKGk4XkqWkHYLgVA4nVlc",
  "access_expires_at": "2026-10-30T17:00:43.011435952Z",
  "refresh_token": "FABaRMBUvrdZ4XEgCm6p_UMPY3ROcPVXG9ka9WJ-e3E",
  "refresh_expires_at": "2026-11-29T16:45:43.010907381Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "541b740e-ce80-4bd6-98d3-877fd0f3cf31",
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
  "id": "d3d6a18b-ca21-4ff6-bde4-c796e4ba6366",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T16:50:43.304655Z",
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
  "command_id": "0ab68ad2-dbeb-400f-8f59-cb1d6e748767",
  "quote_id": "d3d6a18b-ca21-4ff6-bde4-c796e4ba6366",
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
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "search_phase": "EXHAUSTED",
  "assignment": null,
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## All eight metrics are non-zero, with closed labels and no ids/phones
Metric validator: good scrape accepted; missing, unknown, id/phone, extra, zero and NaN rejected
{
  "blizz_orders_total": 36,
  "blizz_orders_cancelled_total": 22,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 24,
  "blizz_dispatch_assigned_seconds_count": 22,
  "blizz_offers_total": 27,
  "blizz_dispatch_excluded_total": 17,
  "blizz_sms_sent_total": 86
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 11.777107037
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 21
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 19.221376849
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="CITY_NOT_ADMITTED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAUSED"} 3.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 24
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.663899664
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 21.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 2.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 4.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 28.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 2.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 10.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 79.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/c2766eba-6bee-4500-940a-3230cdbbb65b` → **200**

```json
{
  "id": "c2766eba-6bee-4500-940a-3230cdbbb65b",
  "short_number": 36,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ec7f30d1-ed95-495e-9559-91ae0cc82958",
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
  "search_phase": "EXHAUSTED",
  "assignment": null,
  "created_at": "2026-10-30T16:45:43.611392Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: zz-reconciliation

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
  "session_id": "8b838bd4-9c94-4260-9dbe-ec845199782d",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk4MjUsImlhdCI6MTc5MzM3ODkyNSwianRpIjoiOGYzMDg2OTQtNzY0ZC00OWEwLTgxY2YtNjY3Y2QxM2M2OTBmIiwic2lkIjoiOGI4MzhiZDQtOWM5NC00MjYwLTlkYmUtZWM4NDUxOTk3ODJkIn0.1RUAR0Yqx6IZJgC_sJgyB8BMU1iN-HwSvTebHgJJaxM",
  "access_expires_at": "2026-10-30T17:03:45.441260254Z",
  "refresh_token": "nIo5BvdptDtCNmUB8becPv1fIagSRjWcXUMXvI3nyq0",
  "refresh_expires_at": "2026-10-31T04:48:45.440277729Z",
  "password_change_required": false
}
```

## The earlier card flows reconcile cleanly without moving money

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30"
}
```

```json
{
  "id": "60098bd9-6bcb-4614-a7ce-858e4d425967",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:48:45.746669Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:48:45.746721Z",
  "updated_at": "2026-10-30T16:48:45.765583Z",
  "finished_at": "2026-10-30T16:48:45.765583Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/60098bd9-6bcb-4614-a7ce-858e4d425967` → **200**

```json
{
  "run": {
    "id": "60098bd9-6bcb-4614-a7ce-858e4d425967",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T16:48:45.746669Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T16:48:45.746721Z",
    "updated_at": "2026-10-30T16:48:45.765583Z",
    "finished_at": "2026-10-30T16:48:45.765583Z",
    "version": 1
  },
  "items": [],
  "next": null
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30"
}
```

```json
{
  "id": "60098bd9-6bcb-4614-a7ce-858e4d425967",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:48:45.746669Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:48:45.746721Z",
  "updated_at": "2026-10-30T16:48:45.765583Z",
  "finished_at": "2026-10-30T16:48:45.765583Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30"
}
```

```json
{
  "id": "60098bd9-6bcb-4614-a7ce-858e4d425967",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:48:45.746669Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:48:45.746721Z",
  "updated_at": "2026-10-30T16:48:45.765583Z",
  "finished_at": "2026-10-30T16:48:45.765583Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/e19a95b2-48bb-4967-bfa5-fba87bf9e477` → **204**

```json
{
  "amount_minor": 100,
  "currency": "PLN"
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "8f9c9dfa-6901-4fb0-9782-828875047f58",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:48:46.19514Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:48:46.195172Z",
  "updated_at": "2026-10-30T16:48:46.20241Z",
  "finished_at": "2026-10-30T16:48:46.20241Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/8f9c9dfa-6901-4fb0-9782-828875047f58` → **200**

```json
{
  "run": {
    "id": "8f9c9dfa-6901-4fb0-9782-828875047f58",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T16:48:46.19514Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T16:48:46.195172Z",
    "updated_at": "2026-10-30T16:48:46.20241Z",
    "finished_at": "2026-10-30T16:48:46.20241Z",
    "version": 1
  },
  "items": [
    {
      "id": "3033a61d-4a97-4068-8151-98456d01c341",
      "run_id": "8f9c9dfa-6901-4fb0-9782-828875047f58",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "a062ed6fd8678b45c9c4cb32d9213b6cf81f6910c939d4bb0801cbc4ea415cf2",
      "reference_display": "sandbox-reconciliation-e19a95b2-48bb-4967-bfa5-fba87bf9e477",
      "local_operation_id": null,
      "local_record_id": null,
      "local_type": null,
      "local_state": null,
      "local_amount_minor": null,
      "local_currency": null,
      "provider_type": "PURCHASE",
      "provider_state": "CAPTURED",
      "provider_status": "Approved",
      "provider_amount_minor": 100,
      "provider_currency": "PLN",
      "fee_minor": null,
      "provider_at": "2026-10-30T16:48:46Z",
      "state": "OPEN",
      "decision": null,
      "reason": null,
      "resolved_by": null,
      "resolved_at": null,
      "version": 0
    }
  ],
  "next": null
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "8f9c9dfa-6901-4fb0-9782-828875047f58",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:48:46.19514Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:48:46.195172Z",
  "updated_at": "2026-10-30T16:48:46.20241Z",
  "finished_at": "2026-10-30T16:48:46.20241Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "8f9c9dfa-6901-4fb0-9782-828875047f58",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:48:46.19514Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:48:46.195172Z",
  "updated_at": "2026-10-30T16:48:46.20241Z",
  "finished_at": "2026-10-30T16:48:46.20241Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/3033a61d-4a97-4068-8151-98456d01c341/resolve` → **200**

```json
{
  "command_id": "f2f5c77a-7710-436b-b789-2ee94132d091",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "3033a61d-4a97-4068-8151-98456d01c341",
  "run_id": "8f9c9dfa-6901-4fb0-9782-828875047f58",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "a062ed6fd8678b45c9c4cb32d9213b6cf81f6910c939d4bb0801cbc4ea415cf2",
  "reference_display": "sandbox-reconciliation-e19a95b2-48bb-4967-bfa5-fba87bf9e477",
  "local_operation_id": null,
  "local_record_id": null,
  "local_type": null,
  "local_state": null,
  "local_amount_minor": null,
  "local_currency": null,
  "provider_type": "PURCHASE",
  "provider_state": "CAPTURED",
  "provider_status": "Approved",
  "provider_amount_minor": 100,
  "provider_currency": "PLN",
  "fee_minor": null,
  "provider_at": "2026-10-30T16:48:46Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "resolved_at": "2026-10-30T16:48:46.622343Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/3033a61d-4a97-4068-8151-98456d01c341/resolve` → **200**

```json
{
  "command_id": "f2f5c77a-7710-436b-b789-2ee94132d091",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "3033a61d-4a97-4068-8151-98456d01c341",
  "run_id": "8f9c9dfa-6901-4fb0-9782-828875047f58",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "a062ed6fd8678b45c9c4cb32d9213b6cf81f6910c939d4bb0801cbc4ea415cf2",
  "reference_display": "sandbox-reconciliation-e19a95b2-48bb-4967-bfa5-fba87bf9e477",
  "local_operation_id": null,
  "local_record_id": null,
  "local_type": null,
  "local_state": null,
  "local_amount_minor": null,
  "local_currency": null,
  "provider_type": "PURCHASE",
  "provider_state": "CAPTURED",
  "provider_status": "Approved",
  "provider_amount_minor": 100,
  "provider_currency": "PLN",
  "fee_minor": null,
  "provider_at": "2026-10-30T16:48:46Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
  "resolved_at": "2026-10-30T16:48:46.622343Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/3033a61d-4a97-4068-8151-98456d01c341/resolve` → **409**

```json
{
  "command_id": "4ad5c8aa-9d4f-498b-afec-6c0b8aa552fb",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/3033a61d-4a97-4068-8151-98456d01c341/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "50f24cfa-f06a-4605-8ed8-3acec4cdc74c"
}
```

`GET /api/admin/v1/payment-reconciliations/8f9c9dfa-6901-4fb0-9782-828875047f58` → **200**

```json
{
  "run": {
    "id": "8f9c9dfa-6901-4fb0-9782-828875047f58",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T16:48:46.19514Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T16:48:46.195172Z",
    "updated_at": "2026-10-30T16:48:46.622343Z",
    "finished_at": "2026-10-30T16:48:46.20241Z",
    "version": 2
  },
  "items": [
    {
      "id": "3033a61d-4a97-4068-8151-98456d01c341",
      "run_id": "8f9c9dfa-6901-4fb0-9782-828875047f58",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "a062ed6fd8678b45c9c4cb32d9213b6cf81f6910c939d4bb0801cbc4ea415cf2",
      "reference_display": "sandbox-reconciliation-e19a95b2-48bb-4967-bfa5-fba87bf9e477",
      "local_operation_id": null,
      "local_record_id": null,
      "local_type": null,
      "local_state": null,
      "local_amount_minor": null,
      "local_currency": null,
      "provider_type": "PURCHASE",
      "provider_state": "CAPTURED",
      "provider_status": "Approved",
      "provider_amount_minor": 100,
      "provider_currency": "PLN",
      "fee_minor": null,
      "provider_at": "2026-10-30T16:48:46Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f",
      "resolved_at": "2026-10-30T16:48:46.622343Z",
      "version": 1
    }
  ],
  "next": null
}
```

`GET /api/admin/v1/payment-reconciliations?merchant_id=5a000000-0000-4000-8000-000000000602&limit=100` → **200**

```json
{
  "runs": [
    {
      "id": "8f9c9dfa-6901-4fb0-9782-828875047f58",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T16:48:46.19514Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T16:48:46.195172Z",
      "updated_at": "2026-10-30T16:48:46.622343Z",
      "finished_at": "2026-10-30T16:48:46.20241Z",
      "version": 2
    },
    {
      "id": "875cdeac-e92b-4eec-85e0-c495576a5d1a",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T16:28:35.563417Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T16:28:35.563501Z",
      "updated_at": "2026-10-30T16:28:35.569123Z",
      "finished_at": "2026-10-30T16:28:35.569123Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/e19a95b2-48bb-4967-bfa5-fba87bf9e477` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "8f9c9dfa-6901-4fb0-9782-828875047f58",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T16:48:46.19514Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T16:48:46.195172Z",
  "updated_at": "2026-10-30T16:48:46.622343Z",
  "finished_at": "2026-10-30T16:48:46.20241Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793379050945E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793379051345E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793379051345E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793379050945E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793379051346E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.

# Scenario: backup-restore

## A rider exists when the backup is taken

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688432703",
  "device_ref": "sandbox-1329"
}
```

```json
{
  "challenge_id": "60a84f05-4205-41dd-8023-64d653cf80c0",
  "expires_at": "2026-10-30T16:55:55.300333829Z",
  "resend_available_at": "2026-10-30T16:50:56.300333829Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380688432703` → **200**

```json
{
  "phone": "+380688432703",
  "audience": "CLIENT",
  "code": "099692",
  "sent_at": "2026-10-30T16:50:55.303503606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60a84f05-4205-41dd-8023-64d653cf80c0",
  "code": "099692",
  "device_ref": "sandbox-1329"
}
```

```json
{
  "session_id": "1450cc6c-88dc-4b62-8e25-90c8f6f4b2fc",
  "subject": {
    "type": "CLIENT",
    "id": "0bdb3b25-6969-49ed-847b-7563b82f7c0b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYmRiM2IyNS02OTY5LTQ5ZWQtODQ3Yi03NTYzYjgyZjdjMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc5OTU1LCJpYXQiOjE3OTMzNzkwNTUsImp0aSI6IjIyODA1NTg2LWZmYTItNDE0NC1iNGVmLTQxMWI2NWM0MmUwNiIsInNpZCI6IjE0NTBjYzZjLTg4ZGMtNGI2Mi04ZTI1LTkwYzhmNmY0YjJmYyJ9.aEtAhb_nmnKpvBvPfFbo4DcdH0hInVuxvPmRCErOo04",
  "access_expires_at": "2026-10-30T17:05:55.641585362Z",
  "refresh_token": "iA--r6x94B3OumJ_mooPbXqV5fSVyckc6hhvYA6XTKU",
  "refresh_expires_at": "2026-11-29T16:50:55.64100208Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0bdb3b25-6969-49ed-847b-7563b82f7c0b",
  "session_id": "1450cc6c-88dc-4b62-8e25-90c8f6f4b2fc",
  "account_state": "ACTIVE"
}
```

## Back up the database (deploy/backup.sh)
Backed up blizz to blizz.dump (552K)

## After the backup the rider deletes the account and staff complete it

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "8a172e3b-f54e-4fc2-8482-ffac2c516401",
  "expires_at": "2026-10-30T16:55:58.768351674Z",
  "resend_available_at": "2026-10-30T16:50:59.768351674Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380688432703` → **200**

```json
{
  "phone": "+380688432703",
  "audience": "CLIENT",
  "code": "820281",
  "sent_at": "2026-10-30T16:50:58.770660222Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "67b4ce7d-caa6-4c4c-bd92-adca4556217e",
  "challenge_id": "8a172e3b-f54e-4fc2-8482-ffac2c516401",
  "otp_code": "820281"
}
```

```json
{
  "client_id": "0bdb3b25-6969-49ed-847b-7563b82f7c0b",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T16:50:59.079229742Z"
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
  "session_id": "5877f009-4e1b-4c8c-a718-396c53ea27f4",
  "subject": {
    "type": "STAFF",
    "id": "ac5d2bb3-fc7c-46e7-9336-3d1329aad56f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzVkMmJiMy1mYzdjLTQ2ZTctOTMzNi0zZDEzMjlhYWQ1NmYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzk5NTksImlhdCI6MTc5MzM3OTA1OSwianRpIjoiZTVmOTZjZTUtODA1Yi00NTYxLThjNTktY2NlMjhjZjVlM2ZkIiwic2lkIjoiNTg3N2YwMDktNGUxYi00YzhjLWE3MTgtMzk2YzUzZWEyN2Y0In0.9MZMnb1GPsdhKZOQBr9TDXa-zfO3VLd9b87iZntdhHo",
  "access_expires_at": "2026-10-30T17:05:59.641093236Z",
  "refresh_token": "i4qIQBCjbwUsRLAuSsqrzk9dYaIA0OPBomKrdj2Yzqs",
  "refresh_expires_at": "2026-10-31T04:50:59.640507946Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/client-deletions/0bdb3b25-6969-49ed-847b-7563b82f7c0b/complete` → **200**

```json
{
  "command_id": "f3d6f079-8505-4a97-8307-526b0a56a592",
  "reason": "Sandbox: backup and restore check"
}
```

```json
{
  "client_id": "0bdb3b25-6969-49ed-847b-7563b82f7c0b",
  "account_state": "ANONYMIZED"
}
```

## Restore into an empty database (deploy/restore.sh); over data it refuses
Restored blizz.dump into blizz_restored: 102 migrations applied. Start the server on it with the same ERASURE_JOURNAL_DIR.
Database blizz_restored is not empty (113 tables): restore only into an empty database

In the restored database before the server starts: `ACTIVE +380688432703` (the backup predates the deletion).

## Start the server on the restored database with the same journal: the deletion is applied again

After the start: `ANONYMIZED -`.

Done: backup, restore into an empty database, start on it; the deleted rider stayed deleted (T-39).
