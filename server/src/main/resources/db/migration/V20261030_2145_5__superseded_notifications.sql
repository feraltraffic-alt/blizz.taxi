-- A notification whose subject is no longer current when its turn comes — the offer closed, the assignment replaced —
-- is never sent and ends SUPERSEDED (REQ-NTF-03, AC-19, issue #143).
alter table notification drop constraint notification_state_check;
alter table notification add constraint notification_state_check
    check (state in ('PENDING', 'SENDING', 'SENT', 'FAILED', 'EXPIRED', 'NO_DEVICE', 'SUPERSEDED'));
