-- Declined and missed personal offers (owner decision 03.11.2026, ADR 0018 B12, issue #487).

-- B12.2: a pause for a low acceptance rate grows like a pause for cancellations (B7).
alter table driver_pause drop constraint driver_pause_kind_check;
alter table driver_pause add constraint driver_pause_kind_check check (kind in ('CANCELLATIONS', 'ACCEPTANCE'));

-- B12.1: personal offers the driver let expire in a row, since the last one answered or the last time off line; and
-- when the driver was last warned about the acceptance rate (one warning per 24 hours).
create table driver_offer_streak (
    driver_id            uuid primary key,
    missed_in_row        int         not null default 0 check (missed_in_row >= 0),
    acceptance_warned_at timestamptz,
    updated_at           timestamptz not null
);

-- The offers that count for the rate; partial, so dispatch's own lookups by order and driver keep their index.
create index offer_driver_created_idx on offer (driver_id, created_at desc)
    where state in ('ACCEPTED', 'REJECTED', 'EXPIRED');

alter table driver_risk_flag drop constraint driver_risk_flag_kind_check;
alter table driver_risk_flag add constraint driver_risk_flag_kind_check
    check (kind in ('IMPOSSIBLE_MOVEMENT', 'MANUAL', 'CASH_DISPUTE', 'DUPLICATE_DOCUMENT', 'DRIVER_CANCELLATIONS',
                    'UNCOUNTED_CANCELLATIONS', 'REPEATED_PAUSES', 'LOW_ACCEPTANCE'));
