-- Emergency access (REQ-SEC-10, issue #72): a super admin gives a staff member extra permissions for at most eight
-- hours, with a reason. The grant ends by itself or is revoked earlier; nothing here is ever deleted. What the staff
-- member did meanwhile is in staff_activity (every request is logged).
create table staff_emergency_grant (
    id            uuid primary key,
    staff_id      uuid        not null references staff_user (id),
    permissions   text[]      not null check (cardinality(permissions) >= 1),
    all_cities    boolean     not null,
    city_scope    uuid[]      not null default '{}',
    reason        text        not null check (length(trim(reason)) between 10 and 500),
    granted_by    uuid        not null references staff_user (id),
    granted_at    timestamptz not null,
    expires_at    timestamptz not null,
    revoked_at    timestamptz,
    revoked_by    uuid references staff_user (id),
    revoke_reason text,
    check (granted_by <> staff_id),
    check (expires_at > granted_at and expires_at <= granted_at + interval '8 hours'),
    check (all_cities or cardinality(city_scope) >= 1),
    check ((revoked_at is null) = (revoked_by is null))
);
create index staff_emergency_grant_active_idx on staff_emergency_grant (staff_id, expires_at) where revoked_at is null;

create function staff_emergency_grant_kept() returns trigger language plpgsql as $$
begin
    if tg_op = 'DELETE' then
        raise exception 'Emergency grants are kept';
    end if;
    if old.revoked_at is not null or new.staff_id <> old.staff_id or new.permissions <> old.permissions
            or new.all_cities <> old.all_cities or new.city_scope <> old.city_scope or new.reason <> old.reason
            or new.granted_by <> old.granted_by or new.granted_at <> old.granted_at
            or new.expires_at <> old.expires_at then
        raise exception 'An emergency grant is only revoked, never changed';
    end if;
    return new;
end $$;
create trigger staff_emergency_grant_kept before update or delete on staff_emergency_grant
    for each row execute function staff_emergency_grant_kept();
