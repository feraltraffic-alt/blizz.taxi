#!/usr/bin/env bash
# How a city takes orders (REQ-TEN-03/05/06): staff pause new orders in Warsaw and the rider is refused, then lift the
# pause; the city offers only cards and a cash order is refused; working hours that do not include now refuse an
# order for now; no rides out of town, or none beyond 50 km, refuse a quote to Łódź. The apps see the pause in the
# bootstrap. The city is put back as it was, even when a step fails.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":52.2297,"lon":21.0122}'    # Warszawa, Pałac Kultury
DROPOFF='{"lat":52.2319,"lon":21.0067}'   # Warszawa Centralna
LODZ='{"lat":51.7592,"lon":19.4560}'      # Łódź, about 120 km away
RIDER_PHONE="+48600$(printf '%06d' $(( (RANDOM * 32768 + RANDOM) % 1000000 )))"

say "Staff open Warsaw's operations (version 0 until the first change: around the clock, every method)"
ADMIN=$(admin_token)
CITY=$(api GET /api/config/v1/bootstrap | jq -r '[.cities[] | select(.currency == "PLN")][0].id'); expect 200
OPS="/api/admin/v1/cities/$CITY/operations"
api GET "$OPS" "$ADMIN" | jq -e '.orders_paused == false' >/dev/null; expect 200

# Whatever happens below, Warsaw takes orders around the clock with every method again.
restore() {
    local state version
    state=$(api GET "$OPS" "$ADMIN")
    version=$(jq -r .version <<<"$state")
    if [[ "$(jq -r .orders_paused <<<"$state")" == true ]]; then
        version=$(api POST "$OPS/resume" "$ADMIN" \
          "{\"command_id\":\"$(uuid)\",\"expected_version\":$version,\"reason\":\"Sandbox clean-up\"}" | jq -r .version)
    fi
    if [[ "$(jq -c '[.working_hours, (.payment_methods | sort), .dropoff_outside_city]' <<<"$state")" \
          != '[[],["CARD","CASH","TERMINAL"],{"allowed":true,"max_distance_km":null}]' ]]; then
        api POST "$OPS" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$version,\"working_hours\":[],
          \"payment_methods\":[\"CASH\",\"CARD\",\"TERMINAL\"],
          \"dropoff_outside_city\":{\"allowed\":true,\"max_distance_km\":null},\"reason\":\"Sandbox clean-up\"}" >/dev/null
    fi
}
trap restore EXIT

version() { api GET "$OPS" "$ADMIN" | jq -r .version; }

# order — a rider's cash order for now in Warsaw; prints nothing, leaves the status for expect.
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
order() {
    local quote
    quote=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
      \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
    expect 201
    api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$quote\",
      \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Pałac Kultury\",\"dropoff\":$DROPOFF,
      \"dropoff_label\":\"Warszawa Centralna\",\"payment_method\":\"CASH\"}" >/tmp/sandbox-order.json
}

say "Staff pause new orders: a reason is required"
api POST "$OPS/pause" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$(version),\"reason\":\" \"}" >/dev/null
expect 400
api POST "$OPS/pause" "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$(version),\"reason\":\"Storm warning\"}" \
  | jq -e '.orders_paused == true and .pause_reason == "Storm warning"' >/dev/null
expect 200

say "The apps see the pause, and the rider's order is refused"
api GET /api/config/v1/bootstrap | jq -e --arg c "$CITY" '.cities[] | select(.id == $c) | .orders_paused' >/dev/null
expect 200
order; expect 422
jq -e '.code == "CITY_PAUSED"' /tmp/sandbox-order.json >/dev/null

say "Staff lift the pause"
api POST "$OPS/resume" "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$(version),\"reason\":\"Storm over\"}" \
  | jq -e '.orders_paused == false' >/dev/null
expect 200

say "Warsaw offers only cards for now: a cash order is refused"
api POST "$OPS" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$(version),\"working_hours\":[],
  \"payment_methods\":[\"CARD\"],\"reason\":\"Cash collection paused\"}" >/dev/null
expect 200
order; expect 422
jq -e '.code == "PAYMENT_METHOD_NOT_OFFERED"' /tmp/sandbox-order.json >/dev/null

say "Working hours that do not include now: an order for now is refused"
# Hours are in Warsaw time, which is UTC+1 or +2: an hour starting at UTC hour + 3 there never includes now.
HOUR=$(( ($(date -u +%-H) + 3) % 24 ))
FROM=$(printf '%02d:00' "$HOUR"); TO=$(printf '%02d:00' $(( (HOUR + 1) % 24 )))
api POST "$OPS" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$(version),
  \"working_hours\":[{\"days_of_week\":[1,2,3,4,5,6,7],\"from\":\"$FROM\",\"to\":\"$TO\"}],
  \"payment_methods\":[\"CASH\",\"CARD\",\"TERMINAL\"],\"reason\":\"One hour a day\"}" >/dev/null
expect 200
order; expect 422
jq -e '.code == "CITY_CLOSED"' /tmp/sandbox-order.json >/dev/null

say "No rides out of town: a quote to Łódź is refused, one inside Warsaw is not"
quote_to() {
    api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
      \"pickup\":$PICKUP,\"dropoff\":$1}" >/tmp/sandbox-quote.json
}
api GET "$OPS" "$ADMIN" | jq -e '.dropoff_outside_city == {"allowed": true, "max_distance_km": null}' >/dev/null
api POST "$OPS" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$(version),\"working_hours\":[],
  \"payment_methods\":[\"CASH\",\"CARD\",\"TERMINAL\"],\"dropoff_outside_city\":{\"allowed\":false,
  \"max_distance_km\":null},\"reason\":\"No rides out of town\"}" | jq -e '.dropoff_outside_city.allowed == false' >/dev/null
expect 200
quote_to "$LODZ"; expect 422
jq -e '.code == "DROPOFF_OUTSIDE_CITY"' /tmp/sandbox-quote.json >/dev/null
quote_to "$DROPOFF"; expect 201

say "Rides out of town up to 50 km: Łódź is still too far"
api POST "$OPS" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$(version),\"working_hours\":[],
  \"payment_methods\":[\"CASH\",\"CARD\",\"TERMINAL\"],\"dropoff_outside_city\":{\"allowed\":true,
  \"max_distance_km\":50},\"reason\":\"Suburbs only\"}" >/dev/null
expect 200
quote_to "$LODZ"; expect 422
jq -e '.code == "DROPOFF_OUTSIDE_CITY"' /tmp/sandbox-quote.json >/dev/null

say "A stale version is refused"
api POST "$OPS/pause" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":0,\"reason\":\"stale\"}" >/dev/null
expect 409
note "Done: paused and resumed, a method not offered and closed hours refused orders, a drop-off out of town refused quotes; Warsaw is restored on exit."
