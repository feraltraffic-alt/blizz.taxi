-- ADR 0016, issue #215: a payment merchant belongs to one taxi service and serves only that service's cities.
alter table payment_merchant add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
create index payment_merchant_service_idx on payment_merchant (service_id, created_at);
