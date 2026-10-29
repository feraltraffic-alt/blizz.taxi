-- Select only mutable/recent invariant candidates, not the full operational history.
create index journal_transaction_invariant_time_idx on journal_transaction(occurred_at,id);
create index ride_order_invariant_active_idx on ride_order(id) where status in ('ASSIGNED','IN_SERVICE');
create index assignment_invariant_committed_idx on assignment(order_id,created_at) where state='COMMITTED';
create index payment_intent_invariant_updated_idx on payment_intent(updated_at,id);
create index payment_operation_invariant_updated_idx on payment_operation(updated_at,intent_id);
create index payment_operation_invariant_auth_idx on payment_operation(created_at,intent_id)
    where type='AUTH' and state='SUCCEEDED';
