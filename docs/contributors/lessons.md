# Lessons from reviews

Real cases from pull requests on this repository: what was handed in, what the review found, and the habit that would have caught it. Read this before your first task and skim it before every PR. Each case is short on purpose: the habit in bold is the point.

## 1. "Zero problems found" from a new check (PR #88, issue #84)

- **Task:** validate every sandbox response against the OpenAPI contracts, and fix the mismatches it finds.
- **Handed in:** a working validator, a green sandbox, and "no real mismatches found".
- **Review:** re-checking the same run's transcript with unknown fields counted found 4 real contract gaps in 19 responses. Most schemas are open (no `additionalProperties: false`), and Ajv accepts extra fields silently. A status code or a path missing from the contract also passed silently (`exit 0`).
- **Habit:** **a new check that finds nothing is itself under suspicion.** For every kind of error the issue names (here: missing field, extra field, wrong type, undeclared status, unknown path), feed the check one deliberate example and show it fails. Only then trust a green run.
- **Habit:** **a check never answers "I don't know" with success.** Something it cannot classify is an error or a listed line in the report, never a silent skip.
- **Second round:** strictness on `allOf` members gave false errors on the operator's order. The fix switched strictness off for every composition. After that, an extra field in `assignment` (`oneOf: [Assignment, null]`) or anywhere in the operator's order passed again, which is where 3 of the 4 gaps had been. The demonstration showed only a top-level extra field.
- **Habit:** **fix a false alarm by correcting the rule, not by switching the check off there.** Then prove again, on that same spot, that a real error is still caught. Demonstrate on nested objects and compositions, not only on the easiest case.

## 2. A whole contract file rewritten from a copy (PR #44)

- **Handed in:** new support endpoints. The YAML file had been re-serialized with a tool.
- **Review:** about 20 descriptions added by others since the branch started were silently gone.
- **Habit:** **edit shared files in place, then read `git diff origin/main...HEAD -- <file>`.** It must show only your additions.

## 3. A cross-module foreign key in a new table (PR #80, issue #71)

- **Handed in:** `driver_risk_flag.driver_id references driver(id)` from the operations module.
- **Review:** module tables never reference each other (ADR 0004); the lead removed it before merging.
- **Habit:** **read every `references` in your migration** and ask whose table it points at.

## 4. Guessing a phone number's country (PR #65, issue #64)

- **Handed in:** `e164()` added `+` to any number without one.
- **Review:** `512345678` became `+512345678`, which is Peru, not a Polish number.
- **Habit:** **for every normalisation, write the input it must not change**, and test that too.

## 5. A decision made silently on an open question

- **Pattern:** the issue leaves a choice open, or the spec has a Q-xx. The contributor picks one and does not say so, and the reviewer finds out from the code.
- **Habit:** **a choice the issue did not make goes into the issue as a question, or into the PR's "Notes" as "I chose X because Y".** Never only into the code. The second Claude did this well on #64, posting three questions with a proposed answer each.

## 6. "Checked, fine" without the check (issue #89, a review task)

- **Task:** review the operator bonus module in six named areas, and prove each finding with a failing test.
- **Handed in:** 2 findings, and "fine" for the other areas. 1 of the 4 major defects was found.
- **Missed:**
  - "all three cancellation paths go through one method, fine". The handler never reads `cancelled_by`, and reason codes are unique only per audience.
  - Audit was not looked at.
  - "a database constraint is handled by idempotency". Two admins send different `command_id`s, so two concurrent settings changes end in a 500.
- **Proofs:** the tests were added after the class's closing brace and never compiled, yet the findings quoted their failing assertions. One test deleted a city that orders reference by foreign key, so it would fail for another reason. The findings came one minute after the plan.
- **Habit:** **"fine" is a finding too, and needs its evidence.** Name the line or query that makes it fine.
- **Habit:** **for every write path, ask "what if two come at once" and "what if it comes late".**
- **Habit:** **never quote a test result you have not seen.** Run it, and check that it fails on the line and for the reason you claim.

## 7. A side check that can break the main path (PR #97, issue #96)

