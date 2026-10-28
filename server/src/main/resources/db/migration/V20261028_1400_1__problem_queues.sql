-- Problem queues in full (REQ-OPS-06): no driver, the driver lost after the assignment, a payment error, a payment
-- result still unknown. Each case gets a time by which someone should take it, from its priority.
alter table support_case drop constraint support_case_category_check;
alter table support_case add constraint support_case_category_check
    check (category in ('LOST_ITEM', 'PAYMENT', 'CASH_DISPUTE', 'DRIVER_BEHAVIOUR', 'RIDER_BEHAVIOUR', 'SAFETY',
                        'TRIP_REVIEW', 'APP_PROBLEM', 'OTHER', 'NO_DRIVER', 'LOST_CONNECTION', 'PAYMENT_UNKNOWN'));
alter table support_case add column respond_by timestamptz;
update support_case set respond_by = created_at + case priority
    when 'URGENT' then interval '5 minutes' when 'HIGH' then interval '15 minutes'
    when 'NORMAL' then interval '4 hours' else interval '24 hours' end;
alter table support_case alter column respond_by set not null;
create index support_case_overdue_idx on support_case (respond_by) where state = 'OPEN';

-- Owned by operations: when the driver of an assignment was reported lost (once per assignment).
alter table assignment add column lost_reported_at timestamptz;

-- Owned by payments: when an operation still UNKNOWN was reported to the dispatchers (once per operation).
alter table payment_operation add column unknown_reported_at timestamptz;
