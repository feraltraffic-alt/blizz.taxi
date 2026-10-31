# Исход оплаты картой неизвестен

**Алерт:** `PaymentOutcomeUnknown` — операция в состоянии UNKNOWN дольше 5 минут.

UNKNOWN значит, что запрос к провайдеру ушёл, а ответа нет. Деньги могли списаться, а могли и не списаться.

## Проверить

```sql
select id, type, reference, amount_minor, attempts, provider_status, reason, updated_at
from payment_operation where state = 'UNKNOWN' order by updated_at;
```

- Сервер сам переспрашивает статус у провайдера (`PaymentWorker`). Смотрите в логах ошибки проверки статуса по `reference`.
- В кабинете мерчанта (WayForPay) найдите транзакцию по `reference`.

## Сделать

- **Провайдер недоступен.** Ждите, повторная проверка идёт сама. Если недоступность долгая, предупредите операторов: пассажиры могут видеть «оплата проверяется».
- **В кабинете списано, а у нас UNKNOWN.** Не проводите оплату руками в базе. Дождитесь сверки или заведите обращение в поддержку с `reference`. Ручная корректировка — только отдельной командой с причиной (REQ-ADM-03).
- **Ни в коем случае** не повторяйте списание новой операцией, пока исход старой неизвестен.

## Эскалация

Если больше 10 операций в UNKNOWN дольше часа — ответственный за платежи.

## Удержанный захват скоро потеряет холд

**Алерт:** `HeldCaptureNearHoldExpiry` — у карточной поездки захват ждёт разбора исправления фактов поездки, а холд на карте истекает меньше чем через 24 часа.

- Сервер сам начнёт захват за `blizz.trips.held-capture-margin` (6 часов) до истечения холда, по текущей итоговой цене (`HeldCaptureDeadline`). Исправление остаётся неразобранным: в карточке фактов поездки у него `released_by_deadline_at`, а поездка по-прежнему `needs_review`.
- Лучше успеть раньше: разберите исправление в админке (`POST /api/admin/v1/orders/{id}/trip-corrections/review`). Если цена после разбора другая — это исправление итоговой цены (долг или обязательство вернуть), а не второй захват.
- Какие заказы ждут:

```sql
select distinct c.order_id, c.created_at from trip_correction c join ride_order o on o.id = c.order_id
where c.holds_capture and c.reviewed_at is null and c.released_by_deadline_at is null
  and o.payment_state = 'AUTHORIZED' order by c.created_at;
```
