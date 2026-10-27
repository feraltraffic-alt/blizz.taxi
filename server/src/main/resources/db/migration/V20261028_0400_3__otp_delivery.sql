-- How each one-time code went out (ADR 0012 Q-18, issue #59): one row per attempt and channel, for support when a
-- code "does not come". Owned by telephony; never the code itself. challenge_id refers to identity's otp_challenge
-- without a foreign key (ADR 0004). Retention is Q-19.
create table otp_delivery (
    id           uuid primary key,
    challenge_id uuid,
    phone        text        not null check (phone ~ '^\+[1-9][0-9]{7,14}$'),
    audience     text        not null check (audience in ('CLIENT', 'DRIVER')),
    channel      text        not null check (channel in ('SMS', 'VOICE')),
    provider     text        not null check (provider in ('TURBOSMS', 'ASTERISK', 'FAKE')),
    state        text        not null check (state in ('SENT', 'FAILED', 'UNKNOWN')),
    provider_ref text,
    error        text,
    attempted_at timestamptz not null
);
create index otp_delivery_phone_idx on otp_delivery (phone, attempted_at desc);
