# Песочница

Одноразовый экземпляр всей системы с вымышленными данными — чтобы трогать её руками, а не только тестами. Профиль `sandbox`: не для настоящих данных (фиксированные секреты, коды из SMS читаются по адресу).

## Что внутри

- Города **Київ** (UAH) и **Warszawa** (PLN), классы STANDARD и COMFORT, опубликованные тарифы с доплатой за предварительный заказ.
- Водители с одобренными машинами: `+380500000001…3` (Киев), `+48500000001…2` (Варшава).
- Пассажиры — любой телефон: аккаунт создаётся при первом входе.
- Супер-админ `admin`, стартовый пароль `Sandbox-Admin-2026`; при первом входе его надо сменить. Сценарии меняют его на `Sandbox-Admin-2026-ok`.
- SMS не отправляются: последний код для телефона — `GET /sandbox/v1/otp?phone=%2B380671234567`.

## Запуск в GitHub Actions (без своего сервера)

Actions → **Sandbox** → Run workflow, или из терминала:

```bash
gh workflow run sandbox.yml -f scenario=all -f minutes=0       # прогнать сценарии и остановиться
gh workflow run sandbox.yml -f scenario=none -f minutes=60     # поднять на час для ручной работы
```

- **scenario** — `all`, `full-ride`, `cancellations`, `preorders` или `none`. Каждый сценарий пишет протокол «запрос → ответ» в `transcript.md` (артефакт **sandbox-transcript** вместе с `server.log`); итог — в сводке запуска.
- **minutes** — после сценариев держать систему N минут (до 120) за временным публичным адресом `https://….trycloudflare.com`; адрес — в сводке запуска. Им можно пользоваться из Postman, браузера, мобильных приложений.

Данные живут только пока идёт запуск.

## На своём компьютере

```bash
docker compose -f deploy/sandbox/compose.yaml up --build
BASE=http://localhost:8080 TRANSCRIPT=/tmp/t.md scripts/sandbox/scenarios/full-ride.sh
```

## Свой сценарий

Скрипт в `scripts/sandbox/scenarios/<имя>.sh`, подключает `../lib.sh`:

- `sign_in CLIENT|DRIVER <телефон>` — вход по SMS, печатает токен;
- `admin_token`, `staff_sign_in ADMIN|OPERATOR <логин> <пароль>`;
- `api <метод> <путь> [токен] [json]` — вызов с записью в протокол;
- `expect <код>` — остановить сценарий, если ответ другой;
- `go_online`, `move` — смена водителя и его координаты;
- `say` / `note` — заголовки в протоколе.
