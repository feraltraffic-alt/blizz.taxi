-- Server-side feature flags (REQ-ENG-14). The flags themselves are declared in code (configuration.FeatureFlags)
-- with an owner and a review date; this table holds only what staff switched. No row: the flag's default.
create table feature_flag (
    key        text        primary key,
    enabled    boolean     not null,
    version    bigint      not null,
    changed_by uuid        not null,
    reason     text        not null,
    changed_at timestamptz not null
);
