-- Reuse the gauge index (#111). Cleanup deletes its selected rows and has no tie/cursor contract, so an
-- attempted_at-only order provides the same bounded oldest-first progress without a duplicate index.
create index if not exists otp_delivery_attempted_idx on otp_delivery(attempted_at);
drop index otp_delivery_retention_idx;
