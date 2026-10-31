#!/usr/bin/env bash
# A fulfilled order's final fare corrected after the fact (issue #142, part B; REQ-ADM-03, REQ-PRC-10): a cash ride is
# completed and paid; staff lower the fare with a reason and their password. Version 2 links to version 1, the rider is
# owed the difference back (a refund obligation waiting for the refund flow), the order's history says so, a repeat
# changes nothing, a wrong password and a stale version are refused.
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

say "Staff see version 1, then lower it by 15.00 with a reason and their password"
ADMIN=$(admin_token)
FARE=""
for _ in $(seq 1 20); do
    FARE=$(api GET "/api/admin/v1/orders/$ORDER/fare" "$ADMIN")
    [[ "$(cat /tmp/sandbox-status)" == 200 ]] && break
    sleep 1
done
expect 200
AMOUNT=$(jq -r '.versions[0].amount_minor' <<<"$FARE")
[[ "$(jq -r .current_version <<<"$FARE")" == 1 && "$(jq -r .refund_state <<<"$FARE")" == NONE ]]
api POST "/api/admin/v1/orders/$ORDER/fare-corrections" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":1,
  \"amount_minor\":$((AMOUNT - 1500)),\"reason\":\"Sandbox: detour\",\"password\":\"wrong-password\"}" >/dev/null
expect 403
COMMAND=$(uuid)
BODY="{\"command_id\":\"$COMMAND\",\"expected_version\":1,\"amount_minor\":$((AMOUNT - 1500)),
  \"reason\":\"Sandbox: detour\",\"password\":\"$ADMIN_PASSWORD\"}"
# The fare may still be on its way to the journal: 409 until it is.
for _ in $(seq 1 20); do
    CORRECTED=$(api POST "/api/admin/v1/orders/$ORDER/fare-corrections" "$ADMIN" "$BODY")
    [[ "$(cat /tmp/sandbox-status)" == 200 ]] && break
    sleep 1
done
expect 200
[[ "$(jq -r .current_version <<<"$CORRECTED")" == 2 ]]
[[ "$(jq -r '.versions[1].corrects_id' <<<"$CORRECTED")" == "$(jq -r '.versions[0].id' <<<"$CORRECTED")" ]]
[[ "$(jq -r .refund_obligation_minor <<<"$CORRECTED")" == 1500 ]]
[[ "$(jq -r .refund_state <<<"$CORRECTED")" == WAITING_FOR_REFUND_FLOW ]]

say "A repeat changes nothing; a stale version is refused; the history shows the correction"
AGAIN=$(api POST "/api/admin/v1/orders/$ORDER/fare-corrections" "$ADMIN" "$BODY"); expect 200
[[ "$(jq -c . <<<"$AGAIN")" == "$(jq -c . <<<"$CORRECTED")" ]]
STALE=$(api POST "/api/admin/v1/orders/$ORDER/fare-corrections" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":1,\"amount_minor\":$AMOUNT,\"reason\":\"Sandbox: stale\",\"password\":\"$ADMIN_PASSWORD\"}")
expect 409
[[ "$(jq -r .code <<<"$STALE")" == VERSION_CONFLICT && "$(jq -r .current_version <<<"$STALE")" == 2 ]]
TIMELINE=$(api GET "/api/admin/v1/orders/$ORDER/timeline" "$ADMIN"); expect 200
jq -e '.events | any(.type == "FareCorrected" and .details.refund_state == "WAITING_FOR_REFUND_FLOW")' \
    <<<"$TIMELINE" >/dev/null
note "Done: order $ORDER corrected from $AMOUNT to $((AMOUNT - 1500)); 1500 owed back, waiting for the refund flow."
