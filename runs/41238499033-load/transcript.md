# L1 load run (2026-10-31T20:38:53Z, 289a69e)

Profile: 1000 drivers online (heartbeat every 4 s, so about 250 GPS points a second),
1000 + 1000 WebSockets, 2 orders a second for 15 minutes with a one-minute burst at 10 a second.
Machine: one GitHub-hosted runner (4 vCPU, 15 GB) holds the server,
PostgreSQL and k6 together; the numbers describe this runner, not the pilot's servers.

## Requests (k6)

| Request | count | p50 ms | p95 ms | p99 ms | max ms |
|---|---|---|---|---|---|
| heartbeat | 239308 | 5.8 | 21 | 128 | 525 |
| go_online | 1000 | 358 | 1418 | 1789 | 2222 |
| offers | 2282 | 1.6 | 3.8 | 6.5 | 221 |
| accept | 2282 | 9.0 | 19 | 56 | 226 |
| trip_current | 2278 | 1.4 | 3.6 | 10 | 153 |
| arrive | 2278 | 3.8 | 8.9 | 40 | 218 |
| start | 2278 | 3.3 | 7.0 | 16 | 177 |
| complete | 2278 | 6.7 | 27 | 163 | 301 |
| quote | 2282 | 6.1 | 20 | 142 | 496 |
| order | 2282 | 29 | 53 | 115 | 367 |

Requests: 258548 (257.4/s), failed (status ≥ 400 or no answer): 0.00 %.
Checks passed: 100.00 %. Offers accepted: 2282, lost to another driver or expiry: 0; rides completed: 2278; WebSocket errors: 0; WebSocket sessions: 2000.

## Server and database (every 10 s)

| Measure | max | at the end |
|---|---|---|
| Server CPU, % of one core (ps) | 255 | 40.1 |
| Server RSS, MB | 862 | 862 |
| Server threads | 271 | 269 |
| Host CPU use (system_cpu_usage) | 0.83 | 0.01 |
| Heap used, MB | 414.92 | 378.13 |
| GC pauses (count, cumulative) | 200 | 200 |
| GC pause time, s (cumulative) | 0.76 | 0.76 |
| Longest GC pause, s (recent max) | 0.02 | 0 |
| Hikari active connections | 20 | 1 |
| Hikari threads waiting for a connection | 44 | 0 |
| Hikari connection timeouts (cumulative) | 0 | 0 |
| Database connections (pg_stat_activity) | 22 | 21 |
| Database sessions idle in transaction | 7 | 0 |
| Locks waited for (pg_locks not granted) | 0 | 0 |
| Locks held | 730 | 9 |
| Outbox pending events (queue lag) | 56 | 2 |
| Oldest pending outbox event, s | 1.72 | 0.7 |
| Outbox events failed | 0 | 0 |
| Drivers online (server gauge) | 1000 | 1000 |
| Orders searching | 5 | 0 |
| Assignments active | 374 | 15 |
| Orders created (cumulative) | 2282 | 2282 |
| Orders unfulfilled (cumulative) | 0 | 0 |
| Offers by outcome (cumulative, all outcomes) | 2282 | 2282 |

Order created → first offer (server): 2282 measured, mean 24 ms, longest in a scrape window 81 ms.
Order created → assignment (server, includes the driver's answer): 2282 measured, mean 673 ms, longest in a scrape window 2739 ms.

## Invariants during the run

Scans with a violation: 0 of 100; the largest sum of violations in one scrape: 0. The five checks were last clean at 2026-10-31T20:38:30.760Z (the oldest of the five).

## The last scrape (raw)

```
blizz_assignments_active{application="blizz-taxi-server"} 15
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 2282
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 1535.429651203
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 1.305905993
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 2282
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 54.496581497
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.05194632
blizz_drivers_online{application="blizz-taxi-server"} 1000
blizz_drivers_online_stale_location{application="blizz-taxi-server"} 1000
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1793479111.356
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1793479111.632
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1793479111.634
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1793479110.76
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1793479111.634
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
blizz_outbox_oldest_seconds{application="blizz-taxi-server"} 0.698578
blizz_outbox_pending{application="blizz-taxi-server"} 2
```

## k6 output (last 60 lines)

```
```
