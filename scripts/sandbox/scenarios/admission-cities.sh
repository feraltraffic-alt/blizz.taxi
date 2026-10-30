#!/usr/bin/env bash
# Admission cities and the zone filter of the ALL tab (issue #141, REQ-DSP-01, REQ-DS-06, REQ-DSP-07).
# E1: staff admit Andrii only in Warsaw; he cannot go online in Kyiv (409 ADMISSION_CITY). Back in Kyiv and online,
#     he is taken off Kyiv: the shift stays, but an order 300 m away is not offered to him (the journal says
#     CITY_NOT_ADMITTED), the ALL tab is empty and a claim is refused.
# Zones: with Kyiv back, Andrii narrows the ALL tab to a zone around the pickup (the order is there) and to another
#     zone (it is not); a Warsaw zone gets 422.
source "$(dirname "$0")/../lib.sh"

KYIV="5a000000-0000-4000-8000-000000000001"; WARSAW="5a000000-0000-4000-8000-000000000002"
ANDRII_ID="5a000000-0000-4000-8000-000000000403"
PICKUP_LAT=50.4501; PICKUP_LON=30.5234
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890
RIDER_PHONE="+38068$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"

ORDER=""; ZONES=()
# Whatever happens: Andrii admitted in Kyiv again and offline, the order cancelled, the zones archived.
cleanup() {
    set +e
    [[ -n "${ADMIN:-}" ]] && set_cities "[\"$KYIV\"]" "Restore after the scenario" >/dev/null
    if [[ -n "$ORDER" && -n "${OPERATOR:-}" ]]; then
        local view
        view=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR")
        if [[ "$(jq -r .status <<<"$view")" == SEARCHING || "$(jq -r .status <<<"$view")" == ASSIGNED ]]; then
            api POST "/api/operator/v1/orders/$ORDER/cancel" "$OPERATOR" \
                "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$view"),\"reason_code\":\"NO_CARS\"}" \
                >/dev/null
        fi
    fi
    for zone in "${ZONES[@]}"; do
        api POST "/api/admin/v1/zones/${zone%%:*}/archive" "$ADMIN" \
            "{\"command_id\":\"$(uuid)\",\"expected_version\":${zone##*:},\"reason\":\"Sandbox scenario over\"}" >/dev/null
    done
    [[ -n "${ANDRII:-}" ]] && go_offline "$ANDRII"
}
trap cleanup EXIT

# set_cities JSON_ARRAY REASON — the admin replaces Andrii's admission cities; prints the profile.
set_cities() {
    local version
    version=$(api GET "/api/admin/v1/drivers/$ANDRII_ID" "$ADMIN" | jq -r .profile.version)
    api PUT "/api/admin/v1/drivers/$ANDRII_ID/admission-cities" "$ADMIN" \
        "{\"command_id\":\"$(uuid)\",\"expected_version\":$version,\"city_ids\":$1,\"reason\":\"$2\"}"
}

# zone CITY LAT_S LON_W LAT_N LON_E — a published zone; prints its id.
zone() {
    local created published
    created=$(api POST "/api/admin/v1/cities/$1/zones" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"type\":\"DISTRICT\",
      \"polygon\":{\"type\":\"Polygon\",\"coordinates\":[[[$3,$2],[$5,$2],[$5,$4],[$3,$4],[$3,$2]]]},
      \"priority\":1,\"reason\":\"Sandbox: ALL tab filter\"}")
    expect 201
    published=$(api POST "/api/admin/v1/zones/$(jq -r .id <<<"$created")/publish" "$ADMIN" \
        "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$created"),\"reason\":\"Sandbox\"}")
    expect 200
    ZONES+=("$(jq -r .id <<<"$published"):$(jq -r .version <<<"$published")")
    jq -r .id <<<"$published"
}

say "Only Andrii is online in Kyiv for this scenario"
for phone in "+380500000001" "+380500000002"; do go_offline "$(sign_in DRIVER "$phone")"; done
ADMIN=$(admin_token)
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
ANDRII=$(sign_in DRIVER "+380500000003")
go_offline "$ANDRII"

