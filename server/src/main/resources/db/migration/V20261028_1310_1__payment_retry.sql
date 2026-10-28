-- A staff member's manual retry of a declined charge (REQ-PAY-14): the new operation points at the one it repeats
-- and names who asked. One retry per operation; a retry may itself be retried once it is declined.
alter table payment_operation add column retry_of uuid references payment_operation (id);
alter table payment_operation add column initiated_by uuid;
create unique index payment_operation_retry_uq on payment_operation (retry_of) where retry_of is not null;
alter table payment_operation add constraint payment_operation_retry_check
    check (retry_of is null or (type = 'CHARGE' and initiated_by is not null));
