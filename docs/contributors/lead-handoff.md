# Lead handoff (state on 02.11.2026, afternoon)

Read this first when a new lead session (Claude) takes over. Everything else lives in GitHub: issues, PRs, reviews.
`CLAUDE.md` (the lead's rules), `AGENTS.md` (contributors' rules, which apply to the lead too) and
`docs/contributors/lessons.md` (review cases) are the rules; this file is only the state and the habits.

## People and roles

- **Owner:** Yurii. Writes in Russian; a message in Latin letters is often Russian typed on the English layout
  ("lfdfq" = "давай", "jr" = "ок").
- **Lead and reviewer:** Claude. Branch prefix `claude/`, migration suffix `_1`, label `claude`.
- **Contributors:**

  | Who | Label and branch prefix | Migration suffix |
  |---|---|---|
  | Codex | `codex` | `_2` |
  | Second Claude | `claude2` | `_5` |

  Suffixes `_3` and `_4` belonged to former contributors and are never reused.
- Contributors take open issues with their label and watch issue and PR comments
  (`scripts/wait-for-work.sh <label>`). Never write `@codex` in a comment: it wakes the ChatGPT Codex connector bot,
  not our contributor.

## Work in flight

Audit of 30.10.2026: `docs/status/2026-10-30-server-audit.md` (what is left on the server and in which issue).
Pilot proofs so far: `docs/status/2026-10-31-pilot-proofs.md`.

| Who | Queue (in order) |
|---|---|
| Codex | Idle since 30.10. #136 was finished by the lead (#233) from Codex's tests-first commit |
| Second Claude | Idle since 01.11 09:16. Its #137 (rider app) was finished by the lead (#236) |
| Lead | ADR 0016: parts 1, 3, 4, 5 done (#214, #216, #217, #218); part 2 (#215) done except **service-data retention**, which waits for the owner's answer below. Clients merged: web foundation (#233), rider first slice (#236), driver first slice (#239), operator workstation (#246), rider `/me` phone and name (#242), city center (#244), rider ordering (#250, issue #248). In review on 02.11: driver offers and trips (#252, issue #249), operator vehicle classes (issue #251), no secret in the client bundles (issue #253, AC-23). The owner said on 02.11: "today work alone, without the contributors; take a task, finish it, take the next". Next candidates: the rider's rating and tip after a ride, the driver's ALL tab (broadcast orders), push registration in the apps and stale notifications on screen (AC-19) |

Done since 30.10: #124, #135, #139, #141, #142, #143, #144, #145, #146 (pilot proofs, all four parts), #149, #176, #178
(L1 findings: heartbeat, relay, pool), #186, #196–#201 (acceptance review and its follow-ups), #112 (closed: every item
of the 29.10 audit fixed or decided).

Owner to confirm (in the audit doc): road-ETA dispatch, call queues, bulk operations, webhook path, WayForPay sandbox keys.
Merging: `.claude/settings.json` on `main` allows the lead's squash merge; the hourly scheduled check reviews contributors and reports idleness.

### Reminders (no work now)

- #30 admin panel for tariffs and finance.
- #43 own GraphHopper server.
- #46 payment link by SMS.

### Open owner questions

- **Settings of the whole server** (asked 02.11): the connection to the Asterisk exchange and the technical retention
  terms (ADR 0015) are one per server. Today the exchange is changed in the first service's panel only (#231). Should
  the platform owner manage them instead, with a panel of their own? The answer decides the last item of #215 (call
  recordings kept per service, technical terms per server).
