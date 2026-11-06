-- Staff refunds to riders reach the card (ADR 0018 part A, issue #512, part 2): a REFUND operation for a rider
-- refund names the refund; one without it releases a hold as before.
alter table payment_operation add column refund_id uuid;
create index payment_operation_refund_idx on payment_operation (refund_id) where refund_id is not null;
