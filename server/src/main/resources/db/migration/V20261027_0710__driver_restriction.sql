-- Restrictions on new orders that other modules report by event (ADR 0004: no reading of their tables).
-- One row per source; source_version drops events that arrive out of order.
create table driver_restriction (
    driver_id      uuid        not null,
    kind           text        not null check (kind in ('DEBT_LIMIT')),
    source_ref     text        not null,
    active         boolean     not null,
    source_version bigint      not null,
    updated_at     timestamptz not null,
    primary key (driver_id, kind, source_ref)
);
create index driver_restriction_active_idx on driver_restriction(driver_id) where active;
