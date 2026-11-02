#!/usr/bin/env bash
set -euo pipefail
cd "$(dirname "$0")/.."
node -e 'if (Number(process.versions.node.split(".")[0]) !== 24) throw new Error("Node 24 is required")'
npm ci --no-fund --no-audit
npm run generate:check
npm run lint
npm run typecheck
npm test
npm run build
# No secret in the panels' bundles (AC-23, #253); the apps' web exports are scanned in web-e2e.yml.
node scripts/audit/bundle-secrets.mjs apps/web/admin/dist apps/web/operator/dist
