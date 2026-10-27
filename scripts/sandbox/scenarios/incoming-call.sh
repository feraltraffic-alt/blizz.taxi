#!/usr/bin/env bash
# An incoming call to the call centre (issue #64): Asterisk's events come from the sandbox's fake source. The call is
# logged once although an event repeats, the operator takes it, makes a phone order during it, the caller hangs up —
# the order goes on (REQ-OPS-10).
source "$(dirname "$0")/../lib.sh"

KYIV="5a000000-0000-4000-8000-000000000001"
LINE="+380441110064"                                   # a fictional service number of Kyiv
LINE_PATH=$(jq -rn --arg n "$LINE" '$n|@uri')
CALLER="+38067$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"
CHANNEL="1730052000.$RANDOM$RANDOM"
PICKUP='{"lat":50.4501,"lon":30.5234}'
DROPOFF='{"lat":50.4405,"lon":30.4890}'

# asterisk JSON — an ARI event as the service's Asterisk would send it.
asterisk() {
    api POST /sandbox/v1/calls/events "" "$1" >/dev/null
    expect 202
}

say "The admin says which city the service number belongs to"
ADMIN=$(admin_token)
LINES=$(api GET /api/admin/v1/call-lines "$ADMIN"); expect 200
VERSION=$(jq -r --arg n "$LINE" '[.lines[] | select(.number == $n) | .version][0] // 0' <<<"$LINES")
api POST "/api/admin/v1/call-lines/$LINE_PATH" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"city_id\":\"$KYIV\",\"label\":\"Kyiv call centre\",\"reason\":\"Sandbox incoming-call scenario\"}" >/dev/null
expect 200

say "A call comes in; Asterisk reports it twice — one call in the log"
CREATED="{\"type\":\"ChannelCreated\",\"timestamp\":\"$(date -u +%Y-%m-%dT%H:%M:%S.000+0000)\",
  \"channel\":{\"id\":\"$CHANNEL\",\"linkedid\":\"$CHANNEL\",\"state\":\"Ring\",
  \"caller\":{\"name\":\"\",\"number\":\"${CALLER#+}\"},\"dialplan\":{\"context\":\"from-trunk\",\"exten\":\"${LINE#+}\"}}}"
asterisk "$CREATED"
asterisk "$CREATED"
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
RINGING=$(api GET "/api/operator/v1/calls?state=RINGING" "$OPERATOR"); expect 200
CALL=$(jq -r --arg c "$CALLER" '[.calls[] | select(.caller_phone == $c)]' <<<"$RINGING")
[[ "$(jq length <<<"$CALL")" == 1 ]]
CALL_ID=$(jq -r '.[0].id' <<<"$CALL")
[[ "$(jq -r '.[0].city_id' <<<"$CALL")" == "$KYIV" ]]

say "The operator takes the call"
api POST "/api/operator/v1/calls/$CALL_ID/answer" "$OPERATOR" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
asterisk "{\"type\":\"ChannelStateChange\",\"channel\":{\"id\":\"$CHANNEL\",\"state\":\"Up\"}}"

say "During the call the operator makes a phone order, linked to the call"
QUOTE=$(api POST /api/operator/v1/quotes "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id); expect 201
ORDER=$(api POST /api/operator/v1/orders "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\",\"caller\":{\"name\":\"Caller\",\"phone\":\"$CALLER\"},
  \"call_id\":\"$CALL_ID\"}" | jq -r .id)
expect 201

say "The caller hangs up: the call is over, the order is not"
asterisk "{\"type\":\"ChannelDestroyed\",\"cause\":16,\"channel\":{\"id\":\"$CHANNEL\",\"state\":\"Up\"}}"
ENDED=$(api GET "/api/operator/v1/calls?state=ENDED" "$OPERATOR"); expect 200
jq -e --arg id "$CALL_ID" --arg o "$ORDER" \
    '.calls[] | select(.id == $id) | .order_ids == [$o]' <<<"$ENDED" >/dev/null
STATUS_NOW=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR" | jq -r .status); expect 200
[[ "$STATUS_NOW" != CANCELLED ]]

say "Clean-up: the order is cancelled"
VERSION=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR" | jq -r .version)
api POST "/api/operator/v1/orders/$ORDER/cancel" "$OPERATOR" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reason_code\":\"NO_CARS\"}" >/dev/null
expect 200
note "Done: call $CALL_ID with order $ORDER."
