#!/usr/bin/env bash
# Why a driver got the order and another did not (REQ-DSP-12, issue #71): two drivers near the pickup, the nearest
# declines, the next accepts; the operator reads the order's history with the dispatch journal — the rounds with
# every driver considered, the offers and their results. Driver ids and distances only, no positions.
source "$(dirname "$0")/../lib.sh"

PICKUP_LAT=50.4501; PICKUP_LON=30.5234
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890
NEAR_ID="5a000000-0000-4000-8000-000000000401"; FAR_ID="5a000000-0000-4000-8000-000000000402"
RIDER_PHONE="+38068$(random_digits 7)"

ORDER=""
# Whatever happens, leave no order searching and no driver online for the next scenarios.
cleanup() {
    set +e
    if [[ -n "$ORDER" && -n "${OPERATOR:-}" ]]; then
        local version
        version=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR" | jq -r .version)
        api POST "/api/operator/v1/orders/$ORDER/cancel" "$OPERATOR" \
            "{\"command_id\":\"$(uuid)\",\"expected_version\":$version,\"reason_code\":\"NO_CARS\"}" >/dev/null
    fi
    [[ -n "${NEAR:-}" ]] && go_offline "$NEAR"
    [[ -n "${FAR:-}" ]] && go_offline "$FAR"
}
trap cleanup EXIT

say "Only the two drivers of this scenario are online"
OTHER=$(sign_in DRIVER "+380500000003"); go_offline "$OTHER"
NEAR=$(sign_in DRIVER "+380500000001")
go_online "$NEAR" "5a000000-0000-4000-8000-000000000501" 50.4519 "$PICKUP_LON" >/dev/null   # about 200 m
FAR=$(sign_in DRIVER "+380500000002")
go_online "$FAR" "5a000000-0000-4000-8000-000000000502" 50.4555 "$PICKUP_LON" >/dev/null    # about 600 m

ADMIN=$(admin_token)
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")

say "A rider orders"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"pickup_label\":\"Майдан\",
  \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}" \
  | jq -r .id)
expect 201

say "The nearest driver declines, the next one accepts"
OFFER=$(api GET /api/driver/v1/offers "$NEAR" | jq -r --arg o "$ORDER" '[.[] | select(.order_id == $o)][0].id')
expect 200
[[ -n "$OFFER" && "$OFFER" != null ]]
api POST "/api/driver/v1/offers/$OFFER/reject" "$NEAR" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 204
OFFER=$(api GET /api/driver/v1/offers "$FAR" | jq -r --arg o "$ORDER" '[.[] | select(.order_id == $o)][0].id')
expect 200
[[ -n "$OFFER" && "$OFFER" != null ]]
api POST "/api/driver/v1/offers/$OFFER/accept" "$FAR" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200

say "The operator reads why: the order's history with the dispatch journal"
HISTORY=$(api GET "/api/operator/v1/orders/$ORDER/events" "$OPERATOR"); expect 200
ATTEMPT=$(jq -c '.dispatch.attempts[0]' <<<"$HISTORY")
[[ "$(jq -r .outcome <<<"$ATTEMPT")" == ASSIGNED ]]
[[ "$(jq -r '.first_offer_at != null and .assigned_at != null' <<<"$ATTEMPT")" == true ]]
[[ "$(jq -c '[.offers[] | {driver_id, result}]' <<<"$ATTEMPT")" == \
   "[{\"driver_id\":\"$NEAR_ID\",\"result\":\"DECLINED\"},{\"driver_id\":\"$FAR_ID\",\"result\":\"ACCEPTED\"}]" ]]
FIRST=$(jq -c '.rounds[0].candidates' <<<"$ATTEMPT")
[[ "$(jq -r --arg d "$NEAR_ID" '.[] | select(.driver_id == $d) | .outcome' <<<"$FIRST")" == OFFERED ]]
[[ "$(jq -r --arg d "$FAR_ID" '.[] | select(.driver_id == $d) | .outcome' <<<"$FIRST")" == ELIGIBLE ]]
SECOND=$(jq -c '.rounds[1].candidates' <<<"$ATTEMPT")
[[ "$(jq -r --arg d "$NEAR_ID" '.[] | select(.driver_id == $d) | .reason' <<<"$SECOND")" == ALREADY_OFFERED ]]
if jq -e '.dispatch | .. | objects | has("lat") or has("lon")' <<<"$HISTORY" | grep -q true; then
    note "**A position is in the journal.**"; exit 1
fi

say "Clean-up: the order is cancelled, the drivers go offline"
note "Done: order $ORDER — declined by $NEAR_ID, taken by $FAR_ID."
