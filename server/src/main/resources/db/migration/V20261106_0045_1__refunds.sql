-- Staff refunds to riders (owner decisions 03–06.11.2026, ADR 0018 part A, issue #512).

-- A9: the refund reasons are a fifth list of the reason catalogue (ADR 0007), each with its fault (A6). OTHER has no
-- fault of its own: the staff member chooses it, with a comment.
alter table cancel_reason drop constraint cancel_reason_audience_check;
alter table cancel_reason add constraint cancel_reason_audience_check
    check (audience in ('RIDER', 'DRIVER', 'STAFF', 'REASSIGN', 'REFUND'));
-- A refund reason may carry the operator's fault without the staff-only operator flag.
alter table cancel_reason drop constraint cancel_reason_operator_fault_check;
alter table cancel_reason add constraint cancel_reason_operator_fault_check
    check (fault is null or audience = 'REFUND' or operator_fault = (fault = 'OPERATOR'));
insert into cancel_reason (id, service_id, audience, code, labels, driver_outcome, sort_order, fault, created_at,
                           updated_at)
select gen_random_uuid(), s.service_id, 'REFUND', r.code, r.labels::jsonb, null, r.sort_order, r.fault, now(), now()
from (select distinct service_id from cancel_reason) s
cross join (values
    ('LONG_ROUTE', '{"ru": "Длинный маршрут", "uk": "Довгий маршрут", "pl": "Długa trasa", "en": "Long route"}', 10, 'DRIVER'),
    ('RUDE_DRIVER', '{"ru": "Грубость водителя", "uk": "Грубість водія", "pl": "Niegrzeczny kierowca", "en": "Rude driver"}', 20, 'DRIVER'),
    ('CAR_CONDITION', '{"ru": "Грязный или неисправный салон", "uk": "Брудний або несправний салон", "pl": "Brudny lub niesprawny samochód", "en": "Dirty or faulty car"}', 30, 'DRIVER'),
    ('LONG_PICKUP', '{"ru": "Долгая подача", "uk": "Довга подача", "pl": "Długi dojazd", "en": "Long wait for the pickup"}', 40, 'DRIVER'),
    ('DOUBLE_CHARGE', '{"ru": "Двойное списание", "uk": "Подвійне списання", "pl": "Podwójne obciążenie", "en": "Double charge"}', 50, 'NONE'),
    ('SOFTWARE_ERROR', '{"ru": "Ошибка программы или цены", "uk": "Помилка програми або ціни", "pl": "Błąd programu lub ceny", "en": "Software or price error"}', 60, 'NONE'),
    ('OPERATOR_ERROR', '{"ru": "Ошибка оператора", "uk": "Помилка оператора", "pl": "Błąd operatora", "en": "Operator''s error"}', 70, 'OPERATOR'),
    ('GOODWILL', '{"ru": "Жест доброй воли", "uk": "Жест доброї волі", "pl": "Gest dobrej woli", "en": "Goodwill"}', 80, 'NONE'),
    ('OTHER', '{"ru": "Другое", "uk": "Інше", "pl": "Inne", "en": "Other"}', 90, 'NONE')
) as r(code, labels, sort_order, fault)
on conflict (service_id, audience, code) do nothing;

-- A2: the limits of one staff member per currency, set by the super admin; none set means no refunds.
create table staff_refund_limit (
    staff_id         uuid        not null,
    currency         text        not null check (currency ~ '^[A-Z]{3}$'),
    per_refund_minor bigint      not null check (per_refund_minor > 0),
    daily_minor      bigint      not null check (daily_minor > 0),
    changed_by       uuid        not null,
    changed_at       timestamptz not null,
    version          bigint      not null default 1,
    primary key (staff_id, currency)
);

-- One refund request (REQ-ADM-05): REQUESTED → APPROVED → PROCESSING → SUCCEEDED / FAILED / UNKNOWN, or REJECTED /
-- NOT_REVIEWED without money moving. Where it goes: card_minor + bonus_minor = amount_minor. Where it comes from:
-- paid_bonus_minor of it was paid with bonuses (A5: that part goes back as bonuses), the rest with money.
create table refund (
    id              uuid primary key,
    service_id      uuid        not null,
    order_id        uuid        not null,
    city_id         uuid        not null,
    client_id       uuid        not null,
    driver_id       uuid,
    currency        text        not null,
    amount_minor    bigint      not null check (amount_minor > 0),
    card_minor      bigint      not null check (card_minor >= 0),
    bonus_minor     bigint      not null check (bonus_minor >= 0),
    paid_bonus_minor bigint     not null check (paid_bonus_minor >= 0),
    rider_agreed    boolean     not null,
    reason_code     text        not null,
    reason_labels   jsonb       not null,
    fault           text        not null check (fault in ('CLIENT_FREE', 'CLIENT', 'DRIVER', 'OPERATOR', 'NONE')),
    comment         text check (comment is null or length(comment) <= 500),
    state           text        not null check (state in ('REQUESTED', 'APPROVED', 'PROCESSING', 'SUCCEEDED', 'FAILED',
                                                          'UNKNOWN', 'REJECTED', 'NOT_REVIEWED')),
    requested_by    uuid        not null,
    requested_at    timestamptz not null,
    decided_by      uuid,
    decided_at      timestamptz,
    decision_reason text check (decision_reason is null or length(decision_reason) <= 500),
    ended_at        timestamptz,
    version         bigint      not null default 1,
    check (card_minor + bonus_minor = amount_minor),
    check (paid_bonus_minor <= bonus_minor)
);
create index refund_order_idx on refund (order_id);
create index refund_requested_by_idx on refund (requested_by, requested_at desc);
create index refund_client_idx on refund (client_id, requested_at desc);
create index refund_waiting_idx on refund (service_id, requested_at) where state = 'REQUESTED';
