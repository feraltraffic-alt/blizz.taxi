#!/usr/bin/env bash
# Q-19 and #276: one real bounded cleanup of delivered events, which belong to no service and are kept exactly 30 days
# (owner answer 02.11.2026), with old/recent/FAILED controls; each service's own terms do not touch them.
set -euo pipefail
source "$(dirname "$0")/../lib.sh"
say 'Technical data retention'
admin=$(admin_token)
current=$(api GET /api/admin/v1/retention "$admin"); expect 200
jq -e '.fixed_days.delivered_events==30 and (.days|has("delivered_events")|not)' <<<"$current" >/dev/null
fixture=$(uuid)
trap 'api DELETE "/sandbox/v1/retention/fixtures/$fixture" "$admin" >/dev/null || true' EXIT
before=$(api POST "/sandbox/v1/retention/fixtures/$fixture" "$admin"); expect 200
jq -e '.old_done==1 and .recent_done==1 and .failed==1' <<<"$before" >/dev/null
run=$(api POST /sandbox/v1/retention/run "$admin"); expect 200
jq -e '.delivered_events.deleted>=1 and .delivered_events.failures==0' <<<"$run" >/dev/null
after=$(api GET "/sandbox/v1/retention/fixtures/$fixture" "$admin"); expect 200
jq -e '.old_done==0 and .recent_done==1 and .failed==1' <<<"$after" >/dev/null
note 'A 400-day-old DONE event removed (fixed 30 days); a recent DONE and an old FAILED event retained.'
