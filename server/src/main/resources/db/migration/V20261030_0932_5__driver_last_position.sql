-- The position dispatch uses must follow from the driver's previous one (issue #102, threat model G1/G2).

-- The driver's last position accepted as the dispatch position, kept across devices and shifts: signing in again or
-- opening a new shift does not reset it. A fix that implies more than blizz.risk.impossible-speed-kph from it is
-- refused; one older than 30 minutes is not used as a baseline. Written under the driver's capacity lock.
create table driver_last_position (
    driver_id   uuid primary key,
    point       geometry(Point, 4326) not null,
    accepted_at timestamptz not null
);

-- Set when a heartbeat's fix was refused, cleared by the next accepted one: the location is STALE meanwhile, and
-- last_location keeps the last trusted point (the operator's map shows it).
alter table work_session add column location_refused_at timestamptz;
