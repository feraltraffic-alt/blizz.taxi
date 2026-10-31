-- A driver's deletion (issue #144, REQ-PRV-04): the same shape as the rider's (#56). The driver asks, the account is
-- DELETION_PENDING until staff complete (ANONYMIZED) or reject it; anonymized_at starts the delay after which the
-- document files are deleted (blizz.driver.document-keep, 0 by default).
alter table driver add column deletion_previous_state text check (deletion_previous_state in ('ACTIVE', 'BLOCKED'));
alter table driver add column deletion_requested_at timestamptz;
alter table driver add column anonymized_at timestamptz;
alter table driver add constraint driver_deletion_pending_check
    check ((account_state = 'DELETION_PENDING') = (deletion_requested_at is not null));
create index driver_deletion_pending_idx on driver (deletion_requested_at, id) where account_state = 'DELETION_PENDING';
create index driver_anonymized_idx on driver (anonymized_at, id) where account_state = 'ANONYMIZED';
