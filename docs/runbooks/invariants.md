# Invariant checks

The module jobs run every ten minutes (`blizz.<module>.invariants.enabled` and
`blizz.<module>.invariants.interval`, default `true` and `PT10M`). Tests disable
the timers and run checks explicitly. Scans read committed data in a PostgreSQL
READ ONLY transaction with a five-second timeout. Reporting happens after that
transaction closes; checks never repair business rows.

`blizz_invariant_violations{check="I1"}` (and I2–I5) counts violating objects in
the latest completed run. Zero means that run was clean. NaN means no reliable
result: inspect `blizz_invariant_failures_total` and the check/error-class warning.
A query or reporting failure does not prevent the next check from running.
`blizz_invariant_last_success` records Unix seconds of the last successful run,
so a scrape can distinguish a fresh check from an old result. Sandbox shortens
the interval to five seconds; the two-minute settling margin is unchanged.

| Check | Meaning and investigation |
| --- | --- |
| I1 | Finance journal posting: compare debit/credit totals in its currency and check for missing journal lines. Inspect the posting's business key and originating finance event. |
| I2 | Operations driver capacity disagrees with its assignment. Inspect occupancy, assignment id, assignment state and any outstanding offer before changing availability. |
| I3 | Operations order has the wrong number of COMMITTED assignments. ASSIGNED and IN_SERVICE require exactly one; SCHEDULED, AWAITING_PAYMENT, READY, SEARCHING, FULFILLED, CANCELLED and UNFULFILLED require none. RESERVED is not COMMITTED. |
| I4 | Payments PAID intent does not match SUCCEEDED SETTLE/CHARGE amounts, or a SETTLE exceeds its authorization. TIP is separate, bonus-only zero-card-leg intents need no capture, and above-hold CHARGE is legitimate. Inspect provider references and reconciled operations before retrying; never charge again merely to clear this alert. |
| I5 | A terminal order's authorization is still standing after one hour. Inspect AUTH and its matching SETTLE/REFUND operations and provider reconciliation. |

For an alert, open the OTHER/HIGH problem case whose source key is
`invariant:<check>:<object_id>`. The case and `InvariantViolated` event contain
only object identifiers and diagnostic codes. Find the owning module and inspect
the object's journal, assignment or payment operations using authorized tools.
Never put card data, tokens, phone numbers or precise positions in incident notes.

A durable receipt suppresses further events and cases for that check/object,
including across restarts and concurrent instances. A continuing positive gauge
still indicates a current inconsistency even when the original case is closed.
Do not delete receipts to make an alert disappear. Investigate the cause and use
the owner's supported corrective command; the following successful scan should
return zero. Monitor failures independently: a failed scan is not evidence that
data is healthy.

Allow a two-minute settling margin for journal postings, assignment/order changes
and payment operations. Card terminal-order checks additionally allow one hour
for settlement. Do not weaken predicates to hide a newly discovered inconsistency.
