-- The list of reconciliation runs pages newest day first (#112), not by a random id.
drop index payment_reconciliation_merchant_page_idx;
create index payment_reconciliation_merchant_page_idx on payment_reconciliation (merchant_id, day, id);
