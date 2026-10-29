-- Chargebacks recorded by hand (REQ-PAY-23, issue #103): the payment provider handles them through its risk managers
-- and tells no API; finance records what the bank took and, later, whether it came back.
create table payment_chargeback (
    id                uuid primary key,
    order_id          uuid        not null,
    intent_id         uuid        not null references payment_intent (id),
    payer_client_id   uuid        not null,
    amount_minor      bigint      not null check (amount_minor > 0),
    currency          varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    bank_reason       text        not null check (length(trim(bank_reason)) between 1 and 500),
    received_on       date        not null,
    state             text        not null check (state in ('OPEN', 'WON', 'LOST')),
    recorded_by       uuid        not null,
    resolution_reason text,
    resolved_by       uuid,
    resolved_at       timestamptz,
    created_at        timestamptz not null,
    version           bigint      not null default 0,
    check ((state = 'OPEN') = (resolved_at is null))
);
create index payment_chargeback_order_idx on payment_chargeback (order_id);
