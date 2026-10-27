-- Report exports (REQ-ADM-07): a background job builds the CSV; only the staff member who asked downloads it, the
-- rights are checked again at the download, and the file is kept for a limited time, then dropped (EXPIRED).
create table report_export (
    id           uuid primary key,
    kind         text        not null check (kind in ('ORDERS', 'FINANCE')),
    city_id      uuid        not null,
    date_from    date        not null,
    date_to      date        not null,
    requested_by uuid        not null,
    state        text        not null check (state in ('PENDING', 'RUNNING', 'READY', 'FAILED', 'EXPIRED')),
    attempts     int         not null default 0,
    started_at   timestamptz,
    file_name    text,
    content      bytea,
    row_count    int,
    error        text,
    created_at   timestamptz not null,
    ready_at     timestamptz,
    expires_at   timestamptz,
    check (date_to >= date_from)
);
create index report_export_todo_idx on report_export (created_at) where state in ('PENDING', 'RUNNING');
create index report_export_expiry_idx on report_export (expires_at) where state = 'READY';
create index report_export_mine_idx on report_export (requested_by, created_at desc);
