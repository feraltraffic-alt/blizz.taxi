#!/usr/bin/env bash
# Report exports to CSV (REQ-ADM-07): the owner asks for this month's orders and money of Kyiv, a background job
# builds the files, the owner downloads them; another export id gives 404.
source "$(dirname "$0")/../lib.sh"

KYIV=5a000000-0000-4000-8000-000000000001
FROM=$(date -u +%Y-%m-01)
TO=$(date -u +%Y-%m-%d)
ADMIN=$(admin_token)

# export KIND — asks, waits up to 30 s for READY, downloads; prints the first line of the file.
export_report() {
    local asked id state=""
    asked=$(api POST /api/admin/v1/reports/exports "$ADMIN" \
      "{\"command_id\":\"$(uuid)\",\"kind\":\"$1\",\"city_id\":\"$KYIV\",\"from\":\"$FROM\",\"to\":\"$TO\"}")
    expect 202
    id=$(jq -r .id <<<"$asked")
    for _ in $(seq 1 30); do
        state=$(api GET "/api/admin/v1/reports/exports/$id" "$ADMIN" | jq -r .state)
        [[ "$state" == READY || "$state" == FAILED ]] && break
        sleep 1
    done
    if [[ "$state" != READY ]]; then note "**The $1 export is $state — scenario stopped.**"; exit 1; fi
    curl -sS -o /tmp/sandbox-export.csv -w '%{http_code}' -H "Authorization: Bearer $ADMIN" \
        "$BASE/api/admin/v1/reports/exports/$id/file" >/tmp/sandbox-status
    expect 200
    note "\`GET /api/admin/v1/reports/exports/$id/file\` → **200**, $(wc -l </tmp/sandbox-export.csv) lines:"
    printf '\n```csv\n%s\n```\n' "$(sed 's/^\xEF\xBB\xBF//' /tmp/sandbox-export.csv | head -5)" >>"$TRANSCRIPT"
    grep -q $'\r$' /tmp/sandbox-export.csv
    tail -n 1 /tmp/sandbox-export.csv | grep -q '^total,'
    head -c 3 /tmp/sandbox-export.csv | od -An -tx1 | grep -q 'ef bb bf'
}

say "Orders of Kyiv this month, as CSV"
export_report ORDERS

say "Money of Kyiv this month, as CSV"
export_report FINANCE

say "An export that is not mine is not found"
api GET "/api/admin/v1/reports/exports/$(uuid)" "$ADMIN" >/dev/null
expect 404
note "Done: both reports were built in the background and downloaded."
