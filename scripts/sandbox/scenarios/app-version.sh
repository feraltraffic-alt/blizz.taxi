#!/usr/bin/env bash
# REQ-API-10: staff raise the driver minimum; settings are restored even if a step fails.
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

UPDATED=$(jq -c '.settings.app_versions.driver_android.minimum_version = "9.0.0"' <<<"$CURRENT")
api POST /api/admin/v1/settings "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,\"settings\":$UPDATED,\"reason\":\"Sandbox: force update\"}" >/dev/null
expect 200

say "Bootstrap shows the raised minimum"
api GET /api/config/v1/bootstrap | jq -e '.app_versions.driver_android.minimum_version == "9.0.0"' >/dev/null
expect 200

say "Settings will be restored by trap on exit"
