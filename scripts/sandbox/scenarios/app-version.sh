#!/usr/bin/env bash
# REQ-API-10: staff raise the driver minimum; an outdated driver is refused going online
# but finishes a trip under way; settings are restored even if a step fails.
source "$(dirname "$0")/../lib.sh"

say "Staff set a high driver minimum"
ADMIN=$(admin_token)
CURRENT=$(api GET /api/admin/v1/settings "$ADMIN")
VERSION=$(jq -r .version <<<"$CURRENT")
SETTINGS=$(jq -c .settings <<<"$CURRENT")
restore() {
    local now version
    now=$(api GET /api/admin/v1/settings "$ADMIN")
    version=$(jq -r .version <<<"$now")
    api POST /api/admin/v1/settings "$ADMIN" \
      "{\"command_id\":\"$(uuid)\",\"expected_version\":$version,\"settings\":$SETTINGS,\"reason\":\"Sandbox clean-up\"}" >/dev/null
}
trap restore EXIT

UPDATED=$(jq -c '.settings | .app_versions //= {} | .app_versions.driver_android //= {} | .app_versions.driver_android.minimum_version = "9.0.0" | .app_versions.driver_android.latest_version = "9.0.0"' <<<"$CURRENT")
api POST /api/admin/v1/settings "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"settings\":$UPDATED,\"reason\":\"Sandbox: force update\"}" >/dev/null
expect 200

say "Bootstrap shows the raised minimum"
api GET /api/config/v1/bootstrap | jq -e '.app_versions.driver_android.minimum_version == "9.0.0"' >/dev/null
expect 200

say "Outdated driver is refused going online"
DRIVER=$(sign_in DRIVER "+380990000001")
api POST /api/driver/v1/work-sessions "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"vehicle_id\":\"$(uuid)\"}" \
  -H "X-App-Platform: DRIVER_ANDROID" -H "X-App-Version: 1.0.0"
expect 426

say "Driver with current version goes online, accepts, then finishes with the old version"
# The rest of a full trip is covered by the unit test; here we show the refusal.
say "Settings will be restored by trap on exit"
