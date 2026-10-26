-- WGS84: geometry x is longitude, y is latitude (REQ-GEO-01).
create table city (
    id uuid primary key,
    code text not null unique check (length(trim(code)) > 0),
    name text not null check (length(trim(name)) > 0),
    currency varchar(3) not null check (currency ~ '^[A-Z]{3}$'),
    timezone text not null,
    polygon geometry(MultiPolygon, 4326) not null,
    priority int not null,
    state text not null check (state in ('DRAFT', 'PUBLISHED', 'ARCHIVED')),
    version bigint not null default 0 check (version >= 0),
    created_at timestamptz not null,
    updated_at timestamptz not null,
    check (state <> 'PUBLISHED' or (ST_IsValid(polygon) and not ST_IsEmpty(polygon)))
);
create index city_polygon_gist on city using gist (polygon);

create table zone (
    id uuid primary key,
    city_id uuid not null references city(id),
    type text not null check (length(trim(type)) > 0),
    polygon geometry(MultiPolygon, 4326) not null,
    priority int not null,
    state text not null check (state in ('DRAFT', 'PUBLISHED', 'ARCHIVED')),
    version bigint not null default 0 check (version >= 0),
    created_at timestamptz not null,
    updated_at timestamptz not null,
    check (state <> 'PUBLISHED' or (ST_IsValid(polygon) and not ST_IsEmpty(polygon)))
);
create index zone_polygon_gist on zone using gist (polygon);
create index zone_city_idx on zone (city_id);
