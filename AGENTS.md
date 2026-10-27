# Instructions for contributors (Codex, second Claude)

You are a **contributor** on this repository. Claude is the **lead and reviewer**: it assigns work, reviews every pull request and decides what is merged. The product owner has the final word.

## Source of truth

- Requirements: [`docs/spec/Taxi_Platform_Detailed_Specification_v0.2.md`](docs/spec/Taxi_Platform_Detailed_Specification_v0.2.md) (Russian). **B** = approved, **D** = proposed, **Q-xx** = open question. Never treat an open question as decided.
- Decisions: [`docs/decisions/`](docs/decisions/). UI reference and gaps: [`docs/design/README.md`](docs/design/README.md).
- Contracts first: a new endpoint or event is added to `packages/contracts` before the code that implements it (REQ-API-01).

## How to work

1. Take only work from a GitHub issue assigned to you. If something is unclear, ask in the issue instead of guessing.
2. Branch from `main` as `<prefix>/<issue-number>-<short-name>`, where the prefix is `codex` for Codex and `claude2` for the second Claude. Never push to `main`.
3. Keep a pull request to one concern and under ~400 changed lines where possible.
4. Before opening the PR, run what CI runs:
   - `scripts/server-build.sh` (needs JDK 25, Maven, Docker)
   - `scripts/contracts-lint.sh` (needs Node 24)
5. **Do not chase `main`.** Being behind `main` is normal: open the PR as soon as your branch is green, even if `main` moved on. Merge `main` into your branch only when GitHub reports a conflict or the reviewer asks; never rebuild or reset the branch to catch up. If you do merge `main`, check afterwards that `git diff origin/main...HEAD --stat` lists **only** the files of your issue — a merge that drops or rewrites other people's work is a blocker.
6. Open or update a PR only when the build is green; a PR with a compile error is not ready for review. The reviewer brings `main` in before merging and resolves trivial conflicts himself.
7. Open the PR with the template filled in: linked issue, spec requirement ids (REQ-…, AC-…, T-…), what was tested and how.
8. Do not merge your own PR. Address review comments in new commits on the same branch.

## Rules that must not be broken

- Server modules: each direct sub-package of `taxi.blizz` is a module; cross-module calls only through a module's base package. `ModularityTests` must pass.
- Schema changes only as new Flyway migrations; never edit an applied migration; Hibernate stays `ddl-auto=validate`.
- Name new migrations by UTC date and time plus the author's suffix, `V<yyyyMMdd>_<HHmm>_<n>__<what>.sql`, where `n` is `1` for the lead Claude, `2` for Codex and `3` for the second Claude (e.g. `V20261027_1400_2__rider_history.sql`), so parallel branches never take the same version even in the same minute. Before opening the PR, `git fetch` and check that your migration sorts **after** every migration on the **current** `origin/main` (not the `main` you branched from); if not, rename it to sort right after the last one there — current UTC time when that is later, otherwise the last one's date and time plus a step (Flyway refuses an older migration on a database that already has newer ones).
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
- Push a commit only after the build of step 4 passes locally. A series of tiny commits each waiting for CI is slower than one green one.
- Simple class names of Spring beans are unique across the whole application, not only within a module: Spring names a bean after its simple class name, so two `AnonymizedClients` in different modules break the context. Prefix them with what they handle (`AnonymizedClientCards`, `AnonymizedClientWallet`).
- When you change what a shared method means (e.g. `Orders.active()` once multiple orders exist), grep every caller and check that each still wants the new meaning; fix or switch the ones that do not.
- Texts a person receives (SMS, pushes, voice, e-mails) are in that person's language, or the language of their number's country when the person is not known; never one string for everybody — the markets are Poland and Ukraine.
- Test cities must not overlap the cities of other test classes: before choosing a longitude for `TestRides.city(...)` or a city polygon, grep the tests for the ones already taken.
- A phone number without `+` or `00` is never given a country by guessing (`512345678` is a Polish national number, not `+512…`): only a full number of a known market (`380` + 9 digits, `48` + 9 digits) may get the `+`; anything else stays raw.
- A `timestamptz` read without a type (`query().singleRow()`, `listOfRows()`) comes back as `java.sql.Timestamp`, not `OffsetDateTime`: compare times in SQL, or read them with `rs.getObject(…, OffsetDateTime.class)`.

## Trying the system by hand

The sandbox ([`docs/sandbox.md`](docs/sandbox.md)) runs the whole system with fictional data in GitHub Actions: `gh workflow run sandbox.yml -f scenario=all`. Before adding a helper to `scripts/sandbox/lib.sh`, look for it in the current `origin/main`. When a change adds or alters an HTTP flow, add or extend a scenario in `scripts/sandbox/scenarios/` and run the workflow on your branch (`--ref <branch>`); link the run in the PR.

## Commits

Imperative subject line in English, a body explaining why, one logical change per commit.
