#!/usr/bin/env bash
# A chargeback (REQ-PAY-23, issue #103): a card ride, then the bank disputes it. Finance exports the order's
# evidence for the provider's risk managers — no phone or card digits in it, whatever people typed — records the
# chargeback (the rider owes the fare again) and, when the provider wins it back, the outcome (the debt is gone).
source "$(dirname "$0")/../lib.sh"

KYIV=5a000000-0000-4000-8000-000000000001
PICKUP='{"lat":50.4437,"lon":30.4970}'
DROPOFF='{"lat":50.4584,"lon":30.4300}'
RIDER_PHONE="+38073$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"

# wait_for TOKEN PATH JQ_EXPR VALUE — polls up to 20 s until the field has the value.
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
BINDING_ID=$(jq -r .id <<<"$BINDING")
FORM=()
while IFS= read -r field; do FORM+=(--data-urlencode "$field"); done \
    < <(jq -r '.fields | to_entries[] | "\(.key)=\(.value)"' <<<"$BINDING")
PAGE=$(curl -sS -o /dev/null -w '%{http_code}' -X POST "$(jq -r .url <<<"$BINDING")" "${FORM[@]}")
note "\`POST $(jq -r .url <<<"$BINDING")\` (the provider's page, from the web view) → **$PAGE**"
wait_for "$RIDER" "/api/rider/v1/card-bindings/$BINDING_ID" .state COMPLETED

say "Andrii is online nearby"
ANDRII=$(sign_in DRIVER "+380500000003")
SESSION=$(go_online "$ANDRII" 5a000000-0000-4000-8000-000000000503 50.4480 30.4970)
trap 'go_offline "$ANDRII"' EXIT

say "A card ride; on the way both write numbers into the chat"
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"вул. Дмитрівська\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Нивки\",\"payment_method\":\"CARD\"}" | jq -r .id)
expect 201
wait_for "$RIDER" "/api/rider/v1/orders/$ORDER" .payment_state AUTHORIZED
for _ in $(seq 1 10); do
    OFFER=$(api GET /api/driver/v1/offers "$ANDRII" | jq -r '.[0].id // empty')
    [[ -n "$OFFER" ]] && break
    sleep 1
done
api POST "/api/driver/v1/offers/$OFFER/accept" "$ANDRII" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$ANDRII")
api POST "/api/rider/v1/orders/$ORDER/messages" "$RIDER" \
    "{\"command_id\":\"$(uuid)\",\"body\":\"Я біля входу, мій номер ${RIDER_PHONE}, картка 4111 1111 1111 1111\"}" \
    >/dev/null
expect 201
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/messages" "$ANDRII" \
    "{\"command_id\":\"$(uuid)\",\"body\":\"Буду за 3 хвилини, телефонуйте 050 000 00 03\"}" >/dev/null
expect 201
move "$ANDRII" "$SESSION" 50.4438 30.4970
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$ANDRII" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$ANDRII" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
move "$ANDRII" "$SESSION" 50.4584 30.4300
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$ANDRII" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\",\"cash_received\":false}" >/dev/null
expect 200
wait_for "$RIDER" "/api/rider/v1/orders/$ORDER" .payment_state PAID
go_offline "$ANDRII"

say "The bank disputes the payment: finance exports the evidence"
ADMIN=$(admin_token)
api GET "/api/admin/v1/orders/$ORDER/evidence" "$ADMIN" >/dev/null
expect 400
EVIDENCE=$(api GET "/api/admin/v1/orders/$ORDER/evidence?reason=Bank%20request%20sandbox" "$ADMIN")
expect 200
jq -e '.order.status == "FULFILLED" and .order.payment_method == "CARD" and .order.completed_at != null
       and .order.fare.amount_minor > 0 and .driver.vehicle.registration_number != null
       and .rider.registered_at != null and (.rider.trips_last_year | length) == 1
       and ([.card_operations[] | "\(.type) \(.state)"] | index("SETTLE SUCCEEDED")) != null
       and (.chat | length) == 2' <<<"$EVIDENCE" >/dev/null
if grep -qE '\+\s*(380|48)|(380|48)[0-9]{9}|4111|\*\*\*\*' <<<"$EVIDENCE"; then
    note "**The evidence carries a phone or card number.**"; exit 1
fi
[[ "$(jq '[.chat[].body | select(contains("[number hidden]"))] | length' <<<"$EVIDENCE")" == 2 ]]

say "Finance records the chargeback: the rider owes the fare again, a case opens"
PAID=$(jq '.order.final_price_minor' <<<"$EVIDENCE")
CLIENT_ID=$(jq -r '.rider.id' <<<"$EVIDENCE")
YESTERDAY=$(date -u -d yesterday +%Y-%m-%d)
api POST "/api/admin/v1/orders/$ORDER/chargebacks" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"amount_minor\":$((PAID + 1)),
  \"currency\":\"UAH\",\"bank_reason\":\"4837 No cardholder authorization\",\"received_on\":\"$YESTERDAY\"}" >/dev/null
expect 422
jq -e '.code == "CHARGEBACK_NOT_ALLOWED"' /tmp/sandbox-body >/dev/null
COMMAND=$(uuid)
CHARGEBACK=$(api POST "/api/admin/v1/orders/$ORDER/chargebacks" "$ADMIN" "{\"command_id\":\"$COMMAND\",
  \"amount_minor\":$PAID,\"currency\":\"UAH\",\"bank_reason\":\"4837 No cardholder authorization\",
  \"received_on\":\"$YESTERDAY\"}")
expect 201
CHARGEBACK_ID=$(jq -r .id <<<"$CHARGEBACK")
# The same command again is the same chargeback.
AGAIN=$(api POST "/api/admin/v1/orders/$ORDER/chargebacks" "$ADMIN" "{\"command_id\":\"$COMMAND\",
  \"amount_minor\":$PAID,\"currency\":\"UAH\",\"bank_reason\":\"4837 No cardholder authorization\",
  \"received_on\":\"$YESTERDAY\"}")
expect 201
[[ "$(jq -r .id <<<"$AGAIN")" == "$CHARGEBACK_ID" ]]
wait_for "$ADMIN" "/api/admin/v1/clients/$CLIENT_ID" '[.debt[] | select(.currency == "UAH") | .amount_minor] | add // 0' "$PAID"

say "The provider's risk managers win it back: the debt is gone; a second answer is refused"
RESOLVED=$(api POST "/api/admin/v1/orders/$ORDER/chargebacks/$CHARGEBACK_ID/resolve" "$ADMIN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":0,\"outcome\":\"WON\",\"reason\":\"Evidence accepted\"}")
expect 200
[[ "$(jq -r .state <<<"$RESOLVED")" == WON ]]
wait_for "$ADMIN" "/api/admin/v1/clients/$CLIENT_ID" '[.debt[] | select(.currency == "UAH") | .amount_minor] | add // 0' 0
api POST "/api/admin/v1/orders/$ORDER/chargebacks/$CHARGEBACK_ID/resolve" "$ADMIN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":1,\"outcome\":\"LOST\",\"reason\":\"Twice\"}" >/dev/null
expect 409
api GET "/api/admin/v1/orders/$ORDER/chargebacks" "$ADMIN" >/dev/null; expect 200
note "Done: the evidence of card order $ORDER without phone or card digits; chargeback $CHARGEBACK_ID recorded and won."
