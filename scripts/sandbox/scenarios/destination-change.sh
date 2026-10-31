#!/usr/bin/env bash
# The rider changes their mind mid-trip (issue #142, part C2; REQ-RID-06): support moves the destination of the trip
# in progress with a reason. The new price is a new quote on the order's own tariff; the driver sees the new
# destination, the fare at completion is the new price, a repeat changes nothing and a stale version is refused.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4501,"lon":30.5234}'    # Майдан
DROPOFF='{"lat":50.4405,"lon":30.4890}'   # Вокзал
NEW_DROPOFF='{"lat":50.4017,"lon":30.4512}' # Деміївка, further out
RIDER_PHONE="+38066$(random_digits 7)"

IVAN=""
cleanup() {
    set +e
    [[ -n "$IVAN" ]] && go_offline "$IVAN"
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

say "A cash ride to the station starts with Ivan"
for phone in "+380500000001" "+380500000002" "+380500000003"; do take_offline "$(sign_in DRIVER "$phone")"; done
IVAN=$(sign_in DRIVER "+380500000001")
SESSION=$(go_online "$IVAN" 5a000000-0000-4000-8000-000000000501 50.4503 30.5234)
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}" | jq -r .id)
expect 201
OFFER=""
for _ in $(seq 1 10); do
    OFFER=$(api GET /api/driver/v1/offers "$IVAN" \
        | jq -r --arg o "$ORDER" '[.[] | select(.order_id == $o)][0].id // empty')
    [[ -n "$OFFER" ]] && break
    sleep 1
done
api POST "/api/driver/v1/offers/$OFFER/accept" "$IVAN" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$IVAN"); expect 200
move "$IVAN" "$SESSION" 50.4503 30.5234 2
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$IVAN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$IVAN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200

say "The rider calls: not the station, Деміївка. Support changes the destination with a reason"
admin_token >/dev/null
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
BEFORE=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR"); expect 200
VERSION=$(jq -r .version <<<"$BEFORE")
BODY="{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"dropoff\":$NEW_DROPOFF,
  \"dropoff_label\":\"Деміївка\",\"reason\":\"Sandbox: the rider called, going further\"}"
CHANGED=$(api POST "/api/operator/v1/orders/$ORDER/destination" "$OPERATOR" "$BODY"); expect 200
PRICE=$(jq -r .price_minor <<<"$CHANGED")
[[ "$(jq -r .previous_price_minor <<<"$CHANGED")" == "$(jq -r .price_minor <<<"$BEFORE")" ]]
(( PRICE > $(jq -r .previous_price_minor <<<"$CHANGED") ))
[[ "$(jq -r .above_hold <<<"$CHANGED")" == false && "$(jq -r .hold_minor <<<"$CHANGED")" == null ]]
[[ "$(jq -r .order.dropoff_label <<<"$CHANGED")" == "Деміївка" ]]

say "A repeat changes nothing; a stale version is refused; Ivan sees the new destination"
AGAIN=$(api POST "/api/operator/v1/orders/$ORDER/destination" "$OPERATOR" "$BODY"); expect 200
[[ "$(jq -c . <<<"$AGAIN")" == "$(jq -c . <<<"$CHANGED")" ]]
STALE=$(api POST "/api/operator/v1/orders/$ORDER/destination" "$OPERATOR" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$VERSION,\"dropoff\":$DROPOFF,\"dropoff_label\":\"Вокзал\",\"reason\":\"Sandbox: stale\"}")
expect 409
[[ "$(jq -r .code <<<"$STALE")" == VERSION_CONFLICT ]]
[[ "$(jq -r .current_version <<<"$STALE")" == "$(jq -r .order.version <<<"$CHANGED")" ]]
TRIP=$(api GET /api/driver/v1/trips/current "$IVAN"); expect 200
[[ "$(jq -r .dropoff_label <<<"$TRIP")" == "Деміївка" ]]
EVENTS=$(api GET "/api/operator/v1/orders/$ORDER/events" "$OPERATOR"); expect 200
jq -e '.. | objects | select(.type? == "DestinationChanged") | .reason' <<<"$EVENTS" >/dev/null

say "Ivan drives to Деміївка and completes; the fare is the new price"
move "$IVAN" "$SESSION" 50.4017 30.4512 3
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$IVAN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\",\"cash_received\":true}" >/dev/null
expect 200
go_offline "$IVAN"; IVAN=""
DONE=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR"); expect 200
[[ "$(jq -r .status <<<"$DONE")" == FULFILLED ]]
(( $(jq -r .final_price_minor <<<"$DONE") >= PRICE ))
note "Done: order $ORDER moved from the station to Деміївка; price $(jq -r .previous_price_minor <<<"$CHANGED") → $PRICE."
