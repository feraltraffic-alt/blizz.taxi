-- Tips after a fulfilled trip (ADR 0012, Q-04). The tip belongs to `operations`; a tip by card is a separate charge
-- of the order's saved card in `payments`; the driver's share is posted by `finance`.

create table order_tip (
    id              uuid primary key,
    order_id        uuid        not null references ride_order (id),
    payer_client_id uuid        not null,
    driver_id       uuid        not null,
    amount_minor    bigint      not null check (amount_minor > 0),
    currency        varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    -- CARD and WALLET move money through the service; CASH and TERMINAL are handed to the driver and only recorded.
    method          text        not null check (method in ('CARD', 'WALLET', 'CASH', 'TERMINAL')),
    state           text        not null check (state in ('PENDING', 'PAID', 'FAILED', 'RECORDED')),
    failure_reason  text,
    created_at      timestamptz not null,
    settled_at      timestamptz
);

-- One tip per order; a failed card tip may be left again.
create unique index order_tip_one_per_order on order_tip (order_id) where state <> 'FAILED';
create index order_tip_driver_idx on order_tip (driver_id, created_at desc);

alter table payment_operation drop constraint payment_operation_type_check;
alter table payment_operation add constraint payment_operation_type_check
    check (type in ('AUTH', 'SETTLE', 'CHARGE', 'REFUND', 'TIP'));
alter table payment_operation add column tip_id uuid;
