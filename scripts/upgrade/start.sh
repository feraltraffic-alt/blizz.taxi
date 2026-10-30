#!/usr/bin/env bash
# Starts the server built in <server dir> on the sandbox database, in the background, and waits until it is ready.
set -euo pipefail
dir=${1:?usage: start.sh <server dir> <log>}
log=${2:?usage: start.sh <server dir> <log>}
(cd "$dir" && nohup java -jar target/server-*[0-9T].jar --spring.profiles.active=sandbox > "$OLDPWD/$log" 2>&1 &)
for i in $(seq 1 120); do
    if curl -fsS http://localhost:8080/readyz >/dev/null 2>&1; then echo "up after ${i}s"; exit 0; fi
    sleep 1
done
tail -100 "$log"
exit 1
