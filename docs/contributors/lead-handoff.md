# Lead handoff (state on 30.10.2026)

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
- Contributors are called by `@codex` in an issue or PR comment, or simply take open issues with their label
  (`scripts/wait-for-work.sh <label>`).

## Work in flight

| Item | Who | State |
|---|---|---|
| #118 retention settings in the admin panel (Q-19 decided by the owner) | Codex | One-time backfill of the "attached" marker approved from three tables (`driver_document`, `support_message_attachment`, `call_recording`), ADR 0004 exception authorised, `CALL_RECORDING` excluded from the cleanup in code |
| #124 isolation sweep must reach the access check | Codex | After #118 |
| #102 dispatch abuse (threat model §6–7) | Second Claude | Plan approved 30.10 (two PRs: G1/G2, then B1–B3) with additions: refusal heals after distance/250 km/h, 429 before any lock, device + idempotency replay rule, reuse `RiskProperties.impossibleSpeedKph`. B2 radius already on main (#117) |
| #105 document uploads (threat model §5) | Second Claude | After #102; PDF `#xx` and Flate (#117), PNG and WebP metadata (#121) already on main |
| #112 deferred audit findings | Lead | See below |

### Left in #112

- The same event type published by payment and order: an event contract question. No runtime bug, because every
  consumer filters by `aggregateType`.

The client card showing support-case subjects across cities stays as it is: owner decision of 30.10.2026.

### Reminders (no work now)

- #30 admin panel for tariffs and finance.
- #43 own GraphHopper server.
- #46 payment link by SMS.

### Open owner questions

Q-05, 06, 07, 10, 11, 12, 15, 16, 18 are still open in the specification; never treat them as decided.

## How the lead works

1. **Review each contributor PR in order:** scope, specification, invariants, tests, CI.
   - Re-check the evidence yourself: run their script, a stricter probe, or a spot check of payloads against schemas.
   - Post the review with event `COMMENT`; `REQUEST_CHANGES` is impossible on the same account.
   - Then squash-merge with `gh api -X PUT repos/feraltraffic-alt/blizz.taxi/pulls/N/merge -f merge_method=squash`.
2. **Own work** goes through a `claude/` branch and a PR. Merge only after CI and a full sandbox are green on the last commit:
   - start the sandbox with `gh workflow run sandbox.yml --ref <branch> -f scenario=all`;
   - read the results on branch `sandbox-runs`, in `runs/<run id>/results.txt`.

   Docs-only changes may go straight to `main`.
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

## Recent history (29–30.10.2026)

- **#126 (lead):** OTP budget per range of numbers (`blizz.otp.max-per-range-per-hour`, 500); the tests and the
  sandbox raise it in their own config.
- **Full code audit:** #113 to #117, then #119 to #122. Lessons 10 and 11.
- **Codex:** #109 reconciliation, #123 contract drift audit (`scripts/audit/contract-drift.mjs`), #125 hot-path
  indexes and background debt refresh.
- **Main** is green after each round, CI and the full sandbox.
