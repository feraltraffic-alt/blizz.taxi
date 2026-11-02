-- ADR 0016, issue #218: the change log and the staff activity log belong to a taxi service, the one of who acted;
-- staff read their own service's only. Rows written before services were all of the first service. A system
-- action of no person has no service and is shown to no service's staff.
alter table audit_log add column service_id uuid references service (id)
    default '5e000000-0000-4000-8000-000000000001';
alter table audit_log alter column service_id drop default;
create index audit_log_service_idx on audit_log (service_id, occurred_at desc, id desc);

alter table staff_activity add column service_id uuid references service (id)
    default '5e000000-0000-4000-8000-000000000001';
alter table staff_activity alter column service_id drop default;
create index staff_activity_service_idx on staff_activity (service_id, occurred_at desc, id desc);
