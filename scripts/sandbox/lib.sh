#!/usr/bin/env bash
# Helpers for sandbox scenarios: every call is written to a Markdown transcript (request → response), so a run
# can be read afterwards like a manual session. Needs curl and jq.
#   BASE        server address (default http://localhost:8080)
#   TRANSCRIPT  where the transcript goes (default transcript.md)
set -euo pipefail
# A failing call inside $(...) stops the whole scenario too: set -e sees the failed assignment.

BASE="${BASE:-http://localhost:8080}"
TRANSCRIPT="${TRANSCRIPT:-transcript.md}"
ADMIN_LOGIN="${ADMIN_LOGIN:-admin}"
ADMIN_BOOTSTRAP_PASSWORD="${ADMIN_BOOTSTRAP_PASSWORD:-Sandbox-Admin-2026}"
# The password the scenarios set at the first sign-in; use it when trying the sandbox by hand.
ADMIN_PASSWORD="${ADMIN_PASSWORD:-Sandbox-Admin-2026-ok}"
STATUS=""

uuid() { cat /proc/sys/kernel/random/uuid; }
now_utc() { date -u +%Y-%m-%dT%H:%M:%SZ; }
in_minutes() { date -u -d "+$1 minutes" +%Y-%m-%dT%H:%M:%SZ; }

say() { printf '\n## %s\n' "$*" | tee -a "$TRANSCRIPT" >&2; }
note() { printf '\n%s\n' "$*" | tee -a "$TRANSCRIPT" >&2; }

# api METHOD PATH [TOKEN] [JSON] — prints the response body; sets STATUS. Fails the scenario on 5xx.
api() {
    local method="$1" path="$2" token="${3:-}" body="${4:-}"
    local args=(-sS -X "$method" -o /tmp/sandbox-body -w '%{http_code}' -H 'Accept: application/json'
                -H "X-Correlation-Id: $(uuid)")
    [[ -n "$token" ]] && args+=(-H "Authorization: Bearer $token")
    [[ -n "$body" ]] && args+=(-H 'Content-Type: application/json' --data "$body")
    STATUS=$(curl "${args[@]}" "$BASE$path")
    echo "$STATUS" >/tmp/sandbox-status # api often runs in $(...); expect reads the status from here
    {
        printf '\n`%s %s` → **%s**\n' "$method" "$path" "$STATUS"
        if [[ -n "$body" ]]; then printf '\n```json\n%s\n```\n' "$(jq . <<<"$body" 2>/dev/null || echo "$body")"; fi
        if [[ -s /tmp/sandbox-body ]]; then
            printf '\n```json\n%s\n```\n' "$(jq . /tmp/sandbox-body 2>/dev/null | head -80 || head -c 4000 /tmp/sandbox-body)"
        fi
    } >>"$TRANSCRIPT"
    if [[ "$STATUS" -ge 500 ]]; then
        echo "Server error $STATUS on $method $path" >&2
        cat /tmp/sandbox-body >&2
        exit 1
    fi
    cat /tmp/sandbox-body
}

# expect CODE — stops the scenario when the last call did not answer CODE.
expect() {
    STATUS=$(cat /tmp/sandbox-status 2>/dev/null || true)
    if [[ "$STATUS" != "$1" ]]; then
        note "**Expected $1, got $STATUS — scenario stopped.**"
        exit 1
    fi
}

# sign_in CLIENT|DRIVER PHONE — signs in by SMS code (read from the sandbox) and prints the access token.
sign_in() {
    local audience="$1" phone="$2" device="sandbox-$RANDOM" challenge code
    local body="{\"audience\":\"$audience\",\"phone\":\"$phone\",\"device_ref\":\"$device\"}"
    challenge=$(api POST /auth/v1/otp/challenges "" "$body" | jq -r .challenge_id)
    if [[ "$(cat /tmp/sandbox-status)" == 429 ]]; then
        # The same phone asked for a code a moment ago (an earlier scenario): wait out the resend pause once.
        sleep "$(jq -r '.retry_after_seconds // 2' /tmp/sandbox-body)"
        challenge=$(api POST /auth/v1/otp/challenges "" "$body" | jq -r .challenge_id)
    fi
    expect 201
    code=$(api GET "/sandbox/v1/otp?phone=$(jq -rn --arg p "$phone" '$p|@uri')" | jq -r .code)
    expect 200
    api POST /auth/v1/otp/verify "" \
        "{\"challenge_id\":\"$challenge\",\"code\":\"$code\",\"device_ref\":\"$device\"}" | jq -r .access_token
    expect 200
}

