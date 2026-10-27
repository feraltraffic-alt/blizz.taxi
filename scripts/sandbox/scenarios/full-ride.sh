#!/usr/bin/env bash
# A whole ride in Kyiv: the rider gets a price and orders, the nearest driver accepts, arrives, starts and
# completes; then the rider's history, the driver's balance and the order history as the operator sees it.
source "$(dirname "$0")/../lib.sh"

# wait_push PHONE TYPE AFTER — waits up to 10 s for a push of TYPE sent to PHONE after AFTER (UTC); the push
# worker runs on a timer, so a push comes a second or two after its event. Stops the scenario when none comes.
wait_push() {
    local path tries
    path="/sandbox/v1/pushes?phone=$(jq -rn --arg p "$1" '$p|@uri')&after=$3"
    for tries in $(seq 10); do
        if api GET "$path" | jq -e --arg t "$2" 'any(.[]; .data.type == $t)' >/dev/null; then
            return
        fi
        sleep 1
    done
    note "**No $2 push for $1 — scenario stopped.**"
    exit 1
}

PICKUP_LAT=50.4501; PICKUP_LON=30.5234     # Майдан Незалежності
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890   # Залізничний вокзал
DRIVER_PHONE="+380500000001"; DRIVER_VEHICLE="5a000000-0000-4000-8000-000000000501"
RIDER_PHONE="+38067$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"

say "Start-up data for the apps"
api GET /api/config/v1/bootstrap >/dev/null; expect 200

say "Driver signs in and goes online 200 m from the pickup"
DRIVER=$(sign_in DRIVER "$DRIVER_PHONE")
SESSION=$(go_online "$DRIVER" "$DRIVER_VEHICLE" 50.4520 "$PICKUP_LON")

say "Rider signs in, sees the classes and gets a price"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
api GET "/api/rider/v1/vehicle-classes?lat=$PICKUP_LAT&lon=$PICKUP_LON" "$RIDER" >/dev/null; expect 200
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" | jq -r .id)
expect 201

say "Both phones register for pushes (the sandbox only records them: /sandbox/v1/pushes)"
api POST /api/driver/v1/push-devices "$DRIVER" \
    "{\"command_id\":\"$(uuid)\",\"platform\":\"ANDROID\",\"token\":\"sandbox-driver-$(uuid)\"}" >/dev/null
expect 201
api POST /api/rider/v1/push-devices "$RIDER" \
    "{\"command_id\":\"$(uuid)\",\"platform\":\"ANDROID\",\"token\":\"sandbox-rider-$(uuid)\"}" >/dev/null
expect 201
# Pushes of earlier scenarios to the same test driver do not count.
SINCE=$(date -u +%Y-%m-%dT%H:%M:%S.%3NZ)

say "Rider orders (cash)"
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},
  \"pickup_label\":\"Майдан Незалежності\",\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},
  \"dropoff_label\":\"Залізничний вокзал\",\"payment_method\":\"CASH\"}" | jq -r .id)
expect 201

say "The driver gets the offer and accepts it"
OFFER=$(api GET /api/driver/v1/offers "$DRIVER" | jq -r '.[0].id')
api POST "/api/driver/v1/offers/$OFFER/accept" "$DRIVER" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200

say "The pushes the server sent: the offer to the driver, \"driver assigned\" to the rider"
wait_push "$DRIVER_PHONE" driver.offer "$SINCE"
wait_push "$RIDER_PHONE" rider.driver-assigned "$SINCE"

say "Rider and driver write in the order chat"
api POST "/api/rider/v1/orders/$ORDER/messages" "$RIDER" \
    "{\"command_id\":\"$(uuid)\",\"body\":\"Я біля входу в метро\"}" >/dev/null
TRIP=$(api GET /api/driver/v1/trips/current "$DRIVER" | jq -r .id)
api POST "/api/driver/v1/trips/$TRIP/messages" "$DRIVER" \
    "{\"command_id\":\"$(uuid)\",\"body\":\"Буду за 3 хвилини\"}" >/dev/null

say "\"Call\" from the order card on both sides (settings: call mode)"
api GET "/api/rider/v1/orders/$ORDER/call" "$RIDER" >/dev/null; expect 200
api GET "/api/driver/v1/trips/$TRIP/call" "$DRIVER" >/dev/null; expect 200

say "The driver arrives, picks up and drives"
move "$DRIVER" "$SESSION" 50.4503 "$PICKUP_LON" 2
VERSION=$(api GET /api/driver/v1/trips/current "$DRIVER" | jq -r .version)
VERSION=$(api POST "/api/driver/v1/trips/$TRIP/arrive" "$DRIVER" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION}" | jq -r .version)
expect 200
VERSION=$(api POST "/api/driver/v1/trips/$TRIP/start" "$DRIVER" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION}" | jq -r .version)
expect 200
move "$DRIVER" "$SESSION" "$DROPOFF_LAT" "$DROPOFF_LON" 3

say "The driver completes; cash received"
api POST "/api/driver/v1/trips/$TRIP/complete" "$DRIVER" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"reported_at\":\"$(now_utc)\",\"cash_received\":true}" >/dev/null
expect 200

say "What each side sees afterwards"
api GET "/api/rider/v1/orders/$ORDER" "$RIDER" >/dev/null; expect 200
api GET /api/rider/v1/orders "$RIDER" >/dev/null; expect 200
api GET /api/driver/v1/trips "$DRIVER" >/dev/null; expect 200
sleep 3 # the ledger posts the fare from the TripCompleted event
api GET /api/driver/v1/balance "$DRIVER" >/dev/null; expect 200
admin_token >/dev/null
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
api GET "/api/operator/v1/orders/$ORDER/events" "$OPERATOR" >/dev/null; expect 200
note "Done: order $ORDER."
