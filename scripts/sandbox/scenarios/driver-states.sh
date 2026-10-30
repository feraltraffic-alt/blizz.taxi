#!/usr/bin/env bash
# Driver states (issue #141, AC-11, REQ-GEO-04, REQ-DS-03).
# E2: the nearest driver pauses while an offer is open: the offer is revoked at once, his late accept gets 409
#     OFFER_REVOKED and the next driver has the order without waiting out the 15 s of the offer.
# E5: five rounds of pause and accept sent at the same moment: exactly one wins each round, never a 5xx.
# E4: a fix less accurate than 100 m keeps the driver out of new orders (LOCATION_INACCURATE) until an accurate one.
# The support map shows when each driver was last heard from (last_heartbeat_at).
source "$(dirname "$0")/../lib.sh"

PICKUP_LAT=50.4501; PICKUP_LON=30.5234
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890
KYIV="5a000000-0000-4000-8000-000000000001"
NEAR_ID="5a000000-0000-4000-8000-000000000401"; FAR_ID="5a000000-0000-4000-8000-000000000402"
RIDER_PHONE="+38068$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"

ORDERS=()
# Whatever happens, leave no order searching and no driver online for the next scenarios.
cleanup() {
    set +e
    if [[ -n "${OPERATOR:-}" ]]; then
        for order in "${ORDERS[@]}"; do cancel_order "$order"; done
    fi
    [[ -n "${NEAR:-}" ]] && go_offline "$NEAR"
    [[ -n "${FAR:-}" ]] && go_offline "$FAR"
}
trap cleanup EXIT

# cancel_order ID — the operator cancels the order unless it is already over.
cancel_order() {
    local view status
    view=$(api GET "/api/operator/v1/orders/$1" "$OPERATOR")
    status=$(jq -r .status <<<"$view")
    if [[ "$status" == SEARCHING || "$status" == ASSIGNED ]]; then
        api POST "/api/operator/v1/orders/$1/cancel" "$OPERATOR" \
            "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$view"),\"reason_code\":\"NO_CARS\"}" \
            >/dev/null
    fi
}

order() {
    local quote id
    quote=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
      \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" \
      | jq -r .id)
    expect 201
    id=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$quote\",
      \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"pickup_label\":\"Майдан\",
      \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}" \
      | jq -r .id)
    expect 201
    ORDERS+=("$id")
    echo "$id"
}

# offer_of TOKEN ORDER — the driver's open offer of the order, or empty.
offer_of() {
    api GET /api/driver/v1/offers "$1" | jq -r --arg o "$2" '[.[] | select(.order_id == $o)][0].id // empty'
}

state_of() { api GET /api/driver/v1/work-sessions/current "$1"; }

# resume TOKEN — back to ACCEPTING once the driver is free again.
resume() {
    local current
    current=$(state_of "$1")
    if [[ "$(jq -r .intent <<<"$current")" != ACCEPTING ]]; then
        api POST "/api/driver/v1/work-sessions/$(jq -r .session_id <<<"$current")/resume" "$1" \
            "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .session_version <<<"$current")}" >/dev/null
        expect 200
    fi
}

say "Only the two drivers of this scenario are online: Near about 200 m from the pickup, Far about 600 m"
OTHER=$(sign_in DRIVER "+380500000003"); go_offline "$OTHER"
NEAR=$(sign_in DRIVER "+380500000001")
NEAR_SESSION=$(go_online "$NEAR" "5a000000-0000-4000-8000-000000000501" 50.4519 "$PICKUP_LON")
FAR=$(sign_in DRIVER "+380500000002")
go_online "$FAR" "5a000000-0000-4000-8000-000000000502" 50.4555 "$PICKUP_LON" >/dev/null
ADMIN=$(admin_token)
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
RIDER=$(sign_in CLIENT "$RIDER_PHONE")

say "E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once"
ORDER=$(order)
OFFER=$(offer_of "$NEAR" "$ORDER"); expect 200
[[ -n "$OFFER" ]]
CURRENT=$(state_of "$NEAR")
[[ "$(jq -r .occupancy <<<"$CURRENT")" == OFFERED ]]
PAUSED=$(api POST "/api/driver/v1/work-sessions/$NEAR_SESSION/pause" "$NEAR" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .session_version <<<"$CURRENT")}")
expect 200
[[ "$(jq -r .intent <<<"$PAUSED")" == NOT_ACCEPTING ]]
[[ "$(jq -r .occupancy <<<"$PAUSED")" == FREE ]]
LATE=$(api POST "/api/driver/v1/offers/$OFFER/accept" "$NEAR" "{\"command_id\":\"$(uuid)\"}")
expect 409
[[ "$(jq -r .code <<<"$LATE")" == OFFER_REVOKED ]]
NEXT=$(offer_of "$FAR" "$ORDER"); expect 200
[[ -n "$NEXT" ]]
api POST "/api/driver/v1/offers/$NEXT/reject" "$FAR" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 204
HISTORY=$(api GET "/api/operator/v1/orders/$ORDER/events" "$OPERATOR"); expect 200
[[ "$(jq -c '[.dispatch.attempts[0].offers[] | {driver_id, result}]' <<<"$HISTORY")" == \
   "[{\"driver_id\":\"$NEAR_ID\",\"result\":\"REVOKED\"},{\"driver_id\":\"$FAR_ID\",\"result\":\"DECLINED\"}]" ]]
