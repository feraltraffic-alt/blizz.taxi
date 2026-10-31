#!/usr/bin/env bash
# Orders for later: a pre-order three hours ahead waits as SCHEDULED; with the settings switched to reservations
# a driver sees it and reserves it; the operator sees who holds it.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":52.2297,"lon":21.0122}'    # Warszawa, Pałac Kultury
DROPOFF='{"lat":52.1672,"lon":20.9679}'   # Lotnisko Chopina
RIDER_PHONE="+48600$(random_digits 6)"
PICKUP_AT=$(in_minutes 180)

say "The admin switches pre-orders to reservations"
ADMIN=$(admin_token)
CURRENT=$(api GET /api/admin/v1/settings "$ADMIN"); expect 200
api POST /api/admin/v1/settings "$ADMIN" "$(jq -c --arg c "$(uuid)" '{command_id:$c, expected_version:.version,
  settings:(.settings | .preorders.dispatch = "RESERVATION"), reason:"Sandbox: pre-orders by reservation"}' <<<"$CURRENT")" >/dev/null
expect 200

say "The rider books the airport for $PICKUP_AT"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF,\"pickup_at\":\"$PICKUP_AT\"}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Pałac Kultury i Nauki\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Lotnisko Chopina\",\"payment_method\":\"CASH\",\"pickup_at\":\"$PICKUP_AT\"}" | jq -r .id)
expect 201

say "A driver in Warsaw sees it and reserves it"
PIOTR=$(sign_in DRIVER "+48500000001")
go_online "$PIOTR" 5a000000-0000-4000-8000-000000000504 52.2350 21.0122 >/dev/null
api GET /api/driver/v1/preorders "$PIOTR" >/dev/null; expect 200
api POST "/api/driver/v1/preorders/$ORDER/reserve" "$PIOTR" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
api GET /api/driver/v1/preorders/reservations "$PIOTR" >/dev/null; expect 200

say "\"On my way\" is too early now; the operator sees who holds the order"
RESERVATION=$(api GET /api/driver/v1/preorders/reservations "$PIOTR" | jq -r '.reservations[0].id')
api POST "/api/driver/v1/preorders/reservations/$RESERVATION/confirm" "$PIOTR" "{\"command_id\":\"$(uuid)\"}" >/dev/null
expect 409
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR" >/dev/null; expect 200
api GET "/api/operator/v1/orders/$ORDER/events" "$OPERATOR" >/dev/null; expect 200
note "Done: pre-order $ORDER, reservation $RESERVATION."
