-- Driver admission: vehicles, documents and review history (section 6, REQ-DRV-01, REQ-DRV-02, REQ-DRV-05).

create table vehicle (
    id                  uuid primary key,
    driver_id           uuid        not null references driver (id),
    registration_number text        not null,
    make                text        not null,
    model               text        not null,
    color               text        not null,
    production_year     int         not null check (production_year between 1950 and 2100),
    state               text        not null default 'DRAFT'
        check (state in ('DRAFT', 'IN_REVIEW', 'APPROVED', 'SUSPENDED', 'EXPIRED')),
    class_approvals     text[]      not null default '{}',
    created_at          timestamptz not null,
    updated_at          timestamptz not null,
    version             bigint      not null default 0
);
create index vehicle_driver_idx on vehicle (driver_id);

-- New documents never overwrite old ones; the latest row per driver/vehicle and type is current.
create table driver_document (
    id                uuid primary key,
    driver_id         uuid        not null references driver (id),
    vehicle_id        uuid references vehicle (id),
    type              text        not null
        check (type in ('DRIVER_LICENSE', 'IDENTITY', 'TAXI_PERMIT', 'VEHICLE_REGISTRATION', 'INSURANCE', 'OTHER')),
    file_id           uuid,
    number            text,
    valid_from        date,
    valid_to          date,
    decision          text        not null default 'PENDING' check (decision in ('PENDING', 'ACCEPTED', 'REJECTED')),
    decision_reason   text,
    reviewer_staff_id uuid references staff_user (id),
    decided_at        timestamptz,
    created_at        timestamptz not null,
    check (valid_to is null or valid_from is null or valid_to >= valid_from)
);
create index driver_document_driver_idx on driver_document (driver_id, type, created_at);
create index driver_document_valid_to_idx on driver_document (valid_to) where decision = 'ACCEPTED';

-- Every admission status change with its actor and mandatory reason (REQ-DRV-02).
create table driver_review_event (
    id          uuid primary key,
    driver_id   uuid        not null references driver (id),
    from_status text        not null,
    to_status   text        not null,
    actor_type  text        not null check (actor_type in ('STAFF', 'DRIVER', 'SYSTEM')),
    actor_id    uuid,
    reason      text        not null,
    occurred_at timestamptz not null
);
create index driver_review_event_driver_idx on driver_review_event (driver_id, occurred_at);
