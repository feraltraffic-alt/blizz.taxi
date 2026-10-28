#!/usr/bin/env bash
# One request, followed through the logs (REQ-OBS-01/04, issue #81): a rider orders with his own X-Correlation-Id;
# the order's history shows that id, and support finds by it what the request recorded — types and ids only.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4501,"lon":30.5234}'
DROPOFF='{"lat":50.4405,"lon":30.4890}'
RIDER_PHONE="+38066$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"
REQUEST=$(uuid)
ORDER=""
cleanup() {
    set +e
    if [[ -n "$ORDER" && -n "${RIDER:-}" ]]; then
        local version
        version=$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER" | jq -r .version)
        api POST "/api/rider/v1/orders/$ORDER/cancel" "$RIDER" \
            "{\"command_id\":\"$(uuid)\",\"expected_version\":$version,\"reason_code\":\"CHANGED_MIND\"}" >/dev/null
    fi
}
trap cleanup EXIT

say "A rider orders; the app sends its own correlation id with the request"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
BODY="{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",\"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,
  \"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}"
STATUS=$(curl -sS -o /tmp/sandbox-body -w '%{http_code}' -X POST -H 'Accept: application/json' \
    -H 'Content-Type: application/json' -H "Authorization: Bearer $RIDER" -H "X-Correlation-Id: $REQUEST" \
    --data "$BODY" "$BASE/api/rider/v1/orders")
echo "$STATUS" >/tmp/sandbox-status
printf '\n`POST /api/rider/v1/orders` (X-Correlation-Id: %s) → **%s**\n' "$REQUEST" "$STATUS" >>"$TRANSCRIPT"
expect 201
ORDER=$(jq -r .id /tmp/sandbox-body)

say "The operator sees the id on the order's history"
ADMIN=$(admin_token)
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
HISTORY=$(api GET "/api/operator/v1/orders/$ORDER/events" "$OPERATOR"); expect 200
[[ "$(jq -r '.events[0].type' <<<"$HISTORY")" == OrderCreated ]]
[[ "$(jq -r '.events[0].correlation_id' <<<"$HISTORY")" == "$REQUEST" ]]

say "Support finds what the request recorded — types and ids only"
FOUND=$(api GET "/api/admin/v1/logs/correlation/$REQUEST" "$ADMIN"); expect 200
jq -e --arg o "$ORDER" 'any(.found[]; .type == "ORDER_EVENT" and .order_id == $o)' <<<"$FOUND" >/dev/null
[[ "$(jq -c '[.found[] | keys] | unique' <<<"$FOUND")" == '[["at","id","order_id","type"]]' ]]
EMPTY=$(api GET "/api/admin/v1/logs/correlation/$(uuid)" "$ADMIN"); expect 200
[[ "$(jq '.found | length' <<<"$EMPTY")" == 0 ]]
note "Done: request $REQUEST — order $ORDER found by its id."
