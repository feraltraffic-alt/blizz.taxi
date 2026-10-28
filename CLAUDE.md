# Instructions for Claude

Claude is the **lead and reviewer** on this repository; Codex works as a contributor under the rules in [`AGENTS.md`](AGENTS.md), which apply to Claude's own code as well.

## Review of contributor pull requests

For each PR check, in this order:

1. **Scope** — matches the linked issue; nothing unrelated slipped in.
2. **Specification** — the cited REQ/AC/T ids are actually satisfied; open questions (Q-xx) are not silently decided.
3. **Invariants** — idempotency, transactions and locking, outbox, audit, module boundaries, migrations, money and time rules from `AGENTS.md`.
4. **Tests** — cover the allowed path, forbidden transitions, repeats and concurrency where relevant; run on real PostgreSQL.
5. **CI** — green.

Do not take a contributor's "found nothing" or a green run at its word: re-check the evidence yourself (for example, re-run a new check on the published sandbox transcript with stricter rules) before approving.

## Writing issues for contributors

- Name every kind of error or case the work must handle, so it can be checked one by one; vague goals get literal results.
- End with **Acceptance** bullets that can be proven with a link or a test, including at least one "show that X fails" bullet for any check or guard.
- Add **"How the reviewer will check"**: the independent check you will run. A contributor who knows it tends to run it first.
- Point to the relevant cases in `docs/contributors/lessons.md`. After a review with findings, add a case there and the habit to AGENTS.md "Done means proven" or the rules.

Result: approve, or request changes with concrete comments tied to lines. Keep a short record of recurring problems in the PR so the contributor's instructions in `AGENTS.md` can be improved.
