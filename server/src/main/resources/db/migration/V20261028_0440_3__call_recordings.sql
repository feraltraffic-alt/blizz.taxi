-- Call recordings (issue #60, ADR 0012 Q-18 p. 5). The bytes are a file of the files module, encrypted at rest; the
-- telephony module owns the link between a call and its recording. Nothing deletes a recording until Q-19 sets a
-- retention.

-- files: a file the server itself stores (no uploading subject) and the encryption of its bytes.
alter table file_object drop constraint file_object_owner_type_check;
alter table file_object add constraint file_object_owner_type_check
    check (owner_type in ('STAFF', 'CLIENT', 'DRIVER', 'PARTNER', 'SYSTEM'));
alter table file_object alter column owner_id drop not null;
alter table file_object add constraint file_object_system_owner_check
    check ((owner_type = 'SYSTEM') = (owner_id is null));
alter table file_object drop constraint file_object_purpose_check;
alter table file_object add constraint file_object_purpose_check
    check (purpose in ('DRIVER_DOCUMENT', 'SUPPORT_ATTACHMENT', 'CALL_RECORDING'));
alter table file_object add column encryption text check (encryption in ('AES256GCM-STREAM-1'));
alter table file_object add constraint file_object_call_recording_encrypted_check
    check (purpose <> 'CALL_RECORDING' or state <> 'SAFE' or encryption is not null);

-- telephony: one recording per call that was taken. PENDING until fetched from Asterisk, then STORED (file_id) or
-- NONE (Asterisk had none).
create table call_recording (
    call_id          uuid        primary key references call (id),
    state            text        not null default 'PENDING' check (state in ('PENDING', 'STORED', 'NONE')),
    file_id          uuid        unique,
    duration_seconds integer     check (duration_seconds >= 0),
    attempts         integer     not null default 0,
    next_attempt_at  timestamptz not null,
    created_at       timestamptz not null,
    stored_at        timestamptz,
    version          bigint      not null default 0,
    check ((state = 'STORED') = (file_id is not null))
);
create index call_recording_due_idx on call_recording (next_attempt_at) where state = 'PENDING';