say "E1: admitted only in Warsaw, Andrii cannot go online in Kyiv"
PROFILE=$(set_cities "[\"$WARSAW\"]" "Moved to the Warsaw office"); expect 200
[[ "$(jq -c .admission_city_ids <<<"$PROFILE")" == "[\"$WARSAW\"]" ]]
drive_to "$ANDRII" 50.4528 "$PICKUP_LON"
REFUSED=$(api POST /api/driver/v1/work-sessions "$ANDRII" "{\"command_id\":\"$(uuid)\",
  \"vehicle_id\":\"5a000000-0000-4000-8000-000000000503\",\"location\":$(location 50.4528 "$PICKUP_LON")}")
expect 409
[[ "$(jq -r .code <<<"$REFUSED")" == DRIVER_NOT_ELIGIBLE ]]
[[ "$(jq -r .detail <<<"$REFUSED")" == *ADMISSION_CITY* ]]

say "Back in Kyiv he goes online; then he is taken off Kyiv while online"
set_cities "[\"$KYIV\"]" "Back in Kyiv" >/dev/null; expect 200
SESSION=$(go_online "$ANDRII" 5a000000-0000-4000-8000-000000000503 50.4528 "$PICKUP_LON")
set_cities "[\"$WARSAW\"]" "Kyiv licence suspended for a check" >/dev/null; expect 200
STATE=$(api GET /api/driver/v1/work-sessions/current "$ANDRII"); expect 200
[[ "$(jq -r .session_state <<<"$STATE")" == OPEN ]]
[[ "$(jq -c .ineligible_reasons <<<"$STATE")" == '["ADMISSION_CITY"]' ]]

say "A rider orders 300 m from him: no offer, not in his ALL tab, a claim is refused"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"pickup_label\":\"Майдан\",
  \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}" \
  | jq -r .id)
expect 201
[[ "$(api GET /api/driver/v1/offers "$ANDRII" | jq length)" == 0 ]]
[[ "$(api GET /api/driver/v1/broadcast-orders "$ANDRII" | jq length)" == 0 ]]
CLAIM=$(api POST "/api/driver/v1/orders/$ORDER/claim" "$ANDRII" "{\"command_id\":\"$(uuid)\"}")
expect 409
[[ "$(jq -r .code <<<"$CLAIM")" == DRIVER_NOT_ELIGIBLE ]]
HISTORY=$(api GET "/api/operator/v1/orders/$ORDER/events" "$OPERATOR"); expect 200
[[ "$(jq -r --arg d "$ANDRII_ID" '[.dispatch.attempts[0].rounds[].candidates[] | select(.driver_id == $d)
    | .reason][0]' <<<"$HISTORY")" == CITY_NOT_ADMITTED ]]

say "Zones: Kyiv again; the ALL tab narrowed to a zone around the pickup has the order, another zone does not"
set_cities "[\"$KYIV\"]" "Check done" >/dev/null; expect 200
move "$ANDRII" "$SESSION" 50.4528 "$PICKUP_LON"; expect 200
AROUND=$(zone "$KYIV" 50.440 30.510 50.460 30.540)
ELSEWHERE=$(zone "$KYIV" 50.400 30.600 50.420 30.640)
IN_WARSAW=$(zone "$WARSAW" 52.220 21.000 52.240 21.030)
[[ "$(api GET "/api/driver/v1/broadcast-orders?zone_id=$AROUND" "$ANDRII" \
    | jq --arg o "$ORDER" 'any(.[]; .order_id == $o)')" == true ]]
expect 200
[[ "$(api GET "/api/driver/v1/broadcast-orders?zone_id=$ELSEWHERE" "$ANDRII" \
    | jq --arg o "$ORDER" 'any(.[]; .order_id == $o)')" == false ]]
expect 200
api GET "/api/driver/v1/broadcast-orders?zone_id=$IN_WARSAW" "$ANDRII" >/dev/null; expect 422
note "Done: E1 for $ANDRII_ID (open 409, no offer, empty ALL tab, claim 409, journal CITY_NOT_ADMITTED); zone filter."
