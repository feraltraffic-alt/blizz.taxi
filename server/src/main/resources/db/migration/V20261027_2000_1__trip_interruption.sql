-- A trip interrupted after the start (T-22, REQ-OPS-05, owner decision 27.10.2026): the order is cancelled by staff,
-- the part already driven is free, and a follow-up order takes the rider on; the rider pays nothing for it and the
-- service pays its driver by the tariff (payment method SERVICE).

alter table ride_order drop constraint ride_order_payment_method_check;
alter table ride_order add constraint ride_order_payment_method_check
    check (payment_method in ('CASH', 'CARD', 'SERVICE'));

-- The follow-up points at the interrupted order (same module, same table).
alter table ride_order add column related_order_id uuid references ride_order (id);
create unique index ride_order_follow_up_uq on ride_order (related_order_id) where related_order_id is not null;

-- Where and when the trip stopped: the partial fact (section 21, CANCELLED after the start).
alter table trip
    add column interrupted_at timestamptz,
    add column interrupted_at_point geometry(Point, 4326);

-- What the service pays itself, e.g. the driver of a follow-up ride the rider gets for free.
alter table journal_line drop constraint journal_line_account_check;
alter table journal_line add constraint journal_line_account_check
    check (account in ('RIDER_RECEIVABLE', 'DRIVER_PAYABLE', 'SERVICE_COMMISSION', 'SERVICE_FUNDS',
                       'PROVIDER_CLEARING', 'PARTNER_SETTLEMENT', 'TIPS_PAYABLE', 'REFUNDS_PAYABLE', 'SUSPENSE',
                       'SERVICE_EXPENSE'));

-- Reasons staff give for an interruption.
insert into cancel_reason (id, audience, code, labels, driver_outcome, sort_order, created_at, updated_at) values
    (gen_random_uuid(), 'STAFF', 'VEHICLE_BREAKDOWN',
     '{"ru": "Поломка автомобиля в пути", "uk": "Поломка автомобіля в дорозі", "pl": "Awaria auta w trasie", "en": "Vehicle broke down on the way"}',
     null, 50, now(), now()),
    (gen_random_uuid(), 'STAFF', 'ACCIDENT',
     '{"ru": "ДТП", "uk": "ДТП", "pl": "Wypadek", "en": "Accident"}', null, 60, now(), now())
on conflict (audience, code) do nothing;
