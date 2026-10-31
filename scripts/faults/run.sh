#!/usr/bin/env bash
# Fault tests (REQ-QA-01, issue #146 part 2): the server is halted as kill -9 would at a named point in the middle of
# its work (blizz.faults.crash-at, CrashPoints), started again, and the result is checked:
#   payment   — the bank charged a card tip, the server died before storing the answer: one charge, the tip is paid
#   outbox    — one consumer handled TripCompleted, the server died before the others and the DONE mark: every
#               consumer gets the event once, and the one that had it does not get it again
#   dispatch  — the driver's accept committed, the server died before answering: the app's retry with the same
#               command gets the same assignment, and the order has one
#   database  — every database connection of the server is cut: the server comes back by itself and a ride works
# Then the invariant scan must be clean. Run by .github/workflows/faults.yml; a run with a broken guard
# (scripts/faults/breaks/*.patch) must fail its case.
#   CASES        which cases, in order (default: payment outbox dispatch database)
#   PGHOST etc.  the server's database, for the listener and the checks
source "$(dirname "$0")/../sandbox/lib.sh"
set -euo pipefail

CASES="${CASES:-payment outbox dispatch database}"
BANK="$PWD/fake-bank.jsonl"
LIVE="$PWD/live.jsonl"
SERVER_PID=""
STARTS=0
KYIV=5a000000-0000-4000-8000-000000000001
DRIVER_PHONE="+380500000001"; DRIVER_VEHICLE="5a000000-0000-4000-8000-000000000501"
PICKUP='{"lat":50.4501,"lon":30.5234}'; DROPOFF='{"lat":50.4405,"lon":30.4890}'
export PGAPPNAME=blizz-faults # the database case cuts the server's connections, not its own

sql() { psql -X -At -v ON_ERROR_STOP=1 -c "$1"; }
phone() { echo "+38067$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"; }

# start_server [CRASH_AT] — starts the server and waits until it is ready.
start_server() {
    STARTS=$((STARTS + 1))
    local args=(--spring.profiles.active=sandbox "--blizz.payments.fake-gateway-journal=$BANK")
    [[ -n "${1:-}" ]] && args+=("--blizz.faults.crash-at=$1")
    note "Server start $STARTS${1:+, armed at \`$1\`}."
    java -jar server/target/server-*[0-9T].jar "${args[@]}" > "server-$STARTS.log" 2>&1 &
    SERVER_PID=$!
    for _ in $(seq 1 120); do
        curl -fsS "$BASE/readyz" >/dev/null 2>&1 && return 0
        kill -0 "$SERVER_PID" 2>/dev/null || break
        sleep 1
    done
    tail -60 "server-$STARTS.log" >&2
    note "**The server did not start.**"; exit 1
}

# wait_crash — waits for the armed server to halt at its crash point (exit 137, the code of kill -9).
wait_crash() {
    local code=0
    for _ in $(seq 1 120); do kill -0 "$SERVER_PID" 2>/dev/null || break; sleep 1; done
    if kill -0 "$SERVER_PID" 2>/dev/null; then
        note "**The server never reached its crash point.**"; kill -9 "$SERVER_PID"; exit 1
    fi
    wait "$SERVER_PID" || code=$?
    grep -h "Crash point" "server-$STARTS.log" | tee -a "$TRANSCRIPT" >&2 || true
    [[ "$code" == 137 ]] || { note "**The server ended with $code, not at its crash point.**"; exit 1; }
    note "The server halted at its crash point (exit $code)."
}

stop_server() {
    [[ -n "$SERVER_PID" ]] && kill "$SERVER_PID" 2>/dev/null && wait "$SERVER_PID" 2>/dev/null || true
    SERVER_PID=""
}
trap stop_server EXIT

