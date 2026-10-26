-- Final fare of a completed trip (REQ-PRC-10, REQ-PRC-12). Versioned per order; rows never change.
create table final_fare (
    id                 uuid primary key,
    order_id           uuid        not null,
    version            int         not null check (version >= 1),
    quote_id           uuid        not null references quote(id),
    policy             text        not null,
    amount_minor       bigint      not null check (amount_minor >= 0),
    currency           varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    commission_rate    numeric     not null check (commission_rate >= 0 and commission_rate <= 1),
    commission_minor   bigint      not null check (commission_minor >= 0),
    driver_share_minor bigint      not null,
    breakdown          jsonb       not null,
    created_at         timestamptz not null,
    unique (order_id, version),
    check (commission_minor + driver_share_minor = amount_minor)
);

create function final_fare_is_immutable() returns trigger language plpgsql as $$
begin
    raise exception 'final_fare rows are immutable; write a new version' using errcode = '23514';
end $$;
create trigger final_fare_immutable before update or delete on final_fare
    for each row execute function final_fare_is_immutable();

-- What the order was finally charged, written by operations from the pricing result.
alter table ride_order add column final_fare_id uuid;
alter table ride_order add column final_price_minor bigint check (final_price_minor >= 0);
