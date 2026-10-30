#!/usr/bin/env bash
# Dispatch abuse (issue #102, threat model G1/G2): a spoofed position does not become the one orders are dispatched by.
# Anna is online in Warsaw; 5 seconds later her phone reports Lviv, 340 km away. The heartbeat answers 200 with
# accepted false (the phone keeps sending), her location is STALE and the operator's map still shows her in Warsaw.
# A plausible fix near Warsaw is accepted again.
source "$(dirname "$0")/../lib.sh"

ANNA_ID="5a000000-0000-4000-8000-000000000405"
WARSAW="5a000000-0000-4000-8000-000000000002"

# Whatever happens, Anna ends offline for the next scenarios.
cleanup() {
    set +e
    [[ -n "${ANNA:-}" ]] && go_offline "$ANNA"
}
trap cleanup EXIT

say "Anna goes online in Warsaw"
ANNA=$(sign_in DRIVER "+48500000002")
go_offline "$ANNA"
SESSION=$(go_online "$ANNA" 5a000000-0000-4000-8000-000000000505 52.2297 21.0122)

say "5 seconds later her phone reports Lviv: not taken as her position"
sleep 5
JUMP=$(api POST "/api/driver/v1/work-sessions/$SESSION/heartbeat" "$ANNA" "{\"location\":$(location 49.8397 24.0297)}")
expect 200
[[ "$(jq -r .accepted <<<"$JUMP")" == false ]]
[[ "$(jq -r .geolocation <<<"$JUMP")" == STALE ]]
[[ "$(jq -r '.ineligible_reasons | index("LOCATION_STALE") != null' <<<"$JUMP")" == true ]]

say "The operator's map still shows her in Warsaw"
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
BOARD=$(api GET "/api/operator/v1/drivers/live?city_id=$WARSAW" "$OPERATOR"); expect 200
ON_MAP=$(jq -c --arg id "$ANNA_ID" '.drivers[] | select(.driver_id == $id)' <<<"$BOARD")
[[ "$(jq -r .geolocation <<<"$ON_MAP")" == STALE ]]
[[ "$(jq -r '.location.lat > 52 and .location.lon > 20.8 and .location.lon < 21.3' <<<"$ON_MAP")" == true ]]

say "A fix next to the last accepted one is taken again"
BACK=$(api POST "/api/driver/v1/work-sessions/$SESSION/heartbeat" "$ANNA" "{\"location\":$(location 52.2299 21.0122)}")
expect 200
[[ "$(jq -r .accepted <<<"$BACK")" == true ]]
[[ "$(jq -r .geolocation <<<"$BACK")" == FRESH ]]
note "Done: the jump to Lviv was refused, the map kept Warsaw, the next plausible fix was accepted."
