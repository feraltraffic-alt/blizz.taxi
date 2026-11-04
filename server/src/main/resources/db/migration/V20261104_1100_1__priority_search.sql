-- ADR 0018 P1: an order a driver gave back after accepting searches again ahead of the others (issue #487).
alter table dispatch_attempt add column priority boolean not null default false;
drop index dispatch_attempt_due_idx;
create index dispatch_attempt_due_idx on dispatch_attempt (priority desc, next_action_at)
    where phase in ('PERSONAL', 'BROADCAST');
