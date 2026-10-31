# Contract and HTTP-call inventory

Run with Node 24 from any directory after `scripts/contracts-lint.sh` installs the existing contract tools:

```sh
node scripts/audit/contract-drift.mjs
node scripts/audit/contract-drift.mjs --json > /tmp/contract-audit.json
```

Exit 1 means missing route contracts, missing implementations, event/schema drift or an unresolved source construct. Coverage gaps are advisory. The script is deliberately not part of CI (#110).

The inventory expands Spring controller prefixes, path arrays, method arrays and annotations without arguments. It includes `addHandler` WebSocket GET handshakes separately from controller mappings. Path variable names are normalized; coverage matches concrete path segments against contract templates. OpenAPI documents are bundled to JSON by the repository's Redocly CLI, including external path-item references. Event types are traced through constant values and method parameters to local and typed receiver call sites; unresolved expressions are errors. Event schema titles identify types (`Type v1 payload`, `Type v1`, or `Type / OtherType v1`). This checks type presence, not agreement between every publisher's payload and the schema.

`covered` contains source locations of direct HTTP calls, local test helpers whose bodies construct HTTP requests, sandbox `api` calls (including simple path-variable assignments), and curl downloads with visible paths. It also models the isolation sweep’s explicit unbundled-contract selection rule when that rule and its HTTP call remain recognizable; those evidence entries are labeled separately. It is an inventory of requests, not assertion/authorization coverage. For example, a 400/401 test may never reach the business operation. Review the evidence before concluding that a feature is tested. URL variables, shell audience substitutions, provider-generated form URLs need manual review; `coverageLimitations` and `unresolvedCoverage` make those limits explicit. `untested` means no resolved call was found, not proof that no dynamically constructed request can reach the operation.

Temporary source/contract mutations proved the checker in both directions for E1–E5. The commands and observed output are in the #110 PR. Throwaway mappings, events and contract paths are not committed.

# Java line length (ratchet)

`node scripts/audit/java-line-length.mjs` runs in CI (job Contracts). It enforces two rules:

- No Java file under `server/src` may have more lines over 120 characters than its entry in `java-line-length-baseline.json`. A file that is not listed is allowed none.
- A file whose count went down fails too, with "lower the baseline for X to N". The baseline therefore only ever goes down.

Each finding names the file and the line numbers. `--print` prints today's counts in the baseline's format, so a lowered count can be reviewed and committed. Lines are counted in characters, not bytes. Background: issue #149 and lessons case 14.
