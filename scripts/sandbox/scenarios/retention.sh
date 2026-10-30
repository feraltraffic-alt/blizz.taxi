#!/usr/bin/env bash
# Q-19: the real policy command and one real bounded cleanup, with old/recent/FAILED controls.
set -euo pipefail
source "$(dirname "$0")/../lib.sh"
say 'Technical data retention'
admin=$(admin_token)
original=$(api GET /api/admin/v1/retention "$admin"); expect 200
fixture=$(uuid)
restore_retention() {
    api DELETE "/sandbox/v1/retention/fixtures/$fixture" "$admin" >/dev/null || true
    local current version body
    current=$(api GET /api/admin/v1/retention "$admin") || return
    version=$(jq -r .version <<<"$current")
    body=$(jq -nc --arg command "$(uuid)" --argjson version "$version" --argjson days "$(jq .days <<<"$original")" \
        '{command_id:$command,expected_version:$version,days:$days,reason:"Restore policy after retention sandbox"}')
    api PUT /api/admin/v1/retention "$admin" "$body" >/dev/null
    expect 200
}
trap restore_retention EXIT
body=$(jq -nc --arg command "$(uuid)" --argjson before "$original" \
    '{command_id:$command,expected_version:$before.version,days:($before.days|.delivered_events=1),reason:"Sandbox retention boundary"}')
changed=$(api PUT /api/admin/v1/retention "$admin" "$body"); expect 200
jq -e '.days.delivered_events==1' <<<"$changed" >/dev/null
before=$(api POST "/sandbox/v1/retention/fixtures/$fixture" "$admin"); expect 200
jq -e '.old_done==1 and .recent_done==1 and .failed==1' <<<"$before" >/dev/null
run=$(api POST /sandbox/v1/retention/run "$admin"); expect 200
jq -e '.delivered_events.deleted>=1 and .delivered_events.failures==0' <<<"$run" >/dev/null
after=$(api GET "/sandbox/v1/retention/fixtures/$fixture" "$admin"); expect 200
jq -e '.old_done==0 and .recent_done==1 and .failed==1' <<<"$after" >/dev/null
note 'Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.'
