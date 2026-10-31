-- The admin order search (issue #142, REQ-ADM-01): newest first within the staff member's cities, or across all.
create index ride_order_city_created_idx on ride_order (city_id, created_at desc, id desc);
create index ride_order_created_idx on ride_order (created_at desc, id desc);
