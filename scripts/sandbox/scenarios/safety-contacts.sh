#!/usr/bin/env bash
# The safety button (REQ-RID-09) in Warszawa: the admin sets the city's support and emergency contacts; the rider
# and the driver on line read them. Nothing goes to emergency services by itself (disclaimer NO_AUTO_DISPATCH).
source "$(dirname "$0")/../lib.sh"

CITY="5a000000-0000-4000-8000-000000000002"   # Warszawa
DRIVER_PHONE="+48500000001"; DRIVER_VEHICLE="5a000000-0000-4000-8000-000000000504"
RIDER_PHONE="+48$(printf '%09d' $(( (RANDOM * 32768 + RANDOM) % 1000000000 )))"
SUPPORT="+48220000101"   # fictional numbers
HOTLINE="+48220000997"

# check JSON JQ_FILTER — stops the scenario when the filter is not true for the JSON.
check() {
    if ! jq -e "$2" >/dev/null <<<"$1"; then
        note "**Check failed: $2 — scenario stopped.**"
        exit 1
    fi
}

say "The admin reads the city's contacts and replaces them"
ADMIN=$(admin_token)
CURRENT=$(api GET "/api/admin/v1/settings/safety-contacts/$CITY" "$ADMIN"); expect 200
COMMAND=$(uuid)
CHANGE="{\"command_id\":\"$COMMAND\",\"expected_version\":$(jq -r .version <<<"$CURRENT"),
  \"emergency_number\":\"112\",\"support_phone\":\"$SUPPORT\",
  \"extra\":[{\"label\":{\"pl\":\"Infolinia\",\"uk\":\"Гаряча лінія\",\"ru\":\"Горячая линия\",\"en\":\"Hotline\"},
              \"phone\":\"$HOTLINE\"}],
  \"reason\":\"Sandbox: contacts of Warszawa\"}"
SAVED=$(api POST "/api/admin/v1/settings/safety-contacts/$CITY" "$ADMIN" "$CHANGE"); expect 200
check "$SAVED" ".support_phone == \"$SUPPORT\" and (.extra | length) == 1"

say "The same command again changes nothing"
AGAIN=$(api POST "/api/admin/v1/settings/safety-contacts/$CITY" "$ADMIN" "$CHANGE"); expect 200
check "$AGAIN" ".version == $(jq -r .version <<<"$SAVED")"

say "The rider opens the safety button for Warszawa"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
api GET /api/rider/v1/safety-contacts "$RIDER" >/dev/null; expect 400   # no order and no city: which city?
FOR_RIDER=$(api GET "/api/rider/v1/safety-contacts?city_id=$CITY" "$RIDER"); expect 200
check "$FOR_RIDER" ".emergency_number == \"112\" and .support_phone == \"$SUPPORT\"
  and .extra[0].phone == \"$HOTLINE\" and .disclaimer_code == \"NO_AUTO_DISPATCH\""

say "The driver on line in Warszawa opens it (the city of his session)"
DRIVER=$(sign_in DRIVER "$DRIVER_PHONE")
go_online "$DRIVER" "$DRIVER_VEHICLE" 52.2350 21.0122 >/dev/null
FOR_DRIVER=$(api GET /api/driver/v1/safety-contacts "$DRIVER"); expect 200
check "$FOR_DRIVER" ".city_id == \"$CITY\" and .support_phone == \"$SUPPORT\""

say "The driver goes off line; without a session there is no city"
go_offline "$DRIVER"
api GET /api/driver/v1/safety-contacts "$DRIVER" >/dev/null; expect 409
note "Done: safety contacts of Warszawa, version $(jq -r .version <<<"$SAVED")."
