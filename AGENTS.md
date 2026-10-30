# Instructions for contributors (Codex, Claude-2)

You are a **contributor** on this repository. Claude is the **lead and reviewer**: it assigns work, reviews every pull request and decides what is merged. The product owner has the final word.

## Source of truth

- Requirements: [`docs/spec/Taxi_Platform_Detailed_Specification_v0.2.md`](docs/spec/Taxi_Platform_Detailed_Specification_v0.2.md) (Russian). **B** = approved, **D** = proposed, **Q-xx** = open question. Never treat an open question as decided.
- Decisions: [`docs/decisions/`](docs/decisions/). UI reference and gaps: [`docs/design/README.md`](docs/design/README.md).
- Contracts first: a new endpoint or event is added to `packages/contracts` before the code that implements it (REQ-API-01).

## How to work

1. Take only work from a GitHub issue meant for you: open issues with your label (`codex` for Codex, `claude2` for the second Claude). **At every start, without waiting to be told:**
   1. first answer the reviews of your open PRs (new comments since your last commit);
   2. then continue your open issue;
   3. when none is left, take the oldest open issue with your label.

   Say in the issue that you took it. The lead writes issues and reviews in GitHub and does not repeat them elsewhere, so GitHub is where you read your work. If something is unclear, ask in the issue instead of guessing.
2. Branch from `main` as `<prefix>/<issue-number>-<short-name>`, where the prefix is `codex` for Codex and `claude2` for the second Claude (the lead uses `claude`). Never push to `main`.
3. Keep a pull request to one concern and under ~400 changed lines where possible.
4. Before opening the PR, run what CI runs:
   - `scripts/server-build.sh` (needs JDK 25, Maven, Docker)
   - `scripts/contracts-lint.sh` (needs Node 24)
5. **Do not chase `main`.** Being behind `main` is normal: open the PR as soon as your branch is green, even if `main` moved on. Merge `main` into your branch only when GitHub reports a conflict or the reviewer asks; never rebuild or reset the branch to catch up. If you do merge `main`, check afterwards that `git diff origin/main...HEAD --stat` lists **only** the files of your issue — a merge that drops or rewrites other people's work is a blocker.
6. Open or update a PR only when the build is green; a PR with a compile error is not ready for review. The reviewer brings `main` in before merging and resolves trivial conflicts himself.
7. Open the PR with the template filled in: linked issue, spec requirement ids (REQ-…, AC-…, T-…), what was tested and how.
8. Do not merge your own PR. Address review comments in new commits on the same branch.
9. **Do not stop when a step is done; wait for the next one.** After you ask for review, answer a review, or find no open issue with your label, run `scripts/wait-for-work.sh <your label>` (`codex` or `claude2`). It returns as soon as there is something new for you (a review or comment on your PR, the PR merged or closed, a new or commented issue with your label) and prints what; then start again from step 1. It ends after about nine minutes with nothing new (exit code 2): run it again. Keep the loop going until the person who started you stops you; never end your session with "waiting for review".

## Done means proven

A green build is the start of your own review, not the end of it. Read [`docs/contributors/lessons.md`](docs/contributors/lessons.md) before your first task: real cases where green PRs were still wrong.

1. **Before you write code**, post a plan in the issue that ends with *"How my result could be green and still wrong"*: two or three ways your change could pass every test and still miss the issue's goal, and how you will rule each out.
2. **Go through the issue line by line.** Every Scope bullet and every Acceptance bullet gets a line in the PR's *Acceptance* table, with the evidence (a test name, a sandbox run link, a command and its output). A bullet you did not do is written as not done.
3. **A check, a validator, a guard or a filter you add is proven both ways.** Show it passing the good case **and** failing on one deliberate example of every kind of error the issue names. "It found nothing" is a finding about the check until proven otherwise.
4. **No silent skips.** Code that cannot classify something (an unknown path, a status not in the contract, an unexpected state) fails or reports it; it never returns success by default.
5. **Name what you chose.** Anything the issue left open goes into the PR's *Notes* as "chose X because Y", or into the issue as a question. A decision the lead or the owner has already approved changes only after a new approval in the issue; announcing a different choice is not enough.
6. **Read your own diff** (`git diff origin/main...HEAD`) as if you were the reviewer, before you ask for review.
7. **Answer every review point**: "done" with the evidence, or "not doing, because …". A point dropped without a word is worse than a refusal with a reason.
8. **Evidence is proof, not a location**: a run link, a test name, a command with its output. "See `file.mjs`" is not evidence.
9. **The test reaches the code it is about.** A request refused earlier (401 without a token, 400 on the body) proves nothing about the check after it: sign in and send a valid body, then vary only what you test. Before debugging the server, check that your tool sent what you meant (the sandbox `api` helper sends extra headers only through `API_HEADERS`).
10. **Re-read the issue before you open the PR.** Every comment since your plan, the lead's above all, is part of the task: each request gets a row in the Acceptance table (lessons case 12).
11. **Test parsers and protocols on realistic input**: several elements of each kind (two streams, two chunks, two records), every way an element can be damaged, and a peer that hangs. Every network call has a total deadline, writes included (lessons case 13).

