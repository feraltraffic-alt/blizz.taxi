#!/usr/bin/env bash
# Editing a city draft (issue #176, part B; registry 22.2 "PATCH /cities/{id}"): staff create a draft far from
# every real city, correct its name and boundary (200), are refused a self-intersecting boundary (400) and a stale
# version (409), publish it, and are refused any edit of the published city (409). The city is archived at the end.
source "$(dirname "$0")/../lib.sh"

ADMIN=$(admin_token)
LON=$(( 100 + RANDOM % 60 ))
box() {  # box WEST_LON — a 1°×1° square at latitude -70
    echo "{\"type\":\"MultiPolygon\",\"coordinates\":[[[[$1,-70],[$(( $1 + 1 )),-70],[$(( $1 + 1 )),-69],[$1,-69],[$1,-70]]]]}"
}
CROSSED="{\"type\":\"MultiPolygon\",\"coordinates\":[[[[$LON,-70],[$(( LON + 1 )),-69],[$LON,-69],[$(( LON + 1 )),-70],[$LON,-70]]]]}"

CITY=""
cleanup() {
    set +e
    [[ -n "$CITY" ]] || return 0
    local state version
    state=$(api GET "/api/admin/v1/cities?state=PUBLISHED" "$ADMIN" | jq -r --arg id "$CITY" '.cities[] | select(.id == $id) | .version')
    [[ -n "$state" ]] && api POST "/api/admin/v1/cities/$CITY/archive" "$ADMIN" \
      "{\"command_id\":\"$(uuid)\",\"expected_version\":$state,\"reason\":\"Sandbox clean-up\"}" >/dev/null
}
trap cleanup EXIT

say "Staff create a draft city in the Southern Ocean"
CITY=$(api POST /api/admin/v1/cities "$ADMIN" "{\"command_id\":\"$(uuid)\",\"code\":\"sandbox-draft-$LON-$RANDOM\",
  \"name\":\"Sandbox draft\",\"currency\":\"UAH\",\"timezone\":\"Europe/Kyiv\",\"polygon\":$(box "$LON"),
  \"priority\":0,\"reason\":\"Sandbox draft\"}" | jq -r .id)
expect 201

say "They correct its name and boundary; a self-intersecting boundary and a stale version are refused"
UPDATE="{\"command_id\":\"$(uuid)\",\"expected_version\":0,\"name\":\"Sandbox draft, corrected\",
  \"currency\":\"UAH\",\"timezone\":\"Europe/Kyiv\",\"polygon\":$(box $(( LON + 1 ))),\"priority\":0,
  \"reason\":\"Boundary moved east\"}"
EDITED=$(api POST "/api/admin/v1/cities/$CITY/update" "$ADMIN" "$UPDATE"); expect 200
[[ "$(jq -r '.state + " " + (.version|tostring)' <<<"$EDITED")" == "DRAFT 1" ]]
AGAIN=$(api POST "/api/admin/v1/cities/$CITY/update" "$ADMIN" "$UPDATE"); expect 200
[[ "$(jq -c . <<<"$AGAIN")" == "$(jq -c . <<<"$EDITED")" ]]
api POST "/api/admin/v1/cities/$CITY/update" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":1,
  \"name\":\"Crossed\",\"currency\":\"UAH\",\"timezone\":\"Europe/Kyiv\",\"polygon\":$CROSSED,\"priority\":0,
  \"reason\":\"Sandbox: a bow tie\"}" >/dev/null
expect 400
STALE=$(api POST "/api/admin/v1/cities/$CITY/update" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":0,
  \"name\":\"Stale\",\"currency\":\"UAH\",\"timezone\":\"Europe/Kyiv\",\"polygon\":$(box "$LON"),\"priority\":0,
  \"reason\":\"Sandbox: stale\"}")
expect 409
[[ "$(jq -r '.code + " " + (.current_version|tostring)' <<<"$STALE")" == "VERSION_CONFLICT 1" ]]

say "Published, the city cannot be edited here"
api POST "/api/admin/v1/cities/$CITY/publish" "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":1,\"reason\":\"Sandbox publish\"}" >/dev/null
expect 200
REFUSED=$(api POST "/api/admin/v1/cities/$CITY/update" "$ADMIN" "{\"command_id\":\"$(uuid)\",\"expected_version\":2,
  \"name\":\"Too late\",\"currency\":\"UAH\",\"timezone\":\"Europe/Kyiv\",\"polygon\":$(box $(( LON + 1 ))),
  \"priority\":0,\"reason\":\"Sandbox: after publishing\"}")
expect 409
[[ "$(jq -r .code <<<"$REFUSED")" == STATE_CONFLICT ]]
note "Done: draft $CITY corrected (200, replayed), bow tie 400, stale 409, published then edit refused 409; archived."
