# События не доставляются (outbox)

**Алерты:** `OutboxStuck` (старейшее событие ждёт больше 60 секунд), `OutboxFailed`.

От доставки событий зависят пуши, карточки звонков, проводки в журнале, бонусы и анонимизация. Сам заказ при этом не теряется: событие лежит в той же базе.

## Проверить

```sql
select event_type, state, count(*), min(occurred_at), max(attempts)
from outbox where state <> 'DONE' group by 1, 2 order by 3 desc;
select event_id, event_type, attempts, last_error, lease_owner, lease_until
from outbox where state = 'FAILED' order by occurred_at limit 20;
```

- **Много PENDING, `lease_until` в прошлом.** Ретранслятор не работает: проверьте, живы ли экземпляры и нет ли ошибок в логах. Ретранслятор есть на каждом экземпляре, события забираются через `SKIP LOCKED`.
- **FAILED с одинаковой `last_error`.** Ломается конкретный обработчик. Найдите его по `event_type` и `correlation_id` в логах.

## Сделать

- Исправьте причину: недоступный провайдер, ошибку в обработчике (её чинят релизом).
- Повторно отправить FAILED после исправления: `update outbox set state = 'PENDING', next_attempt_at = now() where event_id = ...`. Обработчики идемпотентны (`consumer_inbox`), поэтому повтор безопасен.
- Не удаляйте события руками.
