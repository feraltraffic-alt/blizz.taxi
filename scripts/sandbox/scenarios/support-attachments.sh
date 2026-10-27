#!/usr/bin/env bash
# Rider opens a support case with a photo; support replies with a file; rider downloads the public reply attachment.
source "$(dirname "$0")/../lib.sh"

RIDER_PHONE="+38067$(printf '%07d' $(( (RANDOM * 32768 + RANDOM) % 10000000 )))"
PNG=/tmp/support-attachment.png
printf '%s' 'iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNk+A8AAQUBAScY42YAAAAASUVORK5CYII=' | base64 -d >"$PNG"
SIZE=$(wc -c <"$PNG" | tr -d ' ')

upload() { # OPEN_PATH TOKEN -> file id
    local session file path status
    session=$(api POST "$1" "$2" "{\"command_id\":\"$(uuid)\",\"content_type\":\"image/png\",\"size_bytes\":$SIZE}")
    expect 201
    file=$(jq -r .file_id <<<"$session")
    path=$(jq -r .upload_path <<<"$session")
    status=$(curl -sS -X PUT -o /tmp/sandbox-body -w '%{http_code}' \
        -H "Authorization: Bearer $2" -H 'Content-Type: image/png' --data-binary @"$PNG" "$BASE$path")
    echo "$status" >/tmp/sandbox-status
    {
        printf '\n`PUT %s` → **%s**\n' "$path" "$status"
        printf '\n```json\n%s\n```\n' "$(jq . /tmp/sandbox-body 2>/dev/null || cat /tmp/sandbox-body)"
    } >>"$TRANSCRIPT"
    expect 200
    echo "$file"
}

say "Rider uploads a photo and opens a support case"
RIDER=$(sign_in CLIENT "$RIDER_PHONE")
RIDER_FILE=$(upload /api/rider/v1/support/uploads "$RIDER")
CASE=$(api POST /api/rider/v1/support/cases "$RIDER" "{\"command_id\":\"$(uuid)\",\"category\":\"APP_PROBLEM\",
  \"subject\":\"Screenshot attached\",\"message\":\"Please check this screenshot\",\"attachment_ids\":[\"$RIDER_FILE\"]}")
expect 201
CASE_ID=$(jq -r .id <<<"$CASE")
[[ "$(jq -r '.messages[0].attachments[0].file_id' <<<"$CASE")" == "$RIDER_FILE" ]]

say "Operator downloads the rider photo and replies with another file"
admin_token >/dev/null
OPERATOR=$(staff_sign_in OPERATOR "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
TMP=/tmp/support-rider-download.png
STATUS=$(curl -sS -o "$TMP" -w '%{http_code}' -H "Authorization: Bearer $OPERATOR" \
    "$BASE/api/operator/v1/support/cases/$CASE_ID/attachments/$RIDER_FILE")
echo "$STATUS" >/tmp/sandbox-status
printf '\n`GET /api/operator/v1/support/cases/%s/attachments/%s` → **%s**\n' "$CASE_ID" "$RIDER_FILE" "$STATUS" >>"$TRANSCRIPT"
expect 200
cmp "$PNG" "$TMP"

OP_FILE=$(upload /api/operator/v1/support/uploads "$OPERATOR")
CURRENT=$(api GET "/api/operator/v1/support/cases/$CASE_ID" "$OPERATOR"); expect 200
VERSION=$(jq -r .version <<<"$CURRENT")
ANSWER=$(api POST "/api/operator/v1/support/cases/$CASE_ID/comments" "$OPERATOR" "{\"command_id\":\"$(uuid)\",
  \"expected_version\":$VERSION,\"visibility\":\"PUBLIC\",\"body\":\"Here is the annotated file\",
  \"wait_for_requester\":true,\"attachment_ids\":[\"$OP_FILE\"]}")
expect 200
[[ "$(jq -r '.messages[-1].attachments[0].file_id' <<<"$ANSWER")" == "$OP_FILE" ]]

say "Rider sees the public reply and downloads its attachment"
VISIBLE=$(api GET "/api/rider/v1/support/cases/$CASE_ID" "$RIDER"); expect 200
[[ "$(jq -r '.messages[-1].attachments[0].file_id' <<<"$VISIBLE")" == "$OP_FILE" ]]
TMP=/tmp/support-operator-download.png
STATUS=$(curl -sS -o "$TMP" -w '%{http_code}' -H "Authorization: Bearer $RIDER" \
    "$BASE/api/rider/v1/support/cases/$CASE_ID/attachments/$OP_FILE")
echo "$STATUS" >/tmp/sandbox-status
printf '\n`GET /api/rider/v1/support/cases/%s/attachments/%s` → **%s**\n' "$CASE_ID" "$OP_FILE" "$STATUS" >>"$TRANSCRIPT"
expect 200
cmp "$PNG" "$TMP"

note "Done: support case $CASE_ID, rider attachment $RIDER_FILE, operator attachment $OP_FILE."
