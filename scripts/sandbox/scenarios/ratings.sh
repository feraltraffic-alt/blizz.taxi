#!/usr/bin/env bash
# REQ-RID-08: complete a ride, rate it from both sides, read the driver's average and let staff see comments.
source "$(dirname "$0")/../lib.sh"

PICKUP_LAT=50.4501; PICKUP_LON=30.5234
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890
DRIVER_PHONE="+380500000001"; DRIVER_VEHICLE="5a000000-0000-4000-8000-000000000501"
RIDER_PHONE="+38067$(random_digits 7)"

say "Driver and rider sign in"
DRIVER=$(sign_in DRIVER "$DRIVER_PHONE")
# Online next to the pickup: a 190 m hop within a second is flagged as a JUMP and not used for arrive.
SESSION=$(go_online "$DRIVER" "$DRIVER_VEHICLE" 50.4503 "$PICKUP_LON")
RIDER=$(sign_in CLIENT "$RIDER_PHONE")

say "Rider creates a cash order"
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},
  \"pickup_label\":\"Ratings pickup\",\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},
  \"dropoff_label\":\"Ratings dropoff\",\"payment_method\":\"CASH\"}" | jq -r .id)
expect 201

say "Driver accepts and completes the ride"
OFFER=$(api GET /api/driver/v1/offers "$DRIVER" | jq -r '.[0].id')
api POST "/api/driver/v1/offers/$OFFER/accept" "$DRIVER" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$DRIVER" | jq -r .id)
move "$DRIVER" "$SESSION" 50.4503 "$PICKUP_LON" 2
VERSION=$(api GET /api/driver/v1/trips/current "$DRIVER" | jq -r .version)
VERSION=$(api POST "/api/driver/v1/trips/$TRIP/arrive" "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION}" | jq -r .version); expect 200
VERSION=$(api POST "/api/driver/v1/trips/$TRIP/start" "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION}" | jq -r .version); expect 200
move "$DRIVER" "$SESSION" "$DROPOFF_LAT" "$DROPOFF_LON" 3
api POST "/api/driver/v1/trips/$TRIP/complete" "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reported_at\":\"$(now_utc)\",\"cash_received\":true}" >/dev/null
expect 200

say "Both sides rate the fulfilled ride"
api POST "/api/rider/v1/orders/$ORDER/rating" "$RIDER" \
  "{\"command_id\":\"$(uuid)\",\"score\":5,\"comment\":\"Clean car and a smooth ride\"}" >/dev/null; expect 200
api POST "/api/driver/v1/orders/$ORDER/rating" "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"score\":4,\"comment\":\"Passenger was ready at pickup\"}" >/dev/null; expect 200

say "Driver sees only aggregate score"
SUMMARY=$(api GET /api/driver/v1/me/rating "$DRIVER"); expect 200
test "$(echo "$SUMMARY" | jq -r .count)" -ge 1
test "$(echo "$SUMMARY" | jq -r 'has("comment")')" = false

say "Operator sees both staff-only comments"
admin_token >/dev/null
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
STAFF=$(api GET "/api/operator/v1/orders/$ORDER/ratings" "$OPERATOR"); expect 200
test "$(echo "$STAFF" | jq '.ratings | length')" -eq 2
echo "$STAFF" | jq -e '.ratings | any(.comment == "Clean car and a smooth ride")' >/dev/null
echo "$STAFF" | jq -e '.ratings | any(.comment == "Passenger was ready at pickup")' >/dev/null

note "Done: ratings for order $ORDER."
