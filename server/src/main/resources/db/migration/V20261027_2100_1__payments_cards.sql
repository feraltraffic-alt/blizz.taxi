-- Card payments, part A (ADR 0008): merchants per city, saved cards (provider tokens) and the inbox of provider
-- notifications. Holds and charges come in part B.

-- A merchant account at a payment provider. The secret is never stored here: secret_ref names it in the
-- environment (blizz.payments.secrets.<ref>).
create table payment_merchant (
    id         uuid primary key,
    provider   text        not null check (provider in ('WAYFORPAY', 'FAKE')),
    account    text        not null,
    domain     text        not null,
    secret_ref text        not null check (secret_ref ~ '^[a-z0-9-]{1,40}$'),
    currency   varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    created_at timestamptz not null,
    unique (provider, account)
);

-- Which merchant takes card payments in a city (city belongs to geo: no foreign key, ADR 0004).
create table payment_merchant_city (
    city_id     uuid primary key,
    merchant_id uuid not null references payment_merchant (id)
);

-- A rider's card as the provider knows it: the token for later charges, never the card number (REQ-PAY-08).
create table payment_card (
    id          uuid primary key,
    client_id   uuid        not null,
    merchant_id uuid        not null references payment_merchant (id),
    token       text        not null,
    masked_pan  text        not null,
    card_type   text,
    state       text        not null check (state in ('ACTIVE', 'REMOVED')),
    created_at  timestamptz not null,
    removed_at  timestamptz,
    version     bigint      not null default 0,
    check ((state = 'REMOVED') = (removed_at is not null))
);
create unique index payment_card_token_uq on payment_card (merchant_id, token) where state = 'ACTIVE';
create index payment_card_client_idx on payment_card (client_id) where state = 'ACTIVE';

-- Adding a card: the app shows the provider's page; the provider tells us the result at serviceUrl.
create table card_binding (
    id             uuid primary key,
    client_id      uuid        not null,
    merchant_id    uuid        not null references payment_merchant (id),
    reference      text        not null unique,
    state          text        not null check (state in ('PENDING', 'COMPLETED', 'FAILED')),
    card_id        uuid references payment_card (id),
    failure_reason text,
    created_at     timestamptz not null,
    expires_at     timestamptz not null,
    completed_at   timestamptz,
    check ((state = 'COMPLETED') = (card_id is not null))
);

-- Every notification from a provider, before it changes anything (REQ-PAY-11). A repeat (same fingerprint) is
-- stored once; a later different status for the same reference is a new row.
create table payment_event (
    id          uuid primary key,
    merchant_id uuid        not null references payment_merchant (id),
    reference   text        not null,
    status      text,
    fingerprint text        not null unique,
    payload     jsonb       not null,
    received_at timestamptz not null,
    outcome     text
);
create index payment_event_reference_idx on payment_event (merchant_id, reference);
