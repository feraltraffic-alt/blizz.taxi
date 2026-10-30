-- Driver documents encrypted at rest (issue #135, threat model D3). New documents are stored encrypted; the ones
-- already on disk in the clear are re-encrypted by a background job, one file at a time.
alter table file_object add column encrypt_attempts int not null default 0;
alter table file_object add column next_encrypt_at timestamptz;
-- The plain file a switched row no longer points at, until it is deleted: a crash between the switch and the
-- delete leaves it here for the next run, never on disk unnoticed.
alter table file_object add column plain_key_pending_delete text;
create index file_object_plain_documents_idx on file_object (next_encrypt_at nulls first, id)
    where purpose = 'DRIVER_DOCUMENT' and encryption is null and storage_key is not null;
create index file_object_plain_leftover_idx on file_object (id) where plain_key_pending_delete is not null;
