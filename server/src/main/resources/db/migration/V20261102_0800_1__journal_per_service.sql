-- ADR 0016, issue #216: every journal transaction belongs to one taxi service; money never mixes services.
-- The journal is append-only: the column is filled for the existing rows by its default, not by an update.
alter table journal_transaction add column service_id uuid not null
    default '5e000000-0000-4000-8000-000000000001' references service (id);
create index journal_transaction_service_idx on journal_transaction (service_id, occurred_at);
