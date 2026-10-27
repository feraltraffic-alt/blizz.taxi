#!/usr/bin/env bash
# Paying by card (ADR 0008): the rider adds a card on the provider's page (FAKE in the sandbox), orders, the hold is
# taken before the search, the ride is done and the bank takes the money after it.
source "$(dirname "$0")/../lib.sh"

KYIV=5a000000-0000-4000-8000-000000000001
PICKUP='{"lat":50.4437,"lon":30.4970}'    # Лук'янівка… south of it
DROPOFF='{"lat":50.4584,"lon":30.4300}'   # Нивки
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
# What the app's web view does: post the form to the provider's page (here the FAKE provider of the sandbox).
PAGE=$(curl -sS -o /dev/null -w '%{http_code}' -X POST "$(jq -r .url <<<"$BINDING")" "${FORM[@]}")
note "\`POST $(jq -r .url <<<"$BINDING")\` (the provider's page, from the web view) → **$PAGE**"
wait_for "$RIDER" "/api/rider/v1/card-bindings/$BINDING_ID" .state COMPLETED
api GET /api/rider/v1/cards "$RIDER" >/dev/null; expect 200

say "Andrii is online nearby"
ANDRII=$(sign_in DRIVER "+380500000003")
SESSION=$(go_online "$ANDRII" 5a000000-0000-4000-8000-000000000503 50.4480 30.4970)

say "The rider orders by card: the hold comes first, then the search"
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"вул. Дмитрівська\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Нивки\",\"payment_method\":\"CARD\"}" | jq -r .id)
expect 201
wait_for "$RIDER" "/api/rider/v1/orders/$ORDER" .payment_state AUTHORIZED

say "Andrii takes it and drives"
for _ in $(seq 1 10); do
    OFFER=$(api GET /api/driver/v1/offers "$ANDRII" | jq -r '.[0].id // empty')
    [[ -n "$OFFER" ]] && break
    sleep 1
done
api POST "/api/driver/v1/offers/$OFFER/accept" "$ANDRII" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
TRIP=$(api GET /api/driver/v1/trips/current "$ANDRII")
move "$ANDRII" "$SESSION" 50.4438 30.4970
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$ANDRII" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$ANDRII" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$ANDRII" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\"}" >/dev/null
expect 200

say "The bank takes the money after the trip"
wait_for "$RIDER" "/api/rider/v1/orders/$ORDER" .payment_state PAID
api GET /api/driver/v1/balance "$ANDRII" >/dev/null; expect 200
note "Done: card order $ORDER."
