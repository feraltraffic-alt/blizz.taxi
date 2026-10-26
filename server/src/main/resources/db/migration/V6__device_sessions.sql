-- Device sessions and rotating refresh tokens (REQ-AUTH-06, REQ-AUTH-07, REQ-USR-12).
create table device_session (
    id                uuid primary key,
    subject_type      text        not null check (subject_type in ('STAFF', 'CLIENT', 'DRIVER', 'PARTNER')),
    subject_id        uuid        not null,
    audience          text        not null check (audience in ('rider', 'driver', 'operator', 'admin')),
    device_ref        text,
    created_at        timestamptz not null,
    last_refreshed_at timestamptz not null,
    expires_at        timestamptz not null,
    revoked_at        timestamptz,
    revoke_reason     text
);
create index device_session_subject_open_idx on device_session (subject_type, subject_id) where revoked_at is null;

-- Only a SHA-256 hash of each refresh token is stored.
create table refresh_token (
    token_hash bytea primary key,
    session_id uuid        not null references device_session (id),
    issued_at  timestamptz not null,
    expires_at timestamptz not null,
    used_at    timestamptz
);
create index refresh_token_session_idx on refresh_token (session_id);
