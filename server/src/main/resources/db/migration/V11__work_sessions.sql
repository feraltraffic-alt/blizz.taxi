-- Driver work sessions and capacity (sections 10, 12; REQ-DRV-03, REQ-DRV-06, REQ-DS-*).

create table work_session (
    id                      uuid primary key,
    driver_id               uuid        not null references driver (id),
    vehicle_id              uuid        not null references vehicle (id),
    city_id                 uuid        not null references city (id),
    device_session_id       uuid        not null references device_session (id),
    state                   text        not null check (state in ('OPEN', 'CLOSING', 'CLOSED')),
    intent                  text        not null
        check (intent in ('ACCEPTING', 'PAUSE_AFTER_CURRENT', 'NOT_ACCEPTING')),
    opened_at               timestamptz not null,
    closed_at               timestamptz,
    last_heartbeat_at       timestamptz not null,
    last_location           geometry(Point, 4326),
    last_location_at        timestamptz,
    last_location_accuracy  real,
    last_location_sequence  bigint,
    version                 bigint      not null default 0
);
-- One controlling session per driver (REQ-DRV-03, section 21.2).
create unique index work_session_open_driver_uq on work_session (driver_id) where state in ('OPEN', 'CLOSING');
create index work_session_location_gist on work_session using gist (last_location) where state = 'OPEN';

-- One capacity row per local driver; the order core changes occupancy (section 21.2).
create table driver_capacity (
    driver_id     uuid primary key references driver (id),
    occupancy     text        not null default 'FREE'
        check (occupancy in ('FREE', 'OFFERED', 'RESERVED', 'TO_PICKUP', 'WAITING', 'ON_TRIP')),
    assignment_id uuid,
    updated_at    timestamptz not null,
    version       bigint      not null default 0
);