## Rules that must not be broken

- Server modules: each direct sub-package of `taxi.blizz` is a module; cross-module calls only through a module's base package. `ModularityTests` must pass.
- Schema changes only as new Flyway migrations; never edit an applied migration; Hibernate stays `ddl-auto=validate`.
- Name new migrations by UTC date and time plus the author's suffix, `V<yyyyMMdd>_<HHmm>_<n>__<what>.sql`, where `n` is `1` for the lead Claude, `2` for Codex and `5` for the second Claude; `3` and `4` belonged to former contributors and are never reused (e.g. `V20261027_1400_2__rider_history.sql`), so parallel branches never take the same version even in the same minute. Before opening the PR, `git fetch` and check that your migration sorts **after** every migration on the **current** `origin/main` (not the `main` you branched from); if not, rename it to sort right after the last one there — current UTC time when that is later, otherwise the last one's date and time plus a step (Flyway refuses an older migration on a database that already has newer ones).
- State changes are named commands with `command_id` and `expected_version`, executed through `IdempotentCommands`; no PATCH of a `status` field.
- Events go through `Outbox.publish` in the same transaction as the change.
- Privileged and financial actions are written to `AuditLog`.
- Staff actions need an `ACTIVE` `staff_user` with an explicit permission (a `*_PERMISSION` constant in the module's API, e.g. `geo.manage`, `driver.review`); staff have no permissions by default (REQ-AUTH-10). Check it with `identity.StaffAccess.require(actor, permission, cityIds…)` — pass the city when the object belongs to one — **before** `IdempotentCommands.execute`, so a stored outcome is never returned to someone who lost access. Never query `staff_user` from another module.
- A module writes only its own tables; reading another module's table in SQL is allowed only for the cases listed in [`docs/decisions/0004-module-data-ownership.md`](docs/decisions/0004-module-data-ownership.md). No new foreign keys across modules.
- When two operations must not interleave, lock rows in one fixed order on every path (e.g. city before zone) and prove it with a concurrency test.
- Money is `amount_minor` + `currency`; time is UTC; no floating point for money.
- Four separate user tables (`staff_user`, `client`, `driver`, `partner`) — no shared user table (section 36).
- Tests touching the database use Testcontainers PostgreSQL/PostGIS, never H2 or mocks of the database.
- No secrets, keys or real personal data in the repository.
- Do not change `docs/spec/` or `docs/decisions/` without an explicit request in the issue.
- Change only what the issue needs: do not delete or reword comments, Javadoc or code outside its scope.
- Edit contract and other shared files **in place** (insert your paths and schemas into the current file). Never write a whole file from your own copy or re-serialize it with a YAML tool: that reformats everything and silently drops the descriptions others added since (PR #44 lost ~20). Before opening the PR, `git diff origin/main...HEAD -- packages/contracts` must show only your additions.
- Everything a command takes goes into its idempotency request. When you wrap an existing command with extra input (e.g. `attachment_ids` around a support message), give the extra input its own `IdempotentCommands` receipt around the call, so a repeat with different input is a 409 and not a change of the old result.
- Change a module's interface or its implementation directly. Do not add an `@Primary` wrapper that delegates every method of another bean to add one: it hides the real implementation from the next change and breaks the moment the interface grows.
- Spring configuration of a module lives in its `internal` package and is package-private; only the module's API is public.
- Do not make an existing request field required. A new field in a request is optional with a default, so current clients keep working.
- JSON in tests (request bodies, `jsonb` literals read through the application's mapper) uses `snake_case`: the global mapper reads nothing else, and a camelCase key is silently ignored.
- A test of time-based behaviour sets the state it depends on (e.g. backdates a period start); it never assumes "now" is far enough from the boundary.
- Push a commit only after the build of step 4 passes locally. A series of tiny commits each waiting for CI is slower than one green one. **Without Docker** (the PostgreSQL tests cannot run): compile and run everything that can run, push the branch, and let CI run the database tests. Open the PR, or say "done", only when that CI is green, and write in the PR which checks ran locally and which only in CI.
- Simple class names of Spring beans are unique across the whole application, not only within a module: Spring names a bean after its simple class name, so two `AnonymizedClients` in different modules break the context. Prefix them with what they handle (`AnonymizedClientCards`, `AnonymizedClientWallet`).
- When you change what a shared method means (e.g. `Orders.active()` once multiple orders exist), grep every caller and check that each still wants the new meaning; fix or switch the ones that do not.
- Texts a person receives (SMS, pushes, voice, e-mails) are in that person's language, or the language of their number's country when the person is not known; never one string for everybody — the markets are Poland and Ukraine.
- Test cities must not overlap the cities of other test classes: before choosing a longitude, grep the tests for every way a city is made — `city("…", "UAH", lon)` with three arguments, local helpers `city(code, lon)` with two, and literal `MULTIPOLYGON` polygons.
- A phone number without `+` or `00` is never given a country by guessing (`512345678` is a Polish national number, not `+512…`): only a full number of a known market (`380` + 9 digits, `48` + 9 digits) may get the `+`; anything else stays raw.
- A `timestamptz` read without a type (`query().singleRow()`, `listOfRows()`) comes back as `java.sql.Timestamp`, not `OffsetDateTime`: compare times in SQL, or read them with `rs.getObject(…, OffsetDateTime.class)`.
- Before naming a new class, search for `class|interface|record|enum Name` across the code, not only `class Name`: an interface of the same simple name in another package (`operations.OrderCalls`) is easy to miss.
- An address staff type in the admin panel that the server connects to goes through `platform.OutboundAddresses.check` on save and again before connecting (REQ-SEC-05); never `URI.create` of an admin value straight into an HTTP client.
- Never log a phone number, token, one-time code, card data or a precise position. `LogRedaction` in the log layout is a safety net, not a permission: write the log line without them.
- A new action a rider or driver can repeat cheaply but that costs us (a provider call, a file, a write) gets a `platform.RateLimits` bucket, counted per account, never per IP.
- No foreign key to another module's table, also in a brand-new table: check every `references` in a migration (`driver_risk_flag` once pointed at `driver`).
- A sandbox scenario that changes shared sandbox data (drivers online, an order searching, a suspended driver, a legal text in force) restores it in a `trap … EXIT`, so a failure does not break the scenarios after it.
- A time sent by a phone is compared with a server time with a tolerance: phones send whole seconds and keep their own clock.
- Metrics, logs and traces never fail the operation they observe: an unexpected label value becomes `OTHER` with a warning, never an exception in the business transaction.
- No database transaction is held open around a call to an outside provider (SMS, payments, maps): call first, then record the result in a short transaction.
- Inside your transaction, never catch a `DomainException` thrown by another bean's `@Transactional` method to carry on: it has already marked the transaction for rollback, and the request ends in 500 at commit. Ask first with a read (e.g. `CardPayments.intent(orderId).isEmpty()`), then call.
- A list setting's `@DefaultValue` takes one value per element: `@DefaultValue({"48", "380"})`. `@DefaultValue("48,380")` is a single element `"48,380"`.
- A job that runs per period (a day, an hour) catches up on the periods it missed, and reports a fact seen by two periods once.
- A staff command on an object that belongs to a city passes that city to `StaffAccess.require`; an object of no city (a promotion for every city, a new city) needs all cities. Name the city, or why there is none, in the PR.
- A provider answer without the status you asked about is not a result: it stays UNKNOWN and is asked again. Only an explicit code (e.g. WayForPay 1127 "Order Not Found") may decide.
- Inside a PostgreSQL transaction, a unique-key race is handled with `ON CONFLICT`, never by catching `DuplicateKeyException`: the transaction is already aborted.
- A lease is longer than the longest work it covers (a batch of provider calls with their timeouts), or each item is re-claimed just before it is worked on.
- Collections in a hashed idempotency request serialize the same on every instance: sorted sets or lists, never `Set.copyOf`.
- A query that runs on a schedule or on every request reads a bounded set (a lookback window, active rows, an index), never the whole history; prove it with a volume test and its `EXPLAIN`.

## Trying the system by hand

The sandbox ([`docs/sandbox.md`](docs/sandbox.md)) runs the whole system with fictional data in GitHub Actions: `gh workflow run sandbox.yml -f scenario=all`. Before adding a helper to `scripts/sandbox/lib.sh`, look for it in the current `origin/main`. When a change adds or alters an HTTP flow, add or extend a scenario in `scripts/sandbox/scenarios/` and run the workflow on your branch (`--ref <branch>`); link the run in the PR.

## Commits

Imperative subject line in English, a body explaining why, one logical change per commit.
