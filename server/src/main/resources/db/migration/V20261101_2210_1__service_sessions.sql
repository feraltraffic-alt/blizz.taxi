-- Sign-in by service (ADR 0016, issue #214): a one-time code is asked for in a service and signs in (or creates) the
-- account of that service; a session and every token of it carry the subject's service.
alter table otp_challenge add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
alter table device_session add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
