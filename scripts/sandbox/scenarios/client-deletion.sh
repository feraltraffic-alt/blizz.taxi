#!/usr/bin/env bash
# A rider deletes the account (REQ-RID-10, issue #56): asks with a deletion code, cannot order while the request is
# pending, staff complete it; the profile is anonymized and the old token gives 401. Before that the rider rides with
# a note and an entrance, writes in the chat, rates the driver and asks support; after it (issue #144) all of that
# reads "[deleted]" or "—" and the points are rounded to about 1 km, while the ride's facts and the driver's words stay.
source "$(dirname "$0")/../lib.sh"

PICKUP_LAT=50.4501; PICKUP_LON=30.5234     # Київ
DROPOFF_LAT=50.4405; DROPOFF_LON=30.4890
RIDER_PHONE="+38067$(random_digits 7)"
WORDS="Соняшник$(printf '%05d' $(( RANDOM % 100000 )))"

DRIVER=""
# Whatever happens: Ivan offline.
cleanup() {
    set +e
    [[ -n "$DRIVER" ]] && go_offline "$DRIVER"
}
trap cleanup EXIT

# take_offline TOKEN — ends the driver's shift even when another phone of the driver holds it.
take_offline() {
    local current id
    current=$(api GET /api/driver/v1/work-sessions/current "$1")
    id=$(jq -r '.session_id // empty' <<<"$current" 2>/dev/null || true)
    [[ -n "$id" ]] || return 0
    current=$(api POST "/api/driver/v1/work-sessions/$id/handover" "$1" \
        "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .session_version <<<"$current")}")
    expect 200
    api POST "/api/driver/v1/work-sessions/$id/close" "$1" \
        "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .session_version <<<"$current")}" >/dev/null
    expect 200
}

say "A rider signs in and takes a quote"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
CLIENT_ID=$(api GET /api/rider/v1/me "$RIDER" | jq -r .subject_id); expect 200
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" | jq -r .id)
expect 201

say "Before leaving, the rider rides with Ivan: a note, an entrance, a chat message, a rating"
for phone in "+380500000001" "+380500000002" "+380500000003"; do take_offline "$(sign_in DRIVER "$phone")"; done
DRIVER=$(sign_in DRIVER "+380500000001")
SESSION=$(go_online "$DRIVER" 5a000000-0000-4000-8000-000000000501 50.4503 "$PICKUP_LON")
RIDE_QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON}}" \
  | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$RIDE_QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},\"pickup_label\":\"Дім $WORDS\",
  \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"dropoff_label\":\"Робота $WORDS\",
  \"payment_method\":\"CASH\",
  \"comment\":\"Валіза, $WORDS\",\"entrance\":\"Під'їзд 3, $WORDS\"}" | jq -r .id)
expect 201
OFFER=""
for _ in $(seq 1 10); do
    OFFER=$(api GET /api/driver/v1/offers "$DRIVER" \
        | jq -r --arg o "$ORDER" '[.[] | select(.order_id == $o)][0].id // empty')
    [[ -n "$OFFER" ]] && break
    sleep 1
done
api POST "/api/driver/v1/offers/$OFFER/accept" "$DRIVER" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
api POST "/api/rider/v1/orders/$ORDER/messages" "$RIDER" \
    "{\"command_id\":\"$(uuid)\",\"body\":\"Я в червоній куртці, $RIDER_PHONE, $WORDS\"}" >/dev/null
