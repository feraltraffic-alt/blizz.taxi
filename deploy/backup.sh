#!/usr/bin/env bash
# Backs up the database into one file (REQ-ENG-12, runbook docs/runbooks/restore-from-backup.md).
# Connection from the standard libpq variables: PGHOST, PGPORT, PGUSER, PGPASSWORD, PGDATABASE.
# pg_dump must be of the server's major version (18) or newer; deploy/README.md shows how to run it from the
# PostGIS image instead.
#
#   deploy/backup.sh /backups/blizz-$(date -u +%Y%m%dT%H%MZ).dump
#
# The erasure journal (ERASURE_JOURNAL_DIR) is NOT in this file and must not be: it lives on its own storage and is
# replayed by the server after a restore (ADR 0013).
set -euo pipefail
out=${1:?usage: deploy/backup.sh <file>}
partial="$out.partial"
pg_dump --format=custom --no-owner --no-privileges --file "$partial"
# A file that cannot be listed is not a backup: fail now, not on the day of the restore.
pg_restore --list "$partial" >/dev/null
mv "$partial" "$out"
echo "Backed up ${PGDATABASE:-the database} to $out ($(du -h "$out" | cut -f1))"
