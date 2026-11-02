-- Legal texts per taxi service (ADR 0016, issue #215): each service publishes its own terms and policies, numbered
-- on their own; a rider or driver accepts those of their own service. What existed belongs to the first service.
alter table legal_document_version add column service_id uuid not null
    default '5e000000-0000-4000-8000-000000000001' references service (id);
alter table legal_document_version drop constraint legal_document_version_audience_kind_number_key;
alter table legal_document_version add constraint legal_document_version_service_number_key
    unique (service_id, audience, kind, number);
