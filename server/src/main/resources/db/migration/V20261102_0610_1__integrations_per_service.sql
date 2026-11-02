-- ADR 0016, issue #215: each taxi service enters its own keys and settings of the external services.
alter table integration_value add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
alter table integration_value drop constraint integration_value_pkey;
alter table integration_value add primary key (service_id, name);
