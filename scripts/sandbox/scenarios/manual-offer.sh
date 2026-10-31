#!/usr/bin/env bash
# A dispatcher offers an order to a chosen driver (issue #143, REQ-OPS-04, REQ-DRV-07). A rider orders with a note and
# an entrance while nobody is online, so the order is in the ALL tab. Andrii comes online 1 km away; the operator
# offers him the order by hand. The same offer as an automatic one: the server time, seconds left, the kind of price,
# the expected earnings, the note and the entrance; he accepts it as any offer. An offer to Oleh, who is offline, is
# refused, and a second manual offer while one is open answers 409.
source "$(dirname "$0")/../lib.sh"

ANDRII_ID="5a000000-0000-4000-8000-000000000403"; OLEH_ID="5a000000-0000-4000-8000-000000000402"
PICKUP_LAT=50.4501; PICKUP_LON=30.5234
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890
RIDER_PHONE="+38068$(random_digits 7)"

ORDER=""
# Whatever happens: the order cancelled, every Kyiv test driver offline.
cleanup() {
    set +e
    if [[ -n "$ORDER" && -n "${OPERATOR:-}" ]]; then
        local view
        view=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR")
        if [[ "$(jq -r .status <<<"$view")" == SEARCHING || "$(jq -r .status <<<"$view")" == ASSIGNED ]]; then
            api POST "/api/operator/v1/orders/$ORDER/cancel" "$OPERATOR" \
                "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$view"),\"reason_code\":\"NO_CARS\"}" \
                >/dev/null
        fi
    fi
    [[ -n "${ANDRII:-}" ]] && go_offline "$ANDRII"
}
trap cleanup EXIT

# take_offline TOKEN — ends the driver's shift even when another phone of the driver holds it.
take_offline() {
    local current id
    current=$(api GET /api/driver/v1/work-sessions/current "$1")
    id=$(jq -r '.session_id // empty' <<<"$current" 2>/dev/null || true)
    [[ -n "$id" ]] || return 0
    current=$(api POST "/api/driver/v1/work-sessions/$id/handover" "$1" \
        "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .session_version <<<"$current")}")
    expect 200
    api POST "/api/driver/v1/work-sessions/$id/close" "$1" \
        "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .session_version <<<"$current")}" >/dev/null
    expect 200
}

say "Nobody is online in Kyiv; a rider orders with a note and an entrance"
for phone in "+380500000001" "+380500000002" "+380500000003"; do take_offline "$(sign_in DRIVER "$phone")"; done
ADMIN=$(admin_token)
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" | jq -r .id)
expect 201
CREATED=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"pickup_label\":\"Майдан\",
  \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\",
  \"comment\":\"Дві валізи\",\"entrance\":\"Вихід з метро №2\"}")
expect 201
ORDER=$(jq -r .id <<<"$CREATED")
[[ "$(jq -r .search_phase <<<"$CREATED")" == BROADCAST ]]

say "An offer to Oleh, who is offline, is refused"
REFUSED=$(api POST "/api/operator/v1/orders/$ORDER/manual-offers" "$OPERATOR" \
    "{\"command_id\":\"$(uuid)\",\"driver_id\":\"$OLEH_ID\",\"reason\":\"Regular client\"}")
expect 409
[[ "$(jq -r .code <<<"$REFUSED")" == DRIVER_NOT_ELIGIBLE ]]

say "Andrii comes online 1 km away; the operator offers him the order"
ANDRII=$(sign_in DRIVER "+380500000003")
go_online "$ANDRII" 5a000000-0000-4000-8000-000000000503 50.4591 "$PICKUP_LON" >/dev/null
api POST "/api/operator/v1/orders/$ORDER/manual-offers" "$OPERATOR" \
    "{\"command_id\":\"$(uuid)\",\"driver_id\":\"$ANDRII_ID\",\"reason\":\"Regular client asked for him\"}" >/dev/null
expect 200
AGAIN=$(api POST "/api/operator/v1/orders/$ORDER/manual-offers" "$OPERATOR" \
    "{\"command_id\":\"$(uuid)\",\"driver_id\":\"$ANDRII_ID\",\"reason\":\"Twice\"}")
expect 409
[[ "$(jq -r .code <<<"$AGAIN")" == STATE_CONFLICT ]]

say "Andrii sees an ordinary offer with its terms, the note and the entrance, and accepts it"
OFFER=$(api GET /api/driver/v1/offers "$ANDRII" | jq -c --arg o "$ORDER" '[.[] | select(.order_id == $o)][0]')
expect 200
[[ "$(jq -r .price_kind <<<"$OFFER")" == FIXED ]]
[[ "$(jq -r '.seconds_left > 0 and .seconds_left <= 15' <<<"$OFFER")" == true ]]
[[ "$(jq -r '.expected_earnings_minor > 0 and .expected_earnings_minor < .price_minor' <<<"$OFFER")" == true ]]
[[ "$(jq -r .comment <<<"$OFFER")" == "Дві валізи" && "$(jq -r .entrance <<<"$OFFER")" == "Вихід з метро №2" ]]
api POST "/api/driver/v1/offers/$(jq -r .id <<<"$OFFER")/accept" "$ANDRII" "{\"command_id\":\"$(uuid)\"}" >/dev/null
expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$ANDRII"); expect 200
[[ "$(jq -r .entrance <<<"$TRIP")" == "Вихід з метро №2" ]]
HISTORY=$(api GET "/api/operator/v1/orders/$ORDER/events" "$OPERATOR"); expect 200
note "Done: order $ORDER offered by hand to $ANDRII_ID, earnings estimate $(jq -r .expected_earnings_minor <<<"$OFFER") of $(jq -r .price_minor <<<"$OFFER")."
