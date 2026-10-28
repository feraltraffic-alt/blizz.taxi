-- A trip the driver reports as not paid in cash or at the terminal (owner decision 28.10.2026): the dispute and
-- support's decision. The held part of the driver's share is in the journal (SUSPENSE); this row says what became of it.
create table cash_dispute (
    order_id         uuid        primary key, -- operations' order; no foreign key across modules (ADR 0004)
    driver_id        uuid        not null,
    payer_client_id  uuid,
    currency         char(3)     not null,
    held_minor       bigint      not null check (held_minor >= 0),
    rider_debt_minor bigint      not null check (rider_debt_minor >= 0),
    opened_at        timestamptz not null,
    decide_by        timestamptz not null,
    decision         text        check (decision in ('RIDER_PAID', 'PAY_DRIVER', 'KEEP_HELD')),
    decided_by       uuid,
    reason           text        check (reason is null or length(trim(reason)) > 0),
    decided_at       timestamptz,
    version          bigint      not null default 1,
    -- Owner decision 28.10.2026: past decide_by nothing moves by itself; it becomes an urgent task, once.
    overdue_reported_at timestamptz,
    check ((decision is null) = (decided_by is null) and (decision is null) = (decided_at is null)
           and (decision is null) = (reason is null))
);
create index cash_dispute_open_idx on cash_dispute (decide_by) where decision is null;

-- A driver who reported unpaid cash that the rider had paid gets a flag for review (REQ-SEC-11).
alter table driver_risk_flag drop constraint driver_risk_flag_kind_check;
alter table driver_risk_flag add constraint driver_risk_flag_kind_check
    check (kind in ('IMPOSSIBLE_MOVEMENT', 'MANUAL', 'CASH_DISPUTE'));