# raw METHOD PATH TOKEN JSON — a call the crash may cut: never stops the script, prints the status (000 when cut).
raw() {
    curl -sS -o /tmp/faults-raw -w '%{http_code}' -X "$1" -H "Authorization: Bearer $3" \
        -H 'Content-Type: application/json' --data "$4" "$BASE$2" 2>/dev/null || true
}

# wait_for TOKEN PATH JQ_EXPR VALUE [SECONDS] — polls until the field has the value.
wait_for() {
    local value=""
    for _ in $(seq 1 "${5:-30}"); do
        value=$(api GET "$2" "$1" | jq -r "$3")
        [[ "$value" == "$4" ]] && return 0
        sleep 1
    done
    note "**Waited for $3 = $4, still $value.**"; exit 1
}

# A cash or card ride up to the driver's accept: prints ORDER OFFER.
order_and_offer() { # RIDER DRIVER METHOD
    local quote order offer
    quote=$(api POST /api/rider/v1/quotes "$1" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",
      \"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
    expect 201
    order=$(api POST /api/rider/v1/orders "$1" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$quote\",
      \"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,
      \"dropoff_label\":\"Вокзал\",\"payment_method\":\"$3\"}" | jq -r .id)
    if [[ "$3" == CARD ]]; then
        expect 202
        wait_for "$1" "/api/rider/v1/orders/$order" .payment_state AUTHORIZED >/dev/null
    else
        expect 201
    fi
    for _ in $(seq 1 15); do
        offer=$(api GET /api/driver/v1/offers "$2" | jq -r --arg o "$order" '[.[] | select(.order_id == $o)][0].id // empty')
        [[ -n "$offer" ]] && break
        sleep 1
    done
    [[ -n "$offer" ]] || { note "**No offer for order $order.**"; exit 1; }
    echo "$order $offer"
}

# drive DRIVER SESSION — arrive, start and complete the driver's current trip; the complete may be cut by a crash.
drive() {
    local trip
    trip=$(api GET /api/driver/v1/trips/current "$1"); expect 200
    move "$1" "$2" 50.4502 30.5234
    trip=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$trip")/arrive" "$1" \
        "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$trip")}"); expect 200
    trip=$(api POST "/api/driver/v1/trips/$(jq -r .id <<<"$trip")/start" "$1" \
        "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$trip")}"); expect 200
    raw POST "/api/driver/v1/trips/$(jq -r .id <<<"$trip")/complete" "$1" "{\"command_id\":\"$(uuid)\",
      \"expected_version\":$(jq -r .version <<<"$trip"),\"reported_at\":\"$(now_utc)\",\"cash_received\":true}"
}

