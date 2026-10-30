#!/usr/bin/env bash
# A driver replaced before the push leaves (issue #143, E3; REQ-NTF-03, AC-19). Andrii accepts; within the sandbox's
# 3 s push delay the operator takes him off and Oleh takes the order. The notification table shows Andrii's "driver
# assigned" SUPERSEDED (never sent) and Oleh's SENT; the rider's phone got one push, about Oleh, and the rider's order
# shows Oleh's car and why the driver changed.
source "$(dirname "$0")/../lib.sh"

ANDRII_ID="5a000000-0000-4000-8000-000000000403"; OLEH_ID="5a000000-0000-4000-8000-000000000402"
PICKUP_LAT=50.4501; PICKUP_LON=30.5234
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890
RIDER_PHONE="+38068$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"

ORDER=""
# Whatever happens: the order cancelled, both drivers offline.
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
    [[ -n "${OLEH:-}" ]] && go_offline "$OLEH"
}
trap cleanup EXIT

# take_offline TOKEN — ends the driver's shift even when another phone of the driver holds it (a scenario before this
# one may have left the driver online there): this phone takes it over first.
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

say "Andrii (200 m) and Oleh (600 m) are online; a rider with the app orders"
take_offline "$(sign_in DRIVER "+380500000001")"
ADMIN=$(admin_token)
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
ANDRII=$(sign_in DRIVER "+380500000003")
go_online "$ANDRII" 5a000000-0000-4000-8000-000000000503 50.4519 "$PICKUP_LON" >/dev/null
OLEH=$(sign_in DRIVER "+380500000002")
go_online "$OLEH" 5a000000-0000-4000-8000-000000000502 50.4555 "$PICKUP_LON" >/dev/null
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
api POST /api/rider/v1/push-devices "$RIDER" \
    "{\"command_id\":\"$(uuid)\",\"platform\":\"ANDROID\",\"token\":\"sandbox-rider-$(uuid)\"}" >/dev/null
expect 201
SINCE=$(date -u +%Y-%m-%dT%H:%M:%S.%3NZ)
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"pickup_label\":\"Майдан\",
  \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}" \
  | jq -r .id)
expect 201

say "Andrii accepts; at once the operator takes him off and Oleh takes the order"
OFFER=$(api GET /api/driver/v1/offers "$ANDRII" | jq -r --arg o "$ORDER" '[.[] | select(.order_id == $o)][0].id')
[[ -n "$OFFER" && "$OFFER" != null ]]
FIRST=$(api POST "/api/driver/v1/offers/$OFFER/accept" "$ANDRII" "{\"command_id\":\"$(uuid)\"}" | jq -r .id)
expect 200
VERSION=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR" | jq -r .version)
api POST "/api/operator/v1/orders/$ORDER/revoke-assignment" "$OPERATOR" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reason\":\"Driver does not answer\"}" >/dev/null
expect 200
OFFER=$(api GET /api/driver/v1/offers "$OLEH" | jq -r --arg o "$ORDER" '[.[] | select(.order_id == $o)][0].id')
[[ -n "$OFFER" && "$OFFER" != null ]]
SECOND=$(api POST "/api/driver/v1/offers/$OFFER/accept" "$OLEH" "{\"command_id\":\"$(uuid)\"}" | jq -r .id)
expect 200

say "After the push delay: Andrii's \"driver assigned\" is SUPERSEDED, Oleh's is SENT"
sleep 6
ROWS=$(api GET "/sandbox/v1/notifications?order_id=$ORDER"); expect 200
[[ "$(jq -r --arg a "$FIRST" '.[] | select(.template == "rider.driver-assigned" and .data.assignment_id == $a)
    | .state' <<<"$ROWS")" == SUPERSEDED ]]
[[ "$(jq -r --arg a "$SECOND" '.[] | select(.template == "rider.driver-assigned" and .data.assignment_id == $a)
    | .state' <<<"$ROWS")" == SENT ]]
PUSHES=$(api GET "/sandbox/v1/pushes?phone=$(jq -rn --arg p "$RIDER_PHONE" '$p|@uri')&after=$SINCE"); expect 200
[[ "$(jq '[.[] | select(.data.type == "rider.driver-assigned")] | length' <<<"$PUSHES")" == 1 ]]
[[ "$(jq -r '[.[] | select(.data.type == "rider.driver-assigned")][0].data.assignment_id' <<<"$PUSHES")" == "$SECOND" ]]

say "The rider's order shows Oleh's car and why the driver changed"
VIEW=$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER"); expect 200
[[ "$(jq -r .assignment.driver_id <<<"$VIEW")" == "$OLEH_ID" ]]
[[ "$(jq -r .driver.registration_number <<<"$VIEW")" == AA0002TX ]]
[[ "$(jq -r .driver_change.reason_code <<<"$VIEW")" == SERVICE_REASSIGNED ]]
note "Done: assignment $FIRST of $ANDRII_ID never announced (SUPERSEDED); the rider heard only about $SECOND."
