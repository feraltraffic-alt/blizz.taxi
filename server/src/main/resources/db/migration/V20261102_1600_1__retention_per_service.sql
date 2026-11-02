-- Retention terms per taxi service (ADR 0016, owner decisions 02.11.2026, issue #276): the versions so far are the
-- first service's; each service numbers its own versions. Delivered events and receipts are kept a fixed 30 days and
-- leave the stored terms.
alter table retention_settings add column service_id uuid not null
    default '5e000000-0000-4000-8000-000000000001' references service (id);
alter table retention_settings drop constraint retention_settings_pkey;
alter table retention_settings add primary key (service_id, version);
update retention_settings
set days = days - 'delivered_events' - 'consumer_receipts' - 'command_receipts';
