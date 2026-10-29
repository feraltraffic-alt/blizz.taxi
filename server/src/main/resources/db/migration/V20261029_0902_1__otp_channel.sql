-- One-time codes against SMS pumping (issue #101): the one channel each code went by, for the per-number budget of
-- calls, and an index for the per-number budgets that count riders and drivers together.
alter table otp_challenge add column channel text check (channel in ('SMS', 'VOICE'));

create index otp_challenge_phone_any_idx on otp_challenge (phone_normalized, created_at);
