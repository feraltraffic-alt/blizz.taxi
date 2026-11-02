-- Cancel reasons per taxi service (ADR 0016, issue #215): each service has its own catalogue; a new service starts with
-- a copy of the first service's at its first use. What existed belongs to the first service.
alter table cancel_reason add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
alter table cancel_reason drop constraint cancel_reason_audience_code_key;
alter table cancel_reason add constraint cancel_reason_service_code_key unique (service_id, audience, code);
