create table vehicle_class (
    id uuid primary key,
    city_id uuid not null references city(id),
    code text not null check (length(trim(code)) > 0),
    name text not null check (length(trim(name)) > 0),
    active boolean not null default true,
    version bigint not null default 0 check (version >= 0),
    created_at timestamptz not null,
    updated_at timestamptz not null,
    unique (city_id, code),
    unique (city_id, id)
);

create table tariff_version (
    id uuid primary key,
    city_id uuid not null references city(id),
    class_id uuid not null,
    currency varchar(3) not null check (currency ~ '^[A-Z]{3}$'),
    effective_from timestamptz not null,
    effective_to timestamptz,
    state text not null check (state in ('DRAFT', 'PUBLISHED', 'ARCHIVED')),
    version bigint not null default 0 check (version >= 0),
    pickup_minor bigint not null check (pickup_minor >= 0),
    per_km_minor numeric not null check (per_km_minor >= 0 and per_km_minor < 'Infinity'::numeric),
    per_minute_minor numeric not null check (per_minute_minor >= 0 and per_minute_minor < 'Infinity'::numeric),
    minimum_minor bigint not null check (minimum_minor >= 0),
    free_waiting_minutes int not null check (free_waiting_minutes >= 0),
    waiting_per_minute_minor numeric not null
        check (waiting_per_minute_minor >= 0 and waiting_per_minute_minor < 'Infinity'::numeric),
    cancellation_fee_minor bigint not null check (cancellation_fee_minor >= 0),
    commission_rate numeric not null check (commission_rate >= 0 and commission_rate <= 1),
    created_at timestamptz not null,
    updated_at timestamptz not null,
    foreign key (city_id, class_id) references vehicle_class(city_id, id),
    check (effective_to is null or effective_to > effective_from)
);
create index tariff_effective_idx on tariff_version(city_id, class_id, effective_from)
    where state = 'PUBLISHED';

-- The only update to a published tariff is its archive transition; its pricing terms never change.
create function guard_tariff_version() returns trigger language plpgsql as $$
begin
    if old.state <> 'DRAFT' then
        if TG_OP = 'DELETE' then
            raise exception 'Published tariff versions cannot be deleted' using errcode = '23514';
        end if;
        if old.state <> 'PUBLISHED' or new.state <> 'ARCHIVED' or new.version <> old.version + 1
           or (to_jsonb(new) - 'state' - 'version' - 'updated_at')
              is distinct from (to_jsonb(old) - 'state' - 'version' - 'updated_at') then
            raise exception 'Published tariff versions are immutable' using errcode = '23514';
        end if;
    end if;
    return case when TG_OP = 'DELETE' then old else new end;
end $$;
create trigger tariff_version_immutable before update or delete on tariff_version
    for each row execute function guard_tariff_version();

create table quote (
    id uuid primary key,
    city_id uuid not null references city(id),
    class_id uuid not null,
    owner_type text not null check (owner_type in ('STAFF', 'CLIENT', 'DRIVER', 'PARTNER')),
    owner_id uuid not null,
    tariff_version_id uuid not null references tariff_version(id),
    pricing_policy_version int not null check (pricing_policy_version >= 1),
    amount_minor bigint not null check (amount_minor >= 0),
    currency varchar(3) not null,
    fingerprint char(64) not null,
    snapshot jsonb not null,
    created_at timestamptz not null,
    expires_at timestamptz not null,
    consumed_at timestamptz,
    foreign key (city_id, class_id) references vehicle_class(city_id, id),
    check (expires_at > created_at)
);
create index quote_expiry_idx on quote(expires_at) where consumed_at is null;
