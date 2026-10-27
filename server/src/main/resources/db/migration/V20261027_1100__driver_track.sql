create table track_point (
    id uuid primary key,
    driver_id uuid not null,
    device_session_id uuid not null,
    sequence bigint not null check (sequence >= 0),
    recorded_at timestamptz not null,
    received_at timestamptz not null,
    point geometry(Point, 4326) not null,
    accuracy_m double precision not null check (accuracy_m >= 0),
    speed_mps double precision,
    heading_deg double precision,
    flags text[] not null default '{}',
    constraint uq_track_point_session_sequence unique (device_session_id, sequence),
    constraint ck_track_point_speed check (speed_mps is null or speed_mps >= 0),
    constraint ck_track_point_heading check (heading_deg is null or (heading_deg >= 0 and heading_deg < 360))
);

create index ix_track_point_driver_recorded_at on track_point(driver_id, recorded_at);

create table location_batch_request (
    driver_id uuid not null,
    requested_at timestamptz not null
);

create index ix_location_batch_request_driver_time on location_batch_request(driver_id, requested_at);
