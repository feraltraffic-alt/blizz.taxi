#!/usr/bin/env bash
# Driver documents encrypted at rest (issue #135, threat model D3): Oleh uploads a scan of his licence. What lies under
# the server's files directory on this runner does not start with "%PDF" and does not contain the licence number;
# his download is byte for byte what he uploaded (the same SHA-256).
source "$(dirname "$0")/../lib.sh"

FILES_DIR="${FILES_DIR:-server/var/files}"   # the sandbox server runs in server/ with blizz.files.local-dir ./var/files
NUMBER="SANDBOX-LICENCE-$RANDOM$RANDOM"
PDF=/tmp/document-at-rest.pdf
printf '%%PDF-1.7\n1 0 obj << /Type /Catalog /Title (%s) >> endobj\n%%%%EOF\n' "$NUMBER" >"$PDF"
SIZE=$(wc -c <"$PDF" | tr -d ' ')

say "Oleh uploads a scan of his licence"
OLEH=$(sign_in DRIVER "+380500000002")
SESSION=$(api POST /api/driver/v1/documents/upload-sessions "$OLEH" \
    "{\"command_id\":\"$(uuid)\",\"content_type\":\"application/pdf\",\"size_bytes\":$SIZE}")
expect 201
FILE=$(jq -r .file_id <<<"$SESSION")
STATUS=$(curl -sS -X PUT -o /tmp/sandbox-body -w '%{http_code}' -H "Authorization: Bearer $OLEH" \
    -H 'Content-Type: application/pdf' --data-binary @"$PDF" "$BASE$(jq -r .upload_path <<<"$SESSION")")
echo "$STATUS" >/tmp/sandbox-status
printf '\n`PUT %s` → **%s**\n\n```json\n%s\n```\n' "$(jq -r .upload_path <<<"$SESSION")" "$STATUS" \
    "$(jq . /tmp/sandbox-body)" >>"$TRANSCRIPT"
expect 200
[[ "$(jq -r .state /tmp/sandbox-body)" == SAFE ]]

say "On the server's disk the file is not the PDF"
RAW=$(find "$FILES_DIR/driver_document" -type f -name "$FILE*" | head -1)
[[ -n "$RAW" ]] || { note "**No stored file for $FILE under $FILES_DIR.**"; exit 1; }
HEAD=$(head -c 8 "$RAW" | od -An -tx1 | tr -d ' \n')
note "Stored at \`${RAW#"$FILES_DIR"/}\`, first bytes \`$HEAD\` (plain: \`255044462d312e37\` = %PDF-1.7)."
[[ "$HEAD" != 255044462d* && "$HEAD" != ffd8* ]]
if grep -qa "$NUMBER" "$RAW"; then note "**The licence number is readable on disk.**"; exit 1; fi

say "His download is exactly what he uploaded"
STATUS=$(curl -sS -o /tmp/document-at-rest.download -w '%{http_code}' -H "Authorization: Bearer $OLEH" \
    "$BASE/api/driver/v1/files/$FILE")
echo "$STATUS" >/tmp/sandbox-status
printf '\n`GET /api/driver/v1/files/%s` → **%s**\n' "$FILE" "$STATUS" >>"$TRANSCRIPT"
expect 200
UP=$(sha256sum "$PDF" | cut -d' ' -f1); DOWN=$(sha256sum /tmp/document-at-rest.download | cut -d' ' -f1)
note "SHA-256 uploaded \`$UP\`, downloaded \`$DOWN\`."
[[ "$UP" == "$DOWN" ]]
note "Done: document $FILE is encrypted on disk and downloads unchanged."
