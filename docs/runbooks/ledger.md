# Журнал не сходится

**Алерт:** `LedgerUnbalanced` — есть транзакция за последние сутки, у которой дебет не равен кредиту.

Такого не должно быть никогда. Журнал только дополняется, сервер проверяет баланс каждой проводки.

## Проверить

```sql
select t.id, t.basis_type, t.basis_id, t.occurred_at, sum(l.debit_minor) d, sum(l.credit_minor) c
from journal_transaction t join journal_line l on l.transaction_id = t.id
where t.occurred_at > now() - interval '24 hours'
group by t.id having sum(l.debit_minor) <> sum(l.credit_minor);
```

Найдите `basis_type` и `basis_id`: это заказ, пополнение, чаевые и т. п. По `correlation_id` в логах найдите, что произошло.

## Сделать

- Не правьте журнал (UPDATE запрещён триггером). Исправление — компенсирующая проводка отдельной командой с причиной.
- До выяснения остановите выплаты водителям из затронутой валюты.

## Эскалация

Сразу ответственный за финансы и разработчики.

---

# Проводка поездки опаздывает

**Алерт:** `TripPostingLate` — завершённая поездка с итоговой ценой больше 10 минут ждёт проводки в журнал
(«pending accounting», REQ-LED-05). Метрика `blizz_finance_postings_pending_oldest_seconds`: сколько секунд ждёт
самая старая такая поездка (поездки моложе минуты не считаются).

## Проверить

- В админке: `GET /api/admin/v1/finance/pending-postings?city_id=…` — какие поездки ждут и сколько.
- Событие `TripCompleted` не обработано потребителем `finance.trip-fare-posting`; причина — в `last_error`:

```sql
select o.event_id, o.payload ->> 'order_id' as order_id, o.state, o.attempts, o.next_attempt_at, o.last_error
from outbox o
where o.event_type = 'TripCompleted' and o.state <> 'DONE'
  and not exists (select 1 from consumer_inbox i
                  where i.consumer_id = 'finance.trip-fare-posting' and i.event_id = o.event_id)
order by o.occurred_at;
```

## Сделать

- Пока событие в `PENDING`, сервер повторяет сам. Устраните причину (журнал, база), повтор проведёт поездку один
  раз: ключ проводки — `trip-fare:<final_fare_id>`.
- Событие в `FAILED` (попытки кончились) — см. [outbox.md](outbox.md), как вернуть его в очередь после исправления.
- Водитель видит такие поездки в заработке отдельно («ожидают проводки»), их доля ещё не на балансе.

## Эскалация

Ответственный за финансы, если проводки не идут больше часа или их много.
