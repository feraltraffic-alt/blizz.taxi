# ADR 0018. Owner answers of 03.11.2026: refunds (Q-06, points 1–7) and drivers cancelling accepted orders

Date: 03.11.2026. Status: accepted (the owner's answers in the lead's session).

The owner's general rule for both parts: **every number and every switch below is a setting in the admin panel**,
with the value given here as the default. Nothing here is fixed in code.

## Part A. Refunds to riders (Q-06)

Refunds follow REQ-ADM-05: REQUESTED → APPROVED → PROCESSING → SUCCEEDED / FAILED / UNKNOWN. Invariants that are
not settings: the sum of refunds of a payment never exceeds what was paid (T-28, also under concurrency), and the
server checks every limit, so a direct API call cannot pass one (AC-07). Every step is in the audit log.

### A1. Who refunds

- Refunds belong to the taxi service, whose WayForPay merchant the money went through.
- The **super admin of the service** refunds without limits and without a second confirmation: in a small service the
  super admin is its owner.
- An **ADMIN** refunds only with the new permission "Refunds to riders", within their cities.
- An **OPERATOR** does not get the permission (refunds are an admin-panel function).
- The **platform owner** sees refunds in reports and logs and has no refund action.

### A2. Limits (per staff member, per currency)

| Setting | Default |
|---|---|
| Most for one refund | 500 UAH |
| Most per staff member in the last 24 hours (rolling, not a calendar day) | 3000 UAH |
| Refunds of one rider in 30 days before a warning is shown to staff (a warning, not a block) | 3 |
| Limit per service per day | none |

- The limit of a staff member is set in their card next to the permission; no limit set means no refunds.
- The 24-hour sum counts refunds approved, in progress and succeeded; a failed refund does not count.
- Above a limit the request is refused with the remaining amount shown; the super admin makes such a refund.

### A3. A second confirmation for every refund made by staff

- A refund created by an ADMIN waits for confirmation; no money moves before it.
- It is confirmed or rejected (with a reason) by the super admin or by staff with the new permission
  "Confirm refunds" (off by default). Nobody confirms their own refund. The super admin's own refunds go at once.
- The limits of A2 still bound what an ADMIN may request.
- A request waiting 4 hours reminds the confirmers; after 7 days it closes as "not reviewed". Both are settings.
- The confirmer cannot change the amount: confirm, or reject and make a refund of another amount.

### A4. Partial refunds

- Allowed; one payment may have several refunds while an unrefunded remainder exists.
- The minimum amount of a refund is a setting per currency (default 10 UAH).
- The reason is chosen from a list, which is a setting (long route, long wait, service quality, double charge,
  trip did not happen, other with a comment).
- Tips are not refunded with the fare by default.

### A5. Where the money goes

- The staff member chooses: to the card (WayForPay) or to the rider's bonus account; the bonus way requires the mark
  "the rider agreed".
- The part paid with bonuses goes back as bonuses.
- Limits and confirmation are the same for both ways.
- The validity of bonuses given as a refund is a setting.

### A6. Who bears a refund (owner, 05.11.2026)

The one at fault bears it, with the faults of ADR 0019:

- **A refund of a cancelled order** (a charge for an interrupted trip, a fee once Q-07 allows one) follows the
  order's fault.
- **A refund of a completed trip** follows the refund reason: each reason in the list (A4) has a fault in the admin
  panel, from the same set — the driver's (for example a long route, rudeness, a dirty car), the operator's, or
  nobody's (a double charge, a software error, a long wait for the pickup). The staff member may change it in the
  request with a comment, and the confirmer (A3) sees it.

What each fault means for the money:

- `DRIVER`: the driver bears the refund in the driver's share of the fare; the service bears its commission's share.
  A sum already paid out to the driver lowers the next payout, or becomes the driver's debt (ADR 0014 limits).
- `OPERATOR`, `NONE`, `CLIENT_FREE`: the service bears all of it.
- `CLIENT`: no refund is due; a refund made all the same (goodwill) is borne by the service.

