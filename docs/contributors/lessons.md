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

## The common thread

Each of these PRs was green in CI. A green build shows that the code does what its own tests check, not that it does what the issue asks. Your job before the PR is to try to prove your own work wrong and to show in the PR how you tried.
