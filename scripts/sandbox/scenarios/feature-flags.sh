#!/usr/bin/env bash
# Feature flags (REQ-ENG-14): the admin sees each flag with its owner and review date, switches card payments off
# for a provider incident, a new card order is refused while a cash order goes through, and the flag is switched
# back on. The flag is always switched back on, even when a step fails.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4501,"lon":30.5234}'    # Майдан Незалежності
DROPOFF='{"lat":50.4405,"lon":30.4890}'   # Залізничний вокзал

say "The admin looks at the feature flags"
ADMIN=$(admin_token)
FLAGS=$(api GET /api/admin/v1/feature-flags "$ADMIN")
expect 200
note "card-payments: $(jq -c '.flags[] | select(.key == "card-payments") | {enabled, owner, review_by, version}' <<<"$FLAGS")"
VERSION=$(jq -r '.flags[] | select(.key == "card-payments") | .version' <<<"$FLAGS")

restore() {
    local now
    now=$(api GET /api/admin/v1/feature-flags "$ADMIN" | jq -c '.flags[] | select(.key == "card-payments")')
    if [[ "$(jq -r .enabled <<<"$now")" == false ]]; then
        api POST /api/admin/v1/feature-flags/card-payments/change "$ADMIN" "{\"command_id\":\"$(uuid)\",
          \"expected_version\":$(jq -r .version <<<"$now"),\"enabled\":true,\"reason\":\"Sandbox: incident over\"}" >/dev/null
    fi
}
trap restore EXIT

say "Card payments are switched off for a provider incident"
OFF=$(api POST /api/admin/v1/feature-flags/card-payments/change "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$VERSION,\"enabled\":false,\"reason\":\"Sandbox: provider incident\"}")
expect 200
jq -e '.enabled == false' <<<"$OFF" >/dev/null
api POST /api/admin/v1/feature-flags/card-payments/change "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$VERSION,\"enabled\":false,\"reason\":\"An old version\"}" >/dev/null
expect 409
api POST /api/admin/v1/feature-flags/no-such-flag/change "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":0,\"enabled\":false,\"reason\":\"x\"}" >/dev/null
expect 404

say "A rider's new card order is refused; cash still works"
RIDER=$(sign_in CLIENT "+38063$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CARD\"}" \
  >/dev/null
expect 422
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}")
expect 201
api POST "/api/rider/v1/orders/$(jq -r .id <<<"$ORDER")/cancel" "$RIDER" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$ORDER"),\"reason_code\":\"CHANGED_MIND\"}" >/dev/null
expect 200

say "The incident is over: card payments are back on"
api POST /api/admin/v1/feature-flags/card-payments/change "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$OFF"),\"enabled\":true,\"reason\":\"Sandbox: incident over\"}" >/dev/null
expect 200
note "Done: a new card order refused while the flag was off; a cash order went through; the flag is on again."
