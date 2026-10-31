#!/usr/bin/env bash
# A trip's facts corrected after the start (issue #142, part C1; REQ-CAN-07): a cash ride is completed; staff record
# the right completion time with a reason. The trip's own time stays, the correction stands beside it, the trip is
# marked for review, the history says so; a stale version and a time in the future are refused; staff close the
# review.
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

say "Staff record the right completion time beside the driver's"
ADMIN=$(admin_token)
FACTS=$(api GET "/api/admin/v1/orders/$ORDER/trip-facts" "$ADMIN"); expect 200
COMPLETED=$(jq -r .completed_at <<<"$FACTS"); STARTED=$(jq -r .started_at <<<"$FACTS")
[[ "$COMPLETED" != null && "$(jq '.corrections | length' <<<"$FACTS")" == 0 ]]
# A second earlier, unless that is not after the start (a ride of the sandbox takes seconds).
RIGHT=$(date -u -d "@$(( $(date -u -d "$COMPLETED" +%s) - 1 ))" +%Y-%m-%dT%H:%M:%SZ)
if [[ "$(date -u -d "$RIGHT" +%s%3N)" -le "$(date -u -d "$STARTED" +%s%3N)" ]]; then RIGHT="$COMPLETED"; fi
api POST "/api/admin/v1/orders/$ORDER/trip-corrections" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$FACTS"),\"completed_at\":\"$(date -u -d '+1 hour' +%Y-%m-%dT%H:%M:%SZ)\",
  \"reason\":\"Sandbox: future\"}" >/dev/null
expect 400
STALE=$(api POST "/api/admin/v1/orders/$ORDER/trip-corrections" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(( $(jq -r .version <<<"$FACTS") + 7 )),\"completed_at\":\"$RIGHT\",
  \"reason\":\"Sandbox: stale\"}")
expect 409
[[ "$(jq -r .code <<<"$STALE")" == VERSION_CONFLICT ]]
CORRECTED=$(api POST "/api/admin/v1/orders/$ORDER/trip-corrections" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$FACTS"),\"completed_at\":\"$RIGHT\",
  \"reason\":\"Sandbox: the driver pressed complete late\"}")
expect 200
[[ "$(jq -r .completed_at <<<"$CORRECTED")" == "$COMPLETED" ]]
[[ "$(jq -r .corrected_completed_at <<<"$CORRECTED")" != null && "$(jq -r .needs_review <<<"$CORRECTED")" == true ]]
[[ "$(jq -r .capture_held <<<"$CORRECTED")" == false ]]

say "The history shows the correction; staff close the review"
TIMELINE=$(api GET "/api/admin/v1/orders/$ORDER/timeline" "$ADMIN"); expect 200
jq -e '.events | any(.type == "TripFactsCorrected")' <<<"$TIMELINE" >/dev/null
REVIEWED=$(api POST "/api/admin/v1/orders/$ORDER/trip-corrections/review" "$ADMIN" \
    "{\"command_id\":\"$(uuid)\",\"reason\":\"Sandbox: checked the track\"}")
expect 200
[[ "$(jq -r '.corrections[0].reviewed_by' <<<"$REVIEWED")" != null ]]
note "Done: order $ORDER's completion corrected from $COMPLETED to $RIGHT and reviewed."
