-- Order core: orders and their history, dispatch attempts, offers, assignments, trips
-- (sections 9-11, 21.2). Invariants that must hold under concurrency are unique indexes.

create table ride_order (
    id                 uuid primary key,
    short_number       bigint generated always as identity unique,
    channel            text        not null check (channel in ('APP', 'PHONE')),
    payer_client_id    uuid references client (id),
    created_by_type    text        not null check (created_by_type in ('CLIENT', 'STAFF')),
    created_by_id      uuid        not null,
    city_id            uuid        not null references city (id),
    vehicle_class      text        not null,
    pickup             geometry(Point, 4326) not null,
    pickup_label       text        not null,
    dropoff            geometry(Point, 4326) not null,
    dropoff_label      text        not null,
    payment_method     text        not null check (payment_method in ('CASH', 'CARD')),
    price_minor        bigint check (price_minor >= 0),
    currency           char(3),
    status             text        not null
        check (status in ('AWAITING_PAYMENT', 'READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE', 'FULFILLED',
                          'CANCELLED', 'UNFULFILLED')),
    status_reason      text,
    created_at         timestamptz not null,
    updated_at         timestamptz not null,
    version            bigint      not null default 0,
    check ((price_minor is null) = (currency is null))
);
-- One active order per paying account in M1 (REQ-RID-03).
create unique index ride_order_active_payer_uq on ride_order (payer_client_id)
    where payer_client_id is not null
      and status in ('AWAITING_PAYMENT', 'READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE');
create index ride_order_city_status_idx on ride_order (city_id, status, created_at, id);
create index ride_order_payer_idx on ride_order (payer_client_id, created_at, id);

-- Append-only history of every change (REQ-ADM-02).
create table order_event (
    order_id    uuid        not null references ride_order (id),
    sequence    bigint      not null,
    type        text        not null,
    actor_type  text        not null check (actor_type in ('STAFF', 'CLIENT', 'DRIVER', 'PARTNER', 'SYSTEM')),
    actor_id    uuid,
    reason      text,
    payload     jsonb       not null default '{}',
    occurred_at timestamptz not null,
    primary key (order_id, sequence)
);

create table dispatch_attempt (
    id             uuid primary key,
    order_id       uuid        not null references ride_order (id),
    generation     int         not null,
    phase          text        not null check (phase in ('PERSONAL', 'BROADCAST', 'STOPPED', 'EXHAUSTED')),
    phase_deadline timestamptz,
    total_deadline timestamptz not null,
    next_action_at timestamptz,
    lease_owner    text,
    lease_until    timestamptz,
    created_at     timestamptz not null,
    version        bigint      not null default 0,
    unique (order_id, generation)
);
-- One live search per order (section 21.2).
create unique index dispatch_attempt_live_uq on dispatch_attempt (order_id) where phase in ('PERSONAL', 'BROADCAST');
create index dispatch_attempt_due_idx on dispatch_attempt (next_action_at) where phase in ('PERSONAL', 'BROADCAST');

create table offer (
    id         uuid primary key,
    order_id   uuid        not null references ride_order (id),
    attempt_id uuid        not null references dispatch_attempt (id),
    driver_id  uuid        not null references driver (id),
    state      text        not null check (state in ('OPEN', 'ACCEPTED', 'REJECTED', 'EXPIRED', 'REVOKED')),
    distance_m int,
    expires_at timestamptz not null,
    created_at timestamptz not null,
    closed_at  timestamptz,
    unique (attempt_id, driver_id)
);
-- One open personal offer per driver and per order (REQ-DSP-05).
create unique index offer_open_driver_uq on offer (driver_id) where state = 'OPEN';
create unique index offer_open_order_uq on offer (order_id) where state = 'OPEN';

create table assignment (
    id           uuid primary key,
    order_id     uuid        not null references ride_order (id),
    driver_id    uuid        not null references driver (id),
    vehicle_id   uuid        not null references vehicle (id),
    source       text        not null check (source in ('OFFER', 'BROADCAST')),
    state        text        not null check (state in ('RESERVED', 'COMMITTED', 'RELEASED', 'REVOKED', 'COMPLETED')),
    created_at   timestamptz not null,
    closed_at    timestamptz,
    close_reason text,
    version      bigint      not null default 0
);
-- Never two active assignments for one order or one driver (REQ-ASG-09, AC-09).
create unique index assignment_active_order_uq on assignment (order_id) where state in ('RESERVED', 'COMMITTED');
create unique index assignment_active_driver_uq on assignment (driver_id) where state in ('RESERVED', 'COMMITTED');

create table trip (
    id            uuid primary key,
    assignment_id uuid        not null unique references assignment (id),
    order_id      uuid        not null references ride_order (id),
    phase         text        not null check (phase in ('TO_PICKUP', 'WAITING', 'IN_PROGRESS', 'COMPLETED', 'ABORTED')),
    arrived_at    timestamptz,
    started_at    timestamptz,
    completed_at  timestamptz,
    created_at    timestamptz not null,
    version       bigint      not null default 0
);
create index trip_order_idx on trip (order_id);
