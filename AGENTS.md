# Instructions for Codex

You are a **contributor** on this repository. Claude is the **lead and reviewer**: it assigns work, reviews every pull request and decides what is merged. The product owner has the final word.

## Source of truth

- Requirements: [`docs/spec/Taxi_Platform_Detailed_Specification_v0.2.md`](docs/spec/Taxi_Platform_Detailed_Specification_v0.2.md) (Russian). **B** = approved, **D** = proposed, **Q-xx** = open question. Never treat an open question as decided.
- Decisions: [`docs/decisions/`](docs/decisions/). UI reference and gaps: [`docs/design/README.md`](docs/design/README.md).
- Contracts first: a new endpoint or event is added to `packages/contracts` before the code that implements it (REQ-API-01).

## How to work

1. Take only work from a GitHub issue assigned to you. If something is unclear, ask in the issue instead of guessing.
2. Branch from `main` as `codex/<issue-number>-<short-name>`. Never push to `main`.
3. Keep a pull request to one concern and under ~400 changed lines where possible.
4. Before opening the PR, run what CI runs:
   - `scripts/server-build.sh` (needs JDK 25, Maven, Docker)
   - `scripts/contracts-lint.sh` (needs Node 24)
5. Open the PR with the template filled in: linked issue, spec requirement ids (REQ-…, AC-…, T-…), what was tested and how.
6. Do not merge your own PR. Address review comments in new commits on the same branch.

## Rules that must not be broken

- Server modules: each direct sub-package of `taxi.blizz` is a module; cross-module calls only through a module's base package. `ModularityTests` must pass.
- Schema changes only as new Flyway migrations; never edit an applied migration; Hibernate stays `ddl-auto=validate`.
- State changes are named commands with `command_id` and `expected_version`, executed through `IdempotentCommands`; no PATCH of a `status` field.
- Events go through `Outbox.publish` in the same transaction as the change.
- Privileged and financial actions are written to `AuditLog`.
- Staff actions need an `ACTIVE` `staff_user` with an explicit permission (a `*_PERMISSION` constant in the module's API, e.g. `geo.manage`, `driver.review`); staff have no permissions by default (REQ-AUTH-10). Check authorization **before** `IdempotentCommands.execute`, so a stored outcome is never returned to someone who lost access.
- When two operations must not interleave, lock rows in one fixed order on every path (e.g. city before zone) and prove it with a concurrency test.
- Money is `amount_minor` + `currency`; time is UTC; no floating point for money.
- Four separate user tables (`staff_user`, `client`, `driver`, `partner`) — no shared user table (section 36).
- Tests touching the database use Testcontainers PostgreSQL/PostGIS, never H2 or mocks of the database.
- No secrets, keys or real personal data in the repository.
- Do not change `docs/spec/` or `docs/decisions/` without an explicit request in the issue.

## Commits

Imperative subject line in English, a body explaining why, one logical change per commit.
