-- Dispatch journal and driver risk flags (issue #71, REQ-DSP-12, REQ-DS-08, REQ-SEC-11). Owned by operations, except
-- the link from a suspension to its flag, which belongs to driver admission. Driver ids and numbers only: no
-- positions, phones or names (REQ-PRV-02).

-- One choice of the next driver for a personal offer, with the candidates considered (at most 50) and why each was
-- left out: [{driver_id, distance_m, outcome, reason}]. Purged after the configured retention (90 days by default).
create table dispatch_round (
    id         uuid primary key,
    order_id   uuid        not null references ride_order (id),
    attempt_id uuid        not null references dispatch_attempt (id),
    phase      text        not null check (phase in ('PERSONAL', 'BROADCAST')),
    radius_m   int         not null,
    at         timestamptz not null,
    candidates jsonb       not null
);
create index dispatch_round_attempt_idx on dispatch_round (attempt_id, at);
create index dispatch_round_at_idx on dispatch_round (at);

-- A suspicion about a driver for a person to review; it blocks nothing by itself. dedupe_key makes an automatic
-- source raise at most one flag per work session and hour.
create table driver_risk_flag (
    id              uuid primary key,
    driver_id       uuid        not null, -- driver admission's driver; no foreign key across modules (ADR 0004)
    city_id         uuid        not null,
    kind            text        not null check (kind in ('IMPOSSIBLE_MOVEMENT', 'MANUAL')),
    state           text        not null default 'OPEN' check (state in ('OPEN', 'CONFIRMED', 'DISMISSED')),
    evidence        jsonb       not null default '{}',
    dedupe_key      text unique,
    raised_by       uuid,
    raised_at       timestamptz not null,
    reason          text check (reason is null or length(reason) <= 1000),
    reviewed_by     uuid,
    reviewed_at     timestamptz,
    review_reason   text check (review_reason is null or length(review_reason) <= 1000),
    version         bigint      not null default 1,
    check ((kind = 'MANUAL') = (raised_by is not null and reason is not null)),
    check ((state = 'OPEN') = (reviewed_at is null)),
    check (state = 'OPEN' or (reviewed_by is not null and review_reason is not null))
);
create index driver_risk_flag_city_idx on driver_risk_flag (city_id, state, raised_at desc);
create index driver_risk_flag_driver_idx on driver_risk_flag (driver_id, raised_at desc);

-- driver admission: the risk flag that caused a suspension (no foreign key across modules, ADR 0004).
alter table driver_review_event add column risk_flag_id uuid;
