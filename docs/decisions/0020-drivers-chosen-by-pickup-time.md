# ADR 0020. Drivers are chosen by pickup time

Date: 05.11.2026. Status: accepted (the owner's answers in the lead's session).

## Context

REQ-DSP-03 and REQ-DSP-04 ask for a road ETA for up to 10 candidates and a choice that takes the ETA into account.
Today the search orders candidates by the straight-line distance within the radii of 2 and 5 km and offers the order
to the nearest one; the pickup time is computed only for the rider's screen after the acceptance (REQ-RID-04). The
owner decided on 05.11.2026:

- drivers are chosen **by time**, on the service's own GraphHopper (#43);
- a **pickup time threshold**: a driver farther than it is not offered the order, and the search goes on to its
  timeout. After the acceptance the pickup time may change, and that alone changes nothing (the lateness rule of
  ADR 0019 is separate).

## Decision

The owner's rule from ADR 0018 holds: every number below is a setting in the admin panel.

1. **Candidates.** The straight-line query stays as the first filter (radii, admission, class, capacity, freshness,
   REQ-DSP-01). Of its candidates the **10 nearest** (setting) get a road pickup time from the driver's last position
   to the pickup, by the router of the order's taxi service (ADR 0016).
2. **Threshold.** A candidate whose pickup time is above **15 minutes** (setting "maximum pickup time", minutes) is not
   offered the order. When no candidate is within it, the round offers nothing, as when nobody is near: the personal
   phase moves on and the search goes on to its timeout (REQ-DSP-03).
3. **Order.** The order is offered to the candidate with the shortest pickup time; equal times go to the nearer one.
4. **Router down.** Calls are made in parallel, with the router's timeout and its circuit breaker. A candidate with no
   road time gets the straight-line estimate (the detour factor and the average speed of REQ-GEO-08), so the threshold
   still applies; the offer records which one it used.
5. **The offer carries the pickup time** and its source. When the driver accepts an offer whose time came from the
   router, the assignment records the **promised pickup time**: the acceptance plus that time. ADR 0019 uses it for
   the driver's lateness. An order taken from the "ALL" tab, a straight-line time or a manual offer by an operator
   leave no promise.
6. **What stays as it is:** the "ALL" tab shows orders by distance (routing every driver who looks at it would cost a
   route per driver per order); an operator's manual offer is not limited by the threshold, but records the time.
7. **The dispatch journal** (REQ-DSP-12) shows each considered driver's pickup time and "above the threshold" as the
   reason they were passed over.

## Consequences

- One search round costs up to 10 route requests. On the service's own GraphHopper they cost nothing per request; the
  router must be sized for it (#43).
- The first offer waits for the router, at most its timeout, inside the transaction that holds the order. The lead
  checks it on the load stand (L1) and moves the routing out of the transaction if the time to the first offer grows.
