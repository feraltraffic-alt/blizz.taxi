-- The driver's attempts to reach the rider on an order: call requests through the order and chat messages
-- (REQ-CAN-06, issue #143). A no-show records how many there were; no content, no phone number.
create table order_contact_attempt (
    id          uuid        primary key,
    order_id    uuid        not null references ride_order (id),
    trip_id     uuid        not null references trip (id),
    driver_id   uuid        not null,
    kind        text        not null check (kind in ('CALL', 'MESSAGE')),
    at          timestamptz not null
);
create index order_contact_attempt_trip_idx on order_contact_attempt (trip_id, at);
