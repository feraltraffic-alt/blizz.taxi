#!/usr/bin/env bash
# ADR 0016, issue #214: several taxi services on one server. The platform owner creates a second service with its
# first super admin; one phone signs in to both as two riders who see nothing of each other; the second service's
# staff see only their own; suspending the service signs its people out, resuming lets them back in.
source "$(dirname "$0")/../lib.sh"

OWNER_LOGIN="${OWNER_LOGIN:-owner}"
OWNER_BOOTSTRAP_PASSWORD="${OWNER_BOOTSTRAP_PASSWORD:-Sandbox-Owner-2026}"
OWNER_PASSWORD="${OWNER_PASSWORD:-Sandbox-Owner-2026-ok}"
CODE="second-$(random_digits 6)"
BOSS_LOGIN="boss-$CODE"
RIDER_PHONE="+38050$(random_digits 7)"

say "The platform owner signs in (and changes the first password once)"
OWNER=$(staff_sign_in ADMIN "$OWNER_LOGIN" "$OWNER_PASSWORD")
if [[ "$(cat /tmp/sandbox-status)" != 200 ]]; then
    OWNER=$(staff_sign_in ADMIN "$OWNER_LOGIN" "$OWNER_BOOTSTRAP_PASSWORD"); expect 200
    api POST /api/admin/v1/me/password "$OWNER" \
      "{\"current_password\":\"$OWNER_BOOTSTRAP_PASSWORD\",\"new_password\":\"$OWNER_PASSWORD\"}" >/dev/null
    expect 204
    OWNER=$(staff_sign_in ADMIN "$OWNER_LOGIN" "$OWNER_PASSWORD"); expect 200
fi
api GET /api/admin/v1/orders "$OWNER" >/dev/null; expect 403
note "The owner reaches nothing inside a service."

say "A second taxi service with its first super admin, only with the owner's own password"
CREATE="{\"command_id\":\"$(uuid)\",\"code\":\"$CODE\",\"name\":\"Second taxi\",\"reason\":\"Sandbox: a second brand\",
  \"super_admin\":{\"login\":\"$BOSS_LOGIN\",\"initial_password\":\"Sandbox-Boss-2026\",\"first_name\":\"Iryna\",
  \"last_name\":\"Koval\"}"
api POST /api/admin/v1/services "$OWNER" "$CREATE,\"password\":\"not-the-password\"}" >/dev/null; expect 403
SERVICE=$(api POST /api/admin/v1/services "$OWNER" "$CREATE,\"password\":\"$OWNER_PASSWORD\"}"); expect 201
SERVICE_ID=$(jq -r .id <<<"$SERVICE")

say "One phone, two services: two riders"
FIRST=$(sign_in CLIENT "$RIDER_PHONE")
SECOND=$(sign_in CLIENT "$RIDER_PHONE" "$CODE")
FIRST_ID=$(api GET /api/rider/v1/me "$FIRST" | jq -r .subject_id); expect 200
SECOND_ID=$(api GET /api/rider/v1/me "$SECOND" | jq -r .subject_id); expect 200
[[ -n "$FIRST_ID" && -n "$SECOND_ID" && "$FIRST_ID" != "$SECOND_ID" ]] \
  || { note "**Expected two riders, got $FIRST_ID and $SECOND_ID.**"; exit 1; }
api GET /api/rider/v1/orders "$SECOND" | jq -e '(.items // .orders // []) | length == 0' >/dev/null; expect 200

say "The second service has no city yet: its app shows none and orders nowhere"
api GET "/api/config/v1/bootstrap?service=$CODE" "" | jq -e '.cities | length == 0' >/dev/null; expect 200
api GET "/api/rider/v1/vehicle-classes?lat=50.4501&lon=30.5234" "$SECOND" >/dev/null; expect 422

say "The second service's super admin sees their own service only"
BOSS=$(staff_sign_in ADMIN "$BOSS_LOGIN" "Sandbox-Boss-2026"); expect 200
api POST /api/admin/v1/me/password "$BOSS" \
  "{\"current_password\":\"Sandbox-Boss-2026\",\"new_password\":\"Sandbox-Boss-2026-ok\"}" >/dev/null; expect 204
BOSS=$(staff_sign_in ADMIN "$BOSS_LOGIN" "Sandbox-Boss-2026-ok"); expect 200
api GET /api/admin/v1/cities "$BOSS" | jq -e '.cities | length == 0' >/dev/null; expect 200
api GET /api/admin/v1/staff "$BOSS" | jq -e --arg l "$BOSS_LOGIN" '[.staff[].login] == [$l]' >/dev/null; expect 200

say "Suspending the service signs its rider out at once; resuming lets it sign in again"
SUSPENDED=$(api POST "/api/admin/v1/services/$SERVICE_ID/suspend" "$OWNER" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$SERVICE"),\"reason\":\"Sandbox: paused\"}"); expect 200
api GET /api/rider/v1/me "$SECOND" >/dev/null; expect 401
api GET /api/rider/v1/me "$FIRST" >/dev/null; expect 200
api POST "/api/admin/v1/services/$SERVICE_ID/resume" "$OWNER" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$SUSPENDED"),\"reason\":\"Sandbox: back\"}" >/dev/null; expect 200
sign_in CLIENT "$RIDER_PHONE" "$CODE" >/dev/null
note "Done: service $CODE created by the owner; rider $FIRST_ID in the first service and $SECOND_ID in $CODE share \
a phone and nothing else."
