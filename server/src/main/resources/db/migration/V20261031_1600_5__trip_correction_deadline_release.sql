-- Issue #142, part C1 review: a capture held by a trip-facts correction is started without the review when the card
-- hold is about to expire; the correction remembers when, and still waits for its review.
alter table trip_correction add column released_by_deadline_at timestamptz;

create index trip_correction_held_idx on trip_correction (order_id)
    where holds_capture and reviewed_at is null and released_by_deadline_at is null;
