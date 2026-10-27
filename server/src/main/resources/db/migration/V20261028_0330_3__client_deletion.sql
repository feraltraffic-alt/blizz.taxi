-- A rider's request to delete the account (issue #56, REQ-RID-10, section 36.4): ACTIVE or BLOCKED →
-- DELETION_PENDING → ANONYMIZED, or back to the state it had. The previous state and the time of the request are
-- kept on the client while it is pending; staff complete or reject it by hand (retention timers are Q-19).
alter table client add column deletion_previous_state text
    check (deletion_previous_state in ('ACTIVE', 'BLOCKED'));
alter table client add column deletion_requested_at timestamptz;
alter table client add constraint client_deletion_pending_has_previous
    check ((account_state = 'DELETION_PENDING') = (deletion_previous_state is not null));
create index client_deletion_pending_idx on client (deletion_requested_at) where account_state = 'DELETION_PENDING';
