#!/usr/bin/env bash
# Issue #145 E3, REQ-ENG-12, REQ-PRV-05, T-39: a backup restores into an empty database, the server starts on it,
# and a client deleted after the backup does not come back: the erasure journal anonymizes them again (ADR 0013).
# Run by the Sandbox workflow after the scenarios, against the sandbox server on :8080 and its database.
# PG_RUN runs a PostgreSQL 18 client command (the workflow runs it in the pinned PostGIS image).
source "$(dirname "$0")/lib.sh"
set -euo pipefail
: "${PG_RUN:?PG_RUN must run a PostgreSQL client command}"
: "${ERASURE_JOURNAL_DIR:?the journal directory of the running server}"

RIDER_PHONE="+38068$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"
say "A rider exists when the backup is taken"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
CLIENT_ID=$(api GET /api/rider/v1/me "$RIDER" | jq -r .subject_id); expect 200

say "Back up the database (deploy/backup.sh)"
$PG_RUN deploy/backup.sh blizz.dump | tee -a "$TRANSCRIPT"

say "After the backup the rider deletes the account and staff complete it"
sleep 2 # the resend pause after the sign-in code
api POST /api/rider/v1/me/deletion-request/challenge "$RIDER" >/tmp/sandbox-deletion-challenge; expect 201
CHALLENGE=$(jq -r .challenge_id /tmp/sandbox-deletion-challenge)
CODE=$(api GET "/sandbox/v1/otp?phone=$(jq -rn --arg p "$RIDER_PHONE" '$p|@uri')" | jq -r .code); expect 200
api POST /api/rider/v1/me/deletion-request "$RIDER" \
  "{\"command_id\":\"$(uuid)\",\"challenge_id\":\"$CHALLENGE\",\"otp_code\":\"$CODE\"}" >/dev/null; expect 200
ADMIN=$(admin_token)
api POST "/api/admin/v1/client-deletions/$CLIENT_ID/complete" "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"reason\":\"Sandbox: backup and restore check\"}" >/dev/null; expect 200
for i in $(seq 1 30); do # the journal is written by an outbox consumer after the commit
    [[ -f "$ERASURE_JOURNAL_DIR/CLIENT-$CLIENT_ID" ]] && break
    sleep 1
done
[[ -f "$ERASURE_JOURNAL_DIR/CLIENT-$CLIENT_ID" ]] || { note "**The deletion never reached the journal.**"; exit 1; }

say "Restore into an empty database (deploy/restore.sh); over data it refuses"
$PG_RUN psql -X -d blizz -c "create database blizz_restored template template_postgis" >/dev/null
$PG_RUN deploy/restore.sh blizz.dump blizz_restored | tee -a "$TRANSCRIPT"
if $PG_RUN deploy/restore.sh blizz.dump blizz_restored 2>>"$TRANSCRIPT"; then
    note "**A restore over a database with data was not refused.**"; exit 1
fi
state() {
    $PG_RUN psql -X -At -d blizz_restored -c \
        "select account_state || ' ' || coalesce(phone_normalized, '-') from client where id = '$CLIENT_ID'"
}
BEFORE=$(state)
note "In the restored database before the server starts: \`$BEFORE\` (the backup predates the deletion)."
[[ "$BEFORE" == "ACTIVE $RIDER_PHONE" ]] || { note "**Expected the rider active in the backup.**"; exit 1; }

say "Start the server on the restored database with the same journal: the deletion is applied again"
pkill -f 'target/server-.*\.jar' || true
for i in $(seq 1 30); do curl -fsS http://localhost:8080/readyz >/dev/null 2>&1 || break; sleep 1; done
(cd server && DB_URL=jdbc:postgresql://localhost:5432/blizz_restored nohup java -jar target/server-*[0-9T].jar \
    --spring.profiles.active=sandbox > ../server-restored.log 2>&1 &)
for i in $(seq 1 90); do curl -fsS http://localhost:8080/readyz >/dev/null 2>&1 && break; sleep 1; done
curl -fsS http://localhost:8080/readyz >/dev/null || { tail -60 server-restored.log; exit 1; }
for i in $(seq 1 30); do [[ "$(state)" == ANONYMIZED* ]] && break; sleep 1; done
AFTER=$(state)
note "After the start: \`$AFTER\`."
[[ "$AFTER" == "ANONYMIZED -" ]] || { note "**The restored rider was not anonymized again.**"; exit 1; }
note "Done: backup, restore into an empty database, start on it; the deleted rider stayed deleted (T-39)."
