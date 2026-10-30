#!/usr/bin/env bash
# Creates an empty Flyway migration named by the rule in AGENTS.md (REQ-ENG-12):
#   V<yyyyMMdd>_<HHmm>_<n>__<what>.sql, UTC, n = 1 lead Claude, 2 Codex, 5 second Claude (3 and 4 never again).
# It sorts after every migration on origin/main: when the current minute is not later than the last one there,
# it takes the last one's date and time plus one minute.
#
#   scripts/new-migration.sh <author: lead|codex|claude2> <what, in lower case words>
#   scripts/new-migration.sh codex "rider debt"   ->   server/src/main/resources/db/migration/V20261030_1415_2__rider_debt.sql
set -euo pipefail
cd "$(dirname "$0")/.."

case "${1-}" in
    lead) suffix=1 ;;
    codex) suffix=2 ;;
    claude2) suffix=5 ;;
    *) echo "usage: $0 <lead|codex|claude2> <what>" >&2; exit 2 ;;
esac
what=$(echo "${2-}" | tr '[:upper:]' '[:lower:]' | sed -E 's/[^a-z0-9]+/_/g; s/^_+|_+$//g')
[[ -n "$what" ]] || { echo "usage: $0 <lead|codex|claude2> <what>" >&2; exit 2; }

dir=server/src/main/resources/db/migration
git fetch -q origin main 2>/dev/null || echo "warning: could not fetch origin/main; comparing with the local copy" >&2
# The newest dated version on origin/main (and in the working tree), as yyyyMMddHHmm.
last=$( { git ls-tree --name-only origin/main "$dir/" 2>/dev/null; ls "$dir"; } \
    | sed -nE 's#.*V([0-9]{8})_([0-9]{4})(_[0-9])?__.*#\1\2#p' | sort | tail -1)
now=$(date -u +%Y%m%d%H%M)
if [[ -n "$last" && "$now" -le "$last" ]]; then
    now=$(date -u -d "${last:0:8} ${last:8:2}:${last:10:2} +1 minute" +%Y%m%d%H%M)
fi
file="$dir/V${now:0:8}_${now:8:4}_${suffix}__${what}.sql"
[[ ! -e "$file" ]] || { echo "$file exists" >&2; exit 1; }
printf -- '-- %s\n' "${2}" > "$file"
echo "$file"
