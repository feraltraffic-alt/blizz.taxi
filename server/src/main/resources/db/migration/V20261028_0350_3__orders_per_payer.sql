-- Up to active_orders_per_payer orders at once (ADR 0012 Q-03, issue #57), pre-orders included. The unique index
-- that allowed one active order "now" per payer goes; the limit is counted under a per-payer lock when an order is
-- created, so two creations at the limit never both pass.
drop index ride_order_active_payer_uq;
create index ride_order_open_payer_idx on ride_order (payer_client_id)
    where payer_client_id is not null and status not in ('FULFILLED', 'CANCELLED', 'UNFULFILLED');

-- Phone orders count by the caller's phone (a caller without an account is limited by the number).
create index order_contact_phone_idx on order_contact (phone);
