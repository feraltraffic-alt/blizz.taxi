-- Settings per taxi service (ADR 0016, issue #215): each service has its own brand, languages, rules and limits, its
-- own history of versions. What existed belongs to the first service.
alter table service_settings add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
alter table service_settings drop constraint service_settings_pkey;
alter table service_settings add primary key (service_id, version);
