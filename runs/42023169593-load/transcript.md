# L1 load run (2026-11-05T12:15:40Z, b3b0612)

Profile: 1000 drivers online (heartbeat every 4 s, so about 250 GPS points a second),
1000 + 1000 WebSockets, 2 orders a second for 15 minutes with a one-minute burst at 10 a second.
Machine: one GitHub-hosted runner (4 vCPU, 15 GB) holds the server,
PostgreSQL and k6 together; the numbers describe this runner, not the pilot's servers.
Server arguments: none; commit b3b0612.

## Requests (k6)

| Request | count | p50 ms | p95 ms | p99 ms | max ms |
|---|---|---|---|---|---|
| heartbeat | 239467 | 6.3 | 12 | 21 | 723 |
| go_online | 1000 | 491 | 1804 | 2254 | 2734 |
| offers | 2282 | 2.1 | 4.7 | 6.7 | 35 |
| accept | 2282 | 11 | 21 | 28 | 118 |
| trip_current | 2281 | 1.8 | 4.3 | 6.5 | 28 |
| arrive | 2281 | 5.0 | 10 | 15 | 376 |
| start | 2281 | 4.4 | 8.4 | 13 | 88 |
| complete | 2281 | 8.3 | 16 | 23 | 91 |
| quote | 2282 | 9.1 | 17 | 28 | 246 |
| order | 2282 | 36 | 64 | 83 | 314 |

Requests: 258719 (259.7/s), failed (status ≥ 400 or no answer): 0.00 %.
Checks passed: 100.00 %. Offers accepted: 2282, lost to another driver or expiry: 0; rides completed: 2281; WebSocket errors: 0; WebSocket sessions: 2000.

## Server and database (every 10 s)

| Measure | max | at the end |
|---|---|---|
| Server CPU, % of one core (ps) | 244 | 47.1 |
| Server RSS, MB | 935 | 935 |
| Server threads | 272 | 269 |
| Host CPU use (system_cpu_usage) | 0.98 | 0.02 |
| Heap used, MB | 451.25 | 407.23 |
| GC pauses (count, cumulative) | 169 | 169 |
| GC pause time, s (cumulative) | 0.96 | 0.96 |
| Longest GC pause, s (recent max) | 0.03 | 0.01 |
| Hikari active connections | 9 | 1 |
| Hikari threads waiting for a connection | 0 | 0 |
| Hikari connection timeouts (cumulative) | 0 | 0 |
| Database connections (pg_stat_activity) | 22 | 21 |
| Database sessions idle in transaction | 6 | 0 |
| Locks waited for (pg_locks not granted) | 0 | 0 |
| Locks held | 501 | 9 |
| Outbox pending events (queue lag) | 67 | 1 |
| Oldest pending outbox event, s | 1.07 | 0.22 |
| Outbox events failed | 0 | 0 |
| Drivers online (server gauge) | 1000 | 1000 |
| Orders searching | 12 | 0 |
| Assignments active | 376 | 20 |
| Orders created (cumulative) | 2282 | 2282 |
| Orders unfulfilled (cumulative) | 0 | 0 |
| Offers by outcome (cumulative, all outcomes) | 2282 | 2282 |

Order created → first offer (server): 2282 measured, mean 29 ms, longest in a scrape window 116 ms.
Order created → assignment (server, includes the driver's answer): 2282 measured, mean 690 ms, longest in a scrape window 1804 ms.

## Invariants during the run

Scans with a violation: 0 of 99; the largest sum of violations in one scrape: 0. The five checks were last clean at 2026-11-05T12:15:15.780Z (the oldest of the five).

## The last scrape (raw)

```
blizz_assignments_active{application="blizz-taxi-server"} 20
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 2282
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 1574.170078445
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 1.19921909
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 2282
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 65.820589958
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.076066862
blizz_drivers_online{application="blizz-taxi-server"} 1000
blizz_drivers_online_stale_location{application="blizz-taxi-server"} 1000
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1793880915.78
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1793880916.439
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1793880916.441
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1793880920.187
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1793880916.442
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 2282
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 2282
blizz_orders_searching{application="blizz-taxi-server"} 0
blizz_orders_searching_oldest_seconds{application="blizz-taxi-server"} 0
blizz_outbox_failed{application="blizz-taxi-server"} 0
blizz_outbox_oldest_seconds{application="blizz-taxi-server"} 0.223943
blizz_outbox_pending{application="blizz-taxi-server"} 1
```

## k6 output (last 60 lines)

```
```
