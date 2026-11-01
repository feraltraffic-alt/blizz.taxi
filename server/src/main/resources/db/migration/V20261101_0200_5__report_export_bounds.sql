-- Issue #140, REQ-LED-09: an export remembers the time zone and the UTC bounds of the local days it covers (the
-- first local midnight included, the one after the last day excluded). Older exports get them from their city.
alter table report_export
    add column timezone text,
    add column from_utc timestamptz,
    add column to_utc timestamptz;

update report_export e
set timezone = c.timezone,
    from_utc = e.date_from::timestamp at time zone c.timezone,
    to_utc = (e.date_to + 1)::timestamp at time zone c.timezone
from city c
where c.id = e.city_id;

alter table report_export
    alter column timezone set not null,
    alter column from_utc set not null,
    alter column to_utc set not null;
