#!/usr/bin/env bash
# Several orders of one rider (ADR 0012 Q-03, issue #57): an order for granny with her phone, an order for now and an
# order for later; the fourth is refused; the driver sees the recipient only once he has the order.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4501,"lon":30.5234}'     # Майдан Незалежності
DROPOFF='{"lat":50.4405,"lon":30.4890}'    # Залізничний вокзал
DRIVER_PHONE="+380500000002"; DRIVER_VEHICLE="5a000000-0000-4000-8000-000000000502"
RIDER_PHONE="+38067$(random_digits 7)"
GRANNY_PHONE="+38067$(random_digits 7)"

# order RIDER [PICKUP_AT] [RECIPIENT_JSON] — quotes and orders cash; prints the order id (empty when refused).
order() {
    local at="${2:-}" recipient="${3:-null}" quote at_json=""
    [[ -n "$at" ]] && at_json=",\"pickup_at\":\"$at\""
    quote=$(api POST /api/rider/v1/quotes "$1" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
      \"pickup\":$PICKUP,\"dropoff\":$DROPOFF$at_json}" | jq -r .id)
    expect 201
    api POST /api/rider/v1/orders "$1" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$quote\",
      \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,
      \"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\",\"recipient\":$recipient$at_json}" | jq -r '.id // empty'
}

say "A driver goes online near the pickup"
DRIVER=$(sign_in DRIVER "$DRIVER_PHONE")
go_online "$DRIVER" "$DRIVER_VEHICLE" 50.4520 30.5234 >/dev/null

say "The rider orders a taxi for granny, with her phone; the rider pays"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
FOR_GRANNY=$(order "$RIDER" "" "{\"name\":\"Бабуся Ольга\",\"phone\":\"$GRANNY_PHONE\"}"); expect 201

say "The offer says nothing about granny; once accepted, the trip does"
OFFERS=$(api GET /api/driver/v1/offers "$DRIVER"); expect 200
OFFER=$(jq -r --arg o "$FOR_GRANNY" '.[] | select(.order_id == $o) | .id' <<<"$OFFERS")
[[ -n "$OFFER" ]]
if grep -q "$GRANNY_PHONE" <<<"$OFFERS"; then note "**The offer shows the recipient's phone.**"; exit 1; fi
api POST "/api/driver/v1/offers/$OFFER/accept" "$DRIVER" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$DRIVER"); expect 200
jq -e '.recipient.name == "Бабуся Ольга"' <<<"$TRIP" >/dev/null

say "Two more orders: one for now, one for later — three in all"
NOW=$(order "$RIDER"); expect 201
LATER=$(order "$RIDER" "$(in_minutes 180)"); expect 201

say "The fourth is refused: at most three active orders, orders for later included"
order "$RIDER" >/dev/null; expect 409
[[ "$(jq -r .code /tmp/sandbox-body)" == ACTIVE_ORDER_LIMIT ]]
CURRENT=$(api GET /api/rider/v1/orders/current "$RIDER"); expect 200
jq -e '(.orders | length) == 3' <<<"$CURRENT" >/dev/null
api GET /api/rider/v1/orders/active "$RIDER" >/dev/null; expect 200   # the old single answer still works

say "The rider cancels all three; the driver goes off line"
for ID in "$FOR_GRANNY" "$NOW" "$LATER"; do
    VERSION=$(api GET "/api/rider/v1/orders/$ID" "$RIDER" | jq -r .version)
    api POST "/api/rider/v1/orders/$ID/cancel" "$RIDER" \
        "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reason_code\":\"CHANGED_MIND\"}" >/dev/null
    expect 200
done
go_offline "$DRIVER"
note "Done: orders $FOR_GRANNY, $NOW, $LATER."
