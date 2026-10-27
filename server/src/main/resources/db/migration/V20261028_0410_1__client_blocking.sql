-- Staff block and unblock riders (section 36.4, REQ-ADM-01): ACTIVE → BLOCKED with a reason and, optionally, an
-- end; BLOCKED → ACTIVE by staff or when the end comes. A block ends the rider's sessions at once (REQ-AUTH-07); a
-- trip in progress goes on with the call centre. The block stays on the row while a deletion request is pending, so
-- cancelling the request returns to it.
alter table client add column blocked_reason text;
alter table client add column blocked_until  timestamptz;
alter table client add column blocked_at     timestamptz;
alter table client add column blocked_by     uuid;
create index client_blocked_until_idx on client (blocked_until) where account_state = 'BLOCKED';
create index client_name_idx on client (lower(name)) where account_state <> 'ANONYMIZED';
