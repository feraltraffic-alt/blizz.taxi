#!/usr/bin/env bash
# The release is reproducible (REQ-ENG-11, AC-22, issue #199): the same commit builds a byte-identical server jar.
# Builds the jar twice as the image does (server/Dockerfile: package without tests), each from its own fresh copy of
# the sources (no shared target/), and compares the two. The jar's entry times come from project.build.outputTimestamp
# in server/pom.xml. On a difference it exits 1 and names the entries that differ,
# nested BOOT-INF/lib jars included. CI runs this; run it the same way locally.
#
#   scripts/reproducible-build.sh [extra Maven arguments, e.g. -o]
#   MVN=mvn scripts/reproducible-build.sh   with a local Maven instead of the wrapper
set -euo pipefail
cd "$(dirname "$0")/.."
root=$(pwd)
work=$(mktemp -d)
trap 'rm -rf "$work"' EXIT

build() {
    local name=$1 dir="$work/$1"
    shift
    mkdir -p "$dir"
    # The server's sources only, as the image build takes them: never the target/ of an earlier build.
    tar -C "$root/server" --exclude=./target -cf - . | tar -C "$dir" -xf -
    local started=$SECONDS
    (cd "$dir" && ${MVN:-./mvnw} -B -q -ntp -DskipTests package "$@")
    echo "build $name: $((SECONDS - started)) s, $(stat -c %s "$dir"/target/server-*.jar) bytes" >&2
}

build one "$@"
build two "$@"
a=$(ls "$work"/one/target/server-*.jar)
b=$(ls "$work"/two/target/server-*.jar)
sum_a=$(sha256sum "$a" | cut -d' ' -f1)
sum_b=$(sha256sum "$b" | cut -d' ' -f1)
echo "outputTimestamp $(sed -n 's:.*<project.build.outputTimestamp>\(.*\)</project.build.outputTimestamp>.*:\1:p' server/pom.xml)"
echo "sha256 $sum_a $(basename "$a") (first build)"
echo "sha256 $sum_b $(basename "$b") (second build)"
if [[ "$sum_a" == "$sum_b" ]]; then
    echo "Reproducible: both builds gave the same jar."
    exit 0
fi

echo "NOT reproducible: the two jars differ. Entries that differ:"
python3 - "$a" "$b" <<'PY'
import io, sys, zipfile

def entries(data, prefix=""):
    out = {}
    with zipfile.ZipFile(io.BytesIO(data)) as z:
        for info in z.infolist():
            name = prefix + info.filename
            out[name] = (info.CRC, info.file_size, info.date_time)
            if info.filename.endswith(".jar"):
                out.update(entries(z.read(info), name + "!/"))
    return out

a = entries(open(sys.argv[1], "rb").read())
b = entries(open(sys.argv[2], "rb").read())
differ = [name for name in sorted(set(a) | set(b)) if a.get(name) != b.get(name)]
for name in differ[:50]:
    print(f"  {name}: (crc, size, time) {a.get(name)} vs {b.get(name)}")
if len(differ) > 50:
    print(f"  ... and {len(differ) - 50} more, {len(differ)} in all")
PY
exit 1
