#!/usr/bin/env bash
# The operator's targeted customer lookup (issue #176, part A; registry 22.2): a rider is found by their exact phone
# with their latest orders; a prefix, the phone with spaces and a name find nobody (400); an unknown number is 404.
source "$(dirname "$0")/../lib.sh"

RIDER_PHONE="+38066$(random_digits 7)"
UNKNOWN_PHONE="+38066$(random_digits 7)"

say "A rider signs in and orders"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
RIDER_ID=$(api GET /api/rider/v1/me "$RIDER" | jq -r .subject_id); expect 200
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":50.4501,\"lon\":30.5234},\"dropoff\":{\"lat\":50.4405,\"lon\":30.4890}}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":50.4501,\"lon\":30.5234},\"pickup_label\":\"Майдан\",
  \"dropoff\":{\"lat\":50.4405,\"lon\":30.4890},\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}" | jq -r .id)
expect 201
VERSION=$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER" | jq -r .version)
api POST "/api/rider/v1/orders/$ORDER/cancel" "$RIDER" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reason_code\":\"CHANGED_MIND\"}" >/dev/null
expect 200

say "The operator finds the rider by the exact phone, with the order"
admin_token >/dev/null
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
lookup() { api GET "/api/operator/v1/customers/lookup?phone=$(jq -rn --arg p "$1" '$p|@uri')" "$OPERATOR"; }
FOUND=$(lookup "$RIDER_PHONE"); expect 200
jq -e --arg id "$RIDER_ID" --arg order "$ORDER" '.client_id == $id and any(.orders[]; .id == $order)' \
  <<<"$FOUND" >/dev/null

say "A prefix, the phone with spaces, a name: nobody (400); an unknown number: 404"
lookup "${RIDER_PHONE:0:9}" >/dev/null; expect 400
lookup "${RIDER_PHONE:0:4} ${RIDER_PHONE:4}" >/dev/null; expect 400
lookup "Olena" >/dev/null; expect 400
lookup "$UNKNOWN_PHONE" >/dev/null; expect 404
note "Done: rider $RIDER_ID found by the exact phone only; prefix, spaces and a name refused, an unknown number 404."
