#!/usr/bin/env bash
# AC-01 end to end (issue #200): a new city, a new driver through the checks, a rider's app order and an operator's
# phone order, both to the financial result. Only the tariff step uses SQL: there is no tariffs admin API yet (#30,
# deferred by the owner). The city is archived at the end. FIRST_CITY_SKIP_APPROVAL=1 is the negative control: the
# driver is not approved, and going online must be refused.
source "$(dirname "$0")/../lib.sh"

ADMIN=$(admin_token)
LON=$(( 100 + RANDOM % 60 ))
LAT_S=-61; LAT_N=-60
PICKUP="{\"lat\":-60.5,\"lon\":$LON.5}"
DROPOFF="{\"lat\":-60.45,\"lon\":$LON.55}"
TODAY=$(date -u +%F)
CITY=""; DRIVER=""

cleanup() {
    set +e
    [[ -n "$DRIVER" ]] && go_offline "$DRIVER"
    [[ -n "$CITY" ]] || return 0
    local version
    version=$(api GET "/api/admin/v1/cities?state=PUBLISHED" "$ADMIN" \
        | jq -r --arg id "$CITY" '.cities[] | select(.id == $id) | .version')
    [[ -n "$version" ]] && api POST "/api/admin/v1/cities/$CITY/archive" "$ADMIN" \
      "{\"command_id\":\"$(uuid)\",\"expected_version\":$version,\"reason\":\"Sandbox: first city done\"}" >/dev/null
}
trap cleanup EXIT

# sql STATEMENT — the sandbox database; only for the tariff, which has no API yet (#30).
sql() { $PG_RUN psql -X -q -v ON_ERROR_STOP=1 -At -c "$1"; }

# document TOKEN TYPE [VEHICLE_ID] — uploads a small PDF and registers it as a document; prints the document id.
document() {
    local pdf=/tmp/first-city-$2.pdf session file status vehicle=""
    printf '%%PDF-1.7\n1 0 obj << /Type /Catalog /Title (%s) >> endobj\n%%%%EOF\n' "$2-$RANDOM" >"$pdf"
    session=$(api POST /api/driver/v1/documents/upload-sessions "$1" \
        "{\"command_id\":\"$(uuid)\",\"content_type\":\"application/pdf\",\"size_bytes\":$(wc -c <"$pdf" | tr -d ' ')}")
    expect 201
    file=$(jq -r .file_id <<<"$session")
    status=$(curl -sS -X PUT -o /tmp/sandbox-body -w '%{http_code}' -H "Authorization: Bearer $1" \
        -H 'Content-Type: application/pdf' --data-binary @"$pdf" "$BASE$(jq -r .upload_path <<<"$session")")
    echo "$status" >/tmp/sandbox-status
    expect 200
    [[ -n "${3:-}" ]] && vehicle=",\"vehicle_id\":\"$3\""
    api POST /api/driver/v1/documents "$1" "{\"command_id\":\"$(uuid)\",\"type\":\"$2\",\"file_id\":\"$file\"$vehicle,
      \"number\":\"SANDBOX-$2-$RANDOM\",\"valid_from\":\"$(date -u -d '-1 year' +%F)\",
      \"valid_to\":\"$(date -u -d '+1 year' +%F)\"}" | jq -r .id
    expect 201
}

# posted ORDER — waits up to 30 s for the trip's fare in the journal (the posting runs on a timer).
posted() {
    local accounting=""
    for _ in $(seq 1 30); do
        accounting=$(api GET "/api/admin/v1/orders/$1/fare" "$ADMIN" | jq -r .accounting)
        [[ "$accounting" == POSTED ]] && break
        sleep 1
    done
    note "Order $1: accounting \`$accounting\`."
    [[ "$accounting" == POSTED ]] || { note "**The fare of $1 was not posted — scenario stopped.**"; exit 1; }
}

# ride TOKEN SESSION ORDER — the new driver takes the order and drives it to the end, cash received.
ride() {
    local offer trip
    offer=$(api GET /api/driver/v1/offers "$1" | jq -r --arg o "$3" '[.[] | select(.order_id == $o)][0].id')
    if [[ "$offer" == null || -z "$offer" ]]; then
        note "**No offer of $3 to the new driver — scenario stopped.**"; exit 1
    fi
    api POST "/api/driver/v1/offers/$offer/accept" "$1" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
    trip=$(api GET /api/driver/v1/trips/current "$1")
    move "$1" "$2" -60.4998 "$LON.5"
    trip=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$trip")/arrive" "$1" \
        "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$trip")}"); expect 200
    trip=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$trip")/start" "$1" \
        "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$trip")}"); expect 200
    api POST "/api/driver/v1/trips/$(jq -r .id <<<"$trip")/complete" "$1" "{\"command_id\":\"$(uuid)\",
      \"expected_version\":$(jq -r .version <<<"$trip"),\"reported_at\":\"$(now_utc)\",\"cash_received\":true}" \
      >/dev/null
    expect 200
}

