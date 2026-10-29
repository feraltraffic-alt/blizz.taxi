-- Retention counts from when the server received a point, not from the phone's clock (#112).
drop index ix_track_point_off_trip;
drop index ix_track_point_trip;
create index ix_track_point_off_trip on track_point (received_at) where order_id is null;
create index ix_track_point_trip on track_point (received_at) where order_id is not null and not kept;
