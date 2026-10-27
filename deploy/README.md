# Deploy

Deployment, backup and restore for client instances: single-instance and high-availability profiles (section 26 of the specification).

## Push notifications

Each service sends pushes from its own Firebase project (REQ-TEN-08), so the apps of one service never receive
another's. A real instance needs, from the environment:

| Variable | Value |
|---|---|
| `FCM_PROJECT_ID` | the Firebase project id |
| `FCM_CREDENTIALS` | the whole service account JSON (role "Firebase Cloud Messaging API Admin") |

Without them the server does not start. `PUSH_PROVIDER=FAKE` only writes pushes to the log; the `dev` and `sandbox`
profiles use it.
