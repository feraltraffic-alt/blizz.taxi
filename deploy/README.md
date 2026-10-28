# Deploy

Deployment, backup and restore for client instances: single-instance and high-availability profiles (section 26 of the specification).

## Keys of integrations

Keys of Firebase, GraphHopper, the map keys of the apps and the payment merchants are entered in the admin panel
(Integrations, permission `integrations.manage`; every change asks for the password again and goes to the audit
without the key). The servers use a new value within seconds, without a restart. A value in the panel wins over
the environment; the environment variables below remain for instances configured without the panel.

The panel stores keys encrypted with the instance's master key, which only the environment knows:

| Variable | Value |
|---|---|
| `SECRETS_MASTER_KEY` | 32 random bytes in Base64 (`openssl rand -base64 32`), one per instance |

Keep the master key with the database backups but not in them: a restored database without it has unreadable
keys (they are entered again), and a stolen dump without it reveals none. Without a master key the panel cannot
store keys.

## Addresses typed in the admin panel

The server refuses an address in the admin panel (GraphHopper, Asterisk ARI) that points into its own network:
loopback, private networks, carrier-grade NAT, and never link-local (the cloud's metadata service), also when a name
resolves to such an address, on save and again before every connection (REQ-SEC-05). The service's own hosts in a
private network — usually Asterisk — are listed in `BLIZZ_OUTBOUND_PRIVATE_HOSTS` (comma-separated, as typed in the
address, e.g. `asterisk,10.0.0.7`).

## Call recordings

Every call the call centre takes through the service's Asterisk is recorded (issue #60). The dialplan records it
with `MixMonitor(/var/spool/asterisk/recording/${UNIQUEID}.wav)` after `Answer()` — the stored-recordings directory
of ARI, named after the call's first channel (example: `deploy/dev/asterisk/extensions.conf`, context
`blizz-incoming`). After the call the server downloads the file through ARI (the address, user and password of the
panel, Integrations → otp), keeps it encrypted (AES-256-GCM with a key derived from `SECRETS_MASTER_KEY`) and then
removes Asterisk's copy; without a master key recordings wait on Asterisk. They are kept below the files directory
(`call_recording/…`), or in `CALL_RECORDINGS_DIR` — a disk with its own backup and access rights. A
recording is listened to in the panel with the permission `calls.listen`, each time in the audit; nothing deletes
recordings until their retention is decided (Q-19), so plan the disk: WAV at 8 kHz takes about 58 MB an hour of
talk.

The recordings' key is derived from `SECRETS_MASTER_KEY`: changing or losing the master key makes every stored
recording unreadable. Never rotate it without re-encrypting the recordings first (there is no tool for that yet).

## Push notifications

Each service sends pushes from its own Firebase project (REQ-TEN-08), so the apps of one service never receive
another's. The project id and the service account JSON (role "Firebase Cloud Messaging API Admin") are entered in
the panel; "Check the connection" signs in to Firebase without sending anything. Alternatively from the
environment: `FCM_PROJECT_ID`, `FCM_CREDENTIALS`. Without keys the server runs, and pushes wait until their
deadline. `PUSH_PROVIDER=FAKE` only writes pushes to the log; the `dev` and `sandbox` profiles use it.

## Routing (GraphHopper)

Prices and times come from the road route when GraphHopper is on; without it, a straight-line estimate is used
(also as the fallback when GraphHopper is slow, down or finds no route). Set in the admin panel (Integrations →
routing) or through the environment:

| Variable | Hosted API | Own server |
| --- | --- | --- |
| `BLIZZ_ROUTING_GRAPHHOPPER_ENABLED` | `true` | `true` |
| `BLIZZ_ROUTING_GRAPHHOPPER_BASE_URL` | (default `https://graphhopper.com/api/1`) | e.g. `http://graphhopper:8989` |
| `BLIZZ_ROUTING_GRAPHHOPPER_API_KEY` | the key | — |
| `BLIZZ_ROUTING_GRAPHHOPPER_PROFILE` | `car` | the profile configured on the server |

An own server needs an OpenStreetMap extract of the service's region (e.g. Ukraine or Poland from Geofabrik) and
memory roughly proportional to it; it is a separate container next to the backend.
