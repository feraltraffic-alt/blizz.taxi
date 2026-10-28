#!/usr/bin/env bash
# Click-to-call (issue #67): the operator calls the caller of a phone order from the order. The sandbox's fake
# Asterisk records what the server asked it for; the number goes there and nowhere else — not into the panel's answer
# (REQ-PRV-03). The call's events come through /sandbox/v1/calls/events; it is recorded like an incoming one.
source "$(dirname "$0")/../lib.sh"

CALLER="+38067$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"
DIGITS="${CALLER#+}"
PICKUP='{"lat":50.4501,"lon":30.5234}'
DROPOFF='{"lat":50.4405,"lon":30.4890}'

asterisk() {
    api POST /sandbox/v1/calls/events "" "$1" >/dev/null
    expect 202
}

say "The admin gives the operator an internal number"
ADMIN=$(admin_token)
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
ME=$(api GET /api/operator/v1/me "$OPERATOR" | jq -r .member.id); expect 200
EXTENSIONS=$(api GET /api/admin/v1/staff-extensions "$ADMIN"); expect 200
VERSION=$(jq -r --arg id "$ME" '[.extensions[] | select(.staff_id == $id) | .version][0] // 0' <<<"$EXTENSIONS")
api POST "/api/admin/v1/staff-extensions/$ME" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"extension\":\"101\",\"reason\":\"Sandbox outgoing-call scenario\"}" >/dev/null
expect 200

say "The operator says they are available"
api POST /api/operator/v1/me/call-status "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"status\":\"AVAILABLE\"}" >/dev/null
expect 200
[[ "$(api GET /api/operator/v1/me/call-status "$OPERATOR" | jq -r .extension)" == 101 ]]

say "A phone order"
QUOTE=$(api POST /api/operator/v1/quotes "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id); expect 201
ORDER=$(api POST /api/operator/v1/orders "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\",\"caller\":{\"name\":\"Caller\",\"phone\":\"$CALLER\"}}" \
  | jq -r .id)
expect 201

say "The operator calls the caller from the order: the answer has no number"
COMMAND=$(uuid)
PLACED=$(api POST "/api/operator/v1/orders/$ORDER/calls" "$OPERATOR" "{\"command_id\":\"$COMMAND\",\"to\":\"CALLER\"}")
expect 201
CALL_ID=$(jq -r .id <<<"$PLACED")
[[ "$(jq -r .direction <<<"$PLACED")" == OUTBOUND ]]
[[ "$(jq -r .state <<<"$PLACED")" == RINGING ]]
if grep -q "$DIGITS" <<<"$PLACED"; then note "**The number is in the answer.**"; exit 1; fi

say "Asterisk got the number — once, even when the command is repeated"
REPEAT=$(api POST "/api/operator/v1/orders/$ORDER/calls" "$OPERATOR" "{\"command_id\":\"$COMMAND\",\"to\":\"CALLER\"}")
expect 201
[[ "$(jq -r .id <<<"$REPEAT")" == "$CALL_ID" ]]
ORIGINATED=$(api GET /sandbox/v1/calls/originated); expect 200
SENT=$(jq -c --arg id "$CALL_ID" '[.[] | select(.channel_id == $id)]' <<<"$ORIGINATED")
[[ "$(jq length <<<"$SENT")" == 1 ]]
[[ "$(jq -r '.[0].dial' <<<"$SENT")" == "$CALLER" ]]
[[ "$(jq -r '.[0].endpoint' <<<"$SENT")" == PJSIP/101 ]]

say "The operator picks up, then the caller; they talk and hang up"
asterisk "{\"type\":\"ChannelStateChange\",\"channel\":{\"id\":\"$CALL_ID\",\"state\":\"Up\"}}"
asterisk "{\"type\":\"ChannelStateChange\",\"channel\":{\"id\":\"1730055000.$RANDOM\",\"name\":\"PJSIP/trunk-0000004a\",
  \"state\":\"Up\",\"linkedid\":\"$CALL_ID\"}}"
asterisk "{\"type\":\"ChannelDestroyed\",\"cause\":16,\"channel\":{\"id\":\"$CALL_ID\",\"state\":\"Up\"}}"
STATE=PENDING
for _ in $(seq 1 30); do                                 # the recording is fetched every 10 seconds
    LOGGED=$(api GET "/api/operator/v1/calls?order_id=$ORDER" "$OPERATOR"); expect 200
    CALL=$(jq -c --arg id "$CALL_ID" '.calls[] | select(.id == $id)' <<<"$LOGGED")
    STATE=$(jq -r '.recording.state // "none"' <<<"$CALL")
    [[ "$STATE" == STORED ]] && break
    sleep 2
done
[[ "$(jq -r .state <<<"$CALL")" == ENDED ]]
[[ "$STATE" == STORED ]]
if grep -q "$DIGITS" <<<"$LOGGED"; then note "**The number is in the call log.**"; exit 1; fi

say "Clean-up: the order is cancelled, the operator goes offline"
VERSION=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR" | jq -r .version)
api POST "/api/operator/v1/orders/$ORDER/cancel" "$OPERATOR" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reason_code\":\"NO_CARS\"}" >/dev/null
expect 200
api POST /api/operator/v1/me/call-status "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"status\":\"OFFLINE\"}" >/dev/null
expect 200
note "Done: outgoing call $CALL_ID from order $ORDER, recorded."
