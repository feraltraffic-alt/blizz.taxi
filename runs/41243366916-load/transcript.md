# L1 load run (2026-10-31T21:52:00Z, 234f73b)

Profile: 1000 drivers online (heartbeat every 4 s, so about 250 GPS points a second),
1000 + 1000 WebSockets, 2 orders a second for 15 minutes with a one-minute burst at 10 a second.
Machine: one GitHub-hosted runner (4 vCPU, 15 GB) holds the server,
PostgreSQL and k6 together; the numbers describe this runner, not the pilot's servers.
Server arguments: none; commit 234f73b.

## Requests (k6)

| Request | count | p50 ms | p95 ms | p99 ms | max ms |
|---|---|---|---|---|---|
| heartbeat | 239602 | 8.3 | 17 | 28 | 1212 |
| go_online | 1000 | 612 | 1832 | 2150 | 2674 |
| offers | 2281 | 2.8 | 6.7 | 10 | 64 |
| accept | 2281 | 15 | 29 | 44 | 89 |
| trip_current | 2281 | 2.4 | 5.8 | 11 | 29 |
| arrive | 2281 | 6.6 | 14 | 22 | 95 |
| start | 2281 | 6.0 | 13 | 20 | 53 |
| complete | 2281 | 11 | 22 | 33 | 61 |
| quote | 2281 | 10 | 21 | 30 | 234 |
| order | 2281 | 48 | 94 | 136 | 399 |

Requests: 258850 (258.1/s), failed (status ≥ 400 or no answer): 0.00 %.
Checks passed: 100.00 %. Offers accepted: 2281, lost to another driver or expiry: 0; rides completed: 2281; WebSocket errors: 0; WebSocket sessions: 2000.

## Server and database (every 10 s)

| Measure | max | at the end |
|---|---|---|
| Server CPU, % of one core (ps) | 272 | 57.2 |
| Server RSS, MB | 862 | 862 |
| Server threads | 272 | 269 |
| Host CPU use (system_cpu_usage) | 0.99 | 0.02 |
| Heap used, MB | 380.61 | 349.38 |
| GC pauses (count, cumulative) | 231 | 231 |
| GC pause time, s (cumulative) | 1.12 | 1.12 |
| Longest GC pause, s (recent max) | 0.02 | 0.01 |
| Hikari active connections | 13 | 1 |
| Hikari threads waiting for a connection | 0 | 0 |
| Hikari connection timeouts (cumulative) | 0 | 0 |
| Database connections (pg_stat_activity) | 22 | 21 |
| Database sessions idle in transaction | 8 | 0 |
| Locks waited for (pg_locks not granted) | 0 | 0 |
| Locks held | 226 | 9 |
| Outbox pending events (queue lag) | 41 | 1 |
| Oldest pending outbox event, s | 1.01 | 0.64 |
| Outbox events failed | 0 | 0 |
| Drivers online (server gauge) | 1000 | 1000 |
| Orders searching | 5 | 0 |
| Assignments active | 402 | 15 |
| Orders created (cumulative) | 2281 | 2281 |
| Orders unfulfilled (cumulative) | 0 | 0 |
| Offers by outcome (cumulative, all outcomes) | 2281 | 2281 |

Order created → first offer (server): 2281 measured, mean 40 ms, longest in a scrape window 171 ms.
Order created → assignment (server, includes the driver's answer): 2281 measured, mean 755 ms, longest in a scrape window 2194 ms.

## Invariants during the run

Scans with a violation: 0 of 100; the largest sum of violations in one scrape: 0. The five checks were last clean at 2026-10-31T21:51:44.556Z (the oldest of the five).

## The last scrape (raw)

```
blizz_assignments_active{application="blizz-taxi-server"} 15
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 2281
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 1721.308688159
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 1.272125593
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 2281
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 92.322863691
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.110574288
blizz_drivers_online{application="blizz-taxi-server"} 1000
blizz_drivers_online_stale_location{application="blizz-taxi-server"} 1000
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1793483506.345
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1793483505.729
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1793483505.731
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1793483504.556
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1793483505.732
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 2281
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 2281
blizz_orders_searching{application="blizz-taxi-server"} 0
blizz_orders_searching_oldest_seconds{application="blizz-taxi-server"} 0
blizz_outbox_failed{application="blizz-taxi-server"} 0
blizz_outbox_oldest_seconds{application="blizz-taxi-server"} 0.64167
blizz_outbox_pending{application="blizz-taxi-server"} 1
```

## k6 output (last 60 lines)

```
```
