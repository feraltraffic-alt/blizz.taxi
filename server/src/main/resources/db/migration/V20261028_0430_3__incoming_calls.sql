-- Incoming calls of the call centre through the service's Asterisk (issue #64, REQ-OPS-01/07/08/10). Owned by
-- telephony. city_id belongs to geo, order_id to operations, staff ids to identity: no foreign keys (ADR 0004).

-- The service numbers the call centre answers, and their cities (set in the admin panel).
create table call_line (
    number     text primary key check (number ~ '^\+[1-9][0-9]{7,14}$'),
    city_id    uuid        not null,
    label      text check (label is null or length(label) <= 80),
    version    bigint      not null default 1,
    updated_at timestamptz not null
);

-- One row per incoming call; Asterisk's channel id makes every event of one call land on the same row (REQ-OPS-07).
create table call (
    id            uuid primary key,
    channel_id    text        not null unique,
    caller_phone  text check (caller_phone is null or caller_phone ~ '^\+[1-9][0-9]{7,14}$'),
    caller_raw    text,
    called_number text        not null,
    city_id       uuid,
    state         text        not null check (state in ('RINGING', 'ANSWERED', 'ENDED', 'MISSED')),
    answered_by   uuid,
    started_at    timestamptz not null,
    answered_at   timestamptz,
    ended_at      timestamptz,
    ended_reason  text check (ended_reason is null or ended_reason in ('HANGUP', 'LOST')),
    version       bigint      not null default 0
);
create index call_city_started_idx on call (city_id, started_at desc);
create index call_open_idx on call (started_at) where state in ('RINGING', 'ANSWERED');

-- Orders made during a call: linked, each with its own lifecycle (REQ-OPS-10). The first link is kept; another
-- order joins only when asked for explicitly.
create table call_order (
    call_id   uuid        not null references call (id),
    order_id  uuid        not null,
    linked_by uuid        not null,
    linked_at timestamptz not null,
    primary key (call_id, order_id)
);
create unique index call_order_order_uq on call_order (order_id);
