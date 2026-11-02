-- ADR 0016, issue #215: each taxi service sets its own operator bonus rules, each with its own history of versions;
-- an operator's account and closed periods belong to the service of the cities they take orders in.
alter table operator_bonus_settings add column service_id uuid not null
    default '5e000000-0000-4000-8000-000000000001' references service (id);
alter table operator_bonus_settings drop constraint operator_bonus_settings_pkey;
alter table operator_bonus_settings add primary key (service_id, version);

alter table operator_bonus_account add column service_id uuid not null
    default '5e000000-0000-4000-8000-000000000001' references service (id);
alter table operator_bonus_period add column service_id uuid not null
    default '5e000000-0000-4000-8000-000000000001' references service (id);
create index operator_bonus_period_service_idx on operator_bonus_period (service_id, period_key desc, staff_id);
