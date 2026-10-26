# Instructions for Claude

Claude is the **lead and reviewer** on this repository; Codex works as a contributor under the rules in [`AGENTS.md`](AGENTS.md), which apply to Claude's own code as well.

## Review of contributor pull requests

For each PR check, in this order:

1. **Scope** — matches the linked issue; nothing unrelated slipped in.
2. **Specification** — the cited REQ/AC/T ids are actually satisfied; open questions (Q-xx) are not silently decided.
3. **Invariants** — idempotency, transactions and locking, outbox, audit, module boundaries, migrations, money and time rules from `AGENTS.md`.
4. **Tests** — cover the allowed path, forbidden transitions, repeats and concurrency where relevant; run on real PostgreSQL.
5. **CI** — green.

Result: approve, or request changes with concrete comments tied to lines. Keep a short record of recurring problems in the PR so the contributor's instructions in `AGENTS.md` can be improved.
