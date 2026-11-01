#!/usr/bin/env bash
# REQ-PAY-02, E1 of #140: a card order whose hold the bank never confirms ends at the deadline (20 s in the sandbox)
# as UNFULFILLED / PAYMENT_TIMEOUT with the hold released; the bank's late success is voided, not captured.
source "$(dirname "$0")/../lib.sh"

KYIV=5a000000-0000-4000-8000-000000000001
PICKUP='{"lat":50.4437,"lon":30.4970}'
DROPOFF='{"lat":50.4584,"lon":30.4300}'
RIDER_PHONE="+38073$(random_digits 7)"

say "The rider adds a card"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
BINDING=$(api POST /api/rider/v1/card-bindings "$RIDER" "{\"command_id\":\"$(uuid)\",\"city_id\":\"$KYIV\"}")
expect 201
FORM=()
while IFS= read -r field; do FORM+=(--data-urlencode "$field"); done \
    < <(jq -r '.fields | to_entries[] | "\(.key)=\(.value)"' <<<"$BINDING")
curl -sS -o /dev/null -X POST "$(jq -r .url <<<"$BINDING")" "${FORM[@]}"
for _ in $(seq 1 20); do
    STATE=$(api GET "/api/rider/v1/card-bindings/$(jq -r .id <<<"$BINDING")" "$RIDER" | jq -r .state)
    [[ "$STATE" == COMPLETED ]] && break
    sleep 1
done
[[ "$STATE" == COMPLETED ]] || { note "**The card was not added.**"; exit 1; }

say "The bank will take the hold but its answer never comes"
api POST /sandbox/v1/bank/next-answers "" "{\"phone\":\"$RIDER_PHONE\",\"answers\":[\"LOST_ANSWER\"]}" >/dev/null
expect 204

say "The rider orders by card: the order waits for the hold"
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Лук'янівка\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Нивки\",\"payment_method\":\"CARD\"}" | jq -r .id)
expect 202
[[ "$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER" | jq -r .status)" == AWAITING_PAYMENT ]]

say "Past the deadline the order ends PAYMENT_TIMEOUT and the hold is released"
for _ in $(seq 1 60); do
    SHOWN=$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER")
    [[ "$(jq -r .status <<<"$SHOWN")" == UNFULFILLED ]] && break
    sleep 1
done
[[ "$(jq -r .status <<<"$SHOWN")" == UNFULFILLED ]] || { note "**Still $(jq -r .status <<<"$SHOWN").**"; exit 1; }
[[ "$(jq -r .status_reason <<<"$SHOWN")" == PAYMENT_TIMEOUT ]] \
    || { note "**Reason $(jq -r .status_reason <<<"$SHOWN"), not PAYMENT_TIMEOUT.**"; exit 1; }
[[ "$(jq -r .payment_state <<<"$SHOWN")" == HOLD_RELEASED ]] \
    || { note "**Payment state $(jq -r .payment_state <<<"$SHOWN"), not HOLD_RELEASED.**"; exit 1; }
note "Done: order $ORDER ended PAYMENT_TIMEOUT, its hold released."
