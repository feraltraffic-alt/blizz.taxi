# L1 load run (2026-10-31T21:34:03Z, 2226a71)

Profile: 1000 drivers online (heartbeat every 4 s, so about 250 GPS points a second),
1000 + 1000 WebSockets, 2 orders a second for 15 minutes with a one-minute burst at 10 a second.
Machine: one GitHub-hosted runner (4 vCPU, 15 GB) holds the server,
PostgreSQL and k6 together; the numbers describe this runner, not the pilot's servers.
Server arguments: --spring.datasource.hikari.maximum-pool-size=40; commit 2226a71.

## Requests (k6)

| Request | count | p50 ms | p95 ms | p99 ms | max ms |
|---|---|---|---|---|---|
| heartbeat | 239502 | 9.0 | 19 | 32 | 859 |
| go_online | 1000 | 537 | 1826 | 2190 | 2562 |
| offers | 2282 | 2.8 | 7.0 | 12 | 71 |
| accept | 2282 | 16 | 33 | 50 | 141 |
| trip_current | 2280 | 2.4 | 5.8 | 9.5 | 22 |
| arrive | 2280 | 6.7 | 15 | 22 | 62 |
| start | 2280 | 6.1 | 14 | 21 | 36 |
| complete | 2280 | 11 | 24 | 35 | 85 |
| quote | 2282 | 10 | 21 | 35 | 253 |
| order | 2282 | 53 | 100 | 148 | 373 |

Requests: 258750 (257.8/s), failed (status ≥ 400 or no answer): 0.00 %.
Checks passed: 100.00 %. Offers accepted: 2282, lost to another driver or expiry: 0; rides completed: 2280; WebSocket errors: 0; WebSocket sessions: 2000.

## Server and database (every 10 s)

| Measure | max | at the end |
|---|---|---|
| Server CPU, % of one core (ps) | 265 | 58.2 |
| Server RSS, MB | 875 | 875 |
| Server threads | 271 | 269 |
| Host CPU use (system_cpu_usage) | 0.99 | 0.02 |
| Heap used, MB | 381.34 | 349.82 |
| GC pauses (count, cumulative) | 248 | 248 |
| GC pause time, s (cumulative) | 1.18 | 1.18 |
| Longest GC pause, s (recent max) | 0.06 | 0.01 |
| Hikari active connections | 14 | 1 |
| Hikari threads waiting for a connection | 0 | 0 |
| Hikari connection timeouts (cumulative) | 0 | 0 |
| Database connections (pg_stat_activity) | 41 | 41 |
| Database sessions idle in transaction | 8 | 0 |
| Locks waited for (pg_locks not granted) | 0 | 0 |
| Locks held | 263 | 9 |
| Outbox pending events (queue lag) | 208 | 1 |
| Oldest pending outbox event, s | 3 | 0.34 |
| Outbox events failed | 0 | 0 |
| Drivers online (server gauge) | 1000 | 1000 |
| Orders searching | 31 | 0 |
| Assignments active | 363 | 21 |
| Orders created (cumulative) | 2282 | 2282 |
| Orders unfulfilled (cumulative) | 0 | 0 |
| Offers by outcome (cumulative, all outcomes) | 2282 | 2282 |

Order created → first offer (server): 2282 measured, mean 45 ms, longest in a scrape window 305 ms.
Order created → assignment (server, includes the driver's answer): 2282 measured, mean 913 ms, longest in a scrape window 4781 ms.

## Invariants during the run

Scans with a violation: 0 of 100; the largest sum of violations in one scrape: 0. The five checks were last clean at 2026-10-31T21:33:46.917Z (the oldest of the five).

## The last scrape (raw)

```
blizz_assignments_active{application="blizz-taxi-server"} 21
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 2282
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 2082.575448375
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 1.265072715
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 2282
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 102.287313686
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.088565046
blizz_drivers_online{application="blizz-taxi-server"} 1000
blizz_drivers_online_stale_location{application="blizz-taxi-server"} 1000
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1793482428.094
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1793482428.258
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1793482428.259
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1793482426.917
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1793482428.26
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
blizz_outbox_oldest_seconds{application="blizz-taxi-server"} 0.338484
blizz_outbox_pending{application="blizz-taxi-server"} 1
```

## k6 output (last 60 lines)

```
```
