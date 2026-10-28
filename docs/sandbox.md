# Песочница

Одноразовый экземпляр всей системы с вымышленными данными — чтобы трогать её руками, а не только тестами. Профиль `sandbox`: не для настоящих данных (фиксированные секреты, коды из SMS читаются по адресу).

## Что внутри

- Города **Київ** (UAH) и **Warszawa** (PLN), классы STANDARD и COMFORT, опубликованные тарифы с доплатой за предварительный заказ.
- Водители с одобренными машинами: `+380500000001…3` (Киев), `+48500000001…2` (Варшава).
- Пассажиры — любой телефон: аккаунт создаётся при первом входе.
- Супер-админ `admin`, стартовый пароль `Sandbox-Admin-2026`; при первом входе его надо сменить. Сценарии меняют его на `Sandbox-Admin-2026-ok`.
- SMS не отправляются и звонков нет (поддельный провайдер): последний код для телефона — `GET /sandbox/v1/otp?phone=%2B380671234567`, поле `channel` — `SMS` или `VOICE`. «Позвоните мне» — `"channel":"VOICE"` в `POST /auth/v1/otp/challenges`. SMS на номер, оканчивающийся на `0000`, «не доходит» — так видно переход на звонок. Как уходили коды — `GET /api/admin/v1/otp-deliveries?phone=…` (поддержка).
- Asterisk в песочнице нет: события входящих звонков подаются как от Asterisk — `POST /sandbox/v1/calls/events` с событием ARI (`ChannelCreated`, `ChannelStateChange`, `ChannelDestroyed`). Звонок попадает в журнал, только если набранный номер — номер службы (`/api/admin/v1/call-lines`). Журнал оператора — `GET /api/operator/v1/calls`, карточка звонка — в `/ws/v1/operator`. Пример — `scripts/sandbox/scenarios/incoming-call.sh`. Записи разговоров: у отвеченного звонка после `ChannelDestroyed` сервер в течение ~10 секунд «забирает у Asterisk» запись — в песочнице это двухсекундный тон; поле `recording` звонка становится `STORED`, слушать — `GET /api/operator/v1/calls/{id}/recording` (право `calls.listen`), каждое прослушивание видно в `GET /api/admin/v1/logs/changes?action=call_recording.listen`. Пример — `scripts/sandbox/scenarios/call-recording.sh`.
- Копия персональных данных пассажира (REQ-PRV-07): `POST /api/rider/v1/me/data-exports/challenge` — код на телефон (смотреть в `/sandbox/v1/otp`), затем `POST /api/rider/v1/me/data-exports` с кодом; файл собирается в фоне за ~10 секунд, скачать — `GET /api/rider/v1/me/data-exports/{id}/file`. Не чаще раза в сутки на пассажира. Пример — `scripts/sandbox/scenarios/data-export.sh`.
- Юридические тексты (REQ-PRV-08): админ создаёт версию `POST /api/admin/v1/legal-documents` и публикует её `…/{id}/publish`; опубликованная версия не меняется. Пока действующая версия с `acceptance_required` не принята, пассажир не может заказать, а водитель выйти на линию (`403 ACCEPTANCE_REQUIRED`); принять — `POST /api/{rider|driver}/v1/legal/acceptances`, текст до входа — `GET /api/config/v1/legal/rider/terms?language=pl`. Сценарий `legal-acceptance.sh` в конце публикует версию без обязательного принятия, чтобы не блокировать остальные. Если вы публикуете обязательные условия сами, остальные сценарии будут получать 403, пока вы не сделаете то же.
- Пуши не уходят в Firebase (провайдер `FAKE`), а запоминаются: `GET /sandbox/v1/pushes?phone=%2B380671234567&after=2026-10-27T12:00:00Z` — что сервер отправил на активные устройства пассажира и/или водителя с этим телефоном, от старых к новым, не больше 100: `[{at, token_suffix, title, body, data}]`. От токена видны только последние 6 символов. `after` (UTC, необязательно) — только отправленные позже; время пишите с `Z` (знак `+` в адресе надо кодировать как `%2B`). Устройство регистрирует приложение (`POST /api/{rider|driver}/v1/push-devices`); пуш появляется через секунду-две после события. Хранятся последние 10 000 пушей, до перезапуска.

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
