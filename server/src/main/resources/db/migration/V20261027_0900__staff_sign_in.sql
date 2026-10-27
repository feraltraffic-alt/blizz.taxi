-- Staff sign in with login and password (owner decision 27.10.2026, closes the approach of Q-02).
-- The super admin creates staff with names, contacts, role and the functions they may use (checkboxes).
alter table staff_user
    add column first_name           text,
    add column last_name            text,
    add column phone                text,
    add column email                text,
    add column telegram             text,
    add column password_hash        text,
    add column must_change_password boolean     not null default false,
    add column password_changed_at  timestamptz,
    add column failed_sign_ins      int         not null default 0 check (failed_sign_ins >= 0),
    add column locked_until         timestamptz,
    add column all_cities           boolean     not null default false,
    add column created_by           uuid;

-- Who signed in when, also failures; the login is kept even when no such account exists.
create table staff_sign_in (
    id          uuid        primary key,
    login       text        not null,
    staff_id    uuid,
    outcome     text        not null check (outcome in ('SUCCESS', 'BAD_CREDENTIALS', 'LOCKED', 'NOT_ACTIVE')),
    audience    text        not null,
    occurred_at timestamptz not null
);
create index staff_sign_in_login_idx on staff_sign_in (lower(login), occurred_at);
