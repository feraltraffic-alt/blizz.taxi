-- REQ-LED-07: immutable completed daily snapshots, resumable failed/abandoned attempts.
create table payment_reconciliation (
    id uuid primary key,
    merchant_id uuid not null references payment_merchant(id),
    day date not null,
    period_from timestamptz not null,
    period_to timestamptz not null,
    observed_until timestamptz,
    partial boolean not null default false,
    state text not null check (state in ('RUNNING','CLEAN','OPEN','RESOLVED','FAILED')),
    local_count integer check (local_count >= 0),
    provider_count integer check (provider_count >= 0),
    item_count integer check (item_count >= 0),
    open_count integer check (open_count >= 0),
    failure_code text check (failure_code ~ '^[A-Z][A-Z0-9_]{0,79}$'),
    attempts integer not null default 1 check (attempts > 0),
    lease_token uuid,
    lease_until timestamptz,
    created_at timestamptz not null,
    updated_at timestamptz not null,
    finished_at timestamptz,
    version bigint not null default 0,
    unique (merchant_id, day, partial),
    check (period_from < period_to)
);
create index payment_reconciliation_merchant_page_idx on payment_reconciliation(merchant_id,id);
create index payment_reconciliation_last_success_idx on payment_reconciliation(merchant_id,finished_at desc)
    where state in ('CLEAN','OPEN','RESOLVED') and not partial and finished_at is not null;
create index payment_reconciliation_failed_idx on payment_reconciliation(id) where state='FAILED';
create index payment_reconciliation_retry_idx on payment_reconciliation(updated_at)
    where state in ('FAILED','RUNNING');

create table payment_reconciliation_item (
    id uuid primary key,
    run_id uuid not null references payment_reconciliation(id),
    kind text not null check (kind in ('MISSING_LOCALLY','MISSING_AT_PROVIDER','AMOUNT','CURRENCY','STATE','UNKNOWN_STILL')),
    reference_fingerprint text not null check (reference_fingerprint ~ '^[a-f0-9]{64}$'),
    local_operation_id uuid references payment_operation(id),
    local_record_id uuid,
    local_type text,
    local_state text,
    local_amount_minor bigint check (local_amount_minor >= 0),
    local_currency text check (local_currency ~ '^[A-Z]{3}$'),
    provider_type text,
    provider_state text,
    provider_status text,
    provider_amount_minor bigint check (provider_amount_minor >= 0),
    provider_currency text check (provider_currency ~ '^[A-Z]{3}$'),
    fee_minor bigint,
    provider_at timestamptz,
    state text not null default 'OPEN' check (state in ('OPEN','RESOLVED')),
    decision text check (decision in ('EXPLAINED','CORRECTED_BY_HAND','ESCALATED')),
    reason text check (length(reason) between 1 and 500),
    resolved_by uuid,
    resolved_at timestamptz,
    version bigint not null default 0,
    unique (run_id, reference_fingerprint, kind),
    check ((state='OPEN' and decision is null and reason is null and resolved_by is null and resolved_at is null)
        or (state='RESOLVED' and decision is not null and reason is not null and resolved_by is not null and resolved_at is not null))
);
create index payment_reconciliation_item_open_idx on payment_reconciliation_item(kind) where state='OPEN';
create index payment_reconciliation_item_page_idx on payment_reconciliation_item(run_id,id);

-- Accounting-only provider evidence, including fees on clean rows. Never raw bank JSON/customer data.
create table payment_reconciliation_entry (
    run_id uuid not null references payment_reconciliation(id),
    reference_fingerprint text not null check (reference_fingerprint ~ '^[a-f0-9]{64}$'),
    provider_type text not null,
    provider_status text not null,
    amount_minor bigint not null check (amount_minor >= 0),
    currency text not null check (currency ~ '^[A-Z]{3}$'),
    fee_minor bigint,
    created_at timestamptz not null,
    processed_at timestamptz,
    primary key (run_id, reference_fingerprint)
);

-- Daily time cohort and bounded anchor lookup; never aggregate the complete operation history.
create index payment_operation_reconciliation_created_idx on payment_operation(created_at,intent_id);
create index payment_operation_reconciliation_target_idx on payment_operation(target,created_at,id);
create index card_top_up_reconciliation_created_idx on card_top_up(merchant_id,created_at);
create index card_top_up_reconciliation_completed_idx on card_top_up(merchant_id,completed_at);
create index card_binding_reconciliation_created_idx on card_binding(merchant_id,created_at);
create index card_binding_reconciliation_completed_idx on card_binding(merchant_id,completed_at);
