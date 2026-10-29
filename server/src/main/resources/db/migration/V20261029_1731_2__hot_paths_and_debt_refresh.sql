-- Hot request paths (issue #111); all indexes are non-unique and preserve existing data semantics.
create index assignment_order_created_idx on assignment(order_id,created_at desc);
create index assignment_driver_created_idx on assignment(driver_id,created_at desc);
create index offer_order_driver_idx on offer(order_id,driver_id);
create index track_point_session_recorded_idx on track_point(device_session_id,recorded_at desc,sequence desc);
create index support_case_order_idx on support_case(order_id);
create index otp_delivery_attempted_idx on otp_delivery(attempted_at);
create index audit_log_staff_occurred_idx on audit_log(occurred_at desc,id desc) where actor_type='STAFF';
create index support_case_queue_order_idx on support_case(city_id,
    (case priority when 'URGENT' then 0 when 'HIGH' then 1 when 'NORMAL' then 2 else 3 end),created_at desc,id desc);
create index support_case_overdue_order_idx on support_case(city_id,respond_by,
    (case priority when 'URGENT' then 0 when 'HIGH' then 1 when 'NORMAL' then 2 else 3 end),created_at desc,id desc)
    where state='OPEN';
-- IS NULL does not provide the planner's equality pathkey for the leading city column.
create index support_case_queue_no_city_idx on support_case(
    (case priority when 'URGENT' then 0 when 'HIGH' then 1 when 'NORMAL' then 2 else 3 end),created_at desc,id desc)
    where city_id is null;
create index support_case_overdue_no_city_idx on support_case(respond_by,
    (case priority when 'URGENT' then 0 when 'HIGH' then 1 when 'NORMAL' then 2 else 3 end),created_at desc,id desc)
    where city_id is null and state='OPEN';

-- Finance-owned registry and durable generation marker; no reference to another module's driver table.
create table driver_debt_refresh_member (
    currency varchar(3) not null check(currency ~ '^[A-Z]{3}$'),
    driver_id uuid not null,
    applied_version bigint not null default 0 check(applied_version>=0),
    primary key(currency,driver_id)
);
create index driver_debt_refresh_pending_idx on driver_debt_refresh_member(currency,applied_version,driver_id);
create table driver_debt_refresh (
    currency varchar(3) primary key check(currency ~ '^[A-Z]{3}$'),
    target_version bigint not null check(target_version>0),
    updated_at timestamptz not null,
    last_attempt_at timestamptz
);

-- One-time historical enrollment. Subsequent journal postings enroll their parties in the same transaction.
insert into driver_debt_refresh_member(currency,driver_id)
select currency,driver_id from (
    select t.currency,l.party_id as driver_id from journal_line l
    join journal_transaction t on t.id=l.transaction_id
    where l.account='DRIVER_PAYABLE' and l.party_id is not null
    union select currency,driver_id from driver_debt_status
) members;
insert into driver_debt_refresh(currency,target_version,updated_at)
select currency,version,now() from driver_debt_limit where version>0;
