#!/usr/bin/env bash
# A cash trip the driver reports as not paid (owner decision 28.10.2026): the rider owes the fare, a cash dispute
# opens with a 14-day deadline, and finance decides it; nothing moves without that decision. Ivan goes offline even
# when a step fails.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4501,"lon":30.5234}'    # Майдан Незалежності
DROPOFF='{"lat":50.4405,"lon":30.4890}'   # Залізничний вокзал

say "Ivan is online near the pickup"
IVAN=$(sign_in DRIVER "+380500000001")
SESSION=$(go_online "$IVAN" 5a000000-0000-4000-8000-000000000501 50.4510 30.5234)
trap 'go_offline "$IVAN" || true' EXIT

say "A rider orders for cash"
RIDER=$(sign_in CLIENT "+38063$(random_digits 7)")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}" | jq -r .id)
expect 201

say "Ivan drives; at the end the rider has no money and leaves"
OFFER=$(api GET /api/driver/v1/offers "$IVAN" | jq -r '.[0].id')
api POST "/api/driver/v1/offers/$OFFER/accept" "$IVAN" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$IVAN")
move "$IVAN" "$SESSION" 50.4502 30.5234 2
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$IVAN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$IVAN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$IVAN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\",\"cash_received\":false}" >/dev/null
expect 200

say "Finance sees the dispute, with its deadline"
ADMIN=$(admin_token)
DISPUTE=""
for _ in $(seq 20); do
    DISPUTE=$(api GET "/api/admin/v1/orders/$ORDER/cash-dispute" "$ADMIN")
    [[ "$(cat /tmp/sandbox-status)" == 200 ]] && break
    sleep 1
done
expect 200
note "Dispute: $(jq -c '{held_minor, rider_debt_minor, decide_by, decision}' <<<"$DISPUTE")"
api GET /api/admin/v1/cash-disputes "$ADMIN" | jq -e --arg o "$ORDER" 'any(.disputes[]; .order_id == $o)' >/dev/null
expect 200

say "Finance decides: the rider did not pay, the service pays the driver"
api POST "/api/admin/v1/orders/$ORDER/cash-dispute/decide" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$DISPUTE"),\"decision\":\"PAY_DRIVER\",\"reason\":\" \"}" >/dev/null
expect 400
DECIDED=$(api POST "/api/admin/v1/orders/$ORDER/cash-dispute/decide" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$DISPUTE"),\"decision\":\"PAY_DRIVER\",\"reason\":\"The rider does not answer calls\"}")
expect 200
jq -e '.decision == "PAY_DRIVER"' <<<"$DECIDED" >/dev/null
api POST "/api/admin/v1/orders/$ORDER/cash-dispute/decide" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$DECIDED"),\"decision\":\"RIDER_PAID\",\"reason\":\"Again\"}" >/dev/null
expect 409
note "Done: an unpaid cash trip became a dispute and was decided once."
