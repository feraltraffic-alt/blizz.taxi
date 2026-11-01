-- Issue #140, REQ-LED-09: an export remembers the time zone and the UTC bounds of the local days it covers. Older
-- exports have none.
alter table report_export
    add column timezone text,
    add column from_utc timestamptz,
    add column to_utc timestamptz;