- **Before launch:** a second super admin. The confirmation lockout of the only one stays by the owner's choice
  (#173).

Q-05, 06, 07, 11, 12, 15, 16 are still open in the specification; never treat them as decided.
- **Decided:**
  - Q-10, rider debt: ADR 0014.
  - Q-19, retention terms: ADR 0015. Legal hold and cross-border data are still open.
  - Q-18: ADR 0012.

## How the lead works

1. **Review each contributor PR in order:** scope, specification, invariants, tests, CI.
   - Re-check the evidence yourself: run their script, a stricter probe, or a spot check of payloads against schemas.
   - Post the review with event `COMMENT`; `REQUEST_CHANGES` is impossible on the same account.
   - Then squash-merge with `gh api -X PUT repos/feraltraffic-alt/blizz.taxi/pulls/N/merge -f merge_method=squash`.
2. **Own work** goes through a `claude/` branch and a PR. Merge only after CI and a full sandbox are green on the last commit:
   - start the sandbox with `gh workflow run sandbox.yml --ref <branch> -f scenario=all`;
   - read the results on branch `sandbox-runs`, in `runs/<run id>/results.txt`.

   Docs-only changes may go straight to `main`.
   - In auto mode the session's permission check refuses `gh api -X PUT .../pulls/N/merge` as a merge without
     review, even after the lead's review is posted: ask the owner, or the owner adds a permission rule.
3. **After merging several PRs**, run the full sandbox on `main` once more.
4. **After a review with findings,** add a case to `lessons.md` and the habit to `AGENTS.md`.

### Tools and limits of the lead's environment

- GitHub GraphQL is blocked: use REST through `gh api`, PR creation included
  (`gh api repos/.../pulls -f base=main -f head=... -f title=... -F body=@file`).
- CI errors are read through `gh api repos/.../check-runs/<job id>/annotations`.
- Maven Central is not reachable from the lead's container, so the server cannot be built locally: CI is the compiler.
  Small pure-Java checks can run with a downloaded JDK (`javac` on single files).
- Never force-push, never rewrite `main`, no secrets in the repository.
- The owner's e-mail is used only for authorship.

## Recent history (02.11.2026, day)

- **Merged:**

  | PR | What |
  |---|---|
  | #229 | Service-wide settings changed by staff of every city only (ADR 0016 point 6) |
  | #230 | Payment merchants per service |
  | #231 | Integrations and keys per service. Environment values serve the first service only; the exchange connection is server-wide (`Integrations.SERVER_FIELDS`) |
  | #232 | #217 tests: push and SMS per service |
  | #233 | #136 web foundation: `packages/api-client`, the admin panel, the Web E2E workflow |
  | #234 | #218: other-service staff in the sweep; the change and activity logs per service (port `audit.ActorServices`) |
  | #235 | `ServiceColumnGuardTests`: every server insert into a table with `service_id` names it |
  | #236 | #137 rider app first slice (Expo SDK 58): sign-in by code, legal gate, profile, 426 |
  | #238 | #216 journal and reconciliations per service |
  | #239 | #237 driver app first slice; the shared `packages/mobile-ui` |
- **Client stack:**
  - npm workspace at the root: `apps/web/*`, `apps/mobile/*`, `packages/api-client`, `packages/mobile-ui`;
  - `scripts/web-check.sh` is the Web CI job;
  - `.github/workflows/web-e2e.yml` runs the admin, rider and driver end-to-end against the sandbox-profile server on every push that changes client code.
  - Artifacts cannot be downloaded from this environment (the proxy refuses the blob host): read the run log instead.
- **Habits that paid off:**
  - **A green tests-first run is not proof.** #218's sweep was green at once. Only a mutation, a city check that ignores
    the service, showed that the new refused staff reach the check.
  - **Read why a mutation failed.** #136's first single-flight mutation failed on lint, not on E4. A mutation keeps
    lint green (`void unused;`), so that only the test can fail.
  - **A double tap must land while the first request is in flight.** #236's first E4 was green without the guard;
    the answer is now slow (`delayMs`).
  - **Merging a squash-merged branch into a later branch.** A PR from a branch that still carries an earlier PR's commits
    shows those files too (#232 showed 41). Check `git diff <squash>^ <squash>` after the merge.
- **Migrations:** a later PR may sort before one merged meanwhile. Rename it after main's last (#216: `0700` → `0800`).

## Recent history (02.11.2026, night and morning)

- **ADR 0016 (owner, 01.11):**
  - Several taxi services run on one server, each with several cities.
  - Riders, drivers, apps, brand and money are per service.
  - A platform owner (`PLATFORM_OWNER`, no `service_id`) stands above the services.
  - Each service has its own directory of phone numbers, so the server knows which service a caller rings.
- **Part 1 (#214) is done** in #219–#222:
  - `service` table; `service_id` on city, client, driver, staff, session and OTP;
  - tokens carry `svc`;
  - city resolution, phone lookups and call lines are per service;
  - the platform owner, `/api/admin/v1/services`;
  - sandbox scenario `two-services`.
- **Part 2 (#215), done so far:**

  | PR | Moved to per-service storage |
  |---|---|
  | #223 | Service settings |
  | #224 | Feature flags and legal texts |
  | #225 | Cancel reasons (a service's catalogue starts as a copy of the first service's) |
  | #226 | Driver debt limits (one sweep number per currency from `driver_debt_sweep_seq`, under a per-currency advisory lock) |
  | #227 | Transfer rules |
  | #228 | Operator bonus rules, accounts and periods |

  The access rule of ADR 0016 (service-wide settings are changed only by staff of every city) is on branch
  `claude/215-service-wide-access`, with its guard `ServiceWideSettingsAccessTests`.
- **Ports instead of other modules' tables (ADR 0004):**
  - `identity.Services.of(actor)` gives a subject's service;
  - `geo.CityCatalog.serviceOf(city)` gives a city's service;
  - `identity.CityServices` is implemented in geo.
- **Every step's proof:** CI, a full sandbox (62 scenarios) and a mutation branch `claude/<branch>-mutation`, red
  on the new test. Mutation branches stay, because branch deletion is denied.
- **Deferred:**
  - SMS text uses the first service's brand until #217;
  - there are no service-wide call lines (without a city);
  - the column defaults `service_id = first service` are removed at the end of #215.

## Recent history (01.11.2026, evening)

- **Owner decisions of the day:**
  - **Q-10 (#208, ADR 0014).** A rider owing more than `rider_debts.allowed_minor` in a currency gets no new order,
    at once: 403 `RIDER_HAS_DEBT`. The limit is 0 when the currency is not listed. Phone orders for a caller with
    that account are refused too. The account state is unchanged.
  - **Q-19 (#210, ADR 0015).** Retention terms are set in the admin panel; 0 keeps for ever. Technical records keep
    their defaults.
  - **#173 follow-up (#211).** A staff password reset asks for the super admin's own password.
  - **Staff reach by city (#209, closes #201):**
    - `StaffAccess.requireForDriver`: a driver of one of the staff member's cities; an applicant with no admission
      city is open to every holder.
    - `requireOverStaff`: operator extensions and bonus history.
    - `requireEveryCity`: payment merchants.
- **`StaffIsolationTests`** sweeps every admin and operator operation with an id or a `city_id`: 105 swept, 29
  exceptions with reasons. `AWAITING_DECISION` is an exact list, now empty; a new operation in no list fails the
  build.
  - City-changing operations run on spare cities, at longitude 100 and beyond, latitude 60.
  - Driver fixtures use `driverOnlyIn(city)`. `TestAdmission.inEveryCity` would hide a missing city check.
- **The `identity` module** gets a driver's cities through the `DriverCities` port, which the `driver` module
  implements. Keep it that way: no dependency from identity on driver.
- **Habit that paid off:** push the tests-only commit first and read its red CI before the fix. It proved the 18
  driver, operator and merchant gaps and the earnings gap.

## Recent history (01.11.2026)

- **#140 payments:**
  - the card hold deadline (`PAYMENT_TIMEOUT`, #188);
  - currency fraction digits (#188);
  - rider obligations and their repayment by card (#193: a card top-up aimed at the order's debt, one page at a time under the order's lock);
  - report UTC bounds (#190);
  - quote payment constraints (#192).
- **Sandbox fake bank:**
  - `POST /sandbox/v1/bank/next-answers` scripts one rider's cards. A status check or refund of a reference follows the card it was charged to (#189).
  - `DELETE` clears the script (#191).
  - Leftover answers once broke `zz-reconciliation` on main; clear them when a scenario is done.
- **Java line-length ratchet** (#185) runs in CI: no file may gain lines over 120 characters.
- **Questions to the owner from reviews:**
  - should a staff password reset ask for the admin's password too (#173);
  - may wrong confirmation passwords lock the only super admin out (#173);
  - give #136 to claude2?

## Recent history (31.10.2026)

- **Fault tests (#146 part 2):** `.github/workflows/faults.yml` runs a positive job and one negative control per
  guard. A control passes only when its own case fails, for its expected reason, after the cases before it passed.
  The database case found 500s on a lost connection; these are now 503 `TEMPORARILY_UNAVAILABLE`.
- **Flaky tests** came from random phone numbers that collided: `taxi.blizz.TestPhones.unique(prefix, digits)` (#159).
  Tests that sort UUIDs must sort by their hex text (PostgreSQL's order), not `UUID.compareTo`.
- **Branches:**
  - Pushing to `main` and force-pushing are refused by the session's permissions, so docs go through a PR too.
  - Branch deletion is refused by the proxy: ask the owner (`claude/blizz-taxi-review-qshlrv`,
    `claude/upgrade-negative-control`).
- **New workflows** (`workflow_dispatch` only) need the file on `main` first. Until then, a temporary `push` trigger
  on the branch runs them; remove it before merging.

## Recent history (29–30.10.2026)

- **#130 (Codex) merged** after its sandbox, but its Java was compressed onto lines of up to 250 characters, and the
  lead missed it in review. Lessons case 14, AGENTS habit 12; the layout fix and a CI ratchet are #149.
- **Cursor pages (#139):** `PageCursor` and `Page` in `platform`. A list sorts by its keys, then `id`, and asks its store
  for `limit + 1` rows. The staff case queue's cursor holds the priority rank too, so it refuses `before`.

- **#126 (lead):** OTP budget per range of numbers (`blizz.otp.max-per-range-per-hour`, 500); the tests and the
  sandbox raise it in their own config.
- **Full code audit:** #113 to #117, then #119 to #122. Lessons 10 and 11.
- **Codex:** #109 reconciliation, #123 contract drift audit (`scripts/audit/contract-drift.mjs`), #125 hot-path
  indexes and background debt refresh.
- **Main** is green after each round, CI and the full sandbox.
