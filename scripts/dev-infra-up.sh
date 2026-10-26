#!/usr/bin/env bash
# Start local PostgreSQL/PostGIS and Redis for development.
set -euo pipefail
cd "$(dirname "$0")/../deploy/dev"
docker compose up -d --wait
