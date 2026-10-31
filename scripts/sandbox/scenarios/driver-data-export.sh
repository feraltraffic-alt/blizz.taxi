#!/usr/bin/env bash
# A driver's copy of their data (issue #144, REQ-PRV-07): Ivan, who drove riders in earlier scenarios, asks with a
# code; the file has his profile, documents, vehicles, shifts, trips, balance and sessions — and no rider's phone or
# name; another driver gets 404.
source "$(dirname "$0")/../lib.sh"

DRIVER_PHONE="+380500000001"
code_for() { api GET "/sandbox/v1/otp?phone=$(jq -rn --arg p "$1" '$p|@uri')" | jq -r .code; }

say "Ivan signs in and asks for a code to confirm the copy"
DRIVER=$(sign_in DRIVER "$DRIVER_PHONE")
sleep 2 # the resend pause after the sign-in code for the same phone
CHALLENGE=$(api POST /api/driver/v1/me/data-exports/challenge "$DRIVER" | jq -r .challenge_id); expect 201
CODE=$(code_for "$DRIVER_PHONE"); expect 200

say "With the code the copy is queued (409 when Ivan already asked today, in an earlier run on this sandbox)"
ASKED=$(api POST /api/driver/v1/me/data-exports "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"challenge_id\":\"$CHALLENGE\",\"otp_code\":\"$CODE\"}")
if [[ "$(cat /tmp/sandbox-status)" == 409 ]]; then
    ID=$(api GET /api/driver/v1/me/data-exports "$DRIVER" | jq -r '.exports[0].id'); expect 200
else
    expect 202
    ID=$(jq -r .id <<<"$ASKED")
fi

say "The background job builds it"
STATE=""
for _ in $(seq 1 40); do
    STATE=$(api GET "/api/driver/v1/me/data-exports/$ID" "$DRIVER" | jq -r .state)
    [[ "$STATE" == READY || "$STATE" == FAILED || "$STATE" == EXPIRED ]] && break
    sleep 1
done
if [[ "$STATE" != READY ]]; then note "**The copy is $STATE — scenario stopped.**"; exit 1; fi

say "Ivan downloads it: his data, no rider's"
curl -sS -o /tmp/sandbox-driver-copy.json -w '%{http_code}' -H "Authorization: Bearer $DRIVER" \
    "$BASE/api/driver/v1/me/data-exports/$ID/file" >/tmp/sandbox-status
expect 200
note "\`GET /api/driver/v1/me/data-exports/$ID/file\` → **200**, sections:" \
    "$(jq -c '.sections | keys' /tmp/sandbox-driver-copy.json), trips: $(jq '.sections.trips | length' \
    /tmp/sandbox-driver-copy.json)"
[[ "$(jq -r .sections.profile.phone /tmp/sandbox-driver-copy.json)" == "$DRIVER_PHONE" ]]
[[ "$(jq -c '.sections | keys' /tmp/sandbox-driver-copy.json)" == \
   '["balance","documents","profile","sessions","shifts","trips","vehicles"]' ]]
# Riders of the sandbox have numbers +38063…, +38066…, +38067…, +38068…, +38073…: none is in Ivan's file.
[[ -z "$(grep -oE '\+380(63|66|67|68|73)[0-9]{7}' /tmp/sandbox-driver-copy.json || true)" ]]
[[ "$(jq '[.sections.trips[] | keys[]] | map(select(. == "pickup" or . == "pickup_label" or . == "comment"))
    | length' /tmp/sandbox-driver-copy.json)" == 0 ]]

say "Another driver does not see it"
OTHER=$(sign_in DRIVER "+380500000002")
api GET "/api/driver/v1/me/data-exports/$ID/file" "$OTHER" >/dev/null
expect 404
note "Done: Ivan's copy holds his data only."