case_payment() {
    say "Payment: the bank charges a card tip, the server dies before it stores the answer"
    start_server "payment.after-send:TIP"
    local rider driver session binding form=() order offer tips amount before
    rider=$(sign_in CLIENT "$(phone)")
    binding=$(api POST /api/rider/v1/card-bindings "$rider" "{\"command_id\":\"$(uuid)\",\"city_id\":\"$KYIV\"}")
    expect 201
    while IFS= read -r field; do form+=(--data-urlencode "$field"); done \
        < <(jq -r '.fields | to_entries[] | "\(.key)=\(.value)"' <<<"$binding")
    curl -sS -o /dev/null -X POST "$(jq -r .url <<<"$binding")" "${form[@]}"
    wait_for "$rider" "/api/rider/v1/card-bindings/$(jq -r .id <<<"$binding")" .state COMPLETED
    driver=$(sign_in DRIVER "$DRIVER_PHONE")
    session=$(go_online "$driver" "$DRIVER_VEHICLE" 50.4505 30.5234)
    read -r order offer < <(order_and_offer "$rider" "$driver" CARD)
    [[ -n "${offer:-}" ]] || exit 1
    api POST "/api/driver/v1/offers/$offer/accept" "$driver" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
    [[ "$(drive "$driver" "$session")" == 200 ]] || { note "**The trip did not complete.**"; exit 1; }
    wait_for "$rider" "/api/rider/v1/orders/$order" .payment_state PAID
    tips=$(api GET "/api/rider/v1/orders/$order/tip" "$rider"); expect 200
    amount=$(jq '.presets[] | select(.percent == 15) | .amount_minor' <<<"$tips")
    before=$(wc -l < "$BANK")
    note "Tip $amount on order $order; the bank journal has $before lines before it."
    raw POST "/api/rider/v1/orders/$order/tip" "$rider" "{\"command_id\":\"$(uuid)\",\"amount_minor\":$amount}" >/dev/null
    wait_crash
    start_server
    note "The worker asks the bank about the operation once its 2-minute lease has run out."
    wait_for "$rider" "/api/rider/v1/orders/$order/tip" .tip.state PAID 200
    local charges
    charges=$(tail -n +"$((before + 1))" "$BANK" | jq -s '[.[] | select(.kind == "request" and .type == "CHARGE")] | length')
    note "Charges the bank received for the tip: **$charges**."
    [[ "$charges" == 1 ]] || { note "**The tip was charged $charges times.**"; exit 1; }
    wait_for "$driver" /api/driver/v1/balance/history \
      "[.entries[] | select(.order_id == \"$order\" and .kind == \"TIP\") | .amount_minor] | add // 0" "$amount"
    REFERENCE_ORDER=$order
    go_offline "$driver"
}

