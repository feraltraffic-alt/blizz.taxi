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

-- What the deletion looks up by the driver (bounded queries): open cash disputes, chat messages and ratings written.
create index cash_dispute_driver_open_idx on cash_dispute (driver_id) where decision is null;
create index order_message_sender_idx on order_message (sender_id) where sender_role = 'DRIVER';
create index rating_author_idx on rating (author_type, author_id);
