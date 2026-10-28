-- GPS track retention (REQ-PRV-02) and correlation ids where support looks (REQ-OBS-01/04), issue #81.

-- location: a point that fell inside a trip carries the order (kept for the trip's retention); kept = the trip is
-- disputed (an open support case or a risk flag), so its points are evidence and are not deleted. A point with no
-- order is outside a trip and goes after the short retention.
alter table track_point add column order_id uuid;
alter table track_point add column kept boolean not null default false;
create index ix_track_point_off_trip on track_point (recorded_at) where order_id is null;
create index ix_track_point_trip on track_point (recorded_at) where order_id is not null and not kept;
create index ix_location_batch_request_time on location_batch_request (requested_at);

-- operations and payments: the request or job that wrote the row; null for rows older than the column.
alter table order_event add column correlation_id uuid;
create index order_event_correlation_idx on order_event (correlation_id) where correlation_id is not null;
alter table payment_intent add column correlation_id uuid;
create index payment_intent_correlation_idx on payment_intent (correlation_id) where correlation_id is not null;
alter table payment_operation add column correlation_id uuid;
create index payment_operation_correlation_idx on payment_operation (correlation_id) where correlation_id is not null;
create index staff_activity_correlation_idx on staff_activity (correlation_id) where correlation_id is not null;
