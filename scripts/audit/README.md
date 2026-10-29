# Contract and HTTP-call inventory

Run with Node 24 from any directory after `scripts/contracts-lint.sh` installs the existing contract tools:

```sh
node scripts/audit/contract-drift.mjs
node scripts/audit/contract-drift.mjs --json > /tmp/contract-audit.json
```

Exit 1 means missing route contracts, missing implementations, event/schema drift or an unresolved source construct. Coverage gaps are advisory. The script is deliberately not part of CI (#110).

The inventory expands Spring controller prefixes, path arrays, method arrays and annotations without arguments. It includes `addHandler` WebSocket GET handshakes separately from controller mappings. Path variable names are normalized. OpenAPI documents are bundled to JSON by the repository's Redocly CLI, including external path-item references. Event types are traced through constant values and method parameters to local and typed receiver call sites; unresolved expressions are errors. Event schema titles identify types (`Type v1 payload`, `Type v1`, or `Type / OtherType v1`). This checks type presence, not agreement between every publisher's payload and the schema.

`covered` contains source locations of direct HTTP calls, local test helpers whose bodies construct HTTP requests, sandbox `api` calls, and curl downloads with visible paths. It is an inventory of requests, not assertion/authorization coverage. For example, a 400/401 test may never reach the business operation. Review the evidence before concluding that a feature is tested. URL variables, shell audience substitutions, provider-generated form URLs and contract-driven isolation loops need manual review; `coverageLimitations` and `unresolvedCoverage` make those limits explicit. `untested` means no resolved call was found, not proof that no dynamically constructed request can reach the operation.

Temporary source/contract mutations proved the checker in both directions for E1–E5. The commands and observed output are in the #110 PR. Throwaway mappings, events and contract paths are not committed.
