# Sandbox transcript (2026-11-01T08:15:00Z, 753fd95)

# Scenario: first-city

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
  "correlation_id": "74c30458-3453-4025-9c46-48b57a0687de"
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
  "session_id": "5b33e7f0-bc5c-49fc-a49c-9f99f2f365d2",
  "subject": {
    "type": "STAFF",
    "id": "c3c66038-862a-40af-9415-011f7afd6bb1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjM2M2NjAzOC04NjJhLTQwYWYtOTQxNS0wMTFmN2FmZDZiYjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1MjE4MTAsImlhdCI6MTc5MzUyMDkxMCwianRpIjoiOTNlYjE0MzUtOWFiOC00NTAyLWJiYjQtODliMDlhZjgzOGFlIiwic2lkIjoiNWIzM2U3ZjAtYmM1Yy00OWZjLWE0OWMtOWY5OWYyZjM2NWQyIn0.WcxWawzCbbgQmUeYrI26ZL2ot9fPQCkjeGQ0k9zQTXM",
  "access_expires_at": "2026-11-01T08:30:10.718683332Z",
  "refresh_token": "fCtMjBHDsLpXNBqyeMTXvjoFvGd38zKJ9N7rgNasbJo",
  "refresh_expires_at": "2026-11-01T20:15:10.716309333Z",
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
  "session_id": "1ad92569-2906-428f-a1bb-0957b6619549",
  "subject": {
    "type": "STAFF",
    "id": "c3c66038-862a-40af-9415-011f7afd6bb1"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjM2M2NjAzOC04NjJhLTQwYWYtOTQxNS0wMTFmN2FmZDZiYjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTM1MjE4MTIsImlhdCI6MTc5MzUyMDkxMiwianRpIjoiMDU1MDhjYjUtYmE0Ny00ZGNhLWEzZWQtOGEzMmEyYjQ1Mzg2Iiwic2lkIjoiMWFkOTI1NjktMjkwNi00MjhmLWExYmItMDk1N2I2NjE5NTQ5In0.ie3z2omdwHCUVvGqLjGw_4AvU_2SuT-aHhJVmHkV1W8",
  "access_expires_at": "2026-11-01T08:30:12.605184654Z",
  "refresh_token": "T7SL0PipUMdWlAYT5U4mS_3ianp4orCaPIr2VVtTZ40",
  "refresh_expires_at": "2026-11-01T20:15:12.604139408Z",
  "password_change_required": false
}
```

## The admin creates a new city in the Southern Ocean and publishes it

`POST /api/admin/v1/cities` → **201**

```json
{
  "command_id": "50940b8c-c15a-418d-9993-2e31511f5336",
  "code": "sandbox-first-104-18582",
  "name": "Sandbox first city",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "polygon": {
    "type": "MultiPolygon",
    "coordinates": [
      [
        [
          [
            104,
            -61
          ],
          [
            105,
            -61
          ],
          [
            105,
            -60
          ],
          [
            104,
            -60
          ],
          [
            104,
            -61
          ]
        ]
      ]
    ]
  },
  "priority": 0,
  "reason": "Sandbox: the first city (AC-01)"
}
```

```json
{
  "id": "14944b7e-3226-4d41-9395-ede635593d8e",
  "state": "DRAFT",
  "version": 0
}
```

`POST /api/admin/v1/cities/14944b7e-3226-4d41-9395-ede635593d8e/publish` → **200**

```json
{
  "command_id": "99ae9bfc-a572-4180-9ccb-e3cddaa13556",
  "expected_version": 0,
  "reason": "Sandbox: open"
}
```

```json
{
  "id": "14944b7e-3226-4d41-9395-ede635593d8e",
  "state": "PUBLISHED",
  "version": 1
}
```

`GET /api/admin/v1/cities/14944b7e-3226-4d41-9395-ede635593d8e/operations` → **200**

```json
{
  "city_id": "14944b7e-3226-4d41-9395-ede635593d8e",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "return_zone_meters": 0,
  "dropoff_outside_city": {
    "allowed": true,
    "max_distance_km": null
  },
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`PUT /api/admin/v1/cities/14944b7e-3226-4d41-9395-ede635593d8e/operations` → **405**

```json
{
  "command_id": "189c98c7-460a-4f4b-82ab-b5ef3bc266de",
  "expected_version": 0,
  "working_hours": [],
  "payment_methods": [
    "CASH",
    "TERMINAL"
  ],
  "reason": "Sandbox: open around the clock, cash and terminal"
}
```

```json
{
  "instance": "/api/admin/v1/cities/14944b7e-3226-4d41-9395-ede635593d8e/operations",
  "status": 405,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9532ec48-4181-489e-a756-b196c7aa054a"
}
```

**Contract validation failed — scenario stopped.**

`GET /api/admin/v1/cities?state=PUBLISHED` → **200**

```json
{
  "cities": [
    {
      "id": "14944b7e-3226-4d41-9395-ede635593d8e",
      "code": "sandbox-first-104-18582",
      "name": "Sandbox first city",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "priority": 0,
      "state": "PUBLISHED",
      "version": 1,
      "polygon": {
        "type": "MultiPolygon",
        "coordinates": [
          [
            [
              [
                104,
                -61
              ],
              [
                105,
                -61
              ],
              [
                105,
                -60
              ],
              [
                104,
                -60
              ],
              [
                104,
                -61
              ]
            ]
          ]
        ]
      }
    },
    {
      "id": "5a000000-0000-4000-8000-000000000002",
      "code": "warszawa",
      "name": "Warszawa",
      "currency": "PLN",
      "timezone": "Europe/Warsaw",
      "priority": 100,
      "state": "PUBLISHED",
      "version": 0,
      "polygon": {
        "type": "MultiPolygon",
        "coordinates": [
          [
            [
              [
                20.85,
                52.09
              ],
              [
                21.27,
                52.09
              ],
              [
                21.27,
                52.37
              ],
              [
                20.85,
                52.37
              ],
              [
                20.85,
                52.09
              ]
            ]
          ]
        ]
      }
    },
```

`POST /api/admin/v1/cities/14944b7e-3226-4d41-9395-ede635593d8e/archive` → **200**

```json
{
  "command_id": "c1e420ff-8037-4f9b-9094-d2af57d90926",
  "expected_version": 1,
  "reason": "Sandbox: first city done"
}
```

```json
{
  "id": "14944b7e-3226-4d41-9395-ede635593d8e",
  "state": "ARCHIVED",
  "version": 2
}
```
