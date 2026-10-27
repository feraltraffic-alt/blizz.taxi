-- Cancellation reasons per side and who cancelled an order (owner decision 27.10.2026).
-- The catalog belongs to `configuration`; the order columns belong to `operations`. No FK between them:
-- the order keeps the code and a snapshot of the labels it was cancelled with.

create table cancel_reason (
    id             uuid primary key,
    audience       text        not null check (audience in ('RIDER', 'DRIVER', 'STAFF')),
    code           text        not null check (code ~ '^[A-Z][A-Z0-9_]{1,39}$'),
    labels         jsonb       not null,
    driver_outcome text check (driver_outcome in ('RETURN_TO_SEARCH', 'CANCEL_ORDER')),
    active         boolean     not null default true,
    sort_order     int         not null default 0,
    version        bigint      not null default 0,
    created_at     timestamptz not null,
    updated_at     timestamptz not null,
    unique (audience, code),
    check ((audience = 'DRIVER') = (driver_outcome is not null))
);

-- Starting set; the admin edits labels, order and activity, and adds new ones. Codes never change.
insert into cancel_reason (id, audience, code, labels, driver_outcome, sort_order, created_at, updated_at) values
    (gen_random_uuid(), 'RIDER', 'CHANGED_MIND',
     '{"ru": "Передумал ехать", "uk": "Передумав їхати", "pl": "Zmiana planów", "en": "Changed my mind"}', null, 10, now(), now()),
    (gen_random_uuid(), 'RIDER', 'WAIT_TOO_LONG',
     '{"ru": "Долго ждать машину", "uk": "Довго чекати авто", "pl": "Zbyt długie oczekiwanie", "en": "The wait is too long"}', null, 20, now(), now()),
    (gen_random_uuid(), 'RIDER', 'WRONG_ADDRESS',
     '{"ru": "Ошибся адресом", "uk": "Помилився адресою", "pl": "Błędny adres", "en": "Wrong address"}', null, 30, now(), now()),
    (gen_random_uuid(), 'RIDER', 'OTHER_TRANSPORT',
     '{"ru": "Уеду на другом транспорте", "uk": "Поїду іншим транспортом", "pl": "Inny transport", "en": "Found other transport"}', null, 40, now(), now()),
    (gen_random_uuid(), 'DRIVER', 'NO_SHOW',
     '{"ru": "Пассажир не вышел", "uk": "Пасажир не вийшов", "pl": "Pasażer nie przyszedł", "en": "Passenger did not show up"}', 'CANCEL_ORDER', 10, now(), now()),
    (gen_random_uuid(), 'DRIVER', 'PASSENGER_ASKED',
     '{"ru": "Пассажир попросил отменить", "uk": "Пасажир попросив скасувати", "pl": "Pasażer poprosił o anulowanie", "en": "Passenger asked to cancel"}', 'CANCEL_ORDER', 20, now(), now()),
    (gen_random_uuid(), 'DRIVER', 'VEHICLE_PROBLEM',
     '{"ru": "Неисправность автомобиля", "uk": "Несправність автомобіля", "pl": "Awaria samochodu", "en": "Vehicle problem"}', 'RETURN_TO_SEARCH', 30, now(), now()),
    (gen_random_uuid(), 'DRIVER', 'CANNOT_REACH',
     '{"ru": "Не могу подъехать", "uk": "Не можу під''їхати", "pl": "Nie mogę dojechać", "en": "Cannot reach the pickup"}', 'RETURN_TO_SEARCH', 40, now(), now()),
    (gen_random_uuid(), 'STAFF', 'PASSENGER_ASKED',
     '{"ru": "Пассажир попросил", "uk": "Пасажир попросив", "pl": "Na prośbę pasażera", "en": "Passenger asked"}', null, 10, now(), now()),
    (gen_random_uuid(), 'STAFF', 'DUPLICATE',
     '{"ru": "Дубль заказа", "uk": "Дубль замовлення", "pl": "Duplikat zamówienia", "en": "Duplicate order"}', null, 20, now(), now()),
    (gen_random_uuid(), 'STAFF', 'NO_CARS',
     '{"ru": "Нет свободных машин", "uk": "Немає вільних авто", "pl": "Brak wolnych aut", "en": "No cars available"}', null, 30, now(), now()),
    (gen_random_uuid(), 'STAFF', 'TEST_ORDER',
     '{"ru": "Тестовый заказ", "uk": "Тестове замовлення", "pl": "Zamówienie testowe", "en": "Test order"}', null, 40, now(), now());

alter table ride_order
    add column cancelled_by        text check (cancelled_by in ('RIDER', 'STAFF', 'DRIVER')),
    add column cancel_reason_code  text,
    add column cancel_reason_labels jsonb,
    add constraint ride_order_cancellation_ck
        check ((cancelled_by is null) = (cancel_reason_code is null) and (cancelled_by is null or status = 'CANCELLED'));
