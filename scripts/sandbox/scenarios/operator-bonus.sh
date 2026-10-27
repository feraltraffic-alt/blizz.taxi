#!/usr/bin/env bash
# ADR 0011: operator creates two phone orders; one completes, one is cancelled as OPERATOR_ERROR.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4501,"lon":30.5234}'
DROPOFF='{"lat":50.4016,"lon":30.6522}'
DRIVER_PHONE="+380500000001"; DRIVER_VEHICLE="5a000000-0000-4000-8000-000000000501"

ADMIN=$(admin_token)
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
DRIVER=$(sign_in DRIVER "$DRIVER_PHONE")
SESSION=$(go_online "$DRIVER" "$DRIVER_VEHICLE" 50.4510 30.5234)

say "Admin sets operator bonus m=2, g=3"
CURRENT=$(api GET /api/admin/v1/settings/operator-bonuses "$ADMIN"); expect 200
VERSION=$(jq -r .version <<<"$CURRENT")
api POST /api/admin/v1/settings/operator-bonuses "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"settings\":{\"m\":2,\"g\":3,\"count_cancellations\":true,\"reset_day\":28,\"time_rules\":[]},
  \"reason\":\"Sandbox operator bonus scenario\"}" >/dev/null
expect 200

phone_order() {
  local quote
  quote=$(api POST /api/operator/v1/quotes "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
    \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id); expect 201
  api POST /api/operator/v1/orders "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$quote\",
    \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Bonus pickup\",
    \"dropoff\":$DROPOFF,\"dropoff_label\":\"Bonus dropoff\",\"payment_method\":\"CASH\",
    \"caller\":{\"name\":\"Bonus rider\",\"phone\":\"+38067111$(printf '%04d' $RANDOM)\"}}" | jq -r .id
  expect 201
}

# Other scenarios use the same operator: compare with the balance before.
BEFORE=$(api GET /api/operator/v1/me/bonus "$OPERATOR"); expect 200

say "First phone order is fulfilled"
FIRST=$(phone_order)
OFFER=$(api GET /api/driver/v1/offers "$DRIVER" | jq -r '.[0].id')
api POST "/api/driver/v1/offers/$OFFER/accept" "$DRIVER" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$DRIVER")
move "$DRIVER" "$SESSION" 50.4502 30.5234 2
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}"); expect 200
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}"); expect 200
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$DRIVER" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\",\"cash_received\":true}" >/dev/null
expect 200

say "Second phone order is cancelled for operator error"
SECOND=$(phone_order)
ORDER=$(api GET "/api/operator/v1/orders/$SECOND" "$OPERATOR"); expect 200
api POST "/api/operator/v1/orders/$SECOND/cancel" "$OPERATOR" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$ORDER"),\"reason_code\":\"OPERATOR_ERROR\"}" >/dev/null
expect 200

say "Operator reads own bonus account"
sleep 2
BONUS=$(api GET /api/operator/v1/me/bonus "$OPERATOR"); expect 200
(( $(jq -r .balance <<<"$BONUS") - $(jq -r .balance <<<"$BEFORE") == -1 ))      # +2 −3
(( $(jq -r .fulfilled_count <<<"$BONUS") - $(jq -r .fulfilled_count <<<"$BEFORE") == 1 ))
(( $(jq -r .cancelled_count <<<"$BONUS") - $(jq -r .cancelled_count <<<"$BEFORE") == 1 ))
# The next scenario starts without this driver online.
CURRENT=$(api GET /api/driver/v1/work-sessions/current "$DRIVER")
api POST "/api/driver/v1/work-sessions/$(jq -r .session_id <<<"$CURRENT")/close" "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .session_version <<<"$CURRENT")}" >/dev/null
expect 200
note "Done: operator bonus for fulfilled $FIRST and operator-fault cancellation $SECOND."
