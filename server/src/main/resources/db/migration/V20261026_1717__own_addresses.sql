create extension if not exists pg_trgm;

create table address (
    id uuid primary key,
    city_id uuid not null references city(id),
    type text not null check (type in ('HOUSE', 'PLACE', 'ENTRANCE')),
    label text not null check (length(trim(label)) > 0),
    language text not null check (length(trim(language)) > 0),
    street text,
    street_normalized text not null,
    house_raw text,
    house_number text not null,
    house_suffix text not null,
    building_raw text,
    building_normalized text not null,
    house_normalized text not null,
    pickup_point geometry(Point, 4326) not null,
    instructions text,
    source text not null default 'OWN' check (source = 'OWN'),
    visibility text not null default 'ACTIVE' check (visibility in ('ACTIVE', 'HIDDEN')),
    search_text text not null,
    version bigint not null default 0 check (version >= 0),
    created_at timestamptz not null,
    updated_at timestamptz not null,
    check (not ST_IsEmpty(pickup_point) and ST_X(pickup_point) between -180 and 180
           and ST_Y(pickup_point) between -90 and 90)
);
create index address_text_trgm on address using gin(search_text gin_trgm_ops);
create index address_pickup_gist on address using gist(pickup_point);
create index address_pickup_metres_gist on address using gist((pickup_point::geography));
create index address_house_idx on address(city_id, house_number, house_suffix, building_normalized)
    where visibility = 'ACTIVE';

create table address_alias (
    id uuid primary key,
    address_id uuid not null references address(id),
    label text not null check (length(trim(label)) > 0),
    language text not null,
    normalized text not null,
    search_text text not null,
    created_at timestamptz not null,
    unique (address_id, language, normalized)
);
create index address_alias_text_trgm on address_alias using gin(search_text gin_trgm_ops);

-- Opaque replacement links only; no provider labels, coordinates, responses or cached content.
create table address_override (
    provider text not null check (length(trim(provider)) > 0),
    object_id text not null check (length(trim(object_id)) > 0),
    own_address_id uuid not null unique references address(id),
    primary key (provider, object_id)
);

create table address_history (
    id uuid primary key,
    address_id uuid not null references address(id),
    address_version bigint not null check (address_version >= 0),
    action text not null,
    actor_type text not null check (actor_type = 'STAFF'),
    actor_id uuid not null,
    reason text not null check (length(trim(reason)) > 0),
    before jsonb,
    after jsonb not null,
    occurred_at timestamptz not null,
    unique (address_id, address_version)
);
