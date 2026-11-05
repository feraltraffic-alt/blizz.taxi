-- Who is at fault for a cancelled order (owner decision 05.11.2026, ADR 0019).

-- The fault each cancellation reason gives; CLIENT turns into CLIENT_FREE or CLIENT by the time. REASSIGN reasons
-- cancel nothing and have none. late_driver_fault: the driver's fault when the driver is late.
alter table cancel_reason add column fault text check (fault in ('CLIENT', 'DRIVER', 'OPERATOR', 'NONE'));
alter table cancel_reason add column late_driver_fault boolean not null default false;
update cancel_reason set fault = case
    when audience = 'REASSIGN' then null
    when audience = 'RIDER' then 'CLIENT'
    when audience = 'DRIVER' then case when code in ('NO_SHOW', 'PASSENGER_ASKED') then 'CLIENT' else 'DRIVER' end
    when operator_fault then 'OPERATOR'
    when code = 'PASSENGER_ASKED' then 'CLIENT'
    when code = 'VEHICLE_BREAKDOWN' then 'DRIVER'
    else 'NONE' end;
update cancel_reason set late_driver_fault = true where audience = 'RIDER' and code = 'WAIT_TOO_LONG';
alter table cancel_reason add constraint cancel_reason_fault_audience_check
    check ((audience = 'REASSIGN') = (fault is null));
alter table cancel_reason add constraint cancel_reason_operator_fault_check
    check (operator_fault = coalesce(fault = 'OPERATOR', false));
alter table cancel_reason add constraint cancel_reason_late_driver_fault_check
    check (not late_driver_fault or fault = 'CLIENT');

-- The fault of a cancelled order; null for orders cancelled before ADR 0019.
alter table ride_order add column cancel_fault text
    check (cancel_fault in ('CLIENT_FREE', 'CLIENT', 'DRIVER', 'OPERATOR', 'NONE'));
alter table ride_order add constraint ride_order_cancel_fault_check
    check (cancel_fault is null or cancelled_by is not null);

-- A driver's cancellation may come from the rider's cancellation for lateness (LATE) or from staff setting the
-- driver's fault (STAFF); a cancellation staff took off the driver is not counted with the reason STAFF.
alter table driver_cancellation add column source text not null default 'DRIVER'
    check (source in ('DRIVER', 'LATE', 'STAFF'));
alter table driver_cancellation drop constraint driver_cancellation_not_counted_why_check;
alter table driver_cancellation add constraint driver_cancellation_not_counted_why_check
    check (not_counted_why in ('GRACE', 'REASON', 'OFF', 'STAFF'));
