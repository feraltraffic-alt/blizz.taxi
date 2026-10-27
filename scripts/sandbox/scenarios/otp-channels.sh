#!/usr/bin/env bash
# One-time codes by SMS or by a call (ADR 0012 Q-18, issue #59), on the sandbox's fake provider: an SMS, "call me
# instead", an SMS that does not get through and falls back to a call, and what support sees for each phone.
source "$(dirname "$0")/../lib.sh"

random_phone() { echo "+38067$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"; }
# The fake provider refuses an SMS to a number ending in 0000.
NO_SMS_PHONE="+38067$(printf '%03d' $(( RANDOM % 1000 )))0000"

# challenge PHONE [CHANNEL] — asks for a sign-in code; prints the channel the code finally went by.
challenge() {
    local channel_json=""
    [[ -n "${2:-}" ]] && channel_json=",\"channel\":\"$2\""
    api POST /auth/v1/otp/challenges "" \
        "{\"audience\":\"CLIENT\",\"phone\":\"$1\",\"device_ref\":\"sandbox-$RANDOM\"$channel_json}" >/dev/null
    expect 201
    api GET "/sandbox/v1/otp?phone=$(jq -rn --arg p "$1" '$p|@uri')" | jq -r .channel
    expect 200
}

say "A code by SMS, the default channel"
SMS_PHONE=$(random_phone)
[[ "$(challenge "$SMS_PHONE")" == SMS ]]

say "\"Call me instead\" from the sign-in screen"
CALL_PHONE=$(random_phone)
[[ "$(challenge "$CALL_PHONE" VOICE)" == VOICE ]]

say "The SMS does not get through, so the code comes by a call"
[[ "$(challenge "$NO_SMS_PHONE")" == VOICE ]]

say "What support sees: the attempts, never the code"
ADMIN=$(admin_token)
SEEN=$(api GET "/api/admin/v1/otp-deliveries?phone=$(jq -rn --arg p "$NO_SMS_PHONE" '$p|@uri')" "$ADMIN"); expect 200
jq -e '[.deliveries[] | "\(.channel) \(.state)"] | sort == ["SMS FAILED", "VOICE SENT"]' <<<"$SEEN" >/dev/null
CODE=$(api GET "/sandbox/v1/otp?phone=$(jq -rn --arg p "$NO_SMS_PHONE" '$p|@uri')" | jq -r .code)
if grep -q "$CODE" <<<"$(jq -c '[.deliveries[] | .error, .provider_ref]' <<<"$SEEN")"; then
    note "**The delivery record shows the code.**"; exit 1
fi
SEEN=$(api GET "/api/admin/v1/otp-deliveries?phone=$(jq -rn --arg p "$CALL_PHONE" '$p|@uri')" "$ADMIN"); expect 200
jq -e '[.deliveries[].channel] == ["VOICE"]' <<<"$SEEN" >/dev/null
note "Done: SMS to $SMS_PHONE, a call to $CALL_PHONE, SMS then a call to $NO_SMS_PHONE."
