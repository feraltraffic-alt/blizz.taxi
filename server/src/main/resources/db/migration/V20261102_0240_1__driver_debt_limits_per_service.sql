-- ADR 0016, issue #215: each taxi service sets its own driver debt limit per currency. A change bumps the
-- service's own version (optimistic checks) and takes a new sweep number from one sequence, so the background
-- refresh of every driver in the currency keeps one increasing target per currency.
alter table driver_debt_limit add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
alter table driver_debt_limit add column sweep_version bigint;
update driver_debt_limit set sweep_version = version;
alter table driver_debt_limit alter column sweep_version set not null;
alter table driver_debt_limit drop constraint driver_debt_limit_pkey;
alter table driver_debt_limit add primary key (service_id, currency);
create sequence driver_debt_sweep_seq;
select setval('driver_debt_sweep_seq', coalesce((select max(version) from driver_debt_limit), 0) + 1, false);
