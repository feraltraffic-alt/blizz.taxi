-- Bonuses given as a refund last the service's refunds.bonus_validity_days (owner, 06.11.2026; ADR 0018 A5). Each
-- credit is a lot; spending takes the lots that end first, then the bonuses that never end; what is left of a lot at
-- its end goes to WALLET_FORFEITED (credit_key: the journal entry that credited it).
create table rider_bonus_lot (
    id            uuid primary key,
    client_id     uuid        not null,
    currency      text        not null check (currency ~ '^[A-Z]{3}$'),
    amount_minor  bigint      not null check (amount_minor > 0),
    credit_key    text        not null unique,
    granted_at    timestamptz not null,
    expires_at    timestamptz not null,
    expired_at    timestamptz,
    expired_minor bigint      check (expired_minor >= 0),
    check ((expired_at is null) = (expired_minor is null))
);
create index rider_bonus_lot_due_idx on rider_bonus_lot (expires_at) where expired_at is null;
create index rider_bonus_lot_client_idx on rider_bonus_lot (client_id, currency);