case_outbox() {
    say "Outbox: one consumer handled TripCompleted, the server dies before the others and the DONE mark"
    : > "$LIVE"
    python3 "$(dirname "$0")/listen.py" "$LIVE" 2>listener.log &
    local listener=$!
    sleep 2
    start_server "outbox.after-handler:TripCompleted/notification.order-live-feed"
    local rider driver session order offer event reference consumers expected sent
    rider=$(sign_in CLIENT "$(phone)")
    driver=$(sign_in DRIVER "$DRIVER_PHONE")
    session=$(go_online "$driver" "$DRIVER_VEHICLE" 50.4505 30.5234)
    read -r order offer < <(order_and_offer "$rider" "$driver" CASH)
    [[ -n "${offer:-}" ]] || exit 1
    api POST "/api/driver/v1/offers/$offer/accept" "$driver" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
    drive "$driver" "$session" >/dev/null
    wait_crash
    event=$(sql "select event_id from outbox where aggregate_id = '$order' and event_type = 'TripCompleted'")
    note "TripCompleted $event: $(sql "select state from outbox where event_id = '$event'") after the crash."
    start_server
    for _ in $(seq 1 90); do
        [[ "$(sql "select state from outbox where event_id = '$event'")" == DONE ]] && break
        sleep 1
    done
    [[ "$(sql "select state from outbox where event_id = '$event'")" == DONE ]] \
        || { note "**TripCompleted was never delivered after the restart.**"; exit 1; }
    # Every consumer of TripCompleted, as a ride delivered without a crash shows them.
    reference=$(sql "select event_id from outbox where event_type = 'TripCompleted' and event_id <> '$event'
                     and state = 'DONE' order by occurred_at desc limit 1")
    expected=$(sql "select string_agg(consumer_id, ' ' order by consumer_id) from consumer_inbox where event_id = '$reference'")
    consumers=$(sql "select string_agg(consumer_id, ' ' order by consumer_id) from consumer_inbox where event_id = '$event'")
    note "Consumers of the crashed event: \`$consumers\`."
    [[ "$consumers" == "$expected" ]] || { note "**Not every consumer had it: expected \`$expected\`.**"; exit 1; }
    sleep 3 # the listener writes what the server sent
    sent=$(jq -s --arg e "$event" '[.[] | select(.envelope.event_id == $e)] | length' "$LIVE")
    note "Live messages of the crashed event: **$sent** (sent before the crash, not again after it)."
    kill "$listener" 2>/dev/null || true
    [[ "$sent" == 1 ]] || { note "**The live message went out $sent times.**"; exit 1; }
    go_offline "$driver"
}

case_dispatch() {
    say "Dispatch: the driver's accept is committed, the server dies before it answers; the app retries"
    start_server "dispatch.after-accept"
    local rider driver session order offer command first assignments answer
    rider=$(sign_in CLIENT "$(phone)")
    driver=$(sign_in DRIVER "$DRIVER_PHONE")
    session=$(go_online "$driver" "$DRIVER_VEHICLE" 50.4505 30.5234)
    read -r order offer < <(order_and_offer "$rider" "$driver" CASH)
    [[ -n "${offer:-}" ]] || exit 1
    command=$(uuid)
    first=$(raw POST "/api/driver/v1/offers/$offer/accept" "$driver" "{\"command_id\":\"$command\"}")
    note "The first accept: HTTP $first (000: the connection was cut)."
    wait_crash
    start_server
    answer=$(api POST "/api/driver/v1/offers/$offer/accept" "$driver" "{\"command_id\":\"$command\"}")
    note "The retry with the same command: HTTP $STATUS."
    [[ "$STATUS" == 200 ]] || { note "**The retry was not answered with the first result.**"; exit 1; }
    assignments=$(sql "select count(*) from assignment where order_id = '$order'")
    [[ "$assignments" == 1 ]] || { note "**The order has $assignments assignments.**"; exit 1; }
    [[ "$(jq -r .id <<<"$answer")" == "$(sql "select id from assignment where order_id = '$order'")" ]] \
        || { note "**The retry named another assignment.**"; exit 1; }
    note "One assignment, and the retry returned it."
    [[ "$(drive "$driver" "$session")" == 200 ]] || { note "**The trip did not complete.**"; exit 1; }
    go_offline "$driver"
}

case_database() {
    say "Database: every connection of the server is cut; it comes back by itself"
    start_server
    local cut rider driver session order offer
    cut=$(sql "select count(pg_terminate_backend(pid)) from pg_stat_activity
               where datname = current_database() and pid <> pg_backend_pid() and application_name <> '$PGAPPNAME'")
    note "Connections cut: $cut."
    rider=""
    for _ in $(seq 1 20); do
        rider=$(sign_in CLIENT "$(phone)" 2>/dev/null) && break || true
        sleep 1
    done
    [[ -n "$rider" ]] || { note "**The server did not recover from the cut.**"; exit 1; }
    driver=$(sign_in DRIVER "$DRIVER_PHONE")
    session=$(go_online "$driver" "$DRIVER_VEHICLE" 50.4505 30.5234)
    read -r order offer < <(order_and_offer "$rider" "$driver" CASH)
    [[ -n "${offer:-}" ]] || exit 1
    api POST "/api/driver/v1/offers/$offer/accept" "$driver" "{\"command_id\":\"$(uuid)\"}" >/dev/null; expect 200
    [[ "$(drive "$driver" "$session")" == 200 ]] || { note "**The trip did not complete.**"; exit 1; }
    for _ in $(seq 1 30); do
        [[ "$(sql "select state from outbox where aggregate_id = '$order' and event_type = 'TripCompleted'")" == DONE ]] && break
        sleep 1
    done
    [[ "$(sql "select state from outbox where aggregate_id = '$order' and event_type = 'TripCompleted'")" == DONE ]] \
        || { note "**The outbox did not recover from the cut.**"; exit 1; }
    note "After the cut: a whole ride, and its TripCompleted delivered."
    go_offline "$driver"
}

: > "$BANK"
for c in $CASES; do
    "case_$c"
    stop_server
    echo "✅ $c" >> results.txt
done

say "The invariant scan is clean after the faults"
start_server
bash "$(dirname "$0")/../sandbox/scenarios/zzz-invariants.sh"
echo "✅ invariants" >> results.txt
