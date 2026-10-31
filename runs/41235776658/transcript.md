# L1 load run (2026-10-31T19:51:23Z, f3f8c2f)

Profile: 1000 drivers online (heartbeat every 4 s, so about 250 GPS points a second),
1000 + 1000 WebSockets, 2 orders a second for 2 minutes with a one-minute burst at 10 a second.
Machine: one GitHub-hosted runner (4 vCPU, 15 GB) holds the server,
PostgreSQL and k6 together; the numbers describe this runner, not the pilot's servers.

## Requests (k6)

| Request | count | p50 ms | p95 ms | p99 ms | max ms |
|---|---|---|---|---|---|
| heartbeat | 44501 | 9.7 | 26 | 40 | 734 |
| go_online | 1000 | 514 | 2014 | 2369 | 2696 |
| offers | 720 | 3.6 | 8.6 | 13 | 36 |
| accept | 720 | 20 | 40 | 54 | 75 |
| trip_current | 703 | 2.9 | 7.1 | 12 | 43 |
| arrive | 703 | 8.1 | 17 | 28 | 99 |
| start | 703 | 7.6 | 16 | 27 | 53 |
| complete | 703 | 10 | 31 | 44 | 58 |
| quote | 720 | 13 | 27 | 44 | 241 |
| order | 720 | 68 | 129 | 190 | 347 |

Requests: 51193 (226.7/s), failed (status ≥ 400 or no answer): 0.00 %.
Checks passed: 100.00 %. Offers accepted: 720, lost to another driver or expiry: 0; rides completed: 703; WebSocket errors: 0; WebSocket sessions: 2000.

## Server and database (every 10 s)

| Measure | max | at the end |
|---|---|---|
| Server CPU, % of one core (ps) | 263 | 81.8 |
| Server RSS, MB | 881 | 881 |
| Server threads | 271 | 269 |
| Host CPU use (system_cpu_usage) | 0.99 | 0.06 |
| Heap used, MB | 374.8 | 240.57 |
| GC pauses (count, cumulative) | 62 | 62 |
| GC pause time, s (cumulative) | 0.42 | 0.42 |
| Longest GC pause, s (recent max) | 0.04 | 0.01 |
| Hikari active connections | 13 | 1 |
| Hikari threads waiting for a connection | 0 | 0 |
| Hikari connection timeouts (cumulative) | 0 | 0 |
| Database connections (pg_stat_activity) | 21 | 21 |
| Database sessions idle in transaction | 7 | 0 |
| Locks waited for (pg_locks not granted) | 0 | 0 |
| Locks held | 278 | 9 |
| Outbox pending events (queue lag) | 313 | 15 |
| Oldest pending outbox event, s | 4.77 | 0.92 |
| Outbox events failed | 0 | 0 |
| Drivers online (server gauge) | 1000 | 1000 |
| Orders searching | 49 | 0 |
| Assignments active | 288 | 104 |
| Orders created (cumulative) | 0 | 0 |
| Orders unfulfilled (cumulative) | 0 | 0 |

## Invariants during the run

Scans with a violation: 0 of 23; the largest sum of violations in one scrape: NaN. The five checks were last clean at 2026-10-31T19:51:03.662Z (the oldest of the five).

## k6 output (last 60 lines)

```
```
