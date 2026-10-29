#!/usr/bin/env bash
# One-time codes by SMS or by a call (ADR 0012 Q-18, issues #59 and #101), on the sandbox's fake provider: an SMS,
# "call me instead" (an SMS first, the resend a call), an SMS that does not get through and a resend by a call, the
# third call in an hour refused, numbers outside Poland and Ukraine refused, and what support sees for each phone.
source "$(dirname "$0")/../lib.sh"

random_phone() { echo "+38067$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"; }
# The fake provider refuses an SMS to a number ending in 0000.
NO_SMS_PHONE="+38067$(printf '%03d' $(( RANDOM % 1000 )))0000"
uri() { jq -rn --arg p "$1" '$p|@uri'; }

# challenge PHONE [CHANNEL] — asks for a sign-in code; prints the channel the response names, after checking that
# the code went by it.
challenge() {
    local channel_json="" said went
    [[ -n "${2:-}" ]] && channel_json=",\"channel\":\"$2\""
    # The sandbox's resend delay is a second.
    sleep 1.2
    said=$(api POST /auth/v1/otp/challenges "" \
        "{\"audience\":\"CLIENT\",\"phone\":\"$1\",\"device_ref\":\"sandbox-$RANDOM\"$channel_json}" | jq -r .channel)
    expect 201
    # A failed SMS leaves no code at /sandbox/v1/otp to compare with.
    if [[ "$1" != "$NO_SMS_PHONE" || "$said" != SMS ]]; then
        went=$(api GET "/sandbox/v1/otp?phone=$(uri "$1")" | jq -r .channel)
        expect 200
        if [[ "$went" != "$said" ]]; then
            note "**The response names $said, the code went by $went.**"; exit 1
        fi
    fi
    echo "$said"
}

say "A code by SMS, the default channel"
SMS_PHONE=$(random_phone)
[[ "$(challenge "$SMS_PHONE")" == SMS ]]

say "\"Call me instead\" on the first try still gets an SMS; the resend is a call"
CALL_PHONE=$(random_phone)
[[ "$(challenge "$CALL_PHONE" VOICE)" == SMS ]]
[[ "$(challenge "$CALL_PHONE" VOICE)" == VOICE ]]

say "The SMS does not get through: one request, one attempt; the resend comes by a call"
[[ "$(challenge "$NO_SMS_PHONE")" == SMS ]]
[[ "$(challenge "$NO_SMS_PHONE")" == VOICE ]]

say "A second call in the hour is made, the third is refused"
[[ "$(challenge "$NO_SMS_PHONE" VOICE)" == VOICE ]]
sleep 1.2
api POST /auth/v1/otp/challenges "" \
    "{\"audience\":\"CLIENT\",\"phone\":\"$NO_SMS_PHONE\",\"device_ref\":\"sandbox-$RANDOM\",\"channel\":\"VOICE\"}" \
    >/dev/null
expect 429
jq -e '.code == "RATE_LIMITED"' /tmp/sandbox-body >/dev/null

say "Numbers outside Poland and Ukraine get nothing"
for FOREIGN in "+4420$(printf '%08d' $RANDOM)" "+3712$(printf '%07d' $RANDOM)"; do
    api POST /auth/v1/otp/challenges "" "{\"audience\":\"CLIENT\",\"phone\":\"$FOREIGN\"}" >/dev/null
    expect 422
    jq -e '.code == "PHONE_COUNTRY_NOT_SERVED"' /tmp/sandbox-body >/dev/null
    api GET "/sandbox/v1/otp?phone=$(uri "$FOREIGN")" >/dev/null
    expect 404
done

say "What support sees: the attempts, never the code"
ADMIN=$(admin_token)
SEEN=$(api GET "/api/admin/v1/otp-deliveries?phone=$(uri "$NO_SMS_PHONE")" "$ADMIN"); expect 200
jq -e '[.deliveries[] | "\(.channel) \(.state)"] | sort == ["SMS FAILED", "VOICE SENT", "VOICE SENT"]' <<<"$SEEN" \
    >/dev/null
jq -e '[.deliveries[].challenge_id] | length == (unique | length)' <<<"$SEEN" >/dev/null
CODE=$(api GET "/sandbox/v1/otp?phone=$(uri "$NO_SMS_PHONE")" | jq -r .code)
if grep -q "$CODE" <<<"$(jq -c '[.deliveries[] | .error, .provider_ref]' <<<"$SEEN")"; then
    note "**The delivery record shows the code.**"; exit 1
fi
SEEN=$(api GET "/api/admin/v1/otp-deliveries?phone=$(uri "$CALL_PHONE")" "$ADMIN"); expect 200
jq -e '[.deliveries[].channel] | sort == ["SMS", "VOICE"]' <<<"$SEEN" >/dev/null
note "Done: SMS to $SMS_PHONE; SMS then a call to $CALL_PHONE; a failed SMS, two calls and a refused third to \
$NO_SMS_PHONE; +44 and +371 refused."
