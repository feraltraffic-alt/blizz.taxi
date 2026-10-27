-- Card payments, part B (ADR 0008): the obligation to pay (payment_intent) and each external operation
-- (payment_operation) with its own stable reference (REQ-PAY-10). The order waits in AWAITING_PAYMENT until the hold
-- is confirmed (REQ-PAY-01).

create table payment_intent (
    id             uuid primary key,
    order_id       uuid        not null unique,
    client_id      uuid        not null,
    merchant_id    uuid        not null references payment_merchant (id),
    card_id        uuid        not null references payment_card (id),
    currency       varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    hold_minor     bigint      not null check (hold_minor > 0),
    -- How long the provider must keep the hold: a pre-order needs it until after its pickup.
    hold_until     timestamptz,
    state          text        not null check (state in ('AUTH_PENDING', 'AUTHORIZED', 'DECLINED', 'UNKNOWN',
                                                         'VOID_PENDING', 'VOIDED', 'CAPTURE_PENDING', 'PAID',
                                                         'PARTIALLY_PAID')),
    -- The order was cancelled while the hold was still being asked for: a late success is released at once (T-23).
    void_requested boolean     not null default false,
    created_at     timestamptz not null,
    updated_at     timestamptz not null,
    version        bigint      not null default 0
);

create table payment_operation (
    id              uuid primary key,
    intent_id       uuid        not null references payment_intent (id),
    type            text        not null check (type in ('AUTH', 'SETTLE', 'CHARGE', 'REFUND')),
    reference       text        not null unique,
    -- The provider transaction acted upon: its own reference for AUTH and CHARGE, the hold's for SETTLE and REFUND.
    target          text        not null,
    amount_minor    bigint      not null check (amount_minor >= 0),
    state           text        not null check (state in ('CREATED', 'SENDING', 'PENDING', 'UNKNOWN', 'SUCCEEDED',
                                                          'DECLINED', 'CANCELLED')),
    attempts        int         not null default 0,
    lease_until     timestamptz,
    next_check_at   timestamptz,
    provider_status text,
    reason_code     text,
    reason          text,
    created_at      timestamptz not null,
    updated_at      timestamptz not null
);
create index payment_operation_due_idx on payment_operation (next_check_at)
    where state in ('CREATED', 'SENDING', 'PENDING', 'UNKNOWN');
create index payment_operation_intent_idx on payment_operation (intent_id);

alter table ride_order drop constraint ride_order_payment_state_check;
alter table ride_order add constraint ride_order_payment_state_check
    check (payment_state in ('CASH_EXPECTED', 'CASH_REPORTED', 'CASH_NOT_RECEIVED', 'AUTH_PENDING', 'AUTHORIZED',
                             'PAYMENT_DECLINED', 'HOLD_RELEASED', 'CAPTURE_PENDING', 'PAID', 'PARTIALLY_PAID'));
