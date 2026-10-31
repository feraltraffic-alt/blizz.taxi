-- Corrections of a trip's facts after the start (issue #142, REQ-CAN-07): append-only records beside the trip's own
-- times, which are never changed. holds_capture: made before a card trip completed, the capture waits for the review.
create table trip_correction (
    id             uuid primary key,
    trip_id        uuid        not null references trip (id),
    order_id       uuid        not null,
    kind           text        not null check (kind in ('START_VOID', 'STARTED_AT', 'COMPLETED_AT')),
    recorded_value timestamptz,
    corrected_value timestamptz,
    reason         text        not null check (length(trim(reason)) between 1 and 500),
    created_by     uuid        not null,
    created_at     timestamptz not null,
    holds_capture  boolean     not null,
    reviewed_at    timestamptz,
    reviewed_by    uuid,
    review_reason  text,
    check ((kind = 'START_VOID') = (corrected_value is null)),
    check ((reviewed_at is null) = (reviewed_by is null) and (reviewed_at is null) = (review_reason is null))
);
create index trip_correction_trip_idx on trip_correction (trip_id, created_at);
create index trip_correction_open_idx on trip_correction (order_id) where reviewed_at is null;
