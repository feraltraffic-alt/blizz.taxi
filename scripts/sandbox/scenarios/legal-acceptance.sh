#!/usr/bin/env bash
# Legal texts with versions (REQ-PRV-08, issue #69): the admin publishes riders' terms that must be accepted, a rider
# cannot order until accepting them, accepts, orders. At the end — also when a step fails — a version that need not
# be accepted is published, so the other scenarios are not blocked.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4547,"lon":30.5238}'    # Хрещатик
DROPOFF='{"lat":50.4016,"lon":30.6520}'   # Позняки
RIDER_PHONE="+38063$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"
ADMIN=$(admin_token)

# publish_terms REQUIRED(true|false) — prints the new version's id.
publish_terms() {
    local draft
    draft=$(api POST /api/admin/v1/legal-documents "$ADMIN" "{\"command_id\":\"$(uuid)\",\"audience\":\"RIDER\",
      \"kind\":\"TERMS\",\"texts\":{\"uk\":\"Умови користування (пісочниця)\",\"pl\":\"Regulamin (piaskownica)\"},
      \"acceptance_required\":$1,\"effective_from\":\"$(now_utc)\"}")
    api POST "/api/admin/v1/legal-documents/$(jq -r .id <<<"$draft")/publish" "$ADMIN" \
      "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$draft")}" | jq -r .id
}
trap 'publish_terms false >/dev/null' EXIT

order() { # RIDER_TOKEN → prints the order id; the status stays in STATUS
    local quote
    quote=$(api POST /api/rider/v1/quotes "$1" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
      \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
    api POST /api/rider/v1/orders "$1" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$quote\",\"vehicle_class\":\"STANDARD\",
      \"pickup\":$PICKUP,\"pickup_label\":\"Хрещатик, 22\",\"dropoff\":$DROPOFF,\"dropoff_label\":\"Позняки\",
      \"payment_method\":\"CASH\"}" | jq -r '.id // empty'
}

say "The admin publishes riders' terms that must be accepted"
TERMS=$(publish_terms true)
expect 200

say "Before signing in the app shows the text in Polish"
api GET "/api/config/v1/legal/rider/terms?language=pl" | jq -e '.text == "Regulamin (piaskownica)"' >/dev/null
expect 200

say "A rider who has not accepted them cannot order"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
api GET /api/rider/v1/legal "$RIDER" \
  | jq -e --arg id "$TERMS" '.documents[] | select(.version_id == $id) | .accepted == false' >/dev/null
expect 200
order "$RIDER" >/dev/null
expect 403
[[ "$(jq -r .code /tmp/sandbox-body)" == ACCEPTANCE_REQUIRED ]]

say "The rider accepts them in Ukrainian and orders"
api POST /api/rider/v1/legal/acceptances "$RIDER" \
  "{\"command_id\":\"$(uuid)\",\"version_id\":\"$TERMS\",\"language\":\"uk\"}" >/dev/null
expect 200
ORDER=$(order "$RIDER")
expect 201
VERSION=$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER" | jq -r .version)
api POST "/api/rider/v1/orders/$ORDER/cancel" "$RIDER" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reason_code\":\"CHANGED_MIND\"}" >/dev/null
expect 200

say "A published version never changes"
api POST "/api/admin/v1/legal-documents/$TERMS" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":1,
  \"texts\":{\"uk\":\"Інше\"},\"acceptance_required\":true,\"effective_from\":\"$(now_utc)\"}" >/dev/null
expect 409
note "Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end."
