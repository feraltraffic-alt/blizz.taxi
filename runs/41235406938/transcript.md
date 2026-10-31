# L1 load run (2026-10-31T19:45:46Z, e743e69)

Profile: 1000 drivers online (heartbeat every 4 s, so about 250 GPS points a second),
1000 + 1000 WebSockets, 2 orders a second for 2 minutes with a one-minute burst at 10 a second.
Machine: one GitHub-hosted runner (4 vCPU, 15 GB) holds the server,
PostgreSQL and k6 together; the numbers describe this runner, not the pilot's servers.

## Requests (k6)

| Request | count | p50 ms | p95 ms | p99 ms | max ms |
|---|---|---|---|---|---|
| heartbeat | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| go_online | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| offers | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| accept | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| trip_current | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| arrive | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| start | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| complete | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| quote | 721 | 9.0 | 14 | 17 | 226 |
| order | 721 | 14 | 21 | 59 | 142 |

Requests: 1442 (8.0/s), failed (status ≥ 400 or no answer): 0.00 %.
Checks passed: 100.00 %. Offers accepted: 0, lost to another driver or expiry: 0; rides completed: 0; WebSocket errors: 0; WebSocket sessions: 0.

## Server and database (every 10 s)

| Measure | max | at the end |
|---|---|---|
| Server CPU, % of one core (ps) | 259 | 28.3 |
| Server RSS, MB | 479 | 479 |
| Server threads | 79 | 79 |
| Host CPU use (system_cpu_usage) | 0.19 | 0.09 |
| Heap used, MB | 146.84 | 112.84 |
| GC pauses (count, cumulative) | 6 | 6 |
| GC pause time, s (cumulative) | 0.05 | 0.05 |
| Longest GC pause, s (recent max) | 0.01 | 0.01 |
| Hikari active connections | 3 | 1 |
| Hikari threads waiting for a connection | 0 | 0 |
| Hikari connection timeouts (cumulative) | 0 | 0 |
| Database connections (pg_stat_activity) | 21 | 21 |
| Database sessions idle in transaction | 2 | 0 |
| Locks waited for (pg_locks not granted) | 0 | 0 |
| Locks held | 19 | 9 |
| Outbox pending events (queue lag) | 21 | 12 |
| Oldest pending outbox event, s | 0.59 | 0.35 |
| Outbox events failed | 0 | 0 |
| Drivers online (server gauge) | 0 | 0 |
| Orders searching | 692 | 692 |
| Assignments active | 0 | 0 |
| Orders created (cumulative) | 0 | 0 |
| Orders unfulfilled (cumulative) | 0 | 0 |

## Invariants during the run

Scans with a violation: 0 of 19; the largest sum of violations in one scrape: NaN. The five checks were last clean at 2026-10-31T19:45:32.375Z (the oldest of the five).

## k6 output (last 60 lines)

```
```
