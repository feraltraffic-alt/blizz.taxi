#!/usr/bin/env bash
# A rider moves to a new phone (REQ-AUTH-08): codes to the current and to the new phone, both needed; the other
# session ends, the new phone signs in to the same account. Then the rider loses that phone, and support sets
# another one with a reason; every session ends. Riders only, made fresh: nothing shared to restore.
source "$(dirname "$0")/../lib.sh"

random_phone() { echo "+38063$(random_digits 7)"; }
code_for() { api GET "/sandbox/v1/otp?phone=$(jq -rn --arg p "$1" '$p|@uri')" | jq -r .code; }

OLD=$(random_phone); NEW=$(random_phone); LAST=$(random_phone)

say "A rider signs in on two phones' worth of sessions"
RIDER=$(sign_in CLIENT "$OLD")
ID=$(api GET /api/rider/v1/me "$RIDER" | jq -r .subject_id); expect 200
sleep 2 # the resend pause after the sign-in code for the same phone
OTHER_SESSION=$(sign_in CLIENT "$OLD")

say "A code to the current phone and one to the new phone"
sleep 2
CURRENT=$(api POST /api/rider/v1/me/phone-change/current-code "$RIDER" | jq -r .challenge_id); expect 201
CURRENT_CODE=$(code_for "$OLD")
FRESH=$(api POST /api/rider/v1/me/phone-change/new-code "$RIDER" "{\"phone\":\"$NEW\"}" | jq -r .challenge_id)
expect 201
NEW_CODE=$(code_for "$NEW")

say "The code to the new phone alone is not enough"
WRONG=$([[ "$CURRENT_CODE" == 000000 ]] && echo 111111 || echo 000000)
api POST /api/rider/v1/me/phone-change "$RIDER" "{\"command_id\":\"$(uuid)\",\"current_challenge_id\":\"$CURRENT\",
  \"current_code\":\"$WRONG\",\"new_challenge_id\":\"$FRESH\",\"new_code\":\"$NEW_CODE\"}" >/dev/null
expect 422

say "With both codes the phone changes; the other session ends, this one stays"
api POST /api/rider/v1/me/phone-change "$RIDER" "{\"command_id\":\"$(uuid)\",\"current_challenge_id\":\"$CURRENT\",
  \"current_code\":\"$CURRENT_CODE\",\"new_challenge_id\":\"$FRESH\",\"new_code\":\"$NEW_CODE\"}" \
  | jq -e --arg p "$NEW" '.phone == $p' >/dev/null
expect 200
api GET /api/rider/v1/me "$RIDER" >/dev/null; expect 200
api GET /api/rider/v1/me "$OTHER_SESSION" >/dev/null; expect 401

say "The new phone signs in to the same account"
sleep 2
AGAIN=$(sign_in CLIENT "$NEW")
[[ "$(api GET /api/rider/v1/me "$AGAIN" | jq -r .subject_id)" == "$ID" ]]

say "The rider loses the phone: support checks who it is and sends a code to the new phone"
ADMIN=$(admin_token)
VERSION=$(api GET "/api/admin/v1/clients/$ID" "$ADMIN" | jq -r .client.version); expect 200
SUPPORT=$(api POST "/api/admin/v1/clients/$ID/phone/new-code" "$ADMIN" "{\"phone\":\"$LAST\"}" | jq -r .challenge_id)
expect 201
SUPPORT_CODE=$(code_for "$LAST")

say "Without the right code nothing changes; with it, support sets the phone"
WRONG_SUPPORT=$(( (10#$SUPPORT_CODE + 1) % 1000000 )); WRONG_SUPPORT=$(printf '%06d' "$WRONG_SUPPORT")
api POST "/api/admin/v1/clients/$ID/phone" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"new_challenge_id\":\"$SUPPORT\",\"new_code\":\"$WRONG_SUPPORT\",\"reason\":\"Passport checked at the office\"}" >/dev/null
expect 422
api POST "/api/admin/v1/clients/$ID/phone" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"new_challenge_id\":\"$SUPPORT\",\"new_code\":\"$SUPPORT_CODE\",\"reason\":\" \"}" >/dev/null
expect 400
api POST "/api/admin/v1/clients/$ID/phone" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"new_challenge_id\":\"$SUPPORT\",\"new_code\":\"$SUPPORT_CODE\",\"reason\":\"Passport checked at the office\"}" \
  | jq -e --arg p "$LAST" '.phone == $p' >/dev/null
expect 200
api GET /api/rider/v1/me "$AGAIN" >/dev/null; expect 401
RIDER=$(sign_in CLIENT "$LAST")
[[ "$(api GET /api/rider/v1/me "$RIDER" | jq -r .subject_id)" == "$ID" ]]
note "Done: changed with both codes (one was not enough), then by support with a code to the new phone and a reason; sessions ended each time."
