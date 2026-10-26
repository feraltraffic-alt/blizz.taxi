-- Double-entry journal (REQ-LED-01..03). Append-only; every transaction balances; one business_key once.
create table journal_transaction (
    id           uuid primary key,
    business_key text        not null unique check (length(trim(business_key)) > 0),
    basis_type   text        not null,
    basis_id     uuid        not null,
    currency     varchar(3)  not null check (currency ~ '^[A-Z]{3}$'),
    reason       text        not null check (length(trim(reason)) > 0),
    reverses_id  uuid references journal_transaction(id),
    occurred_at  timestamptz not null
);
create index journal_transaction_basis_idx on journal_transaction(basis_type, basis_id);

create table journal_line (
    transaction_id uuid   not null references journal_transaction(id),
    line_no        int    not null check (line_no >= 1),
    account        text   not null check (account in ('RIDER_RECEIVABLE', 'DRIVER_PAYABLE', 'SERVICE_COMMISSION',
                                                      'PROVIDER_CLEARING', 'PARTNER_SETTLEMENT', 'TIPS_PAYABLE',
                                                      'REFUNDS_PAYABLE', 'SUSPENSE')),
    party_id       uuid,
    debit_minor    bigint not null default 0 check (debit_minor >= 0),
    credit_minor   bigint not null default 0 check (credit_minor >= 0),
    primary key (transaction_id, line_no),
    check ((debit_minor = 0) <> (credit_minor = 0))
);
create index journal_line_account_party_idx on journal_line(account, party_id);

create function journal_is_append_only() returns trigger language plpgsql as $$
begin
    raise exception 'The journal is append-only; post a reversal instead' using errcode = '23514';
end $$;
create trigger journal_transaction_append_only before update or delete on journal_transaction
    for each row execute function journal_is_append_only();
create trigger journal_line_append_only before update or delete on journal_line
    for each row execute function journal_is_append_only();
create trigger journal_transaction_no_truncate before truncate on journal_transaction
    for each statement execute function journal_is_append_only();
create trigger journal_line_no_truncate before truncate on journal_line
    for each statement execute function journal_is_append_only();

-- Checked at commit, after all lines of the transaction are written: at least two lines, debit = credit.
-- A transaction row without lines is refused by the same check from its side.
create function journal_transaction_balances() returns trigger language plpgsql as $$
declare
    tx uuid := new.transaction_id;
    lines int;
    debit numeric;
    credit numeric;
begin
    select count(*), coalesce(sum(debit_minor), 0), coalesce(sum(credit_minor), 0)
    into lines, debit, credit from journal_line where transaction_id = tx;
    if lines < 2 or debit <> credit then
        raise exception 'Journal transaction % does not balance (lines %, debit %, credit %)', tx, lines, debit, credit
            using errcode = '23514';
    end if;
    return null;
end $$;
create constraint trigger journal_line_balanced after insert on journal_line
    deferrable initially deferred for each row execute function journal_transaction_balances();

create function journal_transaction_has_lines() returns trigger language plpgsql as $$
begin
    if not exists (select 1 from journal_line where transaction_id = new.id) then
        raise exception 'Journal transaction % has no lines', new.id using errcode = '23514';
    end if;
    return null;
end $$;
create constraint trigger journal_transaction_has_lines after insert on journal_transaction
    deferrable initially deferred for each row execute function journal_transaction_has_lines();
