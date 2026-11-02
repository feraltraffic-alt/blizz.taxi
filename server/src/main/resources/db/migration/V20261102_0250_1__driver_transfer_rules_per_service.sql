-- ADR 0016, issue #215: each taxi service sets its own rules for transfers between its drivers.
alter table driver_transfer_rule add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
alter table driver_transfer_rule drop constraint driver_transfer_rule_pkey;
alter table driver_transfer_rule add primary key (service_id, currency);
