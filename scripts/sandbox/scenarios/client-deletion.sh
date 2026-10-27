#!/usr/bin/env bash
# A rider deletes the account (REQ-RID-10, issue #56): asks with a deletion code, cannot order while the request is
# pending, staff complete it; the profile is anonymized and the old token gives 401.
source "$(dirname "$0")/../lib.sh"

PICKUP_LAT=50.4501; PICKUP_LON=30.5234     # Київ
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890
RIDER_PHONE="+38067$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"

say "A rider signs in and takes a quote"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
CLIENT_ID=$(api GET /api/rider/v1/me "$RIDER" | jq -r .subject_id); expect 200
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" | jq -r .id)
expect 201

say "Step one: a code to confirm the deletion (a sign-in code would not do)"
sleep 2 # the resend pause after the sign-in code for the same phone
api POST /api/rider/v1/me/deletion-request/challenge "$RIDER" >/tmp/sandbox-deletion-challenge; expect 201
CHALLENGE=$(jq -r .challenge_id /tmp/sandbox-deletion-challenge)
CODE=$(api GET "/sandbox/v1/otp?phone=$(jq -rn --arg p "$RIDER_PHONE" '$p|@uri')" | jq -r .code); expect 200

say "Step two: the request; this session stays, the account is DELETION_PENDING"
REQUEST="{\"command_id\":\"$(uuid)\",\"challenge_id\":\"$CHALLENGE\",\"otp_code\":\"$CODE\"}"
PENDING=$(api POST /api/rider/v1/me/deletion-request "$RIDER" "$REQUEST"); expect 200
[[ "$(jq -r .account_state <<<"$PENDING")" == DELETION_PENDING ]]

say "While it is pending the rider cannot order"
api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},
  \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"payment_method\":\"CASH\"}" >/dev/null
expect 403
[[ "$(jq -r .code /tmp/sandbox-body)" == ACCOUNT_NOT_ACTIVE ]]

say "Staff see the request with nothing blocking it and complete it"
ADMIN=$(admin_token)
LIST=$(api GET /api/admin/v1/client-deletions "$ADMIN"); expect 200
jq -e --arg c "$CLIENT_ID" '.requests[] | select(.client_id == $c) | .blockers.blocked == false' <<<"$LIST" >/dev/null
api POST "/api/admin/v1/client-deletions/$CLIENT_ID/complete" "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"reason\":\"Sandbox: the rider confirmed by code\"}" >/dev/null; expect 200

say "The old token no longer works"
api GET /api/rider/v1/me "$RIDER" >/dev/null; expect 401
note "Done: client $CLIENT_ID anonymized."
