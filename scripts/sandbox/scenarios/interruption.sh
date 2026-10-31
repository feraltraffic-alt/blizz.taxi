#!/usr/bin/env bash
# A car breaks down mid-trip (T-22): the operator interrupts the trip — the part driven is free — and sends a
# follow-up from where the car stopped; another driver finishes the ride, paid by the service.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4268,"lon":30.5636}'    # Палац спорту... south-east of the centre
DROPOFF='{"lat":50.3906,"lon":30.4825}'   # Голосіїв
RIDER_PHONE="+38066$(random_digits 7)"

say "A ride starts with Ivan"
IVAN=$(sign_in DRIVER "+380500000001")
IVAN_SESSION=$(go_online "$IVAN" 5a000000-0000-4000-8000-000000000501 50.4275 30.5636)
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Палац спорту\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Голосіїв\",\"payment_method\":\"CASH\"}" | jq -r .id)
expect 201
OFFER=$(api GET /api/driver/v1/offers "$IVAN" | jq -r '.[0].id')
api POST "/api/driver/v1/offers/$OFFER/accept" "$IVAN" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$IVAN")
move "$IVAN" "$IVAN_SESSION" 50.4269 30.5636 2
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$IVAN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$IVAN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}" >/dev/null
expect 200

say "The car breaks down halfway; Oleh is free nearby"
move "$IVAN" "$IVAN_SESSION" 50.4100 30.5250 3
OLEH=$(sign_in DRIVER "+380500000002")
go_online "$OLEH" 5a000000-0000-4000-8000-000000000502 50.4105 30.5250 >/dev/null

say "The operator interrupts: «Поломка автомобиля в пути», follow-up on the service"
admin_token >/dev/null
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
VERSION=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR" | jq -r .version)
FOLLOW_UP=$(api POST "/api/operator/v1/orders/$ORDER/interrupt" "$OPERATOR" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$VERSION,\"reason_code\":\"VEHICLE_BREAKDOWN\",\"comment\":\"Двигун заглух\",\"follow_up\":true}" \
  | jq -r .follow_up.id)
expect 200

say "Oleh takes the follow-up and finishes; the rider sees both orders"
OFFER=$(api GET /api/driver/v1/offers "$OLEH" | jq -r '.[0].id')
api POST "/api/driver/v1/offers/$OFFER/accept" "$OLEH" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$OLEH")
OLEH_SESSION=$(api GET /api/driver/v1/work-sessions/current "$OLEH" | jq -r .session_id)
move "$OLEH" "$OLEH_SESSION" 50.4101 30.5250 2
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$OLEH" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$OLEH" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$OLEH" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\"}" >/dev/null
expect 200
api GET /api/rider/v1/orders "$RIDER" >/dev/null; expect 200
sleep 3
api GET /api/driver/v1/balance "$OLEH" >/dev/null; expect 200
api GET "/api/operator/v1/orders/$ORDER/events" "$OPERATOR" >/dev/null; expect 200
trap 'go_offline "$IVAN"; go_offline "$OLEH"' EXIT
say "A service-paid follow-up cannot be tipped"
TIPS=$(api GET "/api/rider/v1/orders/$FOLLOW_UP/tip" "$RIDER"); expect 200
[[ "$(jq -r .open <<<"$TIPS")" == false && "$(jq -r .method <<<"$TIPS")" == null ]]
REJECTED=$(api POST "/api/rider/v1/orders/$FOLLOW_UP/tip" "$RIDER" \
  "{\"command_id\":\"$(uuid)\",\"amount_minor\":100}")
expect 409
[[ "$(jq -r .code <<<"$REJECTED")" == STATE_CONFLICT ]]
note "Done: interrupted $ORDER, follow-up $FOLLOW_UP."
