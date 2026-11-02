-- Feature flags per taxi service (ADR 0016, issue #215): each service switches its own; what was switched belongs to
-- the first service.
alter table feature_flag add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
alter table feature_flag drop constraint feature_flag_pkey;
alter table feature_flag add primary key (service_id, key);
