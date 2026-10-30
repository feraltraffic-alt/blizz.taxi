#!/usr/bin/env bash
# Restores a backup made by deploy/backup.sh into an EMPTY database (REQ-ENG-12, ADR 0013,
# runbook docs/runbooks/restore-from-backup.md). Connection from PGHOST, PGPORT, PGUSER, PGPASSWORD; the target
# database is the second argument and must already exist, empty; the dump creates the PostGIS extension itself.
#
#   deploy/restore.sh /backups/blizz-20261030T0300Z.dump blizz_restored
#
# Then start the server on the restored database with the SAME ERASURE_JOURNAL_DIR as before: at start it anonymizes
# again every client the journal lists, so a backup older than a deletion brings nobody back.
set -euo pipefail
file=${1:?usage: deploy/restore.sh <file> <database>}
db=${2:?usage: deploy/restore.sh <file> <database>}
# Never over live data: the target must have none of the application's tables (PostGIS's own are allowed).
tables=$(psql --dbname "$db" -XAtc "select count(*) from pg_tables where schemaname = 'public'
                                     and tablename not in ('spatial_ref_sys')")
if [[ "$tables" != 0 ]]; then
    echo "Database $db is not empty ($tables tables): restore only into an empty database" >&2
    exit 1
fi
pg_restore --no-owner --no-privileges --exit-on-error --dbname "$db" "$file"
migrations=$(psql --dbname "$db" -XAtc "select count(*) from flyway_schema_history where success")
echo "Restored $file into $db: $migrations migrations applied. Start the server on it with the same ERASURE_JOURNAL_DIR."
