#!/usr/bin/env bash
# The rider's bonus account and promotions (ADR 0009): the admin starts a 10 % discount in Kyiv and tops up the
# rider's account with 50 ₴; the rider sees the discount in the price, pays 20 ₴ of the rest with bonuses and the
# remainder in cash; afterwards 30 ₴ are left on the account. The promotion is stopped at the end.
source "$(dirname "$0")/../lib.sh"

KYIV=5a000000-0000-4000-8000-000000000001
PICKUP='{"lat":50.4501,"lon":30.5234}'    # Майдан Незалежності
DROPOFF='{"lat":50.4405,"lon":30.4890}'   # Залізничний вокзал
RIDER_PHONE="+38063$(random_digits 7)"

say "The admin starts «Осінь −10 %» in Kyiv"
ADMIN=$(admin_token)
PROMO=$(api POST /api/admin/v1/promotions "$ADMIN" "{\"command_id\":\"$(uuid)\",\"reason\":\"Осіння акція\",
  \"promotion\":{\"name\":\"Осінь −10 %\",\"kind\":\"DISCOUNT\",\"value_type\":\"PERCENT\",\"value\":1000,
  \"conditions\":{\"city_id\":\"$KYIV\"}}}")
expect 201
PROMO_ID=$(jq -r .id <<<"$PROMO")

say "A rider signs in; the admin tops up the account with 50 ₴"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
CLIENT_ID=$(api GET "/api/admin/v1/rider-wallets?phone=%2B${RIDER_PHONE#+}" "$ADMIN" | jq -r .client_id); expect 200
api POST "/api/admin/v1/rider-wallets/$CLIENT_ID/top-ups" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"currency\":\"UAH\",
  \"amount_minor\":5000,\"reason\":\"Вітальний бонус\"}" >/dev/null
expect 201

say "The rider sees the discount and pays 20 ₴ with bonuses"
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}")
expect 201
[[ "$(jq -r '.promotions[0].name' <<<"$QUOTE")" == "Осінь −10 %" ]]
(( $(jq -r .discount_minor <<<"$QUOTE") > 0 ))
IVAN=$(sign_in DRIVER "+380500000001")
SESSION=$(go_online "$IVAN" 5a000000-0000-4000-8000-000000000501 50.4520 30.5234)
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$(jq -r .id <<<"$QUOTE")\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\",\"wallet_minor\":2000}")
expect 201
[[ "$(jq -r .wallet_minor <<<"$ORDER")" == 2000 ]]
[[ "$(api GET /api/rider/v1/wallet "$RIDER" | jq -r '.balances[0].available_minor')" == 3000 ]]

say "Ivan drives; he collects the price minus the discount and the bonuses"
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
note "Ivan collects $(( $(jq -r .price_minor <<<"$TRIP") - $(jq -r .discount_minor <<<"$TRIP") - $(jq -r .wallet_minor <<<"$TRIP") )) minor units in cash"
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$IVAN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\",\"cash_received\":true}" >/dev/null
expect 200
sleep 3
WALLET=$(api GET /api/rider/v1/wallet "$RIDER"); expect 200
[[ "$(jq -r '.balances[0].balance_minor' <<<"$WALLET")" == 3000 ]]

say "The promotion is stopped"
api POST "/api/admin/v1/promotions/$PROMO_ID/archive" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$PROMO"),\"reason\":\"Кінець акції\"}" >/dev/null
expect 200
go_offline "$IVAN"
note "Done: order $(jq -r .id <<<"$ORDER")."
