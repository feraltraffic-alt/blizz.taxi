#!/usr/bin/env bash
# Who cancelled and why: the rider cancels with a reason from the riders' list, a driver gives an order back
# (it returns to the search) and another driver cancels it; then the order history as the operator sees it.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4547,"lon":30.5238}'    # Хрещатик
DROPOFF='{"lat":50.4016,"lon":30.6520}'   # Позняки
RIDER_PHONE="+38063$(random_digits 7)"

order() { # RIDER_TOKEN → order id
    local quote
    quote=$(api POST /api/rider/v1/quotes "$1" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
      \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
    expect 201
    api POST /api/rider/v1/orders "$1" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$quote\",\"vehicle_class\":\"STANDARD\",
      \"pickup\":$PICKUP,\"pickup_label\":\"Хрещатик, 22\",\"dropoff\":$DROPOFF,\"dropoff_label\":\"Позняки\",
      \"payment_method\":\"CASH\"}" | jq -r .id
    expect 201
}

say "Reasons each side can choose from"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
api GET /api/rider/v1/cancel-reasons "$RIDER" >/dev/null; expect 200
OLEH=$(sign_in DRIVER "+380500000002")
api GET /api/driver/v1/cancel-reasons "$OLEH" >/dev/null; expect 200
admin_token >/dev/null
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
api GET /api/operator/v1/cancel-reasons "$OPERATOR" >/dev/null; expect 200

say "The rider orders and cancels: «Долго ждать машину»"
FIRST=$(order "$RIDER")
VERSION=$(api GET "/api/rider/v1/orders/$FIRST" "$RIDER" | jq -r .version)
api POST "/api/rider/v1/orders/$FIRST/cancel" "$RIDER" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reason_code\":\"WAIT_TOO_LONG\"}" >/dev/null
expect 200

say "Two drivers online; the order goes to the nearest one"
OLEH_SESSION=$(go_online "$OLEH" 5a000000-0000-4000-8000-000000000502 50.4590 30.5238)
ANDRII=$(sign_in DRIVER "+380500000003")
ANDRII_SESSION=$(go_online "$ANDRII" 5a000000-0000-4000-8000-000000000503 50.4650 30.5238)
SECOND=$(order "$RIDER")
OFFER=$(api GET /api/driver/v1/offers "$OLEH" | jq -r '.[0].id')
api POST "/api/driver/v1/offers/$OFFER/accept" "$OLEH" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200

say "Oleh gives it back: «Неисправность автомобиля» — the order returns to the search"
TRIP=$(api GET /api/driver/v1/trips/current "$OLEH")
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/cancel" "$OLEH" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reason_code\":\"VEHICLE_PROBLEM\"}" >/dev/null
expect 200
api GET "/api/rider/v1/orders/$SECOND" "$RIDER" >/dev/null

say "Andrii gets it and cancels: «Пассажир попросил отменить»"
OFFER=$(api GET /api/driver/v1/offers "$ANDRII" | jq -r '.[0].id')
api POST "/api/driver/v1/offers/$OFFER/accept" "$ANDRII" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$ANDRII")
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/cancel" "$ANDRII" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reason_code\":\"PASSENGER_ASKED\"}" >/dev/null
expect 200

say "The rider sees who cancelled; the operator sees the whole history"
api GET /api/rider/v1/orders "$RIDER" >/dev/null; expect 200
api GET "/api/operator/v1/orders/$SECOND/events" "$OPERATOR" >/dev/null; expect 200
note "Done: orders $FIRST, $SECOND."
