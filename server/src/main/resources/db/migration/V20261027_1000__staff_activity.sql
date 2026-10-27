-- Logs of every staff member, whatever the role (owner decision 27.10.2026). The role is a snapshot at the
-- moment of the action, so the log of a role stays true after someone is promoted or demoted.
alter table audit_log add column actor_role text;
update audit_log a set actor_role = s.role from staff_user s where a.actor_type = 'STAFF' and s.id = a.actor_id;
create index audit_log_role_idx on audit_log (actor_role, occurred_at) where actor_role is not null;

-- Every request of a staff member to the admin and operator APIs (reads too) and every sign-in attempt.
-- Bodies are never stored (passwords, personal data); the path template and its ids say what was touched.
create table staff_activity (
    id             uuid        primary key,
    occurred_at    timestamptz not null,
    kind           text        not null check (kind in ('REQUEST', 'SIGN_IN')),
    staff_id       uuid,
    staff_login    text,
    role           text,
    audience       text        not null,
    method         text,
    path           text,
    resource_ids   jsonb,
    status         int,
    outcome        text,
    duration_ms    int,
    client_ip      text,
    correlation_id uuid
);
create index staff_activity_time_idx on staff_activity (occurred_at desc, id desc);
create index staff_activity_role_idx on staff_activity (role, occurred_at desc);
create index staff_activity_staff_idx on staff_activity (staff_id, occurred_at desc);

create function staff_activity_is_append_only() returns trigger language plpgsql as $$
begin
    raise exception 'The staff activity log is append-only' using errcode = '23514';
end $$;
create trigger staff_activity_append_only before update or delete on staff_activity
    for each row execute function staff_activity_is_append_only();
create trigger staff_activity_no_truncate before truncate on staff_activity
    for each statement execute function staff_activity_is_append_only();