# staff_sign_in ADMIN|OPERATOR LOGIN PASSWORD — prints the access token.
staff_sign_in() {
    api POST /auth/v1/staff/sign-in "" \
        "{\"login\":\"$2\",\"password\":\"$3\",\"audience\":\"$1\",\"device_ref\":\"sandbox\"}" | jq -r .access_token
}

# admin_token — the super admin; changes the bootstrap password at the first run.
admin_token() {
    local token
    token=$(staff_sign_in ADMIN "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
    if [[ "$(cat /tmp/sandbox-status)" == 200 ]]; then echo "$token"; return; fi
    token=$(staff_sign_in ADMIN "$ADMIN_LOGIN" "$ADMIN_BOOTSTRAP_PASSWORD")
    expect 200
    api POST /api/admin/v1/me/password "$token" \
        "{\"current_password\":\"$ADMIN_BOOTSTRAP_PASSWORD\",\"new_password\":\"$ADMIN_PASSWORD\"}" >/dev/null
    expect 204
    token=$(staff_sign_in ADMIN "$ADMIN_LOGIN" "$ADMIN_PASSWORD")
    expect 200
    echo "$token"
}

# The runner's wall clock can step back (NTP); the last sequence is kept in a file so it only grows.
SEQUENCE_FILE="${SEQUENCE_FILE:-/tmp/sandbox-sequence}"
next_sequence() {
    local now last
    now=$(date +%s%3N)
    last=$(cat "$SEQUENCE_FILE" 2>/dev/null || echo 0)
    (( now > last )) || now=$(( last + 1 ))
    echo "$now" > "$SEQUENCE_FILE"
    echo "$now"
}
location() { # LAT LON — the sequence grows across scenarios, so a later point is never taken as an old one (T-14)
    echo "{\"lat\":$1,\"lon\":$2,\"accuracy_m\":5,\"recorded_at\":\"$(now_utc)\",\"sequence\":$(next_sequence)}"
}

# go_online TOKEN VEHICLE_ID LAT LON — opens a work session and prints its id. When the driver still has an open
# session from an earlier scenario (another phone, T-16), this device takes it over and moves to LAT LON instead.
go_online() {
    local current id
    current=$(api GET /api/driver/v1/work-sessions/current "$1")
    id=$(jq -r '.session_id // empty' <<<"$current" 2>/dev/null || true)
    if [[ "$(cat /tmp/sandbox-status)" == 200 && -n "$id" ]]; then
        api POST "/api/driver/v1/work-sessions/$id/handover" "$1" \
            "{\"command_id\":\"$(uuid)\",\"expected_version\":$(jq -r .session_version <<<"$current")}" >/dev/null
        expect 200
        move "$1" "$id" "$3" "$4"
        echo "$id"
        return
    fi
    api POST /api/driver/v1/work-sessions "$1" \
        "{\"command_id\":\"$(uuid)\",\"vehicle_id\":\"$2\",\"location\":$(location "$3" "$4")}" | jq -r .session_id
    expect 201
}

# move TOKEN SESSION_ID LAT LON — a heartbeat with a new position.
# A hop faster than location.jump-kph (250 km/h) since the previous point is flagged JUMP and not used for
# arrive: keep a driver's points within a few metres of each other when they follow within seconds.
move() {
    api POST "/api/driver/v1/work-sessions/$2/heartbeat" "$1" "{\"location\":$(location "$3" "$4")}" >/dev/null
}
