#!/usr/bin/env bash
# Lint OpenAPI documents and validate event schemas. CI calls this script; run it locally the same way.
set -euo pipefail
cd "$(dirname "$0")/../packages/contracts"
npm ci --no-fund --no-audit
npm run lint