cancel_order "$ORDER"
note "E2: offer $OFFER revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next."

say "E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near"
go_offline "$FAR"
ACCEPT_WON=0; PAUSE_WON=0
for round in 1 2 3 4 5; do
    resume "$NEAR"
    # A heartbeat each round: the rounds take longer than the 15 s after which a silent driver is STALE.
    move "$NEAR" "$NEAR_SESSION" 50.4519 "$PICKUP_LON"; expect 200
    ORDER=$(order)
    OFFER=$(offer_of "$NEAR" "$ORDER"); expect 200
    [[ -n "$OFFER" ]]
    VERSION=$(state_of "$NEAR" | jq -r .session_version)
    # Two requests at once, each with its own output files; the api helper is not made for parallel calls.
    curl -sS -o /tmp/race-accept -w '%{http_code}' -X POST -H "Authorization: Bearer $NEAR" \
        -H 'Content-Type: application/json' -H "X-Correlation-Id: $(uuid)" \
        --data "{\"command_id\":\"$(uuid)\"}" "$BASE/api/driver/v1/offers/$OFFER/accept" >/tmp/race-accept-status &
    curl -sS -o /tmp/race-pause -w '%{http_code}' -X POST -H "Authorization: Bearer $NEAR" \
        -H 'Content-Type: application/json' -H "X-Correlation-Id: $(uuid)" \
        --data "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION}" \
        "$BASE/api/driver/v1/work-sessions/$NEAR_SESSION/pause" >/tmp/race-pause-status &
    wait
    ACCEPT_STATUS=$(cat /tmp/race-accept-status); PAUSE_STATUS=$(cat /tmp/race-pause-status)
    {
        printf '\nRound %s, at the same moment:\n\n`POST /api/driver/v1/offers/%s/accept` → **%s**\n' \
            "$round" "$OFFER" "$ACCEPT_STATUS"
        printf '\n```json\n%s\n```\n' "$(jq . /tmp/race-accept 2>/dev/null | head -20)"
        printf '\n`POST /api/driver/v1/work-sessions/%s/pause` → **%s**\n' "$NEAR_SESSION" "$PAUSE_STATUS"
        printf '\n```json\n%s\n```\n' "$(jq . /tmp/race-pause 2>/dev/null | head -30)"
    } >>"$TRANSCRIPT"
    if (( ACCEPT_STATUS >= 500 || PAUSE_STATUS >= 500 )); then
        note "**Round $round: a server error — scenario stopped.**"; exit 1
    fi
    [[ "$PAUSE_STATUS" == 200 ]]
    INTENT=$(jq -r .intent /tmp/race-pause)
    if [[ "$ACCEPT_STATUS" == 200 ]]; then
        [[ "$INTENT" == PAUSE_AFTER_CURRENT ]]
        [[ "$(jq -r .occupancy /tmp/race-pause)" == TO_PICKUP ]]
        ACCEPT_WON=$((ACCEPT_WON + 1))
        note "Round $round: the accept won; the pause waits for the end of the trip."
    else
        [[ "$ACCEPT_STATUS" == 409 && "$(jq -r .code /tmp/race-accept)" == OFFER_REVOKED ]]
        [[ "$INTENT" == NOT_ACCEPTING && "$(jq -r .occupancy /tmp/race-pause)" == FREE ]]
        PAUSE_WON=$((PAUSE_WON + 1))
        note "Round $round: the pause won; the accept got OFFER_REVOKED."
    fi
    ASSIGNED=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR" | jq -r '.assignment.driver_id // empty')
    if [[ "$ACCEPT_STATUS" == 200 ]]; then [[ "$ASSIGNED" == "$NEAR_ID" ]]; else [[ -z "$ASSIGNED" ]]; fi
    cancel_order "$ORDER"
done
note "E5: $ACCEPT_WON rounds won by the accept, $PAUSE_WON by the pause; one winner each round, no 5xx."

say "E4: a fix with 250 m accuracy keeps Near out of new orders; an accurate one brings him back"
resume "$NEAR"
INACCURATE=$(api POST "/api/driver/v1/work-sessions/$NEAR_SESSION/heartbeat" "$NEAR" \
    "{\"location\":$(location 50.4519 "$PICKUP_LON" | jq -c '.accuracy_m = 250')}")
expect 200
[[ "$(jq -r .eligible <<<"$INACCURATE")" == false ]]
[[ "$(jq -c .ineligible_reasons <<<"$INACCURATE")" == '["LOCATION_INACCURATE"]' ]]
ACCURATE=$(api POST "/api/driver/v1/work-sessions/$NEAR_SESSION/heartbeat" "$NEAR" \
    "{\"location\":$(location 50.4519 "$PICKUP_LON")}")
expect 200
[[ "$(jq -r .eligible <<<"$ACCURATE")" == true ]]

say "The support map shows when Near was last heard from"
BOARD=$(api GET "/api/operator/v1/drivers/live?city_id=$KYIV" "$OPERATOR"); expect 200
HEARD=$(jq -r --arg id "$NEAR_ID" '.drivers[] | select(.driver_id == $id) | .last_heartbeat_at' <<<"$BOARD")
[[ -n "$HEARD" && "$HEARD" != null ]]
note "Done: E2, E5 ($ACCEPT_WON/$PAUSE_WON), E4 and last_heartbeat_at $HEARD."
