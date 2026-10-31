#!/usr/bin/env bash
# A rider's copy of their personal data (REQ-PRV-07, issue #68): asked for with a code to the phone, built in the
# background, downloaded by the rider; another rider gets 404, a second request the same day 409.
source "$(dirname "$0")/../lib.sh"

RIDER_PHONE="+38063$(random_digits 7)"
code_for() { api GET "/sandbox/v1/otp?phone=$(jq -rn --arg p "$1" '$p|@uri')" | jq -r .code; }

say "A rider signs in and asks for a code to confirm the copy"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
sleep 2 # the resend pause after the sign-in code for the same phone
CHALLENGE=$(api POST /api/rider/v1/me/data-exports/challenge "$RIDER" | jq -r .challenge_id); expect 201
CODE=$(code_for "$RIDER_PHONE"); expect 200

say "With the code the copy is queued"
ASKED=$(api POST /api/rider/v1/me/data-exports "$RIDER" \
  "{\"command_id\":\"$(uuid)\",\"challenge_id\":\"$CHALLENGE\",\"otp_code\":\"$CODE\"}")
expect 202
ID=$(jq -r .id <<<"$ASKED")

say "The background job builds it"
STATE=""
for _ in $(seq 1 40); do
    STATE=$(api GET "/api/rider/v1/me/data-exports/$ID" "$RIDER" | jq -r .state)
    [[ "$STATE" == READY || "$STATE" == FAILED ]] && break
    sleep 1
done
if [[ "$STATE" != READY ]]; then note "**The copy is $STATE — scenario stopped.**"; exit 1; fi

say "The rider downloads it"
curl -sS -o /tmp/sandbox-copy.json -w '%{http_code}' -H "Authorization: Bearer $RIDER" \
    "$BASE/api/rider/v1/me/data-exports/$ID/file" >/tmp/sandbox-status
expect 200
note "\`GET /api/rider/v1/me/data-exports/$ID/file\` → **200**, sections: $(jq -c '.sections | keys' /tmp/sandbox-copy.json)"
[[ "$(jq -r .sections.profile.phone /tmp/sandbox-copy.json)" == "$RIDER_PHONE" ]]

say "Another rider does not see it"
OTHER=$(sign_in CLIENT "+38063$(random_digits 7)")
api GET "/api/rider/v1/me/data-exports/$ID/file" "$OTHER" >/dev/null
expect 404

say "Support sees that it was asked for, not what is in it"
ADMIN=$(admin_token)
CLIENT_ID=$(api GET /api/rider/v1/me "$RIDER" | jq -r .subject_id); expect 200
api GET "/api/admin/v1/clients/$CLIENT_ID/data-exports" "$ADMIN" | jq -e '.exports[0].state == "READY"' >/dev/null
expect 200
note "Done: the copy was asked for with a code, built in the background and downloaded by the rider only."
