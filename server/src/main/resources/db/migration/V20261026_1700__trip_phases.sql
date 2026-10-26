-- Trip phases: arrival check, exceptions that need review, reported and recorded completion time
-- (REQ-ASG-05, REQ-ASG-06, REQ-ORD-05), and the payment axis of an order (section 16.1).
alter table trip
    add column arrival_distance_m     int,
    add column arrival_exception      text,
    add column start_exception        text,
    add column completion_reported_at timestamptz,
    add column needs_review           boolean not null default false;

alter table ride_order
    add column payment_state text
        check (payment_state in ('CASH_EXPECTED', 'CASH_REPORTED', 'CASH_NOT_RECEIVED'));
update ride_order set payment_state = 'CASH_EXPECTED' where payment_method = 'CASH';

-- Order sources: rider app, website, operator (phone), partner service (section 18, M2).
alter table ride_order drop constraint ride_order_channel_check;
alter table ride_order add constraint ride_order_channel_check check (channel in ('APP', 'WEB', 'PHONE', 'PARTNER'));
alter table ride_order drop constraint ride_order_created_by_type_check;
alter table ride_order add constraint ride_order_created_by_type_check
    check (created_by_type in ('CLIENT', 'STAFF', 'PARTNER'));
-- Reference of the order in the source system (e.g. the partner's order id); never trusted as an id here.
alter table ride_order add column source_ref text;
