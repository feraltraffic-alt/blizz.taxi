#!/usr/bin/env bash
# Last in scenario=all: the earlier scenarios exercise creation, cancellation, offers, assignments and SMS.
# Exercise the remaining no-car outcome, then check the management scrape, not the public API port.
source "$(dirname "$0")/../lib.sh"

ORDER=""
cleanup() {
    set +e
    if [[ -n "$ORDER" && -n "${RIDER:-}" ]]; then
        local current
        current=$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER")
        if [[ "$(jq -r .status <<<"$current")" == SEARCHING ]]; then
            api POST "/api/rider/v1/orders/$ORDER/cancel" "$RIDER" \
                "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .version <<<"$current"),\"reason_code\":\"CHANGED_MIND\"}" >/dev/null
        fi
    fi
}
trap cleanup EXIT
say "A search without drivers ends as UNFULFILLED"
for number in +380500000001 +380500000002 +380500000003; do
    DRIVER=$(sign_in DRIVER "$number")
    go_offline "$DRIVER"
done
RIDER=$(sign_in CLIENT "+38069$(random_digits 7)")
PICKUP='{"lat":50.4501,"lon":30.5234}'
DROPOFF='{"lat":50.4405,"lon":30.4890}'
QUOTE=$(api POST /api/rider/v1/quotes "$RIDER" "{\"command_id\":\"$(uuid)\",\"vehicle_class\":\"STANDARD\",\"pickup\":$PICKUP,\"dropoff\":$DROPOFF}" | jq -r .id)
expect 201
ORDER=$(api POST /api/rider/v1/orders "$RIDER" "{\"command_id\":\"$(uuid)\",\"quote_id\":\"$QUOTE\",\"vehicle_class\":\"STANDARD\",
    \"pickup\":$PICKUP,\"pickup_label\":\"Майдан\",\"dropoff\":$DROPOFF,\"dropoff_label\":\"Вокзал\",\"payment_method\":\"CASH\"}" | jq -r .id)
expect 201
for _ in $(seq 45); do
    CURRENT=$(api GET "/api/rider/v1/orders/$ORDER" "$RIDER")
    expect 200
    [[ "$(jq -r .status <<<"$CURRENT")" == UNFULFILLED ]] && break
    sleep 5
done
[[ "$(jq -r .status <<<"$CURRENT")" == UNFULFILLED ]]
say "All eight metrics are non-zero, with closed labels and no ids/phones"
node "$(dirname "$0")/../check-metrics.mjs" --self-test 2>&1 | tee -a "$TRANSCRIPT"
SCRAPE=$(mktemp)
# The management port is deliberately local to the workflow machine.
curl -fsS "http://localhost:${MANAGEMENT_PORT:-8081}/actuator/prometheus" > "$SCRAPE"
node "$(dirname "$0")/../check-metrics.mjs" < "$SCRAPE" 2>&1 | tee -a "$TRANSCRIPT"
{
    printf '\n```prometheus\n'
    grep -E '^blizz_(orders(_total|_(cancelled|unfulfilled)_total)|dispatch_(first_offer_seconds|assigned_seconds|excluded_total)|offers_total|sms_sent_total)' "$SCRAPE"
    printf '```\n'
} >> "$TRANSCRIPT"
rm -f "$SCRAPE"
note "Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port."
