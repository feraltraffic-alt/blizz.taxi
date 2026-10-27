-- In-app chat between the rider and the assigned driver, tied to the order and to one assignment
-- (owner decision 26.10.2026, docs/design/README.md). Kept for the admin's order details; append-only.
-- Retention follows the data retention matrix (Q-19); nothing is deleted here.
create table order_message (
    id            uuid        primary key,
    order_id      uuid        not null references ride_order(id),
    sequence      bigint      not null check (sequence >= 1),
    assignment_id uuid        not null references assignment(id),
    sender_role   text        not null check (sender_role in ('RIDER', 'DRIVER')),
    sender_id     uuid        not null,
    body          text        not null check (length(body) between 1 and 1000),
    sent_at       timestamptz not null,
    unique (order_id, sequence)
);
create index order_message_assignment_idx on order_message(assignment_id, sequence);

create function order_message_is_append_only() returns trigger language plpgsql as $$
begin
    raise exception 'Chat messages are append-only' using errcode = '23514';
end $$;
create trigger order_message_append_only before update or delete on order_message
    for each row execute function order_message_is_append_only();
