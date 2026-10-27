-- Support cases and problem queues (REQ-ADM-09, section 21.2 support_case / backoffice, S-08).
create sequence support_case_number_seq;

create table support_case (
    id                uuid        primary key,
    number            bigint      not null unique default nextval('support_case_number_seq'),
    city_id           uuid,
    category          text        not null check (category in ('LOST_ITEM', 'PAYMENT', 'CASH_DISPUTE',
                                      'DRIVER_BEHAVIOUR', 'RIDER_BEHAVIOUR', 'SAFETY', 'TRIP_REVIEW', 'APP_PROBLEM',
                                      'OTHER')),
    order_id          uuid,
    requester_type    text        not null check (requester_type in ('CLIENT', 'DRIVER', 'STAFF', 'SYSTEM')),
    requester_id      uuid,
    subject           text        not null check (length(trim(subject)) between 1 and 200),
    priority          text        not null check (priority in ('LOW', 'NORMAL', 'HIGH', 'URGENT')),
    state             text        not null check (state in ('OPEN', 'IN_PROGRESS', 'WAITING_REQUESTER', 'RESOLVED',
                                      'CLOSED')),
    assigned_staff_id uuid,
    resolution        text,
    -- A system event creates at most one case (problem queues are fed by events, redelivery included).
    source_key        text        unique,
    version           bigint      not null default 0 check (version >= 0),
    created_at        timestamptz not null,
    updated_at        timestamptz not null,
    check (state not in ('RESOLVED', 'CLOSED') or resolution is not null)
);
create index support_case_queue_idx on support_case (assigned_staff_id, state, priority);
create index support_case_city_idx on support_case (city_id, state, created_at);
create index support_case_requester_idx on support_case (requester_type, requester_id, created_at);

-- Messages are append-only; INTERNAL ones never reach the requester.
create table support_message (
    id          uuid        primary key,
    case_id     uuid        not null references support_case(id),
    sequence    bigint      not null check (sequence >= 1),
    author_type text        not null check (author_type in ('CLIENT', 'DRIVER', 'STAFF', 'SYSTEM')),
    author_id   uuid,
    visibility  text        not null check (visibility in ('PUBLIC', 'INTERNAL')),
    body        text        not null check (length(body) between 1 and 4000),
    created_at  timestamptz not null,
    unique (case_id, sequence)
);

create function support_message_is_append_only() returns trigger language plpgsql as $$
begin
    raise exception 'Support messages are append-only' using errcode = '23514';
end $$;
create trigger support_message_append_only before update or delete on support_message
    for each row execute function support_message_is_append_only();
