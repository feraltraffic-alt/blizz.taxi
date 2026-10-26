-- Uploaded files: private, checked before use, stored under random keys (REQ-SEC-06, REQ-SEC-07).
create table file_object (
    id                    uuid primary key,
    owner_type            text        not null check (owner_type in ('STAFF', 'CLIENT', 'DRIVER', 'PARTNER')),
    owner_id              uuid        not null,
    purpose               text        not null check (purpose in ('DRIVER_DOCUMENT')),
    declared_content_type text        not null,
    declared_size_bytes   bigint      not null check (declared_size_bytes > 0),
    detected_content_type text,
    size_bytes            bigint,
    sha256                bytea,
    storage_key           text unique,
    state                 text        not null default 'AWAITING_UPLOAD'
        check (state in ('AWAITING_UPLOAD', 'QUARANTINE', 'SAFE', 'REJECTED')),
    reject_reason         text,
    scan_engine           text,
    upload_expires_at     timestamptz not null,
    created_at            timestamptz not null,
    uploaded_at           timestamptz,
    scanned_at            timestamptz,
    version               bigint      not null default 0
);
create index file_object_owner_idx on file_object (owner_type, owner_id, created_at);
