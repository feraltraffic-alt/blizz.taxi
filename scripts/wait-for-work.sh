#!/usr/bin/env bash
# Waits until there is new work for a contributor on GitHub, so nobody has to call them again.
#
#   scripts/wait-for-work.sh <label> [max-seconds]
#
# <label> is the contributor's label and branch prefix (e.g. codex). Watches, from the moment it starts:
#   - open issues with the label: a new issue or a new comment on one;
#   - pull requests from branches <label>/…: a new comment, a review, a review comment, or the PR closed/merged.
# Exit 0 and print what changed as soon as something does. Exit 2 when max-seconds (default 540, under the usual
# 10-minute command limit) pass with nothing new: just run it again. Waiting costs no tokens; only the restarts do.
# Needs gh signed in. Anything the contributor posts itself before starting the wait is not "new".
set -euo pipefail

label="${1:?usage: wait-for-work.sh <label> [max-seconds]}"
max="${2:-540}"
poll="${POLL_SECONDS:-60}"
repo="${REPO:-$(git remote get-url origin | sed -E 's#^.*github\.com[:/]##; s#\.git$##')}"
since="${SINCE:-$(date -u +%Y-%m-%dT%H:%M:%SZ)}"   # SINCE only to try the script out
deadline=$(( $(date +%s) + max ))

echo "Waiting for work for '$label' in $repo since $since (up to ${max}s)…"
while :; do
    issues="$(gh api "repos/$repo/issues?labels=$label&state=open&since=$since&per_page=50" \
        --jq '.[] | select(.pull_request | not) | "issue #\(.number) \(.title) — updated \(.updated_at)"')"
    pulls="$(gh api "repos/$repo/pulls?state=all&sort=updated&direction=desc&per_page=30" | jq -r \
        --arg p "$label/" --arg s "$since" \
        '.[] | select(.head.ref | startswith($p)) | select(.updated_at > $s)
             | "PR #\(.number) \(.title) — \(if .merged_at then "MERGED" elif .state == "closed" then "CLOSED" else "updated" end) \(.updated_at)"')"
    if [[ -n "$issues$pulls" ]]; then
        echo "New work:"
        [[ -n "$issues" ]] && echo "$issues"
        [[ -n "$pulls" ]] && echo "$pulls"
        echo "Start again from AGENTS.md \"How to work\" step 1: reviews of your PRs first, then your issue, then the oldest open issue with your label."
        exit 0
    fi
    if (( $(date +%s) + poll > deadline )); then
        echo "Nothing new for ${max}s. Run the script again."
        exit 2
    fi
    sleep "$poll"
done
