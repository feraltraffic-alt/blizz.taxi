# Lead handoff (state on 31.10.2026)

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
| Codex | #136 web foundation (branch `codex/136-web-foundation`, no PR yet; idle since 30.10, token limit) → #149 retention layout and line-length ratchet → #140 payments (includes the WayForPay breaker semantics) |
| Second Claude | #142 done (A–D). The `restore` duplicate check (follow-up of #174) → #176 (M1 registry gaps) → #137 rider app (needs `packages/api-client` from #136) |
| Lead | #146 done with this PR: parts 1 (#157), 2 (#172), 3 (#175), 4 (M1 registry test). Next: an issue for the L1 findings before L2 (pool, heartbeat cost, outbox relay), then the audit's remaining items |

Done since 30.10: #124, #135, #139 (parts 1–3), #141, #143, #144, #145, #142.
If Codex stays idle, the lead may take #149 or #140 and say so in the issue.

Owner to confirm (in the audit doc): road-ETA dispatch, call queues, bulk operations, webhook path, WayForPay sandbox keys.
Merging: `.claude/settings.json` on `main` allows the lead's squash merge; the hourly scheduled check reviews contributors and reports idleness.

### Reminders (no work now)

- #30 admin panel for tariffs and finance.
- #43 own GraphHopper server.
- #46 payment link by SMS.

### Open owner questions

From the review of #173: should a staff password reset ask for the acting admin's password too, and may wrong
confirmation passwords lock the only super admin out?

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