- **Task:** count orders, offers, exclusions and SMS for monitoring, with bounded labels.
- **Handed in:** strong tests (red first, then green) and an honest "sandbox not finished yet". Still three problems.
- **Missed:**
  - An unknown label value threw an exception inside the order transaction. The first new exclusion reason would have stopped dispatch, not just the metric.
  - The sandbox check printed its error to stderr, so the red run explained nothing, to the author or to the reviewer.
  - A new transaction was opened around a network call to the SMS provider, holding a second database connection for seconds per sign-in.
- **Habit:** **observability never fails the business.** Metrics, logs and traces map the unexpected to `OTHER` and warn; they never throw into the work they observe.
- **Habit:** **a check's failure must be readable in the evidence.** Send its errors to the transcript or the PR.
- **Habit:** **no transaction around a network call.** Call outside, then write the result in a short transaction.

## 8. Proving something with a tool that does not do it (PR #94, issue #93)

- **Task:** app version check; a sandbox scenario that shows the 426.
- **Handed in:** after five rounds of review the scenario still got no 426. The contributor added debug output to the server to find out why. The lead finished the work.
- **Missed:**
  - The sandbox helper `api` never sent the extra `-H` headers: it ignores arguments it does not know. The server was right all along.
  - The tests called the endpoints without signing in, so they answered 401 before the version was looked at. "Not 426" proved nothing.
- **Habit:** **check that your instrument does what you think before you debug the system.** Look at the request as it left: the transcript, the curl line, the headers.
- **Habit:** **a test must reach the code it claims to test.** If an earlier layer (sign-in, validation) answers first, the test shows nothing about yours.

## 9. A scheduled scan sized for test data (PR #104, issue #99)

- **Task:** invariant checks every 10 minutes, each under a 5 s timeout.
- **Handed in:** excellent proofs: red before code, real timeouts, concurrent reporters. But every query aggregated the whole history: the journal, all orders, all assignments, all payment operations.
- **Missed:** at launch scale (more than 10,000 drivers) the scans would pass their own timeout within weeks. A check that always times out finds nothing.
- **Habit:** **bound every periodic query by what can still change.** Use a lookback window, active rows only, and an index, and prove it with a volume test (`generate_series`) and `EXPLAIN`.

## 10. A daily job that loses days and repeats findings (PR #109, issue #100)

- **Task:** reconcile each day's card statement with our operations; one case per difference; no silent skips.
- **Handed in:** a strong PR: no transaction around the provider, the signature checked, decisions audited, six kinds of difference proven one by one. Green CI and sandbox.
- **Missed:**
  - Only the latest day got a run. Days the service was down were never reconciled, and the freshness alert cleared once the next day succeeded.
  - The overlapping ±2 h windows and a cohort driven by `updated_at` reported the same difference in consecutive runs, each with its own case.
  - The approved decision "an anchor outside the lookback is a FAILED item" became "the whole day fails", announced in the issue but not approved. Every retry then failed the same way, and the day's real differences stayed hidden.
- **Habit:** **a periodic job is tested across days, not inside one.** Ask: what if a run is missed, what if the same fact appears in two runs, and what if one bad record repeats forever?
- **Habit:** **an approved decision changes only with a new approval.** Ask in the issue and wait for the answer before the code.

## 11. What a full audit found in green code (29.10.2026)

- **Task:** read all of the server's code for real defects, after every PR had been reviewed and was green.
- **Found:** about 40 confirmed defects. Most of them repeat a few patterns:
  - **Permission without the object's city.** `require(actor, perm)` passed a member of one city through zones, promotions, card retries and cash disputes of every city. The rule existed, but nobody checked every command against it.
  - **"No answer" read as "no".** A provider status reply without a status (a bad signature, a gate error) was taken as a decline. A charge that had gone through could then be retried and taken twice.
  - **Catching a database error inside a PostgreSQL transaction.** After a caught `DuplicateKeyException` the transaction is already aborted, so the outbox event failed at commit.
  - **A lease shorter than the work it covers.** A batch claimed for 30 s while each provider call could take 60 s, so a second instance sent it again.
  - **One shared thread.** Every `@Scheduled` worker ran on Spring's single default scheduler thread, so a slow download held back dispatch.
  - **Order that depends on the JVM.** `Set.copyOf` inside a hashed idempotency request made a retry on another instance look like another request.
