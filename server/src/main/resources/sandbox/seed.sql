-- Sandbox data (profile "sandbox" only; never run in a real environment). Fictional cities, tariffs, drivers and
-- vehicles so the system can be used by hand at once. Idempotent: runs at every start of the sandbox.
-- Phones are from reserved test ranges; riders create their accounts by signing in with any phone.

insert into city (id, code, name, currency, timezone, polygon, priority, state, created_at, updated_at) values
    ('5a000000-0000-4000-8000-000000000001', 'kyiv', 'Київ', 'UAH', 'Europe/Kyiv',
     ST_GeomFromEWKT('SRID=4326;MULTIPOLYGON(((30.20 50.20,30.85 50.20,30.85 50.65,30.20 50.65,30.20 50.20)))'),
     100, 'PUBLISHED', now(), now()),
    ('5a000000-0000-4000-8000-000000000002', 'warszawa', 'Warszawa', 'PLN', 'Europe/Warsaw',
     ST_GeomFromEWKT('SRID=4326;MULTIPOLYGON(((20.85 52.09,21.27 52.09,21.27 52.37,20.85 52.37,20.85 52.09)))'),
     100, 'PUBLISHED', now(), now())
on conflict (id) do nothing;

insert into vehicle_class (id, city_id, code, name, active, created_at, updated_at) values
    ('5a000000-0000-4000-8000-000000000101', '5a000000-0000-4000-8000-000000000001', 'STANDARD', 'Стандарт', true, now(), now()),
    ('5a000000-0000-4000-8000-000000000102', '5a000000-0000-4000-8000-000000000001', 'COMFORT', 'Комфорт', true, now(), now()),
    ('5a000000-0000-4000-8000-000000000201', '5a000000-0000-4000-8000-000000000002', 'STANDARD', 'Standard', true, now(), now()),
    ('5a000000-0000-4000-8000-000000000202', '5a000000-0000-4000-8000-000000000002', 'COMFORT', 'Comfort', true, now(), now())
on conflict (id) do nothing;

-- Published tariffs: pickup, per km, per minute, minimum, 3 free waiting minutes, 15 % commission,
-- a pre-order surcharge (UAH: +30 грн; PLN: ×1.10).
insert into tariff_version (id, city_id, class_id, currency, effective_from, state, pickup_minor, per_km_minor,
                            per_minute_minor, minimum_minor, free_waiting_minutes, waiting_per_minute_minor,
                            cancellation_fee_minor, commission_rate, waiting_step_seconds, waiting_rounding,
                            pickup_outside_minor, per_km_outside_minor, zone_surcharges, preorder_surcharge,
                            created_at, updated_at) values
    ('5a000000-0000-4000-8000-000000000301', '5a000000-0000-4000-8000-000000000001',
     '5a000000-0000-4000-8000-000000000101', 'UAH', now() - interval '1 day', 'PUBLISHED',
     4000, 1400, 200, 7000, 3, 300, 0, 0.15, 60, 'UP', 6000, 1800, '[]',
     '{"mode": "FIXED", "amount_minor": 3000}', now(), now()),
    ('5a000000-0000-4000-8000-000000000302', '5a000000-0000-4000-8000-000000000001',
     '5a000000-0000-4000-8000-000000000102', 'UAH', now() - interval '1 day', 'PUBLISHED',
     6000, 2000, 300, 10000, 3, 400, 0, 0.15, 60, 'UP', 8000, 2500, '[]',
     '{"mode": "FIXED", "amount_minor": 3000}', now(), now()),
    ('5a000000-0000-4000-8000-000000000303', '5a000000-0000-4000-8000-000000000002',
     '5a000000-0000-4000-8000-000000000201', 'PLN', now() - interval '1 day', 'PUBLISHED',
     800, 300, 50, 1500, 3, 60, 0, 0.15, 60, 'UP', 1000, 400, '[]',
     '{"mode": "COEFFICIENT", "coefficient": 1.10}', now(), now()),
    ('5a000000-0000-4000-8000-000000000304', '5a000000-0000-4000-8000-000000000002',
     '5a000000-0000-4000-8000-000000000202', 'PLN', now() - interval '1 day', 'PUBLISHED',
     1200, 400, 70, 2000, 3, 80, 0, 0.15, 60, 'UP', 1500, 500, '[]',
     '{"mode": "COEFFICIENT", "coefficient": 1.10}', now(), now())
on conflict (id) do nothing;

-- Approved drivers with approved cars (both classes). They sign in by OTP with these phones.
insert into driver (id, phone_normalized, name, language, account_state, review_status, created_at, updated_at) values
    ('5a000000-0000-4000-8000-000000000401', '+380500000001', 'Іван Петренко', 'uk', 'ACTIVE', 'APPROVED', now(), now()),
    ('5a000000-0000-4000-8000-000000000402', '+380500000002', 'Олег Коваль', 'uk', 'ACTIVE', 'APPROVED', now(), now()),
    ('5a000000-0000-4000-8000-000000000403', '+380500000003', 'Андрій Шевчук', 'ru', 'ACTIVE', 'APPROVED', now(), now()),
    ('5a000000-0000-4000-8000-000000000404', '+48500000001', 'Piotr Nowak', 'pl', 'ACTIVE', 'APPROVED', now(), now()),
    ('5a000000-0000-4000-8000-000000000405', '+48500000002', 'Anna Wiśniewska', 'pl', 'ACTIVE', 'APPROVED', now(), now())
on conflict (id) do nothing;

insert into vehicle (id, driver_id, registration_number, make, model, color, production_year, state, class_approvals,
                     created_at, updated_at) values
    ('5a000000-0000-4000-8000-000000000501', '5a000000-0000-4000-8000-000000000401', 'AA0001TX', 'Skoda', 'Octavia', 'white', 2021, 'APPROVED', '{STANDARD,COMFORT}', now(), now()),
    ('5a000000-0000-4000-8000-000000000502', '5a000000-0000-4000-8000-000000000402', 'AA0002TX', 'Toyota', 'Corolla', 'grey', 2020, 'APPROVED', '{STANDARD}', now(), now()),
    ('5a000000-0000-4000-8000-000000000503', '5a000000-0000-4000-8000-000000000403', 'AA0003TX', 'Hyundai', 'Sonata', 'black', 2022, 'APPROVED', '{STANDARD,COMFORT}', now(), now()),
    ('5a000000-0000-4000-8000-000000000504', '5a000000-0000-4000-8000-000000000404', 'WA0001T', 'Toyota', 'Camry', 'black', 2022, 'APPROVED', '{STANDARD,COMFORT}', now(), now()),
    ('5a000000-0000-4000-8000-000000000505', '5a000000-0000-4000-8000-000000000405', 'WA0002T', 'Kia', 'Ceed', 'blue', 2021, 'APPROVED', '{STANDARD}', now(), now())
on conflict (id) do nothing;
