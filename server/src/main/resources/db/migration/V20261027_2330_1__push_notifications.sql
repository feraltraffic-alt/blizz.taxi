-- Push notifications (section 20, REQ-NTF-02/03/07): the devices of riders and drivers, and every notification
-- with its recipient, template, language, attempts and deadline.

create table push_device (
    id                uuid primary key,
    subject_type      text        not null check (subject_type in ('CLIENT', 'DRIVER')),
    subject_id        uuid        not null,
    -- The app session that registered it: a logout or a revoked session stops pushes to it (REQ-AUTH-07).
    device_session_id uuid        not null,
    platform          text        not null check (platform in ('ANDROID', 'IOS', 'WEB')),
    token             text        not null,
    locale            text,
    state             text        not null check (state in ('ACTIVE', 'REVOKED')),
    created_at        timestamptz not null,
    updated_at        timestamptz not null
);
create unique index push_device_token_uq on push_device (token) where state = 'ACTIVE';
create index push_device_subject_idx on push_device (subject_id) where state = 'ACTIVE';

create table notification (
    id               uuid primary key,
    event_id         uuid        not null,
    recipient_type   text        not null check (recipient_type in ('CLIENT', 'DRIVER')),
    recipient_id     uuid        not null,
    channel          text        not null check (channel in ('PUSH')),
    template         text        not null,
    template_version int         not null,
    locale           text        not null,
    title            text        not null,
    body             text        not null,
    data             jsonb       not null,
    state            text        not null check (state in ('PENDING', 'SENDING', 'SENT', 'FAILED', 'EXPIRED',
                                                           'NO_DEVICE')),
    attempts         int         not null default 0,
    next_attempt_at  timestamptz not null,
    lease_until      timestamptz,
    deadline         timestamptz not null,
    last_error       text,
    created_at       timestamptz not null,
    sent_at          timestamptz,
    unique (event_id, recipient_id, channel)
);
create index notification_due_idx on notification (next_attempt_at) where state in ('PENDING', 'SENDING');
