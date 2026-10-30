-- What one staff member topped up in the last 24 hours (threat model C3): the limit sums both kinds of top-up by staff
-- member, currency and time.
create index driver_balance_top_up_staff_idx on driver_balance_top_up (staff_id, currency, created_at);
create index rider_wallet_top_up_staff_idx on rider_wallet_top_up (staff_id, currency, created_at)
    where source = 'STAFF';
