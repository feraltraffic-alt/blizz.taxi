-- Reminders that an accepted driver document is about to end (issue #51, REQ-DRV-05). One row per document and
-- threshold (7 or 1 days before valid_to): the run inserts the row and publishes DriverDocumentExpiring in the same
-- transaction, so a repeated run or a second instance publishes nothing new.
create table driver_document_reminder (
    document_id uuid        not null references driver_document (id),
    days_left   int         not null check (days_left in (7, 1)),
    created_at  timestamptz not null,
    primary key (document_id, days_left)
);
