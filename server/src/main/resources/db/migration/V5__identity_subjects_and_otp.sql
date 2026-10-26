-- Four separate root subjects, no shared user table (section 36, REQ-USR-01).

create table staff_user (
    id            uuid primary key,
    login         text        not null,
    oidc_subject  text,
    name          text        not null,
    role          text        not null check (role in ('SUPER_ADMIN', 'ADMIN', 'OPERATOR')),
    permissions   text[]      not null default '{}',
    city_scope    uuid[]      not null default '{}',
    state         text        not null check (state in ('INVITED', 'ACTIVE', 'SUSPENDED', 'DISABLED')),
    mfa_policy    text        not null default 'REQUIRED' check (mfa_policy in ('REQUIRED')),
    created_at    timestamptz not null,
    updated_at    timestamptz not null,
    version       bigint      not null default 0
);
create unique index staff_user_login_uq on staff_user (lower(login));
create unique index staff_user_oidc_subject_uq on staff_user (oidc_subject) where oidc_subject is not null;

create table client (
    id                uuid primary key,
    phone_normalized  text,
    phone_verified_at timestamptz,
    name              text,
    language          text,
    account_state     text        not null
        check (account_state in ('UNVERIFIED', 'ACTIVE', 'BLOCKED', 'DELETION_PENDING', 'ANONYMIZED')),
    has_app           boolean     not null default false,
    created_at        timestamptz not null,
    updated_at        timestamptz not null,
    version           bigint      not null default 0,
    check (account_state = 'ANONYMIZED' or phone_normalized is not null)
);
-- One live account per phone among clients (REQ-USR-09).
create unique index client_phone_uq on client (phone_normalized) where account_state <> 'ANONYMIZED';

create table driver (
    id                uuid primary key,
    phone_normalized  text,
    phone_verified_at timestamptz,
    name              text,
    language          text,
    account_state     text        not null
        check (account_state in ('ACTIVE', 'BLOCKED', 'DELETION_PENDING', 'ANONYMIZED')),
    review_status     text        not null default 'NOT_SUBMITTED'
        check (review_status in ('NOT_SUBMITTED', 'IN_REVIEW', 'CHANGES_REQUIRED', 'APPROVED', 'REJECTED',
                                 'SUSPENDED', 'EXPIRED')),
    eligibility_rules jsonb       not null default '{}',
    created_at        timestamptz not null,
    updated_at        timestamptz not null,
    version           bigint      not null default 0,
    check (account_state = 'ANONYMIZED' or phone_normalized is not null)
);
-- One live account per phone among drivers; the same phone may also have a client account.
create unique index driver_phone_uq on driver (phone_normalized) where account_state <> 'ANONYMIZED';

create table partner (
    id                uuid primary key,
    legal_name        text        not null,
    display_name      text        not null,
    contacts          jsonb       not null default '{}',
    exchange_endpoint text,
    state             text        not null
        check (state in ('DRAFT', 'VERIFYING', 'ACTIVE', 'PAUSED', 'BLOCKED', 'TERMINATED')),
    allowed_cities    uuid[]      not null default '{}',
    allowed_classes   text[]      not null default '{}',
    created_at        timestamptz not null,
    updated_at        timestamptz not null,
    version           bigint      not null default 0
);

-- One-time codes: only an HMAC of the code is stored (REQ-AUTH-05).
create table otp_challenge (
    id               uuid primary key,
    audience         text        not null check (audience in ('CLIENT', 'DRIVER')),
    phone_normalized text        not null,
    code_hmac        bytea       not null,
    expires_at       timestamptz not null,
    attempts         int         not null default 0,
    max_attempts     int         not null,
    device_ref       text,
    created_at       timestamptz not null,
    consumed_at      timestamptz
);
create index otp_challenge_phone_idx on otp_challenge (audience, phone_normalized, created_at);
create index otp_challenge_created_idx on otp_challenge (created_at);
