-- When an attempt stopped, so a resumed search continues the passenger's search time instead of
-- silently starting over (REQ-CAN-05).
alter table dispatch_attempt add column stopped_at timestamptz;
update dispatch_attempt set stopped_at = created_at where phase in ('STOPPED', 'EXHAUSTED');
