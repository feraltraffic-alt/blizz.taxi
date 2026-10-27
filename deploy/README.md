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

## Routing (GraphHopper)

Prices and times come from the road route when GraphHopper is on; without it, a straight-line estimate is used
(also as the fallback when GraphHopper is slow, down or finds no route). Set through the environment:

| Variable | Hosted API | Own server |
| --- | --- | --- |
| `BLIZZ_ROUTING_GRAPHHOPPER_ENABLED` | `true` | `true` |
| `BLIZZ_ROUTING_GRAPHHOPPER_BASE_URL` | (default `https://graphhopper.com/api/1`) | e.g. `http://graphhopper:8989` |
| `BLIZZ_ROUTING_GRAPHHOPPER_API_KEY` | the key | — |
| `BLIZZ_ROUTING_GRAPHHOPPER_PROFILE` | `car` | the profile configured on the server |

An own server needs an OpenStreetMap extract of the service's region (e.g. Ukraine or Poland from Geofabrik) and
memory roughly proportional to it; it is a separate container next to the backend.
