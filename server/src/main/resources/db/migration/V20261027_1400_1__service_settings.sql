-- Service settings: brand, languages and how "Call" works (REQ-TEN-06, REQ-TEN-07; owner decision 26.10.2026
-- on the call mode). Every change is a new version with its author and reason; versions never change.
create table service_settings (
    version    bigint      primary key check (version >= 1),
    settings   jsonb       not null,
    changed_by uuid        not null,
    reason     text        not null check (length(trim(reason)) > 0),
    changed_at timestamptz not null
);

create function service_settings_is_append_only() returns trigger language plpgsql as $$
begin
    raise exception 'Service settings versions are append-only' using errcode = '23514';
end $$;
create trigger service_settings_append_only before update or delete on service_settings
    for each row execute function service_settings_is_append_only();
create trigger service_settings_no_truncate before truncate on service_settings
    for each statement execute function service_settings_is_append_only();
