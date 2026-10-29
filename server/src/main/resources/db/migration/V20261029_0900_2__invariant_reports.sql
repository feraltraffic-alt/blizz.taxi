-- Owned by platform. Business object ids are references only, never cross-module foreign keys.
create table invariant_report (
    check_id text not null check (check_id in ('I1','I2','I3','I4','I5')),
    object_type text not null check (object_type in ('JournalTransaction','DriverCapacity','Order','PaymentIntent')),
    object_id uuid not null,
    reported_at timestamptz not null,
    primary key (check_id,object_id)
);
