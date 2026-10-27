-- The rider's virtual account (ADR 0009): money in the journal on RIDER_WALLET, what the service owes the rider;
-- PROMO_EXPENSE carries what the service spends on promotions and goodwill top-ups.
alter table journal_line drop constraint journal_line_account_check;
alter table journal_line add constraint journal_line_account_check
    check (account in ('RIDER_RECEIVABLE', 'DRIVER_PAYABLE', 'SERVICE_COMMISSION', 'SERVICE_FUNDS',
                       'PROVIDER_CLEARING', 'PARTNER_SETTLEMENT', 'TIPS_PAYABLE', 'REFUNDS_PAYABLE', 'SUSPENSE',
                       'SERVICE_EXPENSE', 'RIDER_WALLET', 'PROMO_EXPENSE'));

-- One row per rider and currency: the lock every spending takes, so the account never goes below zero.
create table rider_wallet (
    client_id  uuid       not null,
    currency   varchar(3) not null check (currency ~ '^[A-Z]{3}$'),
    created_at timestamptz not null,
    primary key (client_id, currency)
);

-- Every top-up with who made it and why; the journal holds the money, this the story (ADR 0009 p. 1).
create table rider_wallet_top_up (
    id           uuid primary key,
    client_id    uuid        not null,
    currency     varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    amount_minor bigint      not null check (amount_minor > 0),
    source       text        not null check (source in ('STAFF', 'CARD', 'PROMOTION')),
    staff_id     uuid,
    reason       text,
    state        text        not null check (state in ('PENDING', 'COMPLETED', 'FAILED')),
    created_at   timestamptz not null,
    completed_at timestamptz,
    check (source <> 'STAFF' or (staff_id is not null and reason is not null))
);
create index rider_wallet_top_up_client_idx on rider_wallet_top_up (client_id, created_at desc);
