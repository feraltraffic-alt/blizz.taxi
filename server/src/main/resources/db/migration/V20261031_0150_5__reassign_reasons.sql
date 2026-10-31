-- Reasons staff give for taking a driver off an order before the start, which then searches again (REQ-CAN-01,
-- issue #143): a fourth list of the cancel-reason catalog (ADR 0007), apart from the reasons to cancel an order.
alter table cancel_reason drop constraint cancel_reason_audience_check;
alter table cancel_reason add constraint cancel_reason_audience_check
    check (audience in ('RIDER', 'DRIVER', 'STAFF', 'REASSIGN'));

insert into cancel_reason (id, audience, code, labels, driver_outcome, sort_order, created_at, updated_at) values
    (gen_random_uuid(), 'REASSIGN', 'DRIVER_NOT_RESPONDING',
     '{"ru": "Водитель не отвечает", "uk": "Водій не відповідає", "pl": "Kierowca nie odpowiada", "en": "The driver does not answer"}', null, 10, now(), now()),
    (gen_random_uuid(), 'REASSIGN', 'DRIVER_TOO_FAR',
     '{"ru": "Водитель слишком далеко", "uk": "Водій надто далеко", "pl": "Kierowca jest za daleko", "en": "The driver is too far"}', null, 20, now(), now()),
    (gen_random_uuid(), 'REASSIGN', 'VEHICLE_PROBLEM',
     '{"ru": "Проблема с автомобилем", "uk": "Проблема з автомобілем", "pl": "Problem z samochodem", "en": "A problem with the car"}', null, 30, now(), now()),
    (gen_random_uuid(), 'REASSIGN', 'RIDER_ASKED',
     '{"ru": "Пассажир попросил другого водителя", "uk": "Пасажир попросив іншого водія", "pl": "Pasażer poprosił o innego kierowcę", "en": "The rider asked for another driver"}', null, 40, now(), now()),
    (gen_random_uuid(), 'REASSIGN', 'OTHER',
     '{"ru": "Другое", "uk": "Інше", "pl": "Inne", "en": "Other"}', null, 50, now(), now());

-- The code and its labels at the time are kept with the assignment, as for a cancelled order (ADR 0007 p. 5).
alter table assignment
    add column close_reason_code   text,
    add column close_reason_labels jsonb;
