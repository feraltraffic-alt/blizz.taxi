-- City operations (REQ-TEN-03/06): working hours, payment methods offered, and the pause of new orders.
-- No row means the defaults: open around the clock, every method, not paused (version 0). Owned by `geo`.
create table city_operations (
    city_id         uuid primary key references city (id),
    working_hours   jsonb       not null default '[]'::jsonb,
    payment_methods text[]      not null check (cardinality(payment_methods) > 0
                                                and payment_methods <@ array['CASH', 'CARD', 'TERMINAL']),
    orders_paused   boolean     not null default false,
    pause_reason    text,
    paused_at       timestamptz,
    version         bigint      not null check (version > 0),
    updated_by      uuid        not null,
    updated_at      timestamptz not null,
    check (orders_paused = (paused_at is not null))
);
