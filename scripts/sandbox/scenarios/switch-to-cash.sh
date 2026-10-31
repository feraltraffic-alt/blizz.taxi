#!/usr/bin/env bash
# A rider switches a card order to cash (REQ-PAY-20, owner decision 28.10.2026: only the rider or an operator): the
# hold on the card is released at once and the order goes on as cash. The order is cancelled at the end.
source "$(dirname "$0")/../lib.sh"

KYIV=5a000000-0000-4000-8000-000000000001
PICKUP='{"lat":50.4437,"lon":30.4970}'
DROPOFF='{"lat":50.4584,"lon":30.4300}'
RIDER_PHONE="+38073$(random_digits 7)"

wait_for() {
    local value=""
    for _ in $(seq 1 20); do
        value=$(api GET "$2" "$1" | jq -r "$3")
        [[ "$value" == "$4" ]] && return 0
        sleep 1
    done
    note "**Waited for $3 = $4, still $value — scenario stopped.**"
    exit 1
}

say "The rider adds a card"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
BINDING=$(api POST /api/rider/v1/card-bindings "$RIDER" "{\"command_id\":\"$(uuid)\",\"city_id\":\"$KYIV\"}")
expect 201
FORM=()
while IFS= read -r field; do FORM+=(--data-urlencode "$field"); done \
    < <(jq -r '.fields | to_entries[] | "\(.key)=\(.value)"' <<<"$BINDING")
curl -sS -o /dev/null -X POST "$(jq -r .url <<<"$BINDING")" "${FORM[@]}"
wait_for "$RIDER" "/api/rider/v1/card-bindings/$(jq -r .id <<<"$BINDING")" .state COMPLETED

say "The rider orders by card: the hold is taken"
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"pickup_label\":\"вул. Дмитрівська\",\"dropoff\":$DROPOFF,\"dropoff_label\":\"Нивки\",
  \"payment_method\":\"CARD\"}" | jq -r .id)
expect 202
cleanup() {
    local now
    now=$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER")
    if [[ "$(jq -r .status <<<"$now")" =~ ^(SEARCHING|ASSIGNED|AWAITING_PAYMENT)$ ]]; then
        api POST "/api/rider/v1/orders/$ORDER/cancel" "$RIDER" "{\"command_id\":\"$(uuid)\",
          \"expected_version\":$(jq -r .version <<<"$now"),\"reason_code\":\"CHANGED_MIND\"}" >/dev/null
    fi
}
trap cleanup EXIT
wait_for "$RIDER" "/api/rider/v1/orders/$ORDER" .payment_state AUTHORIZED

say "The rider decides to pay in cash"
NOW=$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER")
CASH=$(api POST "/api/rider/v1/orders/$ORDER/switch-to-cash" "$RIDER" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$NOW")}")
expect 200
jq -e '.payment_method == "CASH" and .payment_state == "CASH_EXPECTED"' <<<"$CASH" >/dev/null
api POST "/api/rider/v1/orders/$ORDER/switch-to-cash" "$RIDER" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$CASH")}" >/dev/null
expect 409
note "Done: the card order became cash; a second switch is refused."
