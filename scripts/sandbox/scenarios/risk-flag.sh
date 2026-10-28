#!/usr/bin/env bash
# A driver risk flag (REQ-DS-08, issue #71): the driver's phone reports a jump of 40 km in a minute; the server raises
# one flag for a person to look at — nothing happens to the driver by itself. Support confirms it, raises another by
# hand and dismisses it, suspends the driver naming the flag, and reinstates him (sandbox clean-up).
source "$(dirname "$0")/../lib.sh"

DRIVER_ID="5a000000-0000-4000-8000-000000000403"
KYIV="5a000000-0000-4000-8000-000000000001"

say "The driver starts a new shift in Kyiv"
DRIVER=$(sign_in DRIVER "+380500000003")
go_offline "$DRIVER"
go_online "$DRIVER" "5a000000-0000-4000-8000-000000000503" 50.4501 30.5234 >/dev/null

say "His phone reports a jump: 40 km in one minute"
BEFORE=$(date -u -d '-60 seconds' +%Y-%m-%dT%H:%M:%SZ)
api POST /api/driver/v1/location-batches "$DRIVER" "{\"command_id\":\"$(uuid)\",\"points\":[
  {\"sequence\":$(next_sequence),\"lat\":50.4501,\"lon\":30.5234,\"accuracy_m\":5,\"recorded_at\":\"$BEFORE\"},
  {\"sequence\":$(next_sequence),\"lat\":50.8101,\"lon\":30.5234,\"accuracy_m\":5,\"recorded_at\":\"$(now_utc)\"}]}" \
  >/dev/null
expect 200

say "Support finds one open flag — the driver is still approved"
ADMIN=$(admin_token)
FLAG=null
for _ in $(seq 1 20); do                                  # the outbox delivers the jump within seconds
    FLAGS=$(api GET "/api/admin/v1/driver-risk-flags?driver_id=$DRIVER_ID&state=OPEN&city_id=$KYIV" "$ADMIN")
    expect 200
    FLAG=$(jq -c '[.flags[] | select(.kind == "IMPOSSIBLE_MOVEMENT")][0]' <<<"$FLAGS")
    [[ "$FLAG" != null ]] && break
    sleep 1
done
[[ "$FLAG" != null ]]
FLAG_ID=$(jq -r .id <<<"$FLAG")
[[ "$(jq -r '.evidence.speed_kph > 2000' <<<"$FLAG")" == true ]]
[[ "$(jq -r '.evidence | has("lat") or has("lon")' <<<"$FLAG")" == false ]]
PROFILE=$(api GET "/api/admin/v1/drivers/$DRIVER_ID" "$ADMIN"); expect 200
[[ "$(jq -r .review_status <<<"$PROFILE")" == APPROVED ]]

say "Support confirms it with a reason — once"
api POST "/api/admin/v1/driver-risk-flags/$FLAG_ID/confirm" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$FLAG"),\"reason\":\"Sandbox: the jump is real\"}" >/dev/null
expect 200
api POST "/api/admin/v1/driver-risk-flags/$FLAG_ID/dismiss" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(( $(jq -r .version <<<"$FLAG") + 1 )),\"reason\":\"Changed my mind\"}" >/dev/null
expect 409

say "A flag raised by hand, then dismissed"
MANUAL=$(api POST /api/admin/v1/driver-risk-flags "$ADMIN" "{\"command_id\":\"$(uuid)\",\"driver_id\":\"$DRIVER_ID\",
  \"city_id\":\"$KYIV\",\"reason\":\"Sandbox: a rider complained about detours\"}"); expect 201
api POST "/api/admin/v1/driver-risk-flags/$(jq -r .id <<<"$MANUAL")/dismiss" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$MANUAL"),\"reason\":\"Sandbox: the route was a detour for roadworks\"}" \
  >/dev/null
expect 200

say "The suspension is a separate action and names the confirmed flag; then the driver is reinstated"
VERSION=$(jq -r .version <<<"$PROFILE")
api POST "/api/admin/v1/drivers/$DRIVER_ID/suspend" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"reason\":\"Sandbox: impossible movement confirmed\",\"risk_flag_id\":\"$FLAG_ID\"}" >/dev/null
expect 200
VERSION=$(api GET "/api/admin/v1/drivers/$DRIVER_ID" "$ADMIN" | jq -r .version)
api POST "/api/admin/v1/drivers/$DRIVER_ID/reinstate" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"reason\":\"Sandbox clean-up\"}" >/dev/null
expect 200
go_offline "$DRIVER"
note "Done: flag $FLAG_ID confirmed, suspension named it, driver reinstated."
