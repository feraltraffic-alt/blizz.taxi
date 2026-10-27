-- Operator bonus points (ADR 0011). Bonus tables belong to `operatorbonus`.
-- The operator-fault flag belongs to the configuration cancellation-reason catalog (ADR 0007).

alter table cancel_reason add column operator_fault boolean not null default false;

insert into cancel_reason (id, audience, code, labels, driver_outcome, active, sort_order, operator_fault,
                           created_at, updated_at)
values (gen_random_uuid(), 'STAFF', 'OPERATOR_ERROR',
        '{"ru":"Ошибка оператора","uk":"Помилка оператора","pl":"Błąd operatora","en":"Operator error"}',
        null, true, 50, true, now(), now())
on conflict (audience, code) do update set operator_fault = true;

create table operator_bonus_settings (
    version              bigint primary key,
    m                    int         not null,
    g                    int         not null,
    count_cancellations  boolean     not null,
    reset_day            int         not null check (reset_day between 1 and 28),
    time_rules           jsonb       not null default '[]'::jsonb,
    effective_at         timestamptz not null,
    changed_by           uuid,
    reason               text        not null
);

insert into operator_bonus_settings
    (version, m, g, count_cancellations, reset_day, time_rules, effective_at, changed_by, reason)
values (0, 1, 10, true, 1, '[]'::jsonb, '2000-01-01T00:00:00Z', null, 'Initial operator bonus settings');

create table operator_bonus_entry (
    id               uuid primary key,
    staff_id         uuid        not null,
    order_id         uuid        not null,
    kind             text        not null check (kind in ('FULFILLED', 'OPERATOR_FAULT_CANCELLATION')),
    rule_key         text        not null,
    settings_version bigint      not null,
    points           int         not null,
    occurred_at      timestamptz not null,
    created_at       timestamptz not null,
    unique (order_id, kind)
);
create index operator_bonus_entry_staff_time_idx on operator_bonus_entry(staff_id, occurred_at desc);

create table operator_bonus_account (
    staff_id          uuid primary key,
    balance           int         not null default 0,
    fulfilled_count   int         not null default 0,
    cancelled_count   int         not null default 0,
    period_started_at timestamptz not null,
    timezone           text        not null,
    updated_at         timestamptz not null
);

create table operator_bonus_period (
    id                uuid primary key,
    staff_id          uuid        not null,
    period_key        date        not null,
    period_started_at timestamptz not null,
    period_ended_at   timestamptz not null,
    points            int         not null,
    fulfilled_count   int         not null,
    cancelled_count   int         not null,
    closed_at         timestamptz not null,
    unique (staff_id, period_key)
);
create index operator_bonus_period_key_idx on operator_bonus_period(period_key desc, staff_id);