expect 201
TRIP=$(api GET /api/driver/v1/trips/current "$DRIVER"); expect 200
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/messages" "$DRIVER" \
    "{\"command_id\":\"$(uuid)\",\"body\":\"Буду за хвилину\"}" >/dev/null
expect 201
move "$DRIVER" "$SESSION" 50.4503 "$PICKUP_LON" 2
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$DRIVER" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$DRIVER" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
move "$DRIVER" "$SESSION" "$DROPOFF_LAT" "$DROPOFF_LON" 3
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$DRIVER" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\",\"cash_received\":true}" >/dev/null
expect 200
go_offline "$DRIVER"; DRIVER=""
api POST "/api/rider/v1/orders/$ORDER/rating" "$RIDER" \
    "{\"command_id\":\"$(uuid)\",\"score\":3,\"comment\":\"Запізнився, $WORDS\"}" >/dev/null
expect 200

say "The rider asks support about a lost bag; an operator resolves it"
CASE=$(api POST /api/rider/v1/support/cases "$RIDER" "{\"command_id\":\"$(uuid)\",\"category\":\"LOST_ITEM\",
  \"order_id\":\"$ORDER\",\"subject\":\"Сумка $WORDS\",\"message\":\"Залишила сумку, $RIDER_PHONE\"}")
expect 201
CASE_ID=$(jq -r .id <<<"$CASE")
admin_token >/dev/null
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
api POST "/api/operator/v1/support/cases/$CASE_ID/resolve" "$OPERATOR" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$CASE"),\"text\":\"Сумку повернули, $WORDS\"}" >/dev/null
expect 200

say "Step one: a code to confirm the deletion (a sign-in code would not do)"
sleep 2 # the resend pause after the sign-in code for the same phone
api POST /api/rider/v1/me/deletion-request/challenge "$RIDER" >/tmp/sandbox-deletion-challenge; expect 201
CHALLENGE=$(jq -r .challenge_id /tmp/sandbox-deletion-challenge)
CODE=$(api GET "/sandbox/v1/otp?phone=$(jq -rn --arg p "$RIDER_PHONE" '$p|@uri')" | jq -r .code); expect 200

say "Step two: the request; this session stays, the account is DELETION_PENDING"
REQUEST="{\"command_id\":\"$(uuid)\",\"challenge_id\":\"$CHALLENGE\",\"otp_code\":\"$CODE\"}"
PENDING=$(api POST /api/rider/v1/me/deletion-request "$RIDER" "$REQUEST"); expect 200
[[ "$(jq -r .account_state <<<"$PENDING")" == DELETION_PENDING ]]

say "While it is pending the rider cannot order"
api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":{\"lat\":$PICKUP_LAT,\"lon\":$PICKUP_LON},
  \"dropoff\":{\"lat\":$DROPOFF_LAT,\"lon\":$DROPOFF_LON},\"payment_method\":\"CASH\"}" >/dev/null
expect 403
[[ "$(jq -r .code /tmp/sandbox-body)" == ACCOUNT_NOT_ACTIVE ]]

say "Staff see the request with nothing blocking it and complete it"
ADMIN=$(admin_token)
LIST=$(api GET /api/admin/v1/client-deletions "$ADMIN"); expect 200
jq -e --arg c "$CLIENT_ID" '.requests[] | select(.client_id == $c) | .blockers.blocked == false' <<<"$LIST" >/dev/null
api POST "/api/admin/v1/client-deletions/$CLIENT_ID/complete" "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"reason\":\"Sandbox: the rider confirmed by code\"}" >/dev/null; expect 200

say "The old token no longer works"
api GET /api/rider/v1/me "$RIDER" >/dev/null; expect 401

say "What the rider wrote is gone, the points are rounded; the ride's facts and the driver's words stay"
VIEW=""
for _ in $(seq 1 20); do
    VIEW=$(api GET "/api/operator/v1/orders/$ORDER" "$OPERATOR"); expect 200
    [[ "$(jq -r .pickup_label <<<"$VIEW")" == "—" ]] && break
    sleep 1
done
[[ "$(jq -r .pickup_label <<<"$VIEW")" == "—" && "$(jq -r .dropoff_label <<<"$VIEW")" == "—" ]]
[[ "$(jq -r .comment <<<"$VIEW")" == "[deleted]" && "$(jq -r .entrance <<<"$VIEW")" == "[deleted]" ]]
[[ "$(jq -r .pickup.lat <<<"$VIEW")" == 50.45 && "$(jq -r .pickup.lon <<<"$VIEW")" == 30.52 ]]
[[ "$(jq -r .status <<<"$VIEW")" == FULFILLED && "$(jq -r '.price_minor > 0' <<<"$VIEW")" == true ]]
CHAT=$(api GET "/api/operator/v1/orders/$ORDER/messages?reason=Sandbox%20privacy%20check" "$OPERATOR"); expect 200
[[ "$(jq -r '[.messages[] | select(.sender_role == "RIDER")][0].body' <<<"$CHAT")" == "[deleted]" ]]
[[ "$(jq -r '[.messages[] | select(.sender_role == "DRIVER")][0].body' <<<"$CHAT")" == "Буду за хвилину" ]]
SUPPORT=$(api GET "/api/operator/v1/support/cases/$CASE_ID" "$OPERATOR"); expect 200
[[ "$(jq -r .subject <<<"$SUPPORT")" == "[deleted]" ]]
[[ "$(jq -r '[.messages[].body] | unique | join(",")' <<<"$SUPPORT")" == "[deleted]" ]]
note "Done: client $CLIENT_ID anonymized; order $ORDER and case $CASE_ID keep no word of theirs ($WORDS)."
