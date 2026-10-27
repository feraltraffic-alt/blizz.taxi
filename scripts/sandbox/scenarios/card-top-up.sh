#!/usr/bin/env bash
# Topping up by card on the provider's payment page (ADR 0009 p. 1, ADR 0010 p. 1): the rider tops up the bonus
# account, the driver the balance. FAKE provider in the sandbox; nobody goes online.
source "$(dirname "$0")/../lib.sh"

KYIV=5a000000-0000-4000-8000-000000000001
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

# pay TOP_UP_JSON — what the app's web view does: post the form to the provider's page.
pay() {
    local form=()
    while IFS= read -r field; do form+=(--data-urlencode "$field"); done \
        < <(jq -r '.fields | to_entries[] | "\(.key)=\(.value)"' <<<"$1")
    local page
    page=$(curl -sS -o /dev/null -w '%{http_code}' -X POST "$(jq -r .url <<<"$1")" "${form[@]}")
    note "\`POST $(jq -r .url <<<"$1")\` (the provider's payment page, from the web view) → **$page**"
}

say "The rider tops up the bonus account by 150.00"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
TOP_UP=$(api POST /api/rider/v1/wallet/card-top-ups "$RIDER" \
  "{\"command_id\":\"$(uuid)\",\"city_id\":\"$KYIV\",\"amount_minor\":15000}")
expect 201
[[ "$(jq -r .state <<<"$TOP_UP")" == "PENDING" ]]
pay "$TOP_UP"
wait_for "$RIDER" "/api/rider/v1/wallet/card-top-ups/$(jq -r .id <<<"$TOP_UP")" .state COMPLETED
wait_for "$RIDER" /api/rider/v1/wallet '.balances[] | select(.currency == "UAH") | .available_minor' 15000
WALLET=$(api GET /api/rider/v1/wallet "$RIDER"); expect 200
[[ "$(jq -r '.entries[0].kind' <<<"$WALLET")" == "CARD_TOP_UP" ]]

say "The driver tops up the balance by 500.00"
DRIVER=$(sign_in DRIVER "+380500000002")
BEFORE=$(api GET /api/driver/v1/balance/history "$DRIVER" | jq '[.balances[] | select(.currency == "UAH") | .balance_minor] | add // 0')
expect 200
TOP_UP=$(api POST /api/driver/v1/balance/card-top-ups "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"city_id\":\"$KYIV\",\"amount_minor\":50000}")
expect 201
pay "$TOP_UP"
wait_for "$DRIVER" "/api/driver/v1/balance/card-top-ups/$(jq -r .id <<<"$TOP_UP")" .state COMPLETED
wait_for "$DRIVER" /api/driver/v1/balance/history \
  "([.balances[] | select(.currency == \"UAH\") | .balance_minor] | add // 0) - $BEFORE" 50000

say "A rider cannot use the driver's path"
api POST /api/driver/v1/balance/card-top-ups "$RIDER" \
  "{\"command_id\":\"$(uuid)\",\"city_id\":\"$KYIV\",\"amount_minor\":50000}" >/dev/null
expect 403
note "Done: the rider's account and the driver's balance were topped up by card."
