#!/usr/bin/env bash
# A recorded call (issue #60): Asterisk's events come from the sandbox's fake source, which also stands in for
# Asterisk's recording (a two-second tone). The call is taken and ends; the server fetches the recording and keeps it
# encrypted; staff with calls.listen listen to it, and every listening is in the audit. A missed call has none.
source "$(dirname "$0")/../lib.sh"

KYIV="5a000000-0000-4000-8000-000000000001"
LINE="+380441110060"                                   # a fictional service number of Kyiv
LINE_PATH=$(jq -rn --arg n "$LINE" '$n|@uri')
CALLER="+38067$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"
CHANNEL="1730052600.$RANDOM$RANDOM"
MISSED="1730052700.$RANDOM$RANDOM"

asterisk() {
    api POST /sandbox/v1/calls/events "" "$1" >/dev/null
    expect 202
}
created() { # CHANNEL
    asterisk "{\"type\":\"ChannelCreated\",\"channel\":{\"id\":\"$1\",\"linkedid\":\"$1\",\"state\":\"Ring\",
      \"caller\":{\"name\":\"\",\"number\":\"${CALLER#+}\"},\"dialplan\":{\"context\":\"from-trunk\",\"exten\":\"${LINE#+}\"}}}"
}
destroyed() { # CHANNEL
    asterisk "{\"type\":\"ChannelDestroyed\",\"cause\":16,\"channel\":{\"id\":\"$1\",\"state\":\"Up\"}}"
}
call_of() { # STATE — the newest call of $CALLER in that state, or null
    api GET "/api/operator/v1/calls?state=$1" "$OPERATOR" | jq -c --arg c "$CALLER" '[.calls[] | select(.caller_phone == $c)][0]'
    expect 200
}

say "The admin says which city the service number belongs to"
ADMIN=$(admin_token)
LINES=$(api GET /api/admin/v1/call-lines "$ADMIN"); expect 200
VERSION=$(jq -r --arg n "$LINE" '[.lines[] | select(.number == $n) | .version][0] // 0' <<<"$LINES")
api POST "/api/admin/v1/call-lines/$LINE_PATH" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"city_id\":\"$KYIV\",\"label\":\"Kyiv call centre\",\"reason\":\"Sandbox call-recording scenario\"}" >/dev/null
expect 200
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")

say "A call nobody takes: missed, no recording"
created "$MISSED"
destroyed "$MISSED"
CALL=$(call_of MISSED)
[[ "$(jq -r .recording <<<"$CALL")" == null ]]

say "A call is taken and ends: its recording is fetched from Asterisk"
created "$CHANNEL"
CALL_ID=$(call_of RINGING | jq -r .id)
api POST "/api/operator/v1/calls/$CALL_ID/answer" "$OPERATOR" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
asterisk "{\"type\":\"ChannelStateChange\",\"channel\":{\"id\":\"$CHANNEL\",\"state\":\"Up\"}}"
destroyed "$CHANNEL"
STATE=PENDING
for _ in $(seq 1 30); do                                 # the server fetches every 10 seconds
    STATE=$(call_of ENDED | jq -r --arg id "$CALL_ID" 'select(.id == $id) | .recording.state')
    [[ "$STATE" == STORED ]] && break
    sleep 2
done
note "Recording: $STATE"
[[ "$STATE" == STORED ]]
[[ "$(call_of ENDED | jq -r .recording.duration_seconds)" == 2 ]]

say "Staff with calls.listen listen to it — the whole WAV, never cached"
WAV=/tmp/sandbox-call-recording.wav
listen() {
    STATUS=$(curl -sS -o "$WAV" -D /tmp/sandbox-headers -w '%{http_code}' -H "Authorization: Bearer $OPERATOR" \
        -H 'Range: bytes=0-' "$BASE/api/operator/v1/calls/$CALL_ID/recording")
    echo "$STATUS" >/tmp/sandbox-status
    printf '\n`GET /api/operator/v1/calls/%s/recording` → **%s** (%s bytes)\n' "$CALL_ID" "$STATUS" \
        "$(stat -c %s "$WAV")" >>"$TRANSCRIPT"
}
listen
expect 200
[[ "$(head -c 4 "$WAV")" == RIFF ]]
grep -qi '^cache-control:.*no-store' /tmp/sandbox-headers
grep -qi '^content-type: audio/wav' /tmp/sandbox-headers
listen
expect 200

say "Every listening is in the audit"
CHANGES=$(api GET "/api/admin/v1/logs/changes?action=call_recording.listen&resource_id=$CALL_ID" "$ADMIN"); expect 200
[[ "$(jq '.changes | length' <<<"$CHANGES")" == 2 ]]

note "Done: call $CALL_ID recorded, listened to twice."
