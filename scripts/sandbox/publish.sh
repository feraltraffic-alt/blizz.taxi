#!/usr/bin/env bash
# Puts a sandbox run's transcript, results and server log on the sandbox-runs branch (runs/<run id>/), where
# anyone with repository access reads them through the GitHub API. Called by .github/workflows/sandbox.yml.
set -euo pipefail
: "${GH_TOKEN:?}" "${GITHUB_REPOSITORY:?}" "${GITHUB_RUN_ID:?}"
src="$PWD"
dir="runs/${GITHUB_RUN_ID}"
work=$(mktemp -d)
cd "$work"
git init -q
git remote add origin "https://x-access-token:${GH_TOKEN}@github.com/${GITHUB_REPOSITORY}.git"
if git fetch -q --depth 1 origin sandbox-runs 2>/dev/null; then
    git checkout -q -b sandbox-runs FETCH_HEAD
else
    git checkout -q --orphan sandbox-runs
fi
mkdir -p "$dir"
for f in transcript.md results.txt; do [[ -f "$src/$f" ]] && cp "$src/$f" "$dir/"; done
[[ -f "$src/server.log" ]] && tail -n 3000 "$src/server.log" > "$dir/server.log"
printf '%s %s %s\n' "$GITHUB_RUN_ID" "${GITHUB_SHA:0:7}" "${GITHUB_REF_NAME:-}" > "$dir/run.txt"
git -c user.name=sandbox-bot -c user.email=sandbox-bot@users.noreply.github.com add -A
git -c user.name=sandbox-bot -c user.email=sandbox-bot@users.noreply.github.com \
    commit -qm "Sandbox run ${GITHUB_RUN_ID} (${GITHUB_SHA:0:7})"
for attempt in 1 2 3; do
    git push -q origin HEAD:sandbox-runs && exit 0
    git fetch -q --depth 1 origin sandbox-runs && git rebase -q FETCH_HEAD || true
done
exit 1
