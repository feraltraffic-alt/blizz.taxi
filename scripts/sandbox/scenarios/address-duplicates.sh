#!/usr/bin/env bash
# Duplicates of the service's own addresses (issue #142, part D3; REQ-GEO-14): staff add a house in Kyiv; the same
# house 10 m away is refused with 409 naming the first; saved as distinct with a reason it is accepted. Hidden and
# restored, it is refused again unless restored as distinct. Both are hidden at the end.
source "$(dirname "$0")/../lib.sh"

ADMIN=$(admin_token)
CITY=$(api GET /api/config/v1/bootstrap | jq -r '[.cities[] | select(.currency == "UAH")][0].id'); expect 200
# A house number no real address in the sandbox data uses, so the first create is never itself a duplicate.
HOUSE="$(( 900 + RANDOM % 99 ))"
data() {  # data LAT
    echo "{\"city_id\":\"$CITY\",\"kind\":\"HOUSE\",\"label\":\"Хрещатик, $HOUSE\",\"language\":\"uk\",
      \"street\":\"Хрещатик\",\"house_raw\":\"$HOUSE\",\"pickup\":{\"lat\":$1,\"lon\":30.5234}}"
}

CREATED=()
cleanup() {
    set +e
    local id version
    for id in "${CREATED[@]}"; do
        version=$(api GET "/api/admin/v1/addresses/$id" "$ADMIN" | jq -r .version)
        api POST "/api/admin/v1/addresses/$id/hide" "$ADMIN" \
          "{\"command_id\":\"$(uuid)\",\"expected_version\":$version,\"reason\":\"Sandbox clean-up\"}" >/dev/null
    done
}
trap cleanup EXIT

say "Staff add Хрещатик, $HOUSE"
FIRST=$(api POST /api/admin/v1/addresses "$ADMIN" "{\"command_id\":\"$(uuid)\",\"data\":$(data 50.4501),
  \"reason\":\"Sandbox address\"}" | jq -r .id)
expect 201
CREATED+=("$FIRST")

say "The same house 10 m away is a duplicate naming the first"
api POST /api/admin/v1/addresses "$ADMIN" "{\"command_id\":\"$(uuid)\",\"data\":$(data 50.45019),
  \"reason\":\"Sandbox duplicate\"}" >/tmp/sandbox-address.json
expect 409
jq -e --arg id "$FIRST" '.code == "STATE_CONFLICT" and .duplicate_of == $id' /tmp/sandbox-address.json >/dev/null

say "Saved as distinct with a reason, it is accepted"
SECOND=$(api POST /api/admin/v1/addresses "$ADMIN" "{\"command_id\":\"$(uuid)\",\"data\":$(data 50.45019),
  \"reason\":\"Sandbox: the yard entrance is another pickup point\",\"distinct\":true}" | jq -r .id)
expect 201
CREATED+=("$SECOND")
[[ "$SECOND" != "$FIRST" ]]

say "Hidden, then restored: a duplicate again unless restored as distinct"
VERSION=$(api GET "/api/admin/v1/addresses/$SECOND" "$ADMIN" | jq -r .version); expect 200
VERSION=$(api POST "/api/admin/v1/addresses/$SECOND/hide" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$VERSION,\"reason\":\"Sandbox: closed for repairs\"}" | jq -r .version)
expect 200
api POST "/api/admin/v1/addresses/$SECOND/restore" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$VERSION,\"reason\":\"Sandbox: open again\"}" >/tmp/sandbox-address.json
expect 409
jq -e --arg id "$FIRST" '.duplicate_of == $id' /tmp/sandbox-address.json >/dev/null
api POST "/api/admin/v1/addresses/$SECOND/restore" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$VERSION,\"reason\":\"Sandbox: the yard entrance is open again\",\"distinct\":true}" \
  | jq -e '.visibility == "ACTIVE"' >/dev/null
expect 200
note "Done: Хрещатик, $HOUSE added, its duplicate refused with duplicate_of, saved and restored only as distinct; both hidden."
