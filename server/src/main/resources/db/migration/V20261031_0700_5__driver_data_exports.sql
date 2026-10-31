-- A driver's copy of their personal data (issue #144, REQ-PRV-07): the same table and worker as the rider's (#68), for
-- exactly one of the two. No foreign key to driver: the driver module owns that table (ADR 0004).
alter table personal_data_export alter column client_id drop not null;
alter table personal_data_export add column driver_id uuid;
alter table personal_data_export add constraint personal_data_export_subject_check
    check ((client_id is null) <> (driver_id is null));
create index personal_data_export_driver_idx on personal_data_export (driver_id, created_at desc)
    where driver_id is not null;
