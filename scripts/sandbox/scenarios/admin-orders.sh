#!/usr/bin/env bash
# Orders after the fact in the admin panel (issue #142, part A; REQ-ADM-01): a rider orders and cancels; staff find
# the order by the rider's phone and by its short number, see Kyiv's day by status and read the order's history.
source "$(dirname "$0")/../lib.sh"

PICKUP_LAT=50.4501; PICKUP_LON=30.5234
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890
RIDER_PHONE="+38066$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"

say "A rider orders and changes their mind"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" \
  | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"pickup_label\":\"Майдан\",
  \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}")
expect 201
ORDER_ID=$(jq -r .id <<<"$ORDER"); NUMBER=$(jq -r .short_number <<<"$ORDER"); CITY=$(jq -r .city_id <<<"$ORDER")
api POST "/api/rider/v1/orders/$ORDER_ID/cancel" "$RIDER" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$ORDER"),\"reason_code\":\"CHANGED_MIND\"}" >/dev/null
expect 200

say "Staff find it by the rider's phone, cancelled, and by its number"
ADMIN=$(admin_token)
FOUND=$(api GET "/api/admin/v1/orders?rider_phone=$(jq -rn --arg p "$RIDER_PHONE" '$p|@uri')&status=CANCELLED" "$ADMIN")
expect 200
[[ "$(jq -r '.orders[0].id' <<<"$FOUND")" == "$ORDER_ID" && "$(jq '.orders | length' <<<"$FOUND")" == 1 ]]
BY_NUMBER=$(api GET "/api/admin/v1/orders?city_id=$CITY&short_number=$NUMBER" "$ADMIN"); expect 200
[[ "$(jq -r '.orders[0].id' <<<"$BY_NUMBER")" == "$ORDER_ID" ]]

say "A page of two, then the next one from its cursor"
PAGE=$(api GET "/api/admin/v1/orders?city_id=$CITY&limit=2" "$ADMIN"); expect 200
NEXT=$(jq -r .page.next_cursor <<<"$PAGE")
if [[ "$NEXT" != null ]]; then
    MORE=$(api GET "/api/admin/v1/orders?city_id=$CITY&limit=2&cursor=$NEXT" "$ADMIN"); expect 200
    [[ "$(jq -n --argjson a "$(jq '[.orders[].id]' <<<"$PAGE")" --argjson b "$(jq '[.orders[].id]' <<<"$MORE")" \
        '$a - ($a - $b) | length')" == 0 ]]
fi

say "Kyiv's day by status and the order's history"
TODAY=$(TZ=Europe/Kyiv date +%Y-%m-%d)
OVERVIEW=$(api GET "/api/admin/v1/orders/overview?city_id=$CITY&date=$TODAY" "$ADMIN"); expect 200
[[ "$(jq -r '.total > 0' <<<"$OVERVIEW")" == true ]]
TIMELINE=$(api GET "/api/admin/v1/orders/$ORDER_ID/timeline" "$ADMIN"); expect 200
[[ "$(jq '.events | length' <<<"$TIMELINE")" -ge 2 ]]
note "Done: order $NUMBER found by phone and number; Kyiv's day: $(jq -c .by_status <<<"$OVERVIEW")."
