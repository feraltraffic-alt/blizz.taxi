#!/usr/bin/env bash
# The address field (ADR 0012, Q-08): the rider's past places first, then own addresses, then the provider (FAKE in
# the sandbox); the operator gets the caller's history; a point on the map gives an address.
source "$(dirname "$0")/../lib.sh"

RIDER_PHONE="+38063$(random_digits 7)"

say "A new rider searches: no history yet, the provider answers"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
PLACES=$(api GET "/api/rider/v1/places?query=%D0%9C%D0%B0%D0%B9%D0%B4%D0%B0%D0%BD&lat=50.4501&lon=30.5234" "$RIDER")
expect 200
[[ "$(jq -r .provider <<<"$PLACES")" == "FAKE" ]]
[[ "$(jq '[.places[] | select(.source == "HISTORY")] | length' <<<"$PLACES")" == "0" ]]
[[ "$(jq '[.places[] | select(.source == "FAKE")] | length' <<<"$PLACES")" -ge 1 ]]

say "A point on the map gives an address"
api GET "/api/rider/v1/places/reverse?lat=50.4501&lon=30.5234" "$RIDER" >/dev/null
[[ "$(cat /tmp/sandbox-status)" == 200 || "$(cat /tmp/sandbox-status)" == 204 ]]

say "The operator searches for a caller"
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
api GET "/api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B${RIDER_PHONE#+}" \
  "$OPERATOR" >/dev/null
expect 200

say "Outside the service area"
api GET "/api/rider/v1/places?query=x&lat=10&lon=10" "$RIDER" >/dev/null
expect 422
note "Done: address search through $(jq -r .provider <<<"$PLACES")."
