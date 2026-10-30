-- The cities a driver is admitted in (REQ-DSP-01, REQ-DS-06, issue #141). Owned by `driver`. A driver goes online,
-- is offered orders and sees the ALL tab only in these. No foreign key to `city` (owned by `geo`, ADR 0004): the
-- command that sets the list checks every city through the geo API in the same transaction.
create table driver_admission_city (
    driver_id  uuid        not null references driver (id),
    city_id    uuid        not null,
    granted_by uuid,
    granted_at timestamptz not null,
    primary key (driver_id, city_id)
);
create index driver_admission_city_city_idx on driver_admission_city (city_id, driver_id);

-- Back-fill rule (agreed in issue #141): every driver who is APPROVED now is admitted in each city they have ever
-- opened a work session in, so nobody who drives today loses the line at the deploy. An APPROVED driver without any
-- session gets no city and cannot go online until staff set one (listed in the PR). granted_by stays null: set by
-- this migration, not by a person. Reads `work_session` (operations) once, as ADR 0004 lists for this migration.
insert into driver_admission_city (driver_id, city_id, granted_by, granted_at)
select distinct ws.driver_id, ws.city_id, null::uuid, now()
from work_session ws
join driver d on d.id = ws.driver_id
where d.review_status = 'APPROVED';

-- How far outside its polygon a driver may be and still get the city's new orders (REQ-DS-07). 0: not at all.
-- Never ends or changes a current trip. Owned by `geo` with the other city operations.
alter table city_operations
    add column return_zone_meters int not null default 0 check (return_zone_meters between 0 and 50000);