say "The admin creates a new city in the Southern Ocean and publishes it"
CREATED=$(api POST /api/admin/v1/cities "$ADMIN" "{\"command_id\":\"$(uuid)\",\"code\":\"sandbox-first-$LON-$RANDOM\",
  \"name\":\"Sandbox first city\",\"currency\":\"UAH\",\"timezone\":\"Europe/Kyiv\",
  \"polygon\":{\"type\":\"MultiPolygon\",\"coordinates\":[[[[$LON,$LAT_S],[$(( LON + 1 )),$LAT_S],
  [$(( LON + 1 )),$LAT_N],[$LON,$LAT_N],[$LON,$LAT_S]]]]},\"priority\":0,
  \"reason\":\"Sandbox: the first city (AC-01)\"}")
expect 201
CITY=$(jq -r .id <<<"$CREATED")
api POST "/api/admin/v1/cities/$CITY/publish" "$ADMIN" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$CREATED"),\"reason\":\"Sandbox: open\"}" \
  >/dev/null
expect 200
OPERATIONS=$(api GET "/api/admin/v1/cities/$CITY/operations" "$ADMIN"); expect 200
api PUT "/api/admin/v1/cities/$CITY/operations" "$ADMIN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$OPERATIONS"),\"working_hours\":[],
  \"payment_methods\":[\"CASH\",\"TERMINAL\"],
  \"reason\":\"Sandbox: open around the clock, cash and terminal\"}" >/dev/null
expect 200

say "The class and the tariff: the only step in SQL, as the tariffs admin API waits for #30"
CLASS=$(uuid)
sql "insert into vehicle_class (id, city_id, code, name, active, created_at, updated_at)
     values ('$CLASS', '$CITY', 'STANDARD', 'Standard', true, now(), now());
     insert into tariff_version (id, city_id, class_id, currency, effective_from, state, pickup_minor, per_km_minor,
         per_minute_minor, minimum_minor, free_waiting_minutes, waiting_per_minute_minor, cancellation_fee_minor,
         commission_rate, waiting_step_seconds, waiting_rounding, pickup_outside_minor, per_km_outside_minor,
         zone_surcharges, created_at, updated_at)
     values ('$(uuid)', '$CITY', '$CLASS', 'UAH', now() - interval '1 minute', 'PUBLISHED', 4000, 1500, 300, 8000,
             3, 300, 0, 0.15, 60, 'UP', 4000, 1500, '[]', now(), now());"
note "Inserted one vehicle class STANDARD and one published tariff for city \`$CITY\` (#30)."

say "A new driver signs in, adds a car and the documents, and asks for the check"
DRIVER_PHONE="+38050$(random_digits 7)"
DRIVER=$(sign_in DRIVER "$DRIVER_PHONE")
api PATCH /api/driver/v1/profile "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"name\":\"Taras (sandbox)\",\"language\":\"uk\"}" >/dev/null
expect 200
VEHICLE=$(api POST /api/driver/v1/vehicles "$DRIVER" "{\"command_id\":\"$(uuid)\",
  \"registration_number\":\"AA$(random_digits 4)AA\",\"make\":\"Skoda\",\"model\":\"Octavia\",
  \"color\":\"white\",\"production_year\":2021}" | jq -r .id)
expect 201
document "$DRIVER" DRIVER_LICENSE >/dev/null
document "$DRIVER" VEHICLE_REGISTRATION "$VEHICLE" >/dev/null
document "$DRIVER" INSURANCE "$VEHICLE" >/dev/null
PROFILE=$(api GET /api/driver/v1/profile "$DRIVER"); expect 200
DRIVER_ID=$(jq -r .id <<<"$PROFILE")
note "Review status before the check: \`$(jq -r .review_status <<<"$PROFILE")\`."
SUBMITTED=$(api POST /api/driver/v1/verification/submit "$DRIVER" \
  "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$PROFILE")}")
expect 200
note "After submitting: \`$(jq -r .review_status <<<"$SUBMITTED")\`."
[[ "$(jq -r .review_status <<<"$SUBMITTED")" == IN_REVIEW ]]

