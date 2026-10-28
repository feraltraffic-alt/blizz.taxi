-- Legal texts with versions and recorded acceptance (REQ-PRV-08, issue #69). Owned by configuration. A published
-- version never changes; acceptances are only added. The person's id is the only link to the account (no foreign
-- key across modules) and stays when the account is anonymized: an acceptance is a legal fact.
create table legal_document_version (
    id                  uuid primary key,
    audience            text        not null check (audience in ('RIDER', 'DRIVER')),
    kind                text        not null check (kind in ('TERMS', 'PRIVACY_NOTICE', 'DRIVER_AGREEMENT')),
    number              int         not null check (number >= 1),
    state               text        not null check (state in ('DRAFT', 'PUBLISHED')),
    texts               jsonb       not null check (jsonb_typeof(texts) = 'object' and texts <> '{}'::jsonb),
    acceptance_required boolean     not null,
    effective_from      timestamptz not null,
    created_by          uuid        not null,
    created_at          timestamptz not null,
    published_by        uuid,
    published_at        timestamptz,
    version             bigint      not null default 0,
    unique (audience, kind, number),
    check ((state = 'PUBLISHED') = (published_at is not null))
);
create index legal_document_in_force_idx on legal_document_version (audience, kind, effective_from desc)
    where state = 'PUBLISHED';

create function legal_document_version_frozen() returns trigger language plpgsql as $$
begin
    if old.state = 'PUBLISHED' then
        raise exception 'A published legal text never changes; publish a new version';
    end if;
    if tg_op = 'DELETE' then
        return old;
    end if;
    return new;
end $$;
create trigger legal_document_version_frozen before update or delete on legal_document_version
    for each row execute function legal_document_version_frozen();

create table legal_acceptance (
    id                uuid primary key,
    version_id        uuid        not null references legal_document_version (id),
    subject_type      text        not null check (subject_type in ('CLIENT', 'DRIVER')),
    subject_id        uuid        not null,
    language          text        not null check (language in ('uk', 'pl', 'ru', 'en')),
    device_session_id uuid,
    accepted_at       timestamptz not null,
    unique (version_id, subject_type, subject_id)
);
create index legal_acceptance_subject_idx on legal_acceptance (subject_type, subject_id, accepted_at);

create function legal_acceptance_append_only() returns trigger language plpgsql as $$
begin
    raise exception 'Acceptances are only added';
end $$;
create trigger legal_acceptance_append_only before update or delete on legal_acceptance
    for each row execute function legal_acceptance_append_only();
