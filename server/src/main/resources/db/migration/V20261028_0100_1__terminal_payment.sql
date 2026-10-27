-- Payment by card at the driver's own terminal (owner decision 27.10.2026): only in phone orders; the driver (a
-- sole trader with a terminal) keeps the money like cash, and the service takes its commission from the driver's
-- balance. The order is offered to drivers with a terminal; if the caller agreed to pay cash otherwise, drivers
-- without one see it from the broadcast phase and the order becomes a cash order on assignment.
alter table driver add column has_payment_terminal boolean not null default false;

alter table ride_order drop constraint ride_order_payment_method_check;
alter table ride_order add constraint ride_order_payment_method_check
    check (payment_method in ('CASH', 'CARD', 'SERVICE', 'TERMINAL'));

alter table ride_order drop constraint ride_order_payment_state_check;
alter table ride_order add constraint ride_order_payment_state_check
    check (payment_state in ('CASH_EXPECTED', 'CASH_REPORTED', 'CASH_NOT_RECEIVED', 'AUTH_PENDING', 'AUTHORIZED',
                             'PAYMENT_DECLINED', 'HOLD_RELEASED', 'CAPTURE_PENDING', 'PAID', 'PARTIALLY_PAID',
                             'TERMINAL_EXPECTED', 'TERMINAL_REPORTED', 'TERMINAL_NOT_RECEIVED'));

alter table ride_order add column terminal_fallback_cash boolean not null default false;
alter table ride_order add constraint ride_order_terminal_fallback_check
    check (not terminal_fallback_cash or payment_method in ('TERMINAL', 'CASH'));
