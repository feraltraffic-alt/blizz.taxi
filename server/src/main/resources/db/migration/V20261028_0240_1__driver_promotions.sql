-- Promotions for drivers (ADR 0010 p. 3–5): N completed orders within a period of D days, optionally only on some
-- days, hours (city time, when the driver took the order) and a payment method; the reward goes to the balance.
-- Periods run from starts_at; the promotion pays once or in every period (repeat).
create table driver_promotion (
    id               uuid primary key,
    name             text        not null check (length(trim(name)) between 1 and 120),
    reward_minor     bigint      not null check (reward_minor > 0),
    currency         varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    city_id          uuid,
    period_days      int         not null check (period_days between 1 and 366),
    orders_required  int         not null check (orders_required between 1 and 100000),
    days_of_week     int[] check (days_of_week <@ array[1, 2, 3, 4, 5, 6, 7]),
    time_from        time,
    time_to          time,
    payment_method   text check (payment_method in ('CASH', 'CARD', 'TERMINAL')),
    repeat           text        not null check (repeat in ('ONCE', 'EVERY_PERIOD')),
    starts_at        timestamptz not null,
    ends_at          timestamptz,
    state            text        not null check (state in ('ACTIVE', 'ARCHIVED')),
    version          bigint      not null,
    created_by       uuid        not null,
    created_at       timestamptz not null,
    updated_at       timestamptz not null,
    check ((time_from is null) = (time_to is null)),
    check (ends_at is null or starts_at < ends_at)
);

create table driver_promotion_trip (
    promotion_id uuid not null references driver_promotion (id),
    order_id     uuid not null,
    driver_id    uuid not null,
    period_index int  not null,
    primary key (promotion_id, order_id)
);
create index driver_promotion_trip_count_idx on driver_promotion_trip (promotion_id, driver_id, period_index);

create table driver_promotion_reward (
    promotion_id uuid        not null references driver_promotion (id),
    driver_id    uuid        not null,
    period_index int         not null,
    amount_minor bigint      not null,
    currency     varchar(3)  not null,
    rewarded_at  timestamptz not null,
    primary key (promotion_id, driver_id, period_index)
);
