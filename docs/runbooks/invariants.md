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
| I2 | Operations driver capacity disagrees with its assignment. FREE needs zero COMMITTED assignments and no assignment id; OFFERED additionally needs an OPEN offer; RESERVED needs its matching RESERVED assignment. TO_PICKUP, WAITING and ON_TRIP need exactly one COMMITTED assignment with the matching capacity assignment id. Inspect those rows before changing availability. |
| I3 | Operations order has the wrong number of COMMITTED assignments. ASSIGNED and IN_SERVICE require exactly one; SCHEDULED, AWAITING_PAYMENT, READY, SEARCHING, FULFILLED, CANCELLED and UNFULFILLED require none. RESERVED is not COMMITTED. |
| I4 | Payments PAID intent does not match SUCCEEDED SETTLE/CHARGE amounts, or a SETTLE exceeds its authorization. TIP is separate, bonus-only zero-card-leg intents need no capture, and above-hold CHARGE is legitimate. Inspect provider references and reconciled operations before retrying; never charge again merely to clear this alert. |
| I5 | A FULFILLED, CANCELLED or UNFULFILLED order's authorization is still standing after one hour. Operations queries its orders through identifiers supplied by the read-only CardPayments API; payments reads only its own tables. A SUCCEEDED SETTLE/REFUND targeting the AUTH closes it; PENDING/UNKNOWN is handled by UnknownPayments, not this check. A separate CHARGE is not an authorization. Classification uses the successful AUTH even if the intent amount/state was hand-edited. Inspect AUTH and its target references before taking action. |

## Bounded scan coverage

| Check | Candidate bound |
| --- | --- |
| I1 | `blizz.finance.invariants.lookback`, default `PT48H`, on `journal_transaction.occurred_at`, ending at the two-minute cutoff. Append-only journal rows and commit-time balance triggers prevent older postings from changing through the application. Older hand-edited corruption is deliberately outside this operational scan; investigate it separately. |
| I2 | Only COMMITTED/RESERVED assignments; released, completed and revoked history cannot describe current capacity. Capacity itself is one row per driver. |
| I3 | ASSIGNED/IN_SERVICE orders plus orders with a COMMITTED assignment, through partial indexes and primary-key lookups. `ride_order_status_check` constrains the full status set, so there is no unreachable unsupported-status branch. |
| I4 | `blizz.payments.invariants.lookback`, default `P7D`, on either intent.updated_at or operation.updated_at. A recently changed operation brings an old intent back into scope; only those candidate intents' operations are aggregated. |
| I5 | `blizz.payments.invariants.hold-lookback`, default `P30D`, on successful AUTH.created_at. This lead-approved lifetime-plus-margin bound treats older bank authorizations as expired. Eligible order identifiers are processed in batches of 256, without truncation, so even more than 65,535 open holds cannot exceed PostgreSQL's bind-parameter limit. |

Adjust lookbacks to the operational/provider lifetime policy, keeping them longer than the settling margin. The jobs are bounded operational detection, not an unlimited audit of immutable historical data. The volume regression generates 200k journal lines, 100k orders/assignments/operations and 10k capacities, asserts current violations and deliberate older exclusions, and prints the actual I3/I5 EXPLAIN plans. A second phase covers 65,536 eligible AUTHs and a leak in the last order batch.

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
