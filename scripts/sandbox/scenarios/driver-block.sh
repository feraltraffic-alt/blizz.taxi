#!/usr/bin/env bash
# A driver blocked on a trip (issue #141, REQ-DS-01, E3). Andrii takes an order and starts the trip; staff block his
# account. He still reads his trip and balance, completes the trip (the fare is posted) and writes to support; a
# profile change, resuming the shift and the reads of new work (ALL tab, offers) answer 403 ACCOUNT_BLOCKED.
source "$(dirname "$0")/../lib.sh"

ANDRII_ID="5a000000-0000-4000-8000-000000000403"
PICKUP_LAT=50.4501; PICKUP_LON=30.5234
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890
RIDER_PHONE="+38068$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"

NEXT=""; ORDER=""
# Whatever happens: Andrii's trip ended, Andrii unblocked and offline, the orders cancelled.
cleanup() {
    set +e
    if [[ -n "${ANDRII:-}" ]]; then
        local trip
        trip=$(api GET /api/driver/v1/trips/current "$ANDRII")
        if [[ "$(cat /tmp/sandbox-status)" == 200 && "$(jq -r .phase <<<"$trip")" == IN_PROGRESS ]]; then
            api POST "/api/driver/v1/trips/$(jq -r .id <<<"$trip")/complete" "$ANDRII" "{\"command_id\":\"$(uuid)\",
              \"expected_version\":$(jq -r .version <<<"$trip"),\"reported_at\":\"$(now_utc)\",\"cash_received\":true}" \
              >/dev/null
        fi
    fi
    if [[ -n "${ADMIN:-}" ]]; then
        local profile
        profile=$(api GET "/api/admin/v1/drivers/$ANDRII_ID" "$ADMIN" | jq -c .profile)
        if [[ "$(jq -r .account_state <<<"$profile")" == BLOCKED ]]; then
            api POST "/api/admin/v1/drivers/$ANDRII_ID/unblock" "$ADMIN" "{\"command_id\":\"$(uuid)\",
              \"expected_version\":$(jq -r .version <<<"$profile"),\"reason\":\"Sandbox scenario over\"}" >/dev/null
        fi
    fi
    for order in "$ORDER" "$NEXT"; do
        [[ -n "$order" && -n "${OPERATOR:-}" ]] || continue
        local view
        view=$(api GET "/api/operator/v1/orders/$order" "$OPERATOR")
        if [[ "$(jq -r .status <<<"$view")" == SEARCHING || "$(jq -r .status <<<"$view")" == ASSIGNED ]]; then
            api POST "/api/operator/v1/orders/$order/cancel" "$OPERATOR" \
                "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$view"),\"reason_code\":\"NO_CARS\"}" \
                >/dev/null
        fi
    done
    [[ -n "${ANDRII:-}" ]] && go_offline "$ANDRII"
}
trap cleanup EXIT

order() {
    local quote
    quote=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
      \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" \
      | jq -r .id)
    expect 201
    api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$quote\",
      \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"pickup_label\":\"Майдан\",
      \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}" \
      | jq -r .id
    expect 201
}

say "Only Andrii is online; he takes an order and starts the trip"
for phone in "+380500000001" "+380500000002"; do go_offline "$(sign_in DRIVER "$phone")"; done
ADMIN=$(admin_token)
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
ANDRII=$(sign_in DRIVER "+380500000003")
SESSION=$(go_online "$ANDRII" 5a000000-0000-4000-8000-000000000503 50.4528 "$PICKUP_LON")
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
ORDER=$(order)
OFFER=$(api GET /api/driver/v1/offers "$ANDRII" | jq -r --arg o "$ORDER" '[.[] | select(.order_id == $o)][0].id')
[[ -n "$OFFER" && "$OFFER" != null ]]
api POST "/api/driver/v1/offers/$OFFER/accept" "$ANDRII" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$ANDRII" | jq -r .id)
move "$ANDRII" "$SESSION" 50.4503 "$PICKUP_LON"
VERSION=$(api GET /api/driver/v1/trips/current "$ANDRII" | jq -r .version)
VERSION=$(api POST "/api/driver/v1/trips/$TRIP/arrive" "$ANDRII" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION}" | jq -r .version)
expect 200
VERSION=$(api POST "/api/driver/v1/trips/$TRIP/start" "$ANDRII" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION}" | jq -r .version)
expect 200

say "Staff block his account during the trip"
PROFILE=$(api GET "/api/admin/v1/drivers/$ANDRII_ID" "$ADMIN" | jq -c .profile)
BLOCKED=$(api POST "/api/admin/v1/drivers/$ANDRII_ID/block" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$PROFILE"),\"reason\":\"Complaint under review\"}")
expect 200
[[ "$(jq -r .account_state <<<"$BLOCKED")" == BLOCKED ]]
STATE=$(api GET /api/driver/v1/work-sessions/current "$ANDRII"); expect 200
[[ "$(jq -r .intent <<<"$STATE")" == PAUSE_AFTER_CURRENT && "$(jq -r .occupancy <<<"$STATE")" == ON_TRIP ]]

say "He still reads his trip and balance; new work is refused with 403 ACCOUNT_BLOCKED"
api GET /api/driver/v1/trips/current "$ANDRII" >/dev/null; expect 200
api GET /api/driver/v1/balance "$ANDRII" >/dev/null; expect 200
REFUSED=$(api PATCH /api/driver/v1/profile "$ANDRII" "{\"command_id\":\"$(uuid)\",\"name\":\"Андрій\"}")
expect 403
[[ "$(jq -r .code <<<"$REFUSED")" == ACCOUNT_BLOCKED ]]
REFUSED=$(api GET /api/driver/v1/broadcast-orders "$ANDRII"); expect 403
[[ "$(jq -r .code <<<"$REFUSED")" == ACCOUNT_BLOCKED ]]

say "He completes the trip and writes to support"
move "$ANDRII" "$SESSION" "$DROPOFF_LAT" "$DROPOFF_LON"
api POST "/api/driver/v1/trips/$TRIP/complete" "$ANDRII" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"reported_at\":\"$(now_utc)\",\"cash_received\":true}" >/dev/null
expect 200
api POST /api/driver/v1/support/cases "$ANDRII" "{\"command_id\":\"$(uuid)\",\"category\":\"OTHER\",
  \"subject\":\"Why is my account blocked?\",\"message\":\"Please explain.\"}" >/dev/null
expect 201
sleep 3 # the ledger posts the fare from the TripCompleted event
TRIPS=$(api GET /api/driver/v1/trips "$ANDRII"); expect 200

say "After the trip: not accepting, resuming is refused, the next order is not offered to him"
STATE=$(api GET /api/driver/v1/work-sessions/current "$ANDRII"); expect 200
[[ "$(jq -r .intent <<<"$STATE")" == NOT_ACCEPTING ]]
REFUSED=$(api POST "/api/driver/v1/work-sessions/$SESSION/resume" "$ANDRII" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .session_version <<<"$STATE")}")
expect 403
[[ "$(jq -r .code <<<"$REFUSED")" == ACCOUNT_BLOCKED ]]
move "$ANDRII" "$SESSION" 50.4528 "$PICKUP_LON"
NEXT=$(order)
api GET /api/driver/v1/offers "$ANDRII" >/dev/null; expect 403
[[ "$(api GET "/api/operator/v1/orders/$NEXT" "$OPERATOR" | jq -r '.assignment.driver_id // empty')" != "$ANDRII_ID" ]]
note "Done: blocked on trip $TRIP, Andrii completed it and reached support; new work answered ACCOUNT_BLOCKED."
