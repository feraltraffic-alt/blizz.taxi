#!/usr/bin/env bash
# Stops the server started by start.sh and waits until the port is free.
set -euo pipefail
pkill -f 'target/server-.*\.jar' || true
for i in $(seq 1 60); do
    curl -fsS http://localhost:8080/readyz >/dev/null 2>&1 || exit 0
    sleep 1
done
echo "The server did not stop" >&2
exit 1
