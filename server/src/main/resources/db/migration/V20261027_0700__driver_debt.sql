-- Driver debt to the service (REQ-PAY-16): money the service holds (a driver paying in his debt) and the
-- debt limit, set by the admin per currency; a status projection decides whether new orders are blocked.
alter table journal_line drop constraint journal_line_account_check;
alter table journal_line add constraint journal_line_account_check
    check (account in ('RIDER_RECEIVABLE', 'DRIVER_PAYABLE', 'SERVICE_COMMISSION', 'SERVICE_FUNDS',
                       'PROVIDER_CLEARING', 'PARTNER_SETTLEMENT', 'TIPS_PAYABLE', 'REFUNDS_PAYABLE', 'SUSPENSE'));

-- No row or a null limit: no limit for that currency. The row stays when a limit is removed, so the
-- version keeps counting for optimistic checks.
create table driver_debt_limit (
    currency    varchar(3)  primary key check (currency ~ '^[A-Z]{3}$'),
    limit_minor bigint      check (limit_minor >= 0),
    version     bigint      not null check (version >= 0),
    updated_at  timestamptz not null
);

-- Derived from the journal and the limit; the journal stays the truth (REQ-LED-02).
create table driver_debt_status (
    driver_id   uuid        not null,
    currency    varchar(3)  not null,
    owed_minor  bigint      not null,
    limit_minor bigint,
    blocked     boolean     not null,
    version     bigint      not null check (version >= 1),
    updated_at  timestamptz not null,
    primary key (driver_id, currency)
);
create index driver_debt_status_currency_idx on driver_debt_status(currency);
