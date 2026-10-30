# Deploy

Deployment, backup and restore for client instances: single-instance and high-availability profiles (section 26 of the specification).

## Production profile

A real instance runs with `SPRING_PROFILES_ACTIVE=prod` (REQ-ENG-13). The profile has no default for any secret, and the server refuses to start, before it touches the database, while anything of development or the sandbox is left. It lists every problem at once, by name, never the value:

| Variable | Rule |
|---|---|
| `OTP_SECRET`, `ACCESS_TOKEN_SECRET` | set, at least 32 characters, not a value from this repository |
| `SECRETS_MASTER_KEY` | set (`openssl rand -base64 32`), not the dev/sandbox key; keep it with DB and files backups |
| `DB_PASSWORD` | set |
| `INSTANCE_ID` | set once for the instance and never changed (REQ-TEN-02); not the dev or sandbox id |
| `PUBLIC_BASE_URL` | the instance's public `https://` address |
| `ERASURE_JOURNAL_DIR` | a durable directory outside `/tmp`, not backed up with the database (ADR 0013) |
| `OTP_PROVIDER`, `PUSH_PROVIDER`, geocoding provider | never `FAKE`; fake payment merchants are never allowed |
| `STAFF_BOOTSTRAP_PASSWORD` | if set, not the sandbox password |

`prod` is never combined with `dev`, `sandbox` or `test`. Without a profile the server does not start (threat model O1): set `SPRING_PROFILES_ACTIVE=prod` on a real instance, `dev` for local development.

## Access logs of the proxy

Admin search by phone passes the phone in the query string, for example `/api/admin/v1/otp-deliveries?phone=…`, `/api/admin/v1/clients?phone=…` and `/api/admin/v1/rider-wallets?phone=…`. The server's own logs record only the route template. The reverse proxy in front of the server **must not log query strings** of `/api/` or `/ws/` (threat model O2, REQ-SEC-08): log the path and the status, never `$request_uri` or `$args`. The live channel `/ws/v1/…` takes its token in the `Authorization` header or, from a browser, as the subprotocol `blizz.bearer.<token>` next to `blizz.v1`; a token in the address is refused. Do not log the `Sec-WebSocket-Protocol` or `Authorization` headers either. In nginx, for example:

```nginx
log_format blizz '$remote_addr [$time_iso8601] "$request_method $uri" $status $body_bytes_sent $request_time';
access_log /var/log/nginx/blizz.log blizz;
```

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

The same key encrypts the files of driver documents (passports, licences, vehicle papers) and call recordings below
the files directory (issue #135). Keep it with the **files** backups too, again not inside them: a restored files
directory without the key is unreadable, and a stolen copy of it shows no one's documents. Documents stored in the
clear before #135 are re-encrypted in the background after the upgrade; the gauge `blizz_files_documents_plain`
falls to 0 when that is done, and `blizz_files_documents_encryption_failing` counts files that could not be read
(see the server log, "could not be encrypted"). Without a master key no driver document can be uploaded.

## Addresses typed in the admin panel

The server refuses an address in the admin panel (GraphHopper, Asterisk ARI) that points into its own network:
loopback, private networks, carrier-grade NAT, and never link-local (the cloud's metadata service), also when a name
resolves to such an address, on save and again before every connection (REQ-SEC-05). The service's own hosts in a
private network — usually Asterisk — are listed in `BLIZZ_OUTBOUND_PRIVATE_HOSTS` (comma-separated, as typed in the
address, e.g. `asterisk,10.0.0.7`).

## Monitoring

Metrics are on the management port only — `MANAGEMENT_PORT` (default 8081), `/actuator/prometheus` — and that port
is never published; the main port answers `/livez` and `/readyz` for the load balancer. Alert rules with owners and
runbooks: `deploy/monitoring/alerts.yml`, `docs/runbooks/`. Every log line carries `[correlation_id]`; phones, tokens,
codes and precise positions are taken out by the server itself (REQ-SEC-08).

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
