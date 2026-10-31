#!/usr/bin/env bash
# Riders in the admin panel (REQ-ADM-01, section 36.4): staff find a rider by phone, open the card, block the rider —
# the session ends and a new sign-in is refused (REQ-AUTH-07) — and unblock; the rider signs in again.
source "$(dirname "$0")/../lib.sh"

RIDER_PHONE="+38066$(random_digits 7)"

say "A rider signs in"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
CLIENT_ID=$(api GET /api/rider/v1/me "$RIDER" | jq -r .subject_id); expect 200

say "Staff find the rider by the last 7 digits of the phone and open the card"
ADMIN=$(admin_token)
FOUND=$(api GET "/api/admin/v1/clients?query=${RIDER_PHONE: -7}&limit=10" "$ADMIN"); expect 200
[[ "$(jq -r --arg id "$CLIENT_ID" '[.clients[] | select(.id == $id)] | length' <<<"$FOUND")" == 1 ]]
CARD=$(api GET "/api/admin/v1/clients/$CLIENT_ID" "$ADMIN"); expect 200
[[ "$(jq -r .client.account_state <<<"$CARD")" == ACTIVE ]]
VERSION=$(jq -r .client.version <<<"$CARD")

say "A block needs a reason"
api POST "/api/admin/v1/clients/$CLIENT_ID/block" "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reason\":\" \"}" >/dev/null
expect 400

say "Staff block the rider; the rider's session ends at once"
BLOCKED=$(api POST "/api/admin/v1/clients/$CLIENT_ID/block" "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reason\":\"Abusive calls to drivers\"}")
expect 200
[[ "$(jq -r .account_state <<<"$BLOCKED")" == BLOCKED ]]
api GET /api/rider/v1/me "$RIDER" >/dev/null
expect 401

say "A blocked rider cannot sign in"
sleep 2 # the resend pause after the sign-in code for the same phone
DEVICE="sandbox-$RANDOM"
CHALLENGE=$(api POST /auth/v1/otp/challenges "" \
  "{\"audience\":\"CLIENT\",\"phone\":\"$RIDER_PHONE\",\"device_ref\":\"$DEVICE\"}" | jq -r .challenge_id)
if [[ "$(cat /tmp/sandbox-status)" == 201 ]]; then
    CODE=$(api GET "/sandbox/v1/otp?phone=$(jq -rn --arg p "$RIDER_PHONE" '$p|@uri')" | jq -r .code); expect 200
    api POST /auth/v1/otp/verify "" \
      "{\"challenge_id\":\"$CHALLENGE\",\"code\":\"$CODE\",\"device_ref\":\"$DEVICE\"}" >/dev/null
    expect 403
else
    note "No code was sent to a blocked account (status $(cat /tmp/sandbox-status))."
fi

say "Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again"
VERSION=$(api GET "/api/admin/v1/clients/$CLIENT_ID" "$ADMIN" | jq -r .client.version); expect 200
api POST "/api/admin/v1/clients/$CLIENT_ID/unblock" "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"reason\":\"Apologised\"}" \
  | jq -e '.account_state == "ACTIVE"' >/dev/null
expect 200
sleep 2
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
api GET /api/rider/v1/me "$RIDER" >/dev/null; expect 200
note "Done: found, blocked (signed out, sign-in refused) and unblocked."
