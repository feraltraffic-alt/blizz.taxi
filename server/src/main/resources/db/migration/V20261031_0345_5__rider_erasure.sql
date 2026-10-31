-- The rider's deletion reaches every copy (issue #144, REQ-PRV-04, REQ-PRV-06).

-- What a deletion left in place because a legal basis needs it (operations). Today only an open chargeback holds the
-- order it disputes: its labels, points, contact and chat stay until the chargeback is decided, then the sweep
-- finishes the anonymization and releases the hold.
create table privacy_hold (
    id          uuid primary key,
    subject_type text not null check (subject_type in ('CLIENT')),
    subject_id  uuid not null,
    object_type text not null check (object_type in ('ORDER', 'ORDER_CONTACT')),
    object_id   uuid not null,
    basis       text not null check (basis in ('CHARGEBACK')),
    created_at  timestamptz not null,
    released_at timestamptz
);
create unique index privacy_hold_open_key on privacy_hold (subject_id, object_type, object_id, basis)
    where released_at is null;
create index privacy_hold_open_idx on privacy_hold (created_at, id) where released_at is null;

-- A file whose owner asked for it to go (files): deleted from storage, then its row, by the erasure sweep.
alter table file_object add column erase_requested_at timestamptz;
create index file_object_erase_idx on file_object (erase_requested_at, id) where erase_requested_at is not null;

-- A recording of a deleted rider's call (telephony): discarded on Asterisk and deleted whatever the retention term.
alter table call_recording add column erase_requested_at timestamptz;
create index call_recording_erase_idx on call_recording (erase_requested_at, call_id)
    where erase_requested_at is not null;
