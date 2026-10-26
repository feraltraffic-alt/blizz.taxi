-- Transactional outbox and per-consumer inbox (REQ-ENG-05, REQ-ENG-06).
create table outbox (
    event_id          uuid primary key,
    event_type        text        not null,
    schema_version    int         not null,
    aggregate_type    text        not null,
    aggregate_id      uuid        not null,
    aggregate_version bigint      not null,
    payload           jsonb       not null,
    correlation_id    uuid        not null,
    occurred_at       timestamptz not null,
    state             text        not null default 'PENDING' check (state in ('PENDING', 'DONE', 'FAILED')),
    attempts          int         not null default 0,
    next_attempt_at   timestamptz not null,
    lease_owner       text,
    lease_until       timestamptz,
    last_error        text,
    completed_at      timestamptz
);

create index outbox_pending_idx on outbox (next_attempt_at) where state = 'PENDING';
create index outbox_failed_idx on outbox (occurred_at) where state = 'FAILED';

create table consumer_inbox (
    consumer_id  text        not null,
    event_id     uuid        not null,
    completed_at timestamptz not null,
    primary key (consumer_id, event_id)
);
