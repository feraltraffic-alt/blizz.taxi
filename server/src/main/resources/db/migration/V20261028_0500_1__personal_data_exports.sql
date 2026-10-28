-- A rider's copy of their personal data (REQ-PRV-07, issue #68): asked for with a one-time code, built in the
-- background from every module's part, downloaded only by the rider within its time, then dropped. Erased with the
-- account.
alter table otp_challenge drop constraint otp_challenge_purpose_check;
alter table otp_challenge add constraint otp_challenge_purpose_check
    check (purpose in ('SIGN_IN', 'ACCOUNT_DELETION', 'DATA_EXPORT'));

create table personal_data_export (
    id          uuid primary key,
    client_id   uuid        not null references client (id),
    state       text        not null check (state in ('PENDING', 'RUNNING', 'READY', 'FAILED', 'EXPIRED')),
    attempts    int         not null default 0,
    started_at  timestamptz,
    content     bytea,
    size_bytes  bigint,
    error       text,
    created_at  timestamptz not null,
    ready_at    timestamptz,
    expires_at  timestamptz,
    check ((state = 'READY') = (content is not null))
);
create index personal_data_export_todo_idx on personal_data_export (created_at) where state in ('PENDING', 'RUNNING');
create index personal_data_export_expiry_idx on personal_data_export (expires_at) where state = 'READY';
create index personal_data_export_client_idx on personal_data_export (client_id, created_at desc);
