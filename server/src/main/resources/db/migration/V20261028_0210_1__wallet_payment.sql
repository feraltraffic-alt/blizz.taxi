-- Paying a trip from the rider's account (ADR 0009 p. 3): the order keeps how many bonuses it uses; the account
-- sets them aside when the order is made and takes them after the trip (at most the final fare), or lets them go.
alter table ride_order add column wallet_minor bigint not null default 0 check (wallet_minor >= 0);

create table rider_wallet_hold (
    order_id       uuid primary key,
    client_id      uuid        not null,
    currency       varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    amount_minor   bigint      not null check (amount_minor > 0),
    captured_minor bigint check (captured_minor >= 0 and captured_minor <= amount_minor),
    state          text        not null check (state in ('RESERVED', 'CAPTURED', 'RELEASED')),
    created_at     timestamptz not null,
    closed_at      timestamptz,
    check ((state = 'CAPTURED') = (captured_minor is not null)),
    check ((state = 'RESERVED') = (closed_at is null))
);
create index rider_wallet_hold_reserved_idx on rider_wallet_hold (client_id, currency) where state = 'RESERVED';
