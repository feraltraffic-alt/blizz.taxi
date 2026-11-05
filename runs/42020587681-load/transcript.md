# L1 load run (2026-11-05T11:55:37Z, 65db825)

Profile: 1000 drivers online (heartbeat every 4 s, so about 250 GPS points a second),
1000 + 1000 WebSockets, 2 orders a second for 15 minutes with a one-minute burst at 10 a second.
Machine: one GitHub-hosted runner (4 vCPU, 15 GB) holds the server,
PostgreSQL and k6 together; the numbers describe this runner, not the pilot's servers.
Server arguments: none; commit 65db825.

## Requests (k6)

| Request | count | p50 ms | p95 ms | p99 ms | max ms |
|---|---|---|---|---|---|
| heartbeat | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| go_online | 1000 | 58 | 354 | 560 | 823 |
| offers | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| accept | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| trip_current | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| arrive | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| start | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| complete | 0 | 0.0 | 0.0 | 0.0 | 0.0 |
| quote | 2282 | 1.4 | 2.0 | 2.9 | 5.7 |
| order | 0 | 0.0 | 0.0 | 0.0 | 0.0 |

Requests: 3282 (3.4/s), failed (status ≥ 400 or no answer): 100.00 %.
Checks passed: 0.00 %. Offers accepted: 0, lost to another driver or expiry: 0; rides completed: 0; WebSocket errors: 1000; WebSocket sessions: 1000.
Failed checks: went online 1000/1000, quoted 2282/2282.

## Server and database (every 10 s)

| Measure | max | at the end |
|---|---|---|
| Server CPU, % of one core (ps) | 259 | 6.1 |
| Server RSS, MB | 481 | 481 |
| Server threads | 269 | 80 |
| Host CPU use (system_cpu_usage) | 0.37 | 0.01 |
| Heap used, MB | 149.74 | 145.66 |
| GC pauses (count, cumulative) | 8 | 8 |
| GC pause time, s (cumulative) | 0.07 | 0.07 |
| Longest GC pause, s (recent max) | 0.02 | 0 |
| Hikari active connections | 2 | 1 |
| Hikari threads waiting for a connection | 0 | 0 |
| Hikari connection timeouts (cumulative) | 0 | 0 |
| Database connections (pg_stat_activity) | 21 | 21 |
| Database sessions idle in transaction | 0 | 0 |
| Locks waited for (pg_locks not granted) | 0 | 0 |
| Locks held | 9 | 9 |
| Outbox pending events (queue lag) | 0 | 0 |
| Oldest pending outbox event, s | 0 | 0 |
| Outbox events failed | 0 | 0 |
| Drivers online (server gauge) | 0 | 0 |
| Orders searching | 0 | 0 |
| Assignments active | 0 | 0 |
| Orders created (cumulative) | 0 | 0 |
| Orders unfulfilled (cumulative) | 0 | 0 |
| Offers by outcome (cumulative, all outcomes) | 0 | 0 |

Order created → first offer (server): 0 measured, mean – ms, longest in a scrape window 0 ms.
Order created → assignment (server, includes the driver's answer): 0 measured, mean – ms, longest in a scrape window 0 ms.

## Invariants during the run

Scans with a violation: 0 of 96; the largest sum of violations in one scrape: 0. The five checks were last clean at 2026-11-05T11:55:16.898Z (the oldest of the five).

## The last scrape (raw)

```
blizz_assignments_active{application="blizz-taxi-server"} 0
blizz_drivers_online{application="blizz-taxi-server"} 0
blizz_drivers_online_stale_location{application="blizz-taxi-server"} 0
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1793879716.898
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1793879717.241
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1793879717.242
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1793879716.956
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1793879717.242
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0
blizz_orders_searching{application="blizz-taxi-server"} 0
blizz_orders_searching_oldest_seconds{application="blizz-taxi-server"} 0
blizz_outbox_failed{application="blizz-taxi-server"} 0
blizz_outbox_oldest_seconds{application="blizz-taxi-server"} 0
blizz_outbox_pending{application="blizz-taxi-server"} 0
```

## k6 output (last 60 lines)

```
```
