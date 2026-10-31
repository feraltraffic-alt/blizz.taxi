-- REQ-TEN-05 (issue #142, part D1): whether a ride from the city may end outside its polygon, and how far from it.
-- The default keeps today's behaviour: allowed, no limit.
alter table city_operations
    add column dropoff_outside_allowed boolean not null default true,
    add column dropoff_outside_max_km integer check (dropoff_outside_max_km between 1 and 1000);
