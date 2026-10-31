#!/usr/bin/env bash
# Integration health (issue #176, part C; registry 22.2 "GET /integration-health"): staff read every provider's
# breaker state and its last success and failure; the answer carries no URL, secret or message.
source "$(dirname "$0")/../lib.sh"

ADMIN=$(admin_token)

say "Staff read how the outside providers are doing"
HEALTH=$(api GET /api/admin/v1/integrations/health "$ADMIN"); expect 200
jq -e '.instance != "" and ([.providers[].provider] | sort) == (["ASTERISK","FCM","GEOCODING","GRAPHHOPPER","TURBOSMS","WAYFORPAY"])
  and all(.providers[]; .state == "CLOSED" or .state == "HALF_OPEN" or .state == "OPEN")' <<<"$HEALTH" >/dev/null
! grep -q "://" <<<"$HEALTH"
note "Done: $(jq -r '[.providers[] | .provider + " " + .state] | join(", ")' <<<"$HEALTH") on $(jq -r .instance <<<"$HEALTH")."
