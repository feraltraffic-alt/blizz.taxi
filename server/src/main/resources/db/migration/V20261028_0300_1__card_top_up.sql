-- Topping up the rider's bonus account and the driver's balance by card on the provider's payment page
-- (ADR 0009 p. 1, ADR 0010 p. 1). Belongs to `payments`; the account is credited by `finance` from the
-- CardTopUpCompleted event.

create table card_top_up (
    id             uuid primary key,
    account_type   text        not null check (account_type in ('CLIENT', 'DRIVER')),
    account_id     uuid        not null,
    merchant_id    uuid        not null references payment_merchant (id),
    reference      text        not null unique,
    amount_minor   bigint      not null check (amount_minor > 0),
    currency       varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    state          text        not null check (state in ('PENDING', 'COMPLETED', 'FAILED', 'EXPIRED')),
    masked_pan     text,
    failure_reason text,
    created_at     timestamptz not null,
    expires_at     timestamptz not null,
    next_check_at  timestamptz,
    completed_at   timestamptz
);

create index card_top_up_account_idx on card_top_up (account_type, account_id, created_at desc);
create index card_top_up_check_idx on card_top_up (next_check_at) where state = 'PENDING';
