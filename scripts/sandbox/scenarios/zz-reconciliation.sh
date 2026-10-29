#!/usr/bin/env bash
# After card/metrics flows, before the final invariant scan. All bank injection is restored on failure too.
source "$(dirname "$0")/../lib.sh"
ADMIN=$(admin_token)
DAY=$(date -u +%F)
CLEAN_MERCHANT=5a000000-0000-4000-8000-000000000601
INJECT_MERCHANT=5a000000-0000-4000-8000-000000000602
FIXTURE=$(uuid)
INJECT_PATH="/sandbox/v1/payment-reconciliations/merchants/$INJECT_MERCHANT/transactions/$FIXTURE"
INJECTED=0
cleanup() {
    set +e
    if [[ "$INJECTED" == 1 ]]; then api DELETE "$INJECT_PATH" "$ADMIN" >/dev/null; fi
}
trap cleanup EXIT

say "The earlier card flows reconcile cleanly without moving money"
CLEAN_BODY=$(jq -nc --arg merchant "$CLEAN_MERCHANT" --arg day "$DAY" '{merchant_id:$merchant,day:$day}')
CLEAN=$(api POST /sandbox/v1/payment-reconciliations/run "$ADMIN" "$CLEAN_BODY"); expect 200
[[ "$(jq -r .state <<<"$CLEAN")" == CLEAN ]]
[[ "$(jq -r .partial <<<"$CLEAN")" == true ]]
CLEAN_ID=$(jq -r .id <<<"$CLEAN")
DETAIL=$(api GET "/api/admin/v1/payment-reconciliations/$CLEAN_ID" "$ADMIN"); expect 200
[[ "$(jq '.items|length' <<<"$DETAIL")" == 0 ]]
for _ in 1 2; do
    AGAIN=$(api POST /sandbox/v1/payment-reconciliations/run "$ADMIN" "$CLEAN_BODY"); expect 200
    [[ "$(jq -r .id <<<"$AGAIN")" == "$CLEAN_ID" ]]
    [[ "$(jq -r .state <<<"$AGAIN")" == CLEAN ]]
done

say "One independent bank transaction produces one missing-local item on another merchant's first snapshot"
INJECTED=1
api POST "$INJECT_PATH" "$ADMIN" '{"amount_minor":100,"currency":"PLN"}' >/dev/null; expect 204
INJECT_BODY=$(jq -nc --arg merchant "$INJECT_MERCHANT" --arg day "$DAY" '{merchant_id:$merchant,day:$day}')
OPEN=$(api POST /sandbox/v1/payment-reconciliations/run "$ADMIN" "$INJECT_BODY"); expect 200
[[ "$(jq -r .state <<<"$OPEN")" == OPEN ]]
[[ "$(jq -r .item_count <<<"$OPEN")" == 1 ]]
RUN_ID=$(jq -r .id <<<"$OPEN")
DETAIL=$(api GET "/api/admin/v1/payment-reconciliations/$RUN_ID" "$ADMIN"); expect 200
[[ "$(jq '.items|length' <<<"$DETAIL")" == 1 ]]
[[ "$(jq -r '.items[0].kind' <<<"$DETAIL")" == MISSING_LOCALLY ]]
ITEM_ID=$(jq -r '.items[0].id' <<<"$DETAIL")
VERSION=$(jq -r '.items[0].version' <<<"$DETAIL")
for _ in 1 2; do
    AGAIN=$(api POST /sandbox/v1/payment-reconciliations/run "$ADMIN" "$INJECT_BODY"); expect 200
    [[ "$(jq -r .id <<<"$AGAIN")" == "$RUN_ID" ]]
    [[ "$(jq -r .item_count <<<"$AGAIN")" == 1 ]]
done

say "The admin explains the item once; a replay is the same result and a different decision conflicts"
COMMAND=$(uuid)
RESOLVE=$(jq -nc --arg command "$COMMAND" --argjson version "$VERSION" \
    '{command_id:$command,expected_version:$version,decision:"EXPLAINED",reason:"Independent sandbox bank fixture; no real money moved"}')
RESOLVED=$(api POST "/api/admin/v1/payment-reconciliations/items/$ITEM_ID/resolve" "$ADMIN" "$RESOLVE"); expect 200
[[ "$(jq -r .state <<<"$RESOLVED")" == RESOLVED ]]
REPLAY=$(api POST "/api/admin/v1/payment-reconciliations/items/$ITEM_ID/resolve" "$ADMIN" "$RESOLVE"); expect 200
[[ "$(jq -S . <<<"$RESOLVED")" == "$(jq -S . <<<"$REPLAY")" ]]
CONFLICT=$(jq -nc --arg command "$(uuid)" '{command_id:$command,expected_version:1,decision:"ESCALATED",reason:"A conflicting second decision"}')
api POST "/api/admin/v1/payment-reconciliations/items/$ITEM_ID/resolve" "$ADMIN" "$CONFLICT" >/dev/null; expect 409
DETAIL=$(api GET "/api/admin/v1/payment-reconciliations/$RUN_ID" "$ADMIN"); expect 200
[[ "$(jq -r .run.state <<<"$DETAIL")" == RESOLVED ]]
[[ "$(jq -r .run.open_count <<<"$DETAIL")" == 0 ]]
LIST=$(api GET "/api/admin/v1/payment-reconciliations?merchant_id=$INJECT_MERCHANT&limit=100" "$ADMIN"); expect 200
[[ "$(jq --arg id "$RUN_ID" '[.runs[]|select(.id==$id)]|length' <<<"$LIST")" == 1 ]]
api DELETE "$INJECT_PATH" "$ADMIN" >/dev/null; expect 204
INJECTED=0
AGAIN=$(api POST /sandbox/v1/payment-reconciliations/run "$ADMIN" "$INJECT_BODY"); expect 200
[[ "$(jq -r .id <<<"$AGAIN")" == "$RUN_ID" ]]
[[ "$(jq -r .state <<<"$AGAIN")" == RESOLVED ]]
note "Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored."
