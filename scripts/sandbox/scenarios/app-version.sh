#!/usr/bin/env bash
# App version and forced update (REQ-API-10): Ivan takes an order, then staff raise the driver apps' minimum while he
# is on the way. With his old app he still finishes the trip and closes his shift, but cannot go online again until
# he updates. The settings are put back and Ivan goes offline even when a step fails.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4501,"lon":30.5234}'    # Майдан Незалежності
DROPOFF='{"lat":50.4405,"lon":30.4890}'   # Залізничний вокзал
OLD_APP=("X-App-Platform: DRIVER_ANDROID" "X-App-Version: 1.0.0")

ADMIN=$(admin_token)
SAVED=$(api GET /api/admin/v1/settings "$ADMIN" | jq -c .settings)
expect 200
restore() {
    API_HEADERS=()
    local now
    now=$(api GET /api/admin/v1/settings "$ADMIN")
    api POST /api/admin/v1/settings "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$now"),
      \"settings\":$SAVED,\"reason\":\"Sandbox: app version scenario over\"}" >/dev/null
    go_offline "$IVAN" || true
}

say "Ivan is online with his app and takes an order"
IVAN=$(sign_in DRIVER "+380500000001")
trap restore EXIT
SESSION=$(go_online "$IVAN" 5a000000-0000-4000-8000-000000000501 50.4510 30.5234)
RIDER=$(sign_in CLIENT "+38063$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}" \
  >/dev/null
expect 201
OFFER=$(api GET /api/driver/v1/offers "$IVAN" | jq -r '.[0].id')
api POST "/api/driver/v1/offers/$OFFER/accept" "$IVAN" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200

say "While Ivan drives, staff require driver apps 9.0.0 or newer"
NOW=$(api GET /api/admin/v1/settings "$ADMIN")
RAISED=$(jq -c '.settings.app_versions.driver_android = {"minimum_version":"9.0.0","latest_version":"9.0.0"}
  | .settings.app_versions.driver_ios = {"minimum_version":"9.0.0","latest_version":"9.0.0"} | .settings' <<<"$NOW")
api POST /api/admin/v1/settings "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$NOW"),
  \"settings\":$RAISED,\"reason\":\"Sandbox: force an update\"}" >/dev/null
expect 200
api GET /api/config/v1/bootstrap | jq -e '.app_versions.driver_android.minimum_version == "9.0.0"' >/dev/null
expect 200

say "With the old app Ivan still finishes the trip"
API_HEADERS=("${OLD_APP[@]}")
TRIP=$(api GET /api/driver/v1/trips/current "$IVAN"); expect 200
move "$IVAN" "$SESSION" 50.4502 30.5234 2
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$IVAN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$IVAN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$IVAN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\",\"cash_received\":true}" >/dev/null
expect 200

say "He closes his shift, and cannot go online again with the old app"
go_offline "$IVAN"
api POST /api/driver/v1/work-sessions "$IVAN" "{\"command_id\":\"$(uuid)\",
  \"vehicle_id\":\"5a000000-0000-4000-8000-000000000501\",\"location\":$(location 50.4510 30.5234)}" >/dev/null
expect 426
jq -e '.code == "UPGRADE_REQUIRED" and .minimum_version == "9.0.0"' /tmp/sandbox-body >/dev/null

say "After the update he can"
API_HEADERS=("X-App-Platform: DRIVER_ANDROID" "X-App-Version: 9.0.0")
api POST /api/driver/v1/work-sessions "$IVAN" "{\"command_id\":\"$(uuid)\",
  \"vehicle_id\":\"5a000000-0000-4000-8000-000000000501\",\"location\":$(location 50.4510 30.5234)}" >/dev/null
expect 201
API_HEADERS=()
note "Done: an outdated driver app finished its trip, then was asked to update before going online."
