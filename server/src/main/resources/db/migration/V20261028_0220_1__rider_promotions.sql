-- Promotions for riders (ADR 0009 p. 4–7): a discount on the price or bonuses to the account after the trip, with
-- conditions; several may apply at once. The service pays for them (PROMO_EXPENSE).
create table rider_promotion (
    id              uuid primary key,
    name            text        not null check (length(trim(name)) between 1 and 120),
    kind            text        not null check (kind in ('DISCOUNT', 'BONUS')),
    value_type      text        not null check (value_type in ('PERCENT', 'FIXED')),
    -- PERCENT: basis points (1000 = 10 %); FIXED: minor units of currency.
    value           bigint      not null check (value > 0),
    currency        varchar(3) check (currency ~ '^[A-Z]{3}$'),
    city_id         uuid,
    vehicle_class   text,
    every_nth_trip  int check (every_nth_trip between 2 and 1000),
    days_of_week    int[] check (days_of_week <@ array[1, 2, 3, 4, 5, 6, 7]),
    time_from       time,
    time_to         time,
    pickup_zone_id  uuid,
    dropoff_zone_id uuid,
    starts_at       timestamptz,
    ends_at         timestamptz,
    state           text        not null check (state in ('ACTIVE', 'ARCHIVED')),
    version         bigint      not null,
    created_by      uuid        not null,
    created_at      timestamptz not null,
    updated_at      timestamptz not null,
    check ((value_type = 'FIXED') = (currency is not null)),
    check (value_type <> 'PERCENT' or value <= 10000),
    check ((time_from is null) = (time_to is null)),
    check (starts_at is null or ends_at is null or starts_at < ends_at)
);
create index rider_promotion_active_idx on rider_promotion (state) where state = 'ACTIVE';

-- What a quote got: the promotions are fixed with the price the rider saw (ADR 0009, like the tariff).
create table promotion_quote (
    quote_id       uuid   not null,
    promotion_id   uuid   not null references rider_promotion (id),
    kind           text   not null,
    value_type     text   not null,
    value          bigint not null,
    discount_minor bigint not null check (discount_minor >= 0),
    primary key (quote_id, promotion_id)
);

-- Completed trips of a rider, counted once per order, for "every N-th trip".
create table promotion_trip (
    order_id     uuid primary key,
    client_id    uuid        not null,
    completed_at timestamptz not null
);
create index promotion_trip_client_idx on promotion_trip (client_id);

-- Bonuses granted for a trip, once per order and promotion.
create table promotion_grant (
    order_id     uuid   not null,
    promotion_id uuid   not null references rider_promotion (id),
    client_id    uuid   not null,
    amount_minor bigint not null check (amount_minor > 0),
    currency     varchar(3) not null,
    granted_at   timestamptz not null,
    primary key (order_id, promotion_id)
);

alter table ride_order add column discount_minor bigint not null default 0 check (discount_minor >= 0);
