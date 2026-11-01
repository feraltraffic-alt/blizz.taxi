#!/usr/bin/env bash
# REQ-PAY-18, E2 of #140: a rider's debt and its repayment by card. A cash ride is completed and paid; staff raise its
# final fare by 42.00 (a correction), so the rider owes it. The rider sees the obligation, pays part of it on the
# provider's page (FAKE in the sandbox), cannot open a second page while one is open, then pays the rest: nothing is
# owed any more, and the journal holds each repayment once. While the debt is open a new order is refused with
# RIDER_HAS_DEBT; once it is paid the rider orders again (ADR 0014, Q-10).
source "$(dirname "$0")/../lib.sh"

PICKUP_LAT=50.4501; PICKUP_LON=30.5234
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890
DRIVER_PHONE="+380500000001"; DRIVER_VEHICLE="5a000000-0000-4000-8000-000000000501"
RIDER_PHONE="+38066$(random_digits 7)"

DRIVER=""
cleanup() {
    set +e
    [[ -n "$DRIVER" ]] && go_offline "$DRIVER"
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

say "Ivan drives a rider who pays cash"
for phone in "+380500000001" "+380500000002" "+380500000003"; do take_offline "$(sign_in DRIVER "$phone")"; done
DRIVER=$(sign_in DRIVER "$DRIVER_PHONE")
SESSION=$(go_online "$DRIVER" "$DRIVER_VEHICLE" 50.4503 "$PICKUP_LON")
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" \
  | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"pickup_label\":\"Майдан\",
  \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}" \
  | jq -r .id)
expect 201
OFFER=""
for _ in $(seq 1 10); do
    OFFER=$(api GET /api/driver/v1/offers "$DRIVER" \
        | jq -r --arg o "$ORDER" '[.[] | select(.order_id == $o)][0].id // empty')
    [[ -n "$OFFER" ]] && break
    sleep 1
done
api POST "/api/driver/v1/offers/$OFFER/accept" "$DRIVER" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$DRIVER"); expect 200
move "$DRIVER" "$SESSION" 50.4503 "$PICKUP_LON" 2
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$DRIVER" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$DRIVER" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
move "$DRIVER" "$SESSION" "$DROPOFF_LAT" "$DROPOFF_LON" 3
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$DRIVER" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\",\"cash_received\":true}" >/dev/null
expect 200
go_offline "$DRIVER"; DRIVER=""

say "Staff raise the final fare by 42.00: the rider owes it"
ADMIN=$(admin_token)
FARE=""
for _ in $(seq 1 20); do
    FARE=$(api GET "/api/admin/v1/orders/$ORDER/fare" "$ADMIN")
    [[ "$(cat /tmp/sandbox-status)" == 200 ]] && break
    sleep 1
done
expect 200
AMOUNT=$(jq -r '.versions[0].amount_minor' <<<"$FARE")
BODY="{\"command_id\":\"$(uuid)\",\"expected_version\":1,\"amount_minor\":$((AMOUNT + 4200)),
  \"reason\":\"Sandbox: the waiting time was not counted\",\"password\":\"$ADMIN_PASSWORD\"}"
for _ in $(seq 1 20); do
    api POST "/api/admin/v1/orders/$ORDER/fare-corrections" "$ADMIN" "$BODY" >/dev/null
    [[ "$(cat /tmp/sandbox-status)" == 200 ]] && break
    sleep 1
done
expect 200

say "The rider sees what is owed on the order"
OWED=$(api GET /api/rider/v1/obligations "$RIDER" | jq --arg o "$ORDER" '[.items[] | select(.order_id == $o)][0]')
expect 200
[[ "$(jq -r .remainder_minor <<<"$OWED")" == 4200 ]] || { note "**Expected 4200 owed, got $OWED.**"; exit 1; }

# new_order — a new cash order of the rider from a fresh quote; prints the answer.
new_order() {
    local quote
    quote=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
      \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" \
      | jq -r .id)
    expect 201
    api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$quote\",
      \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"pickup_label\":\"Майдан\",
      \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}"
}

say "While the rider owes, a new order is refused at once (owner decision 01.11.2026, ADR 0014)"
REFUSED=$(new_order)
expect 403
[[ "$(jq -r .code <<<"$REFUSED")" == RIDER_HAS_DEBT ]] || { note "**Expected RIDER_HAS_DEBT, got $REFUSED.**"; exit 1; }

# pay PAGE — what the app's web view does: post the page's form to the provider (here the FAKE page).
pay() {
    local form=()
    while IFS= read -r field; do form+=(--data-urlencode "$field"); done \
        < <(jq -r '.fields | to_entries[] | "\(.key)=\(.value)"' <<<"$1")
    note "\`POST $(jq -r .url <<<"$1")\` (the provider's page) → **$(curl -sS -o /dev/null -w '%{http_code}' \
        -X POST "$(jq -r .url <<<"$1")" "${form[@]}")**"
}
# remainder — what the rider still owes on the order (empty when nothing).
remainder() {
    api GET /api/rider/v1/obligations "$RIDER" \
        | jq -r --arg o "$ORDER" '[.items[] | select(.order_id == $o)][0].remainder_minor // empty'
}
# wait_remainder VALUE — the repayment reaches the journal through the outbox a moment after the payment completes.
wait_remainder() {
    local left=""
    for _ in $(seq 1 20); do
        left=$(remainder)
        [[ "$left" == "$1" ]] && return 0
        sleep 1
    done
    note "**Expected ${1:-nothing} left, got ${left:-nothing}.**"; exit 1
}
wait_paid() {
    local state=""
    for _ in $(seq 1 20); do
        state=$(api GET "/api/rider/v1/payments/$1" "$RIDER" | jq -r .state)
        [[ "$state" == COMPLETED ]] && return 0
        sleep 1
    done
    note "**Payment $1 is $state, not COMPLETED.**"; exit 1
}

say "The rider pays 12.00 now; a second page while this one is open is refused"
PAGE=$(api POST "/api/rider/v1/obligations/$ORDER/payment-sessions" "$RIDER" \
    "{\"command_id\":\"$(uuid)\",\"amount_minor\":1200}")
expect 201
api POST "/api/rider/v1/obligations/$ORDER/payment-sessions" "$RIDER" "{\"command_id\":\"$(uuid)\"}" >/dev/null
expect 409
pay "$PAGE"
wait_paid "$(jq -r .id <<<"$PAGE")"
wait_remainder 3000

say "The rider pays the rest; nothing is owed any more"
PAGE=$(api POST "/api/rider/v1/obligations/$ORDER/payment-sessions" "$RIDER" "{\"command_id\":\"$(uuid)\"}")
expect 201
[[ "$(jq -r .amount_minor <<<"$PAGE")" == 3000 ]]
pay "$PAGE"
wait_paid "$(jq -r .id <<<"$PAGE")"
wait_remainder ""
api POST "/api/rider/v1/obligations/$ORDER/payment-sessions" "$RIDER" "{\"command_id\":\"$(uuid)\"}" >/dev/null
expect 404

say "Paid: the rider orders again"
AGAIN=$(new_order)
expect 201
AGAIN_ID=$(jq -r .id <<<"$AGAIN")
VERSION=$(api GET "/api/rider/v1/orders/$AGAIN_ID" "$RIDER" | jq -r .version)
api POST "/api/rider/v1/orders/$AGAIN_ID/cancel" "$RIDER" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reason_code\":\"CHANGED_MIND\"}" >/dev/null
expect 200
note "Done: order $ORDER owed 42.00, a new order was refused until it was repaid in two card payments."
