#!/usr/bin/env bash
# Security checks of the repository (REQ-SEC-12): vulnerable dependencies (Maven, npm), secrets, misconfiguration of
# the Dockerfile and compose files; with an image name also the built image. HIGH and CRITICAL fail; exceptions are in
# .trivyignore, each with a reason and an expiry (docs/security/vulnerabilities.md). CI calls this script; locally it
# needs Docker. Findings go to stdout one per line (CI turns them into annotations) and to trivy-*.json.
#   scripts/security-scan.sh             — the repository
#   scripts/security-scan.sh IMAGE:TAG   — a built image
set -euo pipefail
cd "$(dirname "$0")/.."
TRIVY_IMAGE="aquasec/trivy:0.56.2"
CACHE="${TRIVY_CACHE_DIR:-$HOME/.cache/trivy}"
mkdir -p "$CACHE"

trivy() {
    docker run --rm -v "$PWD:/work" -w /work -v "$CACHE:/root/.cache/trivy" \
        -v /var/run/docker.sock:/var/run/docker.sock "$TRIVY_IMAGE" "$@"
}

common=(--severity HIGH,CRITICAL --ignore-unfixed --ignorefile .trivyignore --exit-code 1 --format json)
if [[ $# -eq 0 ]]; then
    out=trivy-repo.json
    set +e
    trivy fs "${common[@]}" --scanners vuln,secret,misconfig --skip-dirs packages/contracts/node_modules \
        --skip-dirs server/target -o "$out" .
    status=$?
    set -e
else
    out=trivy-image.json
    set +e
    trivy image "${common[@]}" --scanners vuln,secret -o "$out" "$1"
    status=$?
    set -e
fi

# One line per finding: CI shows only the first line of a failure.
if [[ -s "$out" ]]; then
    jq -r '.Results[]? | .Target as $t
        | ((.Vulnerabilities // [])[] | "\(.Severity) \(.VulnerabilityID) \(.PkgName) \(.InstalledVersion) → \(.FixedVersion // "no fix") in \($t)"),
          ((.Misconfigurations // [])[] | "\(.Severity) \(.ID) \(.Title) in \($t)"),
          ((.Secrets // [])[] | "\(.Severity) secret \(.RuleID) in \($t):\(.StartLine)")' "$out"
fi
if [[ -n "${GITHUB_ACTIONS:-}" && -s "$out" ]]; then
    # A summary on every run, so it is visible that the scan really looked at something.
    echo "::notice title=Security scan (${out%.json})::$(jq -r '"\(.Results // [] | length) targets: " + ([.Results[]?.Target] | join(", "))' "$out" | cut -c1-900)"
fi
exit "$status"