- **Habit:** **for every staff command, name the city of the object, or say why it has none.** A command without a city needs all cities.
- **Habit:** **only an explicit answer is a result.** Anything a provider did not state stays UNKNOWN and is asked again.
- **Habit:** **for every job that claims work, compare its lease with the longest time the work can take.**

## 12. A lead's answer that did not reach the PR (PR #127, issue #102)

- **Task:** refuse an implausible heartbeat position for dispatch, with a per-driver baseline.
- **Handed in:** a strong PR. The baseline survives sign-out and a new shift, the location is STALE everywhere freshness is judged (proven by a mutation), and the sandbox transcript showed the only refused heartbeat was the deliberate jump.
- **Missed:** the lead approved the plan with one addition: a test that a refusal heals on its own once `distance / 250 km/h` has passed. That answer came after the plan, and the PR did not carry it. The code healed correctly, but nothing would catch a later change that moves the baseline on every refusal and keeps a driver STALE for 30 minutes.
- **Habit:** **before you open the PR, re-read the issue from your plan onwards.** Every request of the lead gets its own row in the Acceptance table.

## 13. A parser tested only on one-element samples (PR #131, issue #105)

- **Task:** refuse a PDF whose object stream cannot be checked.
- **Handed in:** a careful PR. No quarantined file could be served, "no answer" never counted as clean, and the sandbox showed the EICAR and escaped-name PDFs refused.
- **Missed:**
  - The stream pattern also matched the `stream` inside `endstream`. After each real stream the scanner read a "ghost" stream that unpacked to nothing, so a normal PDF with an object stream followed by an xref stream or an image was refused. That is almost every PDF a phone or Word makes.
  - A filter chain, a truncated stream or `(obj)` inside the dictionary let a real hidden object stream through.
  - A scanner that accepts the connection and stops reading held the request for minutes, longer than the rescan lease.
- **Habit:** **test a parser on realistic input with several elements**, at least two of every kind, and on every way the element can be damaged. One sample per test proves the first step only.
- **Habit:** **every network call has a total deadline**, writes included, and the deadline is shorter than any lease around it.

## 14. Code compressed onto long lines (PR #130, issue #118)

- **Task:** a retention period for each kind of technical data, set in the admin, and the jobs that enforce it.
- **Handed in:** working code. The jobs delete in bounded batches, a FAILED event is kept, and the sandbox proved the boundary.
- **Missed:** the code was written compressed: several statements on one line, no spaces, lines up to 250 characters (`if(...)throw ...` after a read on the same line). CI has no formatter, and the lead reviewed the logic and missed the layout. Such code hides a missed condition from every later reader.
- **Habit:** **write in the layout of the surrounding code**: one statement per line, at most 120 characters, SQL in text blocks. Before the PR, `awk 'length>120'` over your files prints nothing (the ratchet from #149 enforces it).

## 15. Negative controls that were green for the wrong reason (lead's PRs #172 and #146 part 4)

- **Task:** fault tests and an M1 registry test, each with a negative control: a broken guard must make its check go red.
- **Handed in by the lead:** the first fault matrix was all green.
- **Missed:**
  - **Two of the four controls were green for the wrong reason.** A lost `STATUS` in a subshell failed the dispatch case in every job, so the outbox case never ran and its control "passed".
  - **The registry test's first drift check was a request sweep** ("a missing operation answers 404"). A contract operation with no server handler still answered 401, because the static-resource handler takes an unknown path and the token check runs first. Only a deliberately added fake operation showed that the check could not see what it claimed.
  - **A concurrency test that never ran its two calls at once** (#193): `CompletableFuture.supplyAsync` without an executor uses the common pool. On a small CI machine that pool has one worker, so the two "simultaneous" starts ran one after the other. The mutation that removed the lock stayed green. The test now runs on two threads of its own.
- **Habit:** **a negative control passes only for its own reason.** Check the failure's message, not just the colour, and require the cases before it to pass. **Prove every new check red once on purpose** before you rely on its green.

## The common thread

Each of these PRs was green in CI. A green build shows that the code does what its own tests check, not that it does what the issue asks. Your job before the PR is to try to prove your own work wrong and to show in the PR how you tried.
