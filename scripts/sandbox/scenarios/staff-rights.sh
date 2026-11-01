#!/usr/bin/env bash
# Rights need the acting super admin's own password (issue #142, part D2; REQ-ADM-10): a new staff member, then more
# functions for them, are refused without the password or with a wrong one (403) and pass with it; a new surname alone
# needs none. The new member is suspended at the end.
source "$(dirname "$0")/../lib.sh"

ADMIN=$(admin_token)
CITY=$(api GET /api/config/v1/bootstrap | jq -r '.cities[0].id'); expect 200
LOGIN="sandbox-rights-$(random_digits 6)"
profile() {  # profile PERMISSIONS LAST_NAME
    echo "{\"first_name\":\"Olena\",\"last_name\":\"$2\",\"contacts\":{\"email\":\"$LOGIN@example.invalid\"},
      \"role\":\"OPERATOR\",\"permissions\":$1,\"all_cities\":false,\"city_ids\":[\"$CITY\"]}"
}

MEMBER=""
cleanup() {
    set +e
    [[ -n "$MEMBER" ]] || return 0
    local version
    version=$(api GET "/api/admin/v1/staff/$MEMBER" "$ADMIN" | jq -r .version)
    api POST "/api/admin/v1/staff/$MEMBER/suspend" "$ADMIN" \
      "{\"command_id\":\"$(uuid)\",\"expected_version\":$version,\"reason\":\"Sandbox clean-up\"}" >/dev/null
}
trap cleanup EXIT

say "A new operator without the super admin's password is refused"
CREATE="{\"command_id\":\"$(uuid)\",\"login\":\"$LOGIN\",\"initial_password\":\"Sandbox-Operator-2026\",
  \"profile\":$(profile '["orders.view"]' Shevchenko),\"reason\":\"Sandbox operator\""
api POST /api/admin/v1/staff "$ADMIN" "$CREATE}" >/tmp/sandbox-staff.json; expect 403
jq -e '.code == "ACCESS_DENIED"' /tmp/sandbox-staff.json >/dev/null
MEMBER=$(api POST /api/admin/v1/staff "$ADMIN" "$CREATE,\"password\":\"$ADMIN_PASSWORD\"}" | jq -r .id); expect 201

say "More functions: refused with a wrong password, done with the right one"
VERSION=$(api GET "/api/admin/v1/staff/$MEMBER" "$ADMIN" | jq -r .version); expect 200
api POST "/api/admin/v1/staff/$MEMBER/update" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"profile\":$(profile '["orders.view","orders.create"]' Shevchenko),\"reason\":\"Takes phone orders\",
  \"password\":\"not-the-password\"}" >/tmp/sandbox-staff.json
expect 403
jq -e '.code == "ACCESS_DENIED"' /tmp/sandbox-staff.json >/dev/null
UPDATED=$(api POST "/api/admin/v1/staff/$MEMBER/update" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$VERSION,\"profile\":$(profile '["orders.view","orders.create"]' Shevchenko),
  \"reason\":\"Takes phone orders\",\"password\":\"$ADMIN_PASSWORD\"}")
expect 200
jq -e '.profile.permissions | index("orders.create")' <<<"$UPDATED" >/dev/null

say "A new surname alone needs no password"
api POST "/api/admin/v1/staff/$MEMBER/update" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$UPDATED"),\"profile\":$(profile '["orders.view","orders.create"]' Kovalenko),
  \"reason\":\"Married name\"}" | jq -e '.profile.last_name == "Kovalenko"' >/dev/null
expect 200

say "A password reset hands the account over: refused without the super admin's password, done with it (#173)"
VERSION=$(api GET "/api/admin/v1/staff/$MEMBER" "$ADMIN" | jq -r .version); expect 200
RESET="{\"command_id\":\"$(uuid)\",\"expected_version\":$VERSION,
  \"temporary_password\":\"Sandbox-Temporary-2026\",\"reason\":\"Forgot the password\""
api POST "/api/admin/v1/staff/$MEMBER/reset-password" "$ADMIN" "$RESET}" >/tmp/sandbox-staff.json; expect 403
jq -e '.code == "ACCESS_DENIED"' /tmp/sandbox-staff.json >/dev/null
api POST "/api/admin/v1/staff/$MEMBER/reset-password" "$ADMIN" "$RESET,\"password\":\"$ADMIN_PASSWORD\"}" \
  | jq -e '.password_change_required == true' >/dev/null
expect 200
note "Done: $LOGIN created and given orders.create only with the password; the surname changed without it; the \
password reset needed it too."
