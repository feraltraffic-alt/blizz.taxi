#!/usr/bin/env bash
# Container images are pinned by digest (REQ-ENG-11): `name:tag@sha256:…`. The tag says what the image is, the digest
# makes every build use the same bytes.
#
#   scripts/pin-images.sh --check   fail if an image in the files below has no digest (CI runs this)
#   scripts/pin-images.sh           look up the current digest of each tag on Docker Hub and write it in
#
# After a refresh, build, run the tests and the sandbox before merging: a new digest is a new image.
set -euo pipefail
cd "$(dirname "$0")/.."

# Every image reference as file:line:image — FROM lines, compose image: keys, and the quoted image names of the
# Testcontainers configuration (a name with a tag, `postgis/postgis:18-3.6…`).
references() {
    grep -HnoE '^FROM [^ ]+' server/Dockerfile | sed -E 's/:FROM /:/'
    grep -HnoE '^[[:space:]]+image: [^ ]+' deploy/dev/compose.yaml deploy/sandbox/compose.yaml .github/workflows/*.yml \
        | sed -E 's/:[[:space:]]+image: /:/'
    grep -HnoE '"[a-z0-9./-]+/[a-z0-9._-]+:[A-Za-z0-9._-]+(@sha256:[0-9a-f]{64})?"' \
        server/src/test/java/taxi/blizz/TestcontainersConfiguration.java | sed -E 's/:"/:/; s/"$//'
}

if [[ "${1-}" == "--check" ]]; then
    missing=$(references | grep -v '@sha256:[0-9a-f]\{64\}$' || true)
    if [[ -n "$missing" ]]; then
        echo "Images without a digest (run scripts/pin-images.sh):" >&2
        echo "$missing" >&2
        exit 1
    fi
    echo "Every image is pinned by digest: $(references | wc -l | tr -d ' ') references."
    exit 0
fi

digest() {
    local image=$1 repo tag token
    repo=${image%%:*}
    tag=${image#*:}
    [[ "$repo" == */* ]] || repo="library/$repo"
    token=$(curl -fsS "https://auth.docker.io/token?service=registry.docker.io&scope=repository:$repo:pull" \
        | sed -E 's/.*"token":"([^"]+)".*/\1/')
    curl -fsSI -H "Authorization: Bearer $token" \
        -H "Accept: application/vnd.oci.image.index.v1+json, application/vnd.docker.distribution.manifest.list.v2+json" \
        "https://registry-1.docker.io/v2/$repo/manifests/$tag" \
        | tr -d '\r' | awk -F': ' 'tolower($1) == "docker-content-digest" {print $2}'
}

references | while IFS=: read -r file _ reference; do
    image=${reference%@*}
    pinned="$image@$(digest "$image")"
    if [[ "$reference" != "$pinned" ]]; then
        sed -i "s|$reference|$pinned|" "$file"
        echo "$file: $pinned"
    fi
done
