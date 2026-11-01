-- Several taxi services on one server (ADR 0016, issue #214, part 1: the data model). Riders, drivers, staff and
-- cities belong to one service; everything the server holds today becomes the first service, code 'default'.
-- The column default keeps every existing insert in that service until each one passes its service (later steps of
-- #214 remove the defaults); a check per table will then require it.
create table service (
    id         uuid        primary key,
    code       text        not null unique check (code ~ '^[a-z0-9][a-z0-9-]{1,39}$'),
    name       text        not null check (length(trim(name)) between 1 and 120),
    state      text        not null default 'ACTIVE' check (state in ('ACTIVE', 'SUSPENDED')),
    version    bigint      not null default 1,
    created_at timestamptz not null,
    updated_at timestamptz not null
);

insert into service (id, code, name, created_at, updated_at)
values ('5e000000-0000-4000-8000-000000000001', 'default', 'Default', now(), now());

alter table city add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
alter table client add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
alter table driver add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
alter table staff_user add column service_id uuid not null default '5e000000-0000-4000-8000-000000000001'
    references service (id);
create index city_service_idx on city (service_id);
create index staff_user_service_idx on staff_user (service_id);

-- One phone, one account per service: the same phone in two services is two people (ADR 0016, REQ-TEN-02).
drop index client_phone_uq;
create unique index client_phone_uq on client (service_id, phone_normalized) where account_state <> 'ANONYMIZED';
drop index driver_phone_uq;
create unique index driver_phone_uq on driver (service_id, phone_normalized) where account_state <> 'ANONYMIZED';

-- A city code is unique within its service; two services may each have a 'kyiv'.
alter table city drop constraint city_code_key;
alter table city add constraint city_service_code_key unique (service_id, code);
