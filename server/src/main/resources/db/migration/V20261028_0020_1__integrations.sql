-- Keys and settings of integrations entered in the admin panel (REQ-ADM-10): Firebase, GraphHopper, maps, merchant
-- secrets. A secret is stored encrypted (AES-256-GCM with the instance's master key from the environment) and never
-- read back by the panel; a removed value keeps its row so that who removed it and when stays visible.
create sequence integration_value_seq;

create table integration_value (
    name         text primary key check (name ~ '^[a-z0-9][a-z0-9.-]{1,99}$'),
    plain_value  text,
    secret_value bytea,
    key_version  int,
    hint         text,
    seq          bigint      not null,
    changed_by   uuid,
    changed_at   timestamptz not null,
    check (plain_value is null or secret_value is null),
    check ((secret_value is null) = (key_version is null))
);