The driver sees each such charge as its own line in the earnings ("refund to the rider for trip №…, reason") with a
notice, and may dispute it through a support case, decided by finance or the super admin (as a cash dispute). A
refund never cancels the completed trip: it stays in the driver's history and rating. Fines are not this: they wait
for the lawyer (Q-05).

### A7. Cash trips (owner, 05.11.2026, variant A)

- A trip paid in cash is refunded **only as bonuses** to the rider's account, with the mark "the rider agreed".
- Who bears it follows A6. With the driver's fault the driver's balance is charged the **whole** sum: the driver
  holds all the cash. With the service's fault the bonuses are the service's.
- Limits (A2) and the second confirmation (A3) are the same as for any refund.
- A switch in the admin panel "Allow a refund to the card for cash trips", **off** by default. If it is turned on
  later, it is a payout to the rider's card, not a refund of a payment (the trip had none), and needs its own design.

### Still open

The time limit (point 8), reasons and the rider's notice (point 9). Until they are answered, refunds are not built.

## Part B. A driver cancels an order after accepting it

Today a driver's cancellation after acceptance only records the reason and returns the order to search or cancels
it (ADR 0007). The owner decided to count such cancellations and act on them, without money.

| # | Rule | Setting, default |
|---|---|---|
| B1 | Counts: a cancellation by the driver after accepting, whatever happens to the order. Declining or ignoring an offer does not count. | — |
| B2 | Grace window after accepting | 30 s |
| B3 | Each driver reason has "does not count" (default on for "rider asked to cancel", "rider did not come out" with the waiting check, "accident"; off for "car broke down" and the others). Too many uncounted cancellations raise a risk flag. | more than 5 in 7 days |
| B4 | Counting windows: rolling 24 hours for the warning and the pause, rolling 30 days for the rate | — |
| B5 | Warning to the driver | after 3 in 24 h |
| B6 | Pause without new orders (the trip in progress and accepted orders stay; the driver sees a timer) | 30 min after 5 in 24 h |
| B7 | Repeated pauses grow | 2nd in 7 days: 2 h; 3rd: until the end of the day and a risk flag |
| B8 | Staff with "Drivers' risk flags" or the super admin lift a pause with a reason (audited) | — |
| B9 | Risk flag by rate | above 20 % of accepted orders in 30 days, with at least 20 accepted |
| B10 | The driver sees their rate for 30 days and how many cancellations remain before a pause | — |
| B11 | The admin panel shows the rate, the cancellations with reasons and the pauses in the driver's card, and a report of the drivers with the highest rates | — |

### B12. Declined and missed offers (added by the owner the same day)

A second, separate counter for personal offers the driver declined or let expire. Each of B12.1 and B12.2 is
switched on or off in the admin panel on its own; all thresholds are settings.

| # | Rule | Setting, default |
|---|---|---|
| B12.1 | Missed offers in a row (the timer ran out): the driver goes off line with a notice; one tap brings them back at once. Not a penalty: it keeps riders from waiting on a driver away from the phone. | 3 in a row |
| B12.2 | Acceptance rate of personal offers over rolling 7 days, counted only from a minimum number of offers; the driver sees it in the app | min 20 offers; warning below 50 %; pause 30 min below 30 % (growing as B7); risk flag after 2 weeks below 30 % |
| B12.3 | Not counted: orders from the broadcast list; offers that reached a driver paused, on a trip or in the last 30 s of the shift; offers with pickup farther than a set distance; a decline with a reason marked "does not count" | distance 3 km |

The drivers are probably sole traders (FOP), not employees: forcing them hard to accept may be read as employment.
The thresholds are therefore moderate, the measure is a pause, not a fine or a permanent block, and the question goes
to the lawyer with Q-05.

For the rider:
- P1. The order searches again with priority, the nearest free drivers first.
- P2. It is not offered again to the driver who cancelled.
- P3. The rider sees "The driver cancelled. Looking for another car", without the driver's name or reason.
- P4. No automatic bonus; support may give one on a complaint.

Later: a lower dispatch priority for drivers with high rates (after statistics exist); fines after a lawyer.
