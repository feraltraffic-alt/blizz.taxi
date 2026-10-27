#!/usr/bin/env bash
# A phone order paid by card at the driver's own terminal (owner decision 27.10.2026): only Andrii, who has a
# terminal, gets the offer although Ivan is nearer; Andrii reports the payment went through and owes the commission.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4501,"lon":30.5234}'    # Майдан Незалежності
DROPOFF='{"lat":50.4016,"lon":30.6522}'   # Позняки

say "The admin marks that Andrii has an own card terminal"
ADMIN=$(admin_token)
ANDRII=$(sign_in DRIVER "+380500000003")
ANDRII_ID=$(api GET /api/driver/v1/profile "$ANDRII" | jq -r .id); expect 200
VERSION=$(api GET "/api/admin/v1/drivers/$ANDRII_ID" "$ADMIN" | jq -r '.profile.version'); expect 200
api POST "/api/admin/v1/drivers/$ANDRII_ID/payment-terminal" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$VERSION,\"has_terminal\":true,\"reason\":\"ФОП, власний POS-термінал\"}" >/dev/null
expect 200

say "Ivan (no terminal) is nearer than Andrii"
IVAN=$(sign_in DRIVER "+380500000001")
go_online "$IVAN" 5a000000-0000-4000-8000-000000000501 50.4510 30.5234 >/dev/null
ANDRII_SESSION=$(go_online "$ANDRII" 5a000000-0000-4000-8000-000000000503 50.4560 30.5234)

say "The operator takes a phone order paid at the terminal"
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
QUOTE=$(api POST /api/operator/v1/quotes "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
ORDER=$(api POST /api/operator/v1/orders "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Позняки\",\"payment_method\":\"TERMINAL\",\"caller\":{\"name\":\"Олена\",
  \"phone\":\"+380671112233\"}}")
expect 201
[[ "$(jq -r .payment_state <<<"$ORDER")" == "TERMINAL_EXPECTED" ]]
ORDER=$(jq -r .id <<<"$ORDER")
[[ "$(api GET /api/driver/v1/offers "$IVAN" | jq 'length')" == 0 ]]

say "Andrii accepts, drives and reports the card payment went through"
OFFER=$(api GET /api/driver/v1/offers "$ANDRII" | jq -r '.[0].id')
api POST "/api/driver/v1/offers/$OFFER/accept" "$ANDRII" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$ANDRII")
move "$ANDRII" "$ANDRII_SESSION" 50.4502 30.5234 2
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$ANDRII" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$ANDRII" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$ANDRII" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\",\"cash_received\":true}" >/dev/null
expect 200
[[ "$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR" | jq -r .payment_state)" == "TERMINAL_REPORTED" ]]
sleep 3
api GET /api/driver/v1/balance "$ANDRII" >/dev/null; expect 200
note "Done: terminal order $ORDER by Andrii ($ANDRII_ID)."
