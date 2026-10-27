-- Caller contact belongs to operations and is intentionally not linked to client.
-- TODO(Q-19/security review): encryption at rest
create table order_contact (
    order_id uuid primary key references ride_order(id) on delete cascade,
    name varchar(120),
    phone varchar(16) not null,
    created_by uuid not null,
    created_at timestamptz not null,
    constraint order_contact_phone_e164 check (phone ~ '^\+[1-9][0-9]{7,14}$')
);