if [[ "${FIRST_CITY_SKIP_APPROVAL:-}" == 1 ]]; then
    say "Negative control: the driver is not approved, so going online is refused"
else
    say "The admin approves the driver for STANDARD and admits him to the new city"
    DECIDED=$(api POST "/api/admin/v1/drivers/$DRIVER_ID/decision" "$ADMIN" "{\"command_id\":\"$(uuid)\",
      \"expected_version\":$(jq -r .version <<<"$SUBMITTED"),\"decision\":\"APPROVE\",\"reason\":\"Documents valid\",
      \"vehicle_classes\":[\"STANDARD\"]}")
    expect 200
    note "After the decision: \`$(jq -r .review_status <<<"$DECIDED")\`."
    [[ "$(jq -r .review_status <<<"$DECIDED")" == APPROVED ]]
    api PUT "/api/admin/v1/drivers/$DRIVER_ID/admission-cities" "$ADMIN" "{\"command_id\":\"$(uuid)\",
      \"expected_version\":$(jq -r .version <<<"$DECIDED"),\"city_ids\":[\"$CITY\"],
      \"reason\":\"Sandbox: the new city\"}" >/dev/null
    expect 200
fi

say "The driver goes online in the new city"
drive_to "$DRIVER" -60.49 "$LON.5"
api POST /api/driver/v1/work-sessions "$DRIVER" "{\"command_id\":\"$(uuid)\",\"vehicle_id\":\"$VEHICLE\",
  \"location\":$(location -60.49 "$LON.5")}" >/tmp/first-city-session
if [[ "${FIRST_CITY_SKIP_APPROVAL:-}" == 1 ]]; then
    note "Going online without approval: **$(cat /tmp/sandbox-status)** \`$(jq -r .code /tmp/sandbox-body)\`."
    expect 409
    note "**Negative control: the scenario stops here, as it must without the approval.**"
    exit 1
fi
expect 201
SESSION=$(jq -r .session_id /tmp/first-city-session)

say "A rider orders in the app (cash) and the new driver drives it"
RIDER=$(sign_in CLIENT "+38067$(random_digits 7)")
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}")
expect 201
[[ "$(jq -r .city_id <<<"$QUOTE")" == "$CITY" ]]
APP_ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",
  \"quote_id\":\"$(jq -r .id <<<"$QUOTE")\",\"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,
  \"pickup_label\":\"Pier\",\"dropoff\":$DROPOFF,\"dropoff_label\":\"Station\",\"payment_method\":\"CASH\"}" | jq -r .id)
expect 201
ride "$DRIVER" "$SESSION" "$APP_ORDER"

say "An operator takes a phone order (cash) and the new driver drives it"
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
QUOTE=$(api POST /api/operator/v1/quotes "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
PHONE_ORDER=$(api POST /api/operator/v1/orders "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Pier\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Station\",\"payment_method\":\"CASH\",\"caller\":{\"name\":\"Olena\",
  \"phone\":\"+38067$(random_digits 7)\"}}" | jq -r .id)
expect 201
ride "$DRIVER" "$SESSION" "$PHONE_ORDER"

say "The financial result: both fares posted, the driver's earnings and the city's money report"
posted "$APP_ORDER"
posted "$PHONE_ORDER"
for ORDER in "$APP_ORDER" "$PHONE_ORDER"; do
    SHOWN=$(api GET "/api/admin/v1/orders/$ORDER/fare" "$ADMIN"); expect 200
done
EARNINGS=$(api GET "/api/driver/v1/earnings?city_id=$CITY&from=$TODAY&to=$TODAY" "$DRIVER"); expect 200
note "Earnings today: $(jq -c '{trips: .total.trips, fares: .total.fare_minor,
  commission: .total.commission_minor, balance: .balance_minor}' <<<"$EARNINGS")."
[[ "$(jq -r .total.trips <<<"$EARNINGS")" == 2 ]]
(( $(jq -r .balance_minor <<<"$EARNINGS") < 0 ))   # cash trips: the driver owes the service its commission
REPORT=$(api GET "/api/admin/v1/reports/finance?city_id=$CITY&from=$TODAY&to=$TODAY" "$ADMIN"); expect 200
note "The city's money report today: $(jq -c '{trips: .total.trips, fares: .total.fares_minor,
  commission: .total.commission_minor}' <<<"$REPORT")."
[[ "$(jq -r .total.trips <<<"$REPORT")" == 2 ]]
note "Done: city $CITY, driver $DRIVER_ID approved through the API; app order $APP_ORDER and phone order \
$PHONE_ORDER posted."
