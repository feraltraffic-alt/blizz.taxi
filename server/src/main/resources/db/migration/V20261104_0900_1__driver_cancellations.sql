-- Drivers cancelling an accepted order (owner decision 03.11.2026, ADR 0018 part B, issue #487).

-- B3: a driver reason marked "does not count" leaves the cancellation out of the warning, the pause and the rate.
alter table cancel_reason add column not_counted boolean not null default false;
alter table cancel_reason add constraint cancel_reason_not_counted_check check (not not_counted or audience = 'DRIVER');
update cancel_reason set not_counted = true
where audience = 'DRIVER' and code in ('NO_SHOW', 'PASSENGER_ASKED', 'ACCIDENT');

-- One row per assignment the driver ended before the start, counted or not, and why not.
create table driver_cancellation (
    id              uuid primary key,
    driver_id       uuid        not null,
    city_id         uuid        not null,
    order_id        uuid        not null,
    assignment_id   uuid        not null unique,
    reason_code     text        not null,
    counted         boolean     not null,
    not_counted_why text check (not_counted_why in ('GRACE', 'REASON', 'OFF')),
    accepted_at     timestamptz not null,
    cancelled_at    timestamptz not null,
    check (counted = (not_counted_why is null))
);
create index driver_cancellation_driver_idx on driver_cancellation (driver_id, cancelled_at desc);

-- B6–B8: a pause without new orders; lifted by staff with a reason.
create table driver_pause (
    id          uuid primary key,
    driver_id   uuid        not null,
    city_id     uuid        not null,
    kind        text        not null check (kind in ('CANCELLATIONS')),
    level       int         not null check (level >= 1),
    starts_at   timestamptz not null,
    ends_at     timestamptz not null,
    lifted_at   timestamptz,
    lifted_by   uuid,
    lift_reason text check (lift_reason is null or length(lift_reason) <= 1000),
    version     bigint      not null default 1,
    check (ends_at > starts_at),
    check ((lifted_at is null) = (lifted_by is null) and (lifted_at is null) = (lift_reason is null))
);
create index driver_pause_driver_idx on driver_pause (driver_id, ends_at desc);

alter table driver_risk_flag drop constraint driver_risk_flag_kind_check;
alter table driver_risk_flag add constraint driver_risk_flag_kind_check
    check (kind in ('IMPOSSIBLE_MOVEMENT', 'MANUAL', 'CASH_DISPUTE', 'DUPLICATE_DOCUMENT', 'DRIVER_CANCELLATIONS',
                    'UNCOUNTED_CANCELLATIONS', 'REPEATED_PAUSES'));
