#!/usr/bin/env bash
# Bots on the ALL tab (issue #102, threat model B1-B3). In Warsaw, nobody is near when the rider orders, so the order
# goes to the ALL tab. Anna, 10 km away, does not see it and her claim is refused (422 PICKUP_TOO_FAR); a script on her
# phone that keeps claiming gets 429 from the 31st claim in 10 minutes. Piotr is near and signed in on two phones: the
# one without his shift gets 409, the one with it takes the order. Piotr then cancels it at the rider's request.
source "$(dirname "$0")/../lib.sh"

PICKUP_LAT=52.2297; PICKUP_LON=21.0122   # Pałac Kultury i Nauki
DROPOFF_LAT=52.1672; DROPOFF_LON=20.9679  # Lotnisko Chopina
RIDER_PHONE="+48600$(random_digits 6)"
ORDER=""

# Whatever happens, no order stays searching and nobody stays online for the next scenarios.
cleanup() {
    set +e
    if [[ -n "$ORDER" && -n "${RIDER:-}" ]]; then
        local current
        current=$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER")
        if [[ "$(jq -r .status <<<"$current")" == SEARCHING ]]; then
            api POST "/api/rider/v1/orders/$ORDER/cancel" "$RIDER" "{\"command_id\":\"$(uuid)\",
              \"expected_version\":$(jq -r .version <<<"$current"),\"reason_code\":\"WAIT_TOO_LONG\"}" >/dev/null
        fi
    fi
    [[ -n "${ANNA:-}" ]] && go_offline "$ANNA"
    [[ -n "${PIOTR:-}" ]] && go_offline "$PIOTR"
}
trap cleanup EXIT

say "Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup"
PIOTR=$(sign_in DRIVER "+48500000001"); go_offline "$PIOTR"
PIOTR_TABLET=$(sign_in DRIVER "+48500000001")
ANNA=$(sign_in DRIVER "+48500000002"); go_offline "$ANNA"
go_online "$ANNA" 5a000000-0000-4000-8000-000000000505 52.2297 21.1700 >/dev/null

say "The rider orders: nobody is near, the order goes to the ALL tab"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"pickup_label\":\"PKiN\",
  \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"dropoff_label\":\"Lotnisko\",\"payment_method\":\"CASH\"}" \
  | jq -r .id)
expect 201
PHASE=""
for _ in $(seq 1 10); do
    PHASE=$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER" | jq -r .search_phase)
    [[ "$PHASE" == BROADCAST ]] && break
    sleep 1
done
[[ "$PHASE" == BROADCAST ]]

say "Anna, 10 km away, does not see it, and her claim is refused: the order stays in the ALL tab"
[[ "$(api GET /api/driver/v1/broadcast-orders "$ANNA" | jq --arg o "$ORDER" '[.[] | select(.order_id == $o)] | length')" == 0 ]]
expect 200
api POST "/api/driver/v1/orders/$ORDER/claim" "$ANNA" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 422
[[ "$(jq -r .code /tmp/sandbox-body)" == PICKUP_TOO_FAR ]]
[[ "$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER" | jq -r '.status + " " + .search_phase')" == "SEARCHING BROADCAST" ]]

say "A script on Anna's phone keeps claiming: from the 31st claim in 10 minutes, 429"
for attempt in $(seq 2 30); do
    api POST "/api/driver/v1/orders/$(uuid)/claim" "$ANNA" "{\"command_id\":\"$(uuid)\"}" >/dev/null
    [[ "$(cat /tmp/sandbox-status)" != 429 ]] || { note "**429 already at claim $attempt**"; exit 1; }
done
api POST "/api/driver/v1/orders/$(uuid)/claim" "$ANNA" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 429
[[ "$(jq -r .code /tmp/sandbox-body)" == RATE_LIMITED ]]

say "Piotr goes online next to the pickup on his phone; his other phone cannot claim, the phone with the shift can"
go_online "$PIOTR" 5a000000-0000-4000-8000-000000000504 52.2350 21.0122 >/dev/null
[[ "$(api GET /api/driver/v1/broadcast-orders "$PIOTR" | jq --arg o "$ORDER" '[.[] | select(.order_id == $o)] | length')" == 1 ]]
api POST "/api/driver/v1/orders/$ORDER/claim" "$PIOTR_TABLET" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 409
[[ "$(jq -r .code /tmp/sandbox-body)" == STATE_CONFLICT ]]
api POST "/api/driver/v1/orders/$ORDER/claim" "$PIOTR" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200

say "Piotr cancels at the rider's request (sandbox clean-up)"
TRIP=$(api GET /api/driver/v1/trips/current "$PIOTR"); expect 200
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/cancel" "$PIOTR" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reason_code\":\"PASSENGER_ASKED\"}" >/dev/null
expect 200
note "Done: far claim 422, the 31st claim 429, the phone without the shift 409, the phone with it took the order."
