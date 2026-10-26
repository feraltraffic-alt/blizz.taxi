-- Append-only audit log (REQ-AUTH-10, REQ-SEC-13). Corrections are new records, never edits.
create table audit_log (
    id             uuid primary key,
    occurred_at    timestamptz not null,
    actor_type     text        not null check (actor_type in ('STAFF', 'CLIENT', 'DRIVER', 'PARTNER', 'SYSTEM')),
    actor_id       uuid,
    action         text        not null,
    resource_type  text        not null,
    resource_id    text,
    reason         text,
    before         jsonb,
    after          jsonb,
    correlation_id uuid        not null,
    check (actor_type = 'SYSTEM' or actor_id is not null)
);

create index audit_log_resource_idx on audit_log (resource_type, resource_id, occurred_at);
create index audit_log_actor_idx on audit_log (actor_type, actor_id, occurred_at);
create index audit_log_correlation_idx on audit_log (correlation_id);

create function audit_log_append_only() returns trigger
    language plpgsql as
$$
begin
    raise exception 'audit_log is append-only' using errcode = 'insufficient_privilege';
end;
$$;

create trigger audit_log_no_update_or_delete
    before update or delete on audit_log
    for each row execute function audit_log_append_only();

create trigger audit_log_no_truncate
    before truncate on audit_log
    for each statement execute function audit_log_append_only();
