# L1 load run (2026-10-31T20:10:16Z, 9bcc93c)

Profile: 1000 drivers online (heartbeat every 4 s, so about 250 GPS points a second),
1000 + 1000 WebSockets, 2 orders a second for 15 minutes with a one-minute burst at 10 a second.
Machine: one GitHub-hosted runner (4 vCPU, 15 GB) holds the server,
PostgreSQL and k6 together; the numbers describe this runner, not the pilot's servers.

## Requests (k6)

| Request | count | p50 ms | p95 ms | p99 ms | max ms |
|---|---|---|---|---|---|
| heartbeat | 239390 | 7.4 | 98 | 283 | 3099 |
| go_online | 1000 | 402 | 1483 | 1778 | 2030 |
| offers | 2282 | 1.9 | 4.9 | 12 | 182 |
| accept | 2282 | 12 | 69 | 146 | 410 |
| trip_current | 2280 | 1.8 | 8.0 | 45 | 432 |
| arrive | 2280 | 4.9 | 43 | 165 | 645 |
| start | 2280 | 4.2 | 27 | 113 | 762 |
| complete | 2280 | 8.8 | 111 | 299 | 2046 |
| quote | 2282 | 9.1 | 147 | 409 | 2591 |
| order | 2282 | 37 | 129 | 274 | 1015 |

Requests: 258638 (258.3/s), failed (status ≥ 400 or no answer): 0.00 %.
Checks passed: 100.00 %. Offers accepted: 2282, lost to another driver or expiry: 0; rides completed: 2280; WebSocket errors: 0; WebSocket sessions: 2000.

## Server and database (every 10 s)

| Measure | max | at the end |
|---|---|---|
| Server CPU, % of one core (ps) | 243 | 43.7 |
| Server RSS, MB | 841 | 841 |
| Server threads | 271 | 269 |
| Host CPU use (system_cpu_usage) | 0.9 | 0.01 |
| Heap used, MB | 392.45 | 348.96 |
| GC pauses (count, cumulative) | 240 | 240 |
| GC pause time, s (cumulative) | 1.03 | 1.03 |
| Longest GC pause, s (recent max) | 0.02 | 0.01 |
| Hikari active connections | 20 | 1 |
| Hikari threads waiting for a connection | 130 | 0 |
| Hikari connection timeouts (cumulative) | 0 | 0 |
| Database connections (pg_stat_activity) | 21 | 21 |
| Database sessions idle in transaction | 8 | 0 |
| Locks waited for (pg_locks not granted) | 0 | 0 |
| Locks held | 698 | 9 |
| Outbox pending events (queue lag) | 382 | 0 |
| Oldest pending outbox event, s | 6.34 | 0 |
| Outbox events failed | 0 | 0 |
| Drivers online (server gauge) | 1000 | 1000 |
| Orders searching | 64 | 0 |
| Assignments active | 329 | 11 |
| Orders created (cumulative) | 0 | 0 |
| Orders unfulfilled (cumulative) | 0 | 0 |
| Offers by outcome (cumulative, all outcomes) | 2282 | 2282 |

Order created → first offer (server): 2282 measured, mean 27 ms, longest in a scrape window 121 ms.
Order created → assignment (server, includes the driver's answer): 2282 measured, mean 1312 ms, longest in a scrape window 9734 ms.

## Invariants during the run

Scans with a violation: 0 of 100; the largest sum of violations in one scrape: 0. The five checks were last clean at 2026-10-31T20:09:59.449Z (the oldest of the five).

## The last scrape (raw)

```
blizz_assignments_active{application="blizz-taxi-server"} 11
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 2282
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 2994.298006258
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 1.905332062
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 2282
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 61.894565839
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.081727531
blizz_drivers_online{application="blizz-taxi-server"} 1000
blizz_drivers_online_stale_location{application="blizz-taxi-server"} 1000
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1793477400.308
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1793477401.539
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1793477401.54
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1793477399.449
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1793477401.541
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 2282
blizz_orders_searching{application="blizz-taxi-server"} 0
blizz_orders_searching_oldest_seconds{application="blizz-taxi-server"} 0
blizz_outbox_failed{application="blizz-taxi-server"} 0
blizz_outbox_oldest_seconds{application="blizz-taxi-server"} 0
blizz_outbox_pending{application="blizz-taxi-server"} 0
```

## k6 output (last 60 lines)

```
```
