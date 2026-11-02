-- The platform owner (ADR 0016, issue #214): above the taxi services, creates them and their first super admins, and
-- belongs to none. Their sessions have no service; every other staff member belongs to exactly one.
alter table staff_user drop constraint staff_user_role_check;
alter table staff_user add constraint staff_user_role_check
    check (role in ('PLATFORM_OWNER', 'SUPER_ADMIN', 'ADMIN', 'OPERATOR'));
alter table staff_user alter column service_id drop not null;
alter table staff_user add constraint staff_user_service_check check ((role = 'PLATFORM_OWNER') = (service_id is null));
alter table device_session alter column service_id drop not null;
