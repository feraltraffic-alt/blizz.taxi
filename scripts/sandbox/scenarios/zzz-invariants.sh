#!/usr/bin/env bash
# Last in scenario=all. Observe a fresh scan after the earlier scenarios have settled.
source "$(dirname "$0")/../lib.sh"
say "Five invariant checks are clean after all scenario transactions settle"
SCRAPE=$(mktemp)
trap 'rm -f "$SCRAPE"' EXIT
# The production settling margin remains enabled: wait for two minutes of quiet data.
SETTLED_AFTER=$(( $(date +%s) + 121 ))
for _ in $(seq 32); do
    curl -fsS "http://localhost:${MANAGEMENT_PORT:-8081}/actuator/prometheus" > "$SCRAPE"
    if node - "$SCRAPE" "$SETTLED_AFTER" <<'JS'
const fs = require('fs');
const scrape = fs.readFileSync(process.argv[2], 'utf8');
const after = Number(process.argv[3]);
for (const check of ['I1','I2','I3','I4','I5']) {
  function value(name) {
    const lines = scrape.split('\n').filter(line => line.startsWith(name + '{') && line.includes(`check="${check}"`));
    if (lines.length !== 1) return NaN;
    return Number(lines[0].split(/\s+/)[1]);
  }
  if (value('blizz_invariant_violations') !== 0 || !(value('blizz_invariant_last_success') >= after)) process.exit(1);
}
JS
    then
        { printf '\n```prometheus\n'; grep -E '^blizz_invariant_(violations|last_success)' "$SCRAPE"; printf '```\n'; } >> "$TRANSCRIPT"
        note "Done: five fresh zero invariant gauges after the settling margin."
        exit 0
    fi
    sleep 5
done
grep '^blizz_invariant_' "$SCRAPE" >> "$TRANSCRIPT" || true
echo 'Invariant results missing, stale, failed or nonzero' >&2
exit 1
