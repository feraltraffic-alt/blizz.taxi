-- Orders for a set time (ADR 0006). A pre-order waits in SCHEDULED until it is released into the search
-- (release_at) or, in RESERVATION mode, a driver confirms it. pickup_at is also kept for an order for later that
-- is not far enough ahead to be a pre-order; that one is searched for at once.

alter table ride_order
    add column pickup_at  timestamptz,
    add column preorder   boolean not null default false,
    add column release_at timestamptz,
    add constraint ride_order_preorder_ck check (not preorder or (pickup_at is not null and release_at is not null));

alter table ride_order drop constraint ride_order_status_check;
alter table ride_order add constraint ride_order_status_check
    check (status in ('SCHEDULED', 'AWAITING_PAYMENT', 'READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE', 'FULFILLED',
                      'CANCELLED', 'UNFULFILLED'));

-- One active order "now" per paying account (REQ-RID-03); pre-orders do not count, so a rider can ride now and
-- have the trip back booked, and a released pre-order does not collide with a ride in progress.
drop index ride_order_active_payer_uq;
create unique index ride_order_active_payer_uq on ride_order (payer_client_id)
    where payer_client_id is not null and not preorder
      and status in ('AWAITING_PAYMENT', 'READY', 'SEARCHING', 'ASSIGNED', 'IN_SERVICE');

create index ride_order_release_idx on ride_order (release_at) where status = 'SCHEDULED';
