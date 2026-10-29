-- Wrong staff sign-ins per network address in the last minutes (threat model A3): an index for that count only.
create index staff_activity_failed_sign_in_idx on staff_activity (client_ip, occurred_at)
    where kind = 'SIGN_IN' and outcome in ('BAD_CREDENTIALS', 'LOCKED');
