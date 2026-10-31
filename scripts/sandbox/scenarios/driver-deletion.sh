#!/usr/bin/env bash
# A driver deletes the account (issue #144): asks with a deletion code; while the request is pending the session is
# limited (no offers: 403 ACCOUNT_NOT_ACTIVE) but the request can be seen and withdrawn; staff see what blocks it and
# complete it; the old token gives 401 and the same phone signs in as a new driver.
source "$(dirname "$0")/../lib.sh"

DRIVER_PHONE="+38095$(random_digits 7)"

say "A new driver signs in"
DRIVER=$(sign_in DRIVER "$DRIVER_PHONE")
DRIVER_ID=$(api GET /api/driver/v1/me "$DRIVER" | jq -r .subject_id); expect 200

say "Step one: a code to confirm the deletion"
sleep 2 # the resend pause after the sign-in code for the same phone
CHALLENGE=$(api POST /api/driver/v1/me/deletion-request/challenge "$DRIVER" | jq -r .challenge_id); expect 201
CODE=$(api GET "/sandbox/v1/otp?phone=$(jq -rn --arg p "$DRIVER_PHONE" '$p|@uri')" | jq -r .code); expect 200

say "Step two: the request; this session stays, the account is DELETION_PENDING"
PENDING=$(api POST /api/driver/v1/me/deletion-request "$DRIVER" \
    "{\"command_id\":\"$(uuid)\",\"challenge_id\":\"$CHALLENGE\",\"otp_code\":\"$CODE\"}"); expect 200
[[ "$(jq -r .account_state <<<"$PENDING")" == DELETION_PENDING ]]

say "While it is pending the driver gets no offers, but still reads the profile"
api GET /api/driver/v1/offers "$DRIVER" >/dev/null; expect 403
[[ "$(jq -r .code /tmp/sandbox-body)" == ACCOUNT_NOT_ACTIVE ]]
api GET /api/driver/v1/me "$DRIVER" >/dev/null; expect 200

say "Staff see the request with nothing blocking it and complete it"
ADMIN=$(admin_token)
LIST=$(api GET /api/admin/v1/driver-deletions "$ADMIN"); expect 200
jq -e --arg d "$DRIVER_ID" '.requests[] | select(.driver_id == $d) | .blockers.blocked == false' <<<"$LIST" >/dev/null
DONE=$(api POST "/api/admin/v1/driver-deletions/$DRIVER_ID/complete" "$ADMIN" \
    "{\"command_id\":\"$(uuid)\",\"reason\":\"Sandbox: the driver confirmed by code\"}"); expect 200
[[ "$(jq -r .account_state <<<"$DONE")" == ANONYMIZED ]]

say "The old token no longer works; the phone signs in as a new driver"
api GET /api/driver/v1/me "$DRIVER" >/dev/null; expect 401
AGAIN=$(sign_in DRIVER "$DRIVER_PHONE")
NEW_ID=$(api GET /api/driver/v1/me "$AGAIN" | jq -r .subject_id); expect 200
[[ "$NEW_ID" != "$DRIVER_ID" ]]
note "Done: driver $DRIVER_ID anonymized; the phone now belongs to driver $NEW_ID."
