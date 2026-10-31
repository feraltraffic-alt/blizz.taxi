#!/usr/bin/env bash
# A phone order's caller is not in the app (REQ-NTF-08, section 20): the caller gets an SMS with the car and plate
# when a driver takes the order, and another when the car is at the pickup. The sandbox shows the texts at
# /sandbox/v1/sms. (An SMS that fails for good becomes a dispatcher task; the retries take a minute, so the tests
# show that part.) Ivan finishes the ride and goes offline even when a step fails.
source "$(dirname "$0")/../lib.sh"

PICKUP='{"lat":50.4501,"lon":30.5234}'    # Майдан Незалежності
DROPOFF='{"lat":50.4405,"lon":30.4890}'   # Залізничний вокзал
CALLER="+38067$(random_digits 7)"
[[ "$CALLER" == *0000 ]] && CALLER="${CALLER%0000}1234"   # the fake provider refuses numbers ending in 0000
texts() { api GET "/sandbox/v1/sms?phone=$(jq -rn --arg p "$CALLER" '$p|@uri')"; }

# wait_text N — waits up to 10 s until the caller has N texts (the worker runs every second).
wait_text() {
    for _ in $(seq 10); do
        [[ "$(texts | jq 'length')" -ge "$1" ]] && return
        sleep 1
    done
    note "**The caller has $(texts | jq 'length') texts, expected $1 — scenario stopped.**"
    exit 1
}

say "Ivan is online near the pickup"
IVAN=$(sign_in DRIVER "+380500000001")
SESSION=$(go_online "$IVAN" 5a000000-0000-4000-8000-000000000501 50.4510 30.5234)
trap 'go_offline "$IVAN" || true' EXIT

say "The operator takes a phone order for a caller without the app"
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
QUOTE=$(api POST /api/operator/v1/quotes "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
  \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
api POST /api/operator/v1/orders "$OPERATOR" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",
  \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,
  \"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\",\"caller\":{\"name\":\"Олена\",\"phone\":\"$CALLER\"}}" \
  >/dev/null
expect 201

say "Ivan accepts: the caller gets the car and the plate by SMS"
OFFER=$(api GET /api/driver/v1/offers "$IVAN" | jq -r '.[0].id')
api POST "/api/driver/v1/offers/$OFFER/accept" "$IVAN" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
wait_text 1
note "SMS: $(texts | jq -r '.[0].text')"
texts | jq -e '.[0].text | startswith("До вас їде")' >/dev/null

say "Ivan is at the pickup: a second SMS"
TRIP=$(api GET /api/driver/v1/trips/current "$IVAN")
move "$IVAN" "$SESSION" 50.4502 30.5234 2
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/arrive" "$IVAN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
wait_text 2
note "SMS: $(texts | jq -r '.[1].text')"
texts | jq -e '.[1].text | contains("чекає на вас")' >/dev/null

say "The ride goes on as usual"
TRIP=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/start" "$IVAN" \
    "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$TRIP")}")
expect 200
api POST "/api/driver/v1/trips/$(jq -r .id <<<"$TRIP")/complete" "$IVAN" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$(jq -r .version <<<"$TRIP"),\"reported_at\":\"$(now_utc)\",\"cash_received\":true}" >/dev/null
expect 200
note "Done: two SMS to the caller of a phone order."
