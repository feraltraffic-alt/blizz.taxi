#!/usr/bin/env bash
# Compile, test and package the server. CI calls this script; run it locally the same way.
set -euo pipefail
cd "$(dirname "$0")/../server"
mvn -B verify "$@"
