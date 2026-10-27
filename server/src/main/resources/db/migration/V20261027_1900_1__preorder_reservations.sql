-- A driver reserves a pre-order for himself (ADR 0006, RESERVATION mode). He confirms "On my way" in the
-- confirmation window and becomes the assigned driver; otherwise the reservation expires and the order goes to the
-- search. He may drop it himself until a set time before the pickup; later only a dispatcher can remove him.

create table preorder_reservation (
    id           uuid primary key,
    order_id     uuid        not null references ride_order (id),
    driver_id    uuid        not null references driver (id),
    state        text        not null check (state in ('RESERVED', 'CONFIRMED', 'DROPPED', 'REMOVED', 'EXPIRED',
                                                        'CANCELLED')),
    reserved_at  timestamptz not null,
    closed_at    timestamptz,
    close_reason text,
    version      bigint      not null default 0,
    check ((state = 'RESERVED') = (closed_at is null))
);
-- One driver per pre-order at a time.
create unique index preorder_reservation_open_uq on preorder_reservation (order_id) where state = 'RESERVED';
create index preorder_reservation_driver_idx on preorder_reservation (driver_id) where state = 'RESERVED';

alter table assignment drop constraint assignment_source_check;
alter table assignment add constraint assignment_source_check check (source in ('OFFER', 'BROADCAST', 'RESERVATION'));
