-- Driver balance (ADR 0010): top-ups by staff (money paid in, or a bonus) and transfers between drivers with the
-- limits set in the admin panel. The journal holds the money (DRIVER_PAYABLE); these tables the story.
create table driver_balance_top_up (
    id           uuid primary key,
    driver_id    uuid        not null,
    currency     varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    amount_minor bigint      not null check (amount_minor > 0),
    kind         text        not null check (kind in ('DEPOSIT', 'BONUS')),
    reference    text,
    reason       text        not null,
    staff_id     uuid        not null,
    created_at   timestamptz not null
);
create index driver_balance_top_up_driver_idx on driver_balance_top_up (driver_id, created_at desc);

create table driver_transfer (
    id           uuid primary key,
    from_driver  uuid        not null,
    to_driver    uuid        not null,
    currency     varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    amount_minor bigint      not null check (amount_minor > 0),
    comment      text check (comment is null or char_length(comment) <= 200),
    created_at   timestamptz not null,
    check (from_driver <> to_driver)
);
create index driver_transfer_from_idx on driver_transfer (from_driver, created_at);

-- Per currency; no row: transfers are off. Every change is a new version.
create table driver_transfer_rule (
    currency                 varchar(3)  primary key check (currency ~ '^[A-Z]{3}$'),
    enabled                  boolean     not null,
    max_per_transfer_minor   bigint      not null check (max_per_transfer_minor > 0),
    max_per_day_minor        bigint      not null check (max_per_day_minor > 0),
    min_balance_after_minor  bigint      not null,
    version                  bigint      not null,
    changed_by               uuid        not null,
    changed_at               timestamptz not null
);
