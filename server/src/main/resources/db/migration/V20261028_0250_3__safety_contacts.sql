-- The safety button (REQ-RID-09): the service's support contacts and the local emergency number per city.
-- Owned by configuration; city_id has no foreign key to geo's city (ADR 0004). A city without a row gets the
-- default (112, nothing else). Each change bumps the version and is audited.
create table safety_contacts (
    city_id          uuid primary key,
    emergency_number text        not null check (emergency_number ~ '^[0-9]{2,6}$'),
    support_phone    text check (support_phone is null or support_phone ~ '^\+[1-9][0-9]{7,14}$'),
    extra            jsonb       not null default '[]'::jsonb check (jsonb_typeof(extra) = 'array'),
    version          bigint      not null check (version >= 1),
    changed_by       uuid        not null,
    reason           text        not null,
    changed_at       timestamptz not null
);
